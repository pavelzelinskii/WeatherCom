package core;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.markuputils.*;
import com.aventstack.extentreports.reporter.*;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsTest {
	public WebDriver driver;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	static Properties info = new Properties();
	static String browser = System.getProperty("browser"); // -Dbrowser="firefox"

	@Test(priority = 0)
	public void MainPageTest() throws Exception {
		logger = extent.createTest("Main Page Validation");
		MainPage.validateElementsAndConvertFahrenheit(logger);

		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.className(info.getProperty("el_01"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_02"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_03"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.className(info.getProperty("el_04"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_05"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_06"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_07"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_08"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.className(info.getProperty("el_09"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_11"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_12"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_14"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_15"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_16"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_17"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_18"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_19"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_20"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.className(info.getProperty("el_21"))));
		Assert.assertEquals("This element on the page", Common.isThisElementOnPage(By.id(info.getProperty("el_22"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_23"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_24"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_25"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_26"))));
		Common.scrollDown();
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_27"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_28"))));
		Assert.assertEquals("This element on the page", Common.isThisElementOnPage(By.id(info.getProperty("el_29"))));
		Assert.assertEquals("This element on the page", Common.isThisElementOnPage(By.id(info.getProperty("el_30"))));
		Common.scrollDown2();
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_34"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_35"))));
		Common.scrollDown();
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_37"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_38"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_39"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_40"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_41"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_42"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_43"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_44"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_45"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_46"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_47"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_48"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_49"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_50"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_51"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_52"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_53"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_54"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_55"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_56"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_57"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_58"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_59"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_60"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_61"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_62"))));
		Common.scrollUp();
		Common.leftClickOnElement(By.xpath(info.getProperty("el_63")));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_64"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_65"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_66"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_67"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_68"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_69"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_70"))));
		Common.leftClickOnElement(By.xpath(info.getProperty("el_71")));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_72"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_73"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_74"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_75"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_76"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_77"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_78"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_80"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_81"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_82"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_83"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_84"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_85"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_86"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_87"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_88"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_90"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_91"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_92"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_93"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_94"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_95"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_96"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_97"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_98"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_99"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_100"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_101"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_102"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_103"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_104"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_105"))));
		Common.leftClickOnElement(By.xpath(info.getProperty("el_106")));
		Common.moveElement(By.className(info.getProperty("el_107")));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.className(info.getProperty("el_108"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_109"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_110"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_111"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_112"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_113"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_114"))));
		Common.leftClickOnElement(By.xpath(info.getProperty("el_113")));

	}

	@Test(dependsOnMethods = { "MainPageTest" }, priority = 1)
	public void FishingPageTest() throws Exception {
		Common.waitTitlePage("Fishing - weather.com");

		logger = extent.createTest("Fishing Page Validation");
		FishingPage.validateElementsAndConvertInFahrenheit(logger);

		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.className(info.getProperty("el_01"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_02"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_03"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.className(info.getProperty("el_04"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_05"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_06"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_07"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_08"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.className(info.getProperty("el_09"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_11"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_12"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_115"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_116"))));
		Common.scrollDown();
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_37"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_38"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_39"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_40"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_41"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_42"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_43"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_44"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_45"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_46"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_47"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_48"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_49"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_50"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_51"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_52"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_53"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_54"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_55"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_56"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_57"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_58"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_59"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_60"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_61"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_62"))));
		Common.scrollUp();
		Common.leftClickOnElement(By.xpath(info.getProperty("el_63")));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_64"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_65"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_66"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_67"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_68"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_69"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_70"))));
		Common.leftClickOnElement(By.xpath(info.getProperty("el_71")));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_72"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_73"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_74"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_75"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_76"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_77"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_78"))));
//	   Assert.assertEquals("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_79"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_80"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_81"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_82"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_83"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_84"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_85"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_86"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_87"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_88"))));
//	   Assert.assertEquals("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_89"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_90"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_91"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_92"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_93"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_94"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_95"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_96"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_97"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_98"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_99"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_100"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_101"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_102"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_103"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_104"))));
		Assert.assertEquals("This element on the page",
				Common.isThisElementOnPage(By.xpath(info.getProperty("el_105"))));
		Common.leftClickOnElement(By.xpath(info.getProperty("el_106")));
	}

	@BeforeClass
	public void beforeClass() throws Exception {
		if (browser == null) {
			System.err.println("Please provide browser: -Dbrowser=firefox");
			System.exit(0);
		} else if (!browser.equalsIgnoreCase("chrome") && !browser.equalsIgnoreCase("firefox")
				&& !browser.equalsIgnoreCase("safari") && !browser.equalsIgnoreCase("edge")) {
			System.err.println("Framework supports only: Chrome, Firefox, Safari or Edge");
			System.exit(0);
		}
		MainPage.open(browser);
		info.load(new FileInputStream("./elements.properties"));
	}

	@AfterClass
	public void afterClass() {
		Common.stopDriver();
	}

	@BeforeTest
	public void startReport() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/extentreports.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("User Name", "Alex Chekinskii");
		extent.setSystemInfo("Browser", browser);
		htmlReporter.config().setDocumentTitle("Main Page");
		htmlReporter.config().setReportName("Elements Validation and Convert Fahrenheit in Celsius"); // DARK
		htmlReporter.config().setTheme(Theme.STANDARD);
	}

	@AfterMethod
	public void getResult(ITestResult result) throws Exception {
		String screenshotPath = Common.takeScreenShot(result.getName());
		logger.addScreenCaptureFromPath(screenshotPath);
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS,
					MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
		}
	}

	@AfterTest
	public void endReport() {
		extent.flush();
	}
}
