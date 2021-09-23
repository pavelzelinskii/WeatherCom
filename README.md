Parsing value of temperature and current location, Compare actual/expected results, Validating elements on Pages Reporting using extentReports and AllureReport mvn package -DskipTests; mvn site -Dbrowser=Firefox -Dtest=ExtentReportsTest; open ./test-output/extentreports.html and then mvn site -Dbrowser=Firefox -Dtest=AllureReportTest; open -a firefox ./target/site/allure-maven-plugin/index.html
package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import core.ADITestSpecificData;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.remote.http.W3CHttpCommandCodec;
import org.openqa.selenium.remote.http.W3CHttpResponseCodec;
import org.openqa.selenium.support.ui.FluentWait;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestRunContext {
    public final WebDriver driver;
    public final ExtentTest reportLogger;

    public TestRunContext(final WebDriver driver, final String testName, ExtentReports reports) {
        this.driver = driver;
        this.reportLogger = reports.createTest(testName);
    }

    public TestRunContext(final String browser, final String testName, ExtentReports reports) {
        this.driver = TestRunContext.createDriver(browser);
        this.reportLogger = reports.createTest(testName);
    }

    protected TestRunContext(final WebDriver driver, final ExtentTest reportLogger) {
        this.driver = driver;
        this.reportLogger = reportLogger;
    }

    public void closeContext() {
//        this.driver.quit();
    }

    public ITestSpecificData getTestSpecificData(String testSpecificDataType) {
        // get from config
        return new ADITestSpecificData();
    }

    public TimeTracker getTimeTracker() {
        return this.getTimeTracker(this.driver.getTitle());
    }

    public TimeTracker getTimeTracker(String title) {
        return new TimeTracker(title, this.reportLogger);
    }

    public TestRunContext createChildContext(String browser) {
        WebDriver newDriver = createDriver(browser);
        return new TestRunContext(newDriver, this.reportLogger);
    }

    private static WebDriver createDriver(String browser) {
        WebDriver driver;
        Logger.getLogger("").setLevel(Level.OFF);

        switch (browser.toLowerCase()) {
            case "firefox":
                driver = createFirefox();
                break;
            case "chrome":
                driver = createChrome();
                break;
            case "edge":
                driver = createEdge();
                break;
            default:
                throw new WebDriverException("Unknown WebDriver");
        }

        return driver;
    }

    private static WebDriver createEdge() {
        if (!System.getProperty("os.name").contains("Windows"))
            throw new IllegalArgumentException("MS Edge is available only on Windows");
        System.setProperty("webdriver.edge.driver", ".\\resources\\webdrivers\\pc\\MicrosoftWebDriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return driver;
    }

    private static WebDriver createChrome() {
        String pathToDriver = System.getenv("CHROME_PATH") != null ?
                System.getenv("CHROME_DRIVER_PATH") :
                ".\\resources\\webdrivers\\pc\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", pathToDriver);
        System.setProperty("webdriver.chrome.silentOutput", "true");

        ChromeOptions option = new ChromeOptions();
        option.addArguments("disable-infobars");
        option.addArguments("--disable-notifications");

        String customPath = System.getenv("CHROME_PATH");
        if(null != customPath) {
            option.setBinary(customPath);
        }

        ChromeDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        System.out.printf("[D]: Driver session ID: %s%n", driver.getSessionId());

        return driver;
    }

    private static WebDriver createFirefox() {
        String drPath = "";
        if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"))
            drPath = ".\\resources\\webdrivers\\pc\\geckodriver.exe";
        else
            throw new IllegalArgumentException("Unknown OS");
        System.setProperty("webdriver.gecko.driver", drPath);
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return driver;
    }
}
