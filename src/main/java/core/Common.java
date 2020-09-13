package core;

import java.io.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.*;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.markuputils.*;
import org.openqa.selenium.interactions.Actions;

class Common {
	static WebDriver driver;
	static Writer report;
	static Properties info = new Properties();
	static String url;
	static String browser;
	static By by;

	static void getWebDriver(String browser) {
		Logger.getLogger("").setLevel(Level.OFF);
		String drPath = "";

		if (browser.equalsIgnoreCase("firefox")) {
			if (System.getProperty("os.name").toUpperCase().contains("MAC"))
				drPath = "./resources/webdrivers/mac/geckodriver.sh";
			else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"))
				drPath = "./resources/webdrivers/pc/geckodriver.exe";
			else
				throw new IllegalArgumentException("Unknown OS");
			System.setProperty("webdriver.gecko.driver", drPath);
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}

		else if (browser.equalsIgnoreCase("chrome")) {
			if (System.getProperty("os.name").toUpperCase().contains("MAC"))
				drPath = "./resources/webdrivers/mac/chromedriver";
			else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"))
				drPath = "./resources/webdrivers/pc/chromedriver.exe";
			else
				throw new IllegalArgumentException("Unknown OS");
			System.setProperty("webdriver.chrome.driver", drPath);
			System.setProperty("webdriver.chrome.silentOutput", "true");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("disable-infobars");
			option.addArguments("--disable-notifications");
			driver = new ChromeDriver(option);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}

		else if (browser.equalsIgnoreCase("safari")) {
			if (!System.getProperty("os.name").contains("Mac")) {
				throw new IllegalArgumentException("Safari is available only on Mac");
			}
			driver = new SafariDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}

		else if (browser.equalsIgnoreCase("edge")) {
			if (!System.getProperty("os.name").contains("Windows"))
				throw new IllegalArgumentException("MS Edge is available only on Windows");
			System.setProperty("webdriver.edge.driver", "./resources/webdrivers/pc/MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		} else {
			throw new WebDriverException("Unknown WebDriver");
		}
	}

	static void openBrowser(String browser, String url) {
		getWebDriver(browser);
		driver.manage().window().maximize();
		driver.get(url);
	}

	static String isThisElementOnPage(By by) throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (!driver.findElements(by).isEmpty()) {
			elementHighlight(driver.findElement(by));
			elementUnhighlight(driver.findElement(by));
			return "This element on the page";
		} else
			return "There is no element on the page";
	}

	static String getSize(By by) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (!driver.findElements(by).isEmpty() && driver.findElement(by).isDisplayed())
			return driver.findElement(by).getSize().toString().replace(", ", "x");
		else
			return "null";
	}

	static String getLocation(By by) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (((RemoteWebDriver) driver).getCapabilities().getBrowserName().equals("Safari"))
			return "(0x0)";
		else {
			if (!driver.findElements(by).isEmpty() && driver.findElement(by).isDisplayed())
				return driver.findElement(by).getLocation().toString().replace(", ", "x");
			else
				return "null";
		}
	}

	public static void elementHighlight(WebElement element) throws Exception {
		((RemoteWebDriver) driver).executeScript("arguments[0].setAttribute('style','border: solid 3px red');",
				element);
		Thread.sleep(100);
	}

	public static void elementUnhighlight(WebElement element) throws Exception {
		Thread.sleep(100);
		((RemoteWebDriver) driver).executeScript("arguments[0].setAttribute('style','border: solid 0px red');",
				element);
	}

	static void inputValue(By by, String value) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (!driver.findElements(by).isEmpty() && driver.findElement(by).isDisplayed())
			driver.findElement(by).sendKeys(value);
	}

	static void leftClickOnElement(By by) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (!driver.findElements(by).isEmpty() && driver.findElement(by).isDisplayed())
			driver.findElement(by).click();
	}

	static void leftDoubleClickOnElement(By by) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(by);
		actions.doubleClick(elementLocator).perform();
	}

	static void moveElement(By by) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(by);
		actions.moveToElement(element).build().perform();
	}

	static void scrollDown() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1300)");
	}

	static void scrollDown2() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
	}

	static void scrollUp() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-3500)");
	}

	static String takeText(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		String text = wait.until(ExpectedConditions.presenceOfElementLocated(by)).getText();

		return text;

	}

	static String takeValue(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		driver.manage();
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		if (!driver.findElements(by).isEmpty() && driver.findElement(by).isDisplayed()
				&& driver.findElement(by).getTagName().equalsIgnoreCase("input"))
			return driver.findElement(by).getAttribute("value").toString().trim();

		else if (!driver.findElements(by).isEmpty() && driver.findElement(by).isDisplayed()
				&& driver.findElement(by).getTagName().equalsIgnoreCase("span"))
			return driver.findElement(by).getText().trim();
		else
			return "null";
	}

	static void doawnload(By by) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (!driver.findElements(by).isEmpty() && driver.findElement(by).isDisplayed())
			driver.findElement(by).submit();
	}

	static String getNameOfBrowser() {
		String browser = ((RemoteWebDriver) driver).getCapabilities().getBrowserName().toString().trim();
		return browser.replaceFirst(String.valueOf(browser.charAt(0)), String.valueOf(browser.charAt(0)).toUpperCase());
	}

	static String getNameOfFile() {
		String file = driver.getCurrentUrl().toString().trim();
		return file.substring(file.lastIndexOf('/') + 1);
	}

	static String getNameOfTitle() {
		return driver.getTitle().toString().trim();
	}

	static void waitTitlePage(String title) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleIs(title));
	}

	static void stopDriver() {
		driver.quit();
	}

	public static void checkCheckBox(By by) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (!driver.findElements(by).isEmpty() && driver.findElement(by).isDisplayed()
				&& !driver.findElement(by).isSelected())
			driver.findElement(by).click();
	}

	public static void checkRadioButton(By by) {
		if (!driver.findElements(by).isEmpty() && driver.findElement(by).isDisplayed()
				&& !driver.findElement(by).isSelected())
			driver.findElement(by).click();
	}

	public static void selectDropDown(By by, String value) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (!driver.findElements(by).isEmpty() && driver.findElement(by).isDisplayed())
			new Select(driver.findElement(by)).selectByVisibleText(value);
	}

	public static String takeScreenShot(String screenshotName) throws IOException {
		String dateName = new SimpleDateFormat("_yyyy-MM-dd_HH_mm").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

	static void writeLineWithInformation(String element, String expected, String actual, ExtentTest logger) {
		String info = "Element [" + element + "] - Expected Result [" + expected + "] : Actual Result [" + actual + "]";
		if (expected.equals(actual))
			logger.log(Status.INFO, MarkupHelper.createLabel(info, ExtentColor.BLUE));
		else
			logger.log(Status.INFO, MarkupHelper.createLabel(info, ExtentColor.RED));
	}
}
