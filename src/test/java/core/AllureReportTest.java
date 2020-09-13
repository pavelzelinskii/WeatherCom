package core;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import io.qameta.allure.*;

public class AllureReportTest {

	public WebDriver driver;
	static Properties info = new Properties();
	static String browser = System.getProperty("browser"); // -Dbrowser="firefox"

	@Step("Step [Compare Value of Weather in Fahrenheit]")
	public void assertElement01(String expected, String actual) {
		Assert.assertEquals(expected, actual);
	};

	@Step("Step [Compare Value of Weather in Celsius]")
	public void assertElement02(String expected, String actual) {
		Assert.assertEquals(expected, actual);
	};

	@Step("Step [Compare User's Location]")
	public void assertElement03(String expected, String actual) {
		Assert.assertEquals(expected, actual);
	};

	@Step("Step [Validate Element]")
	public void assertElement04(String expected, String actual) {
		Assert.assertEquals(expected, actual);
	};

	@Test(priority = 1, description = "Main Page")
	@Description("Comparising weather in Fahrenheit and Celsius, Findig User,s Location and Elements Validation")
	public void MainPageTest() throws Exception {

		assertElement01(MainPage.compareFahrenheit(), MainPage.cleanFahrenheit());
		assertElement02(MainPage.compareCelsius(), MainPage.convertInCelsius());
		assertElement03(MainPage.compareLocation(), Common.takeValue(By.xpath(info.getProperty("el_12"))));

		assertElement04("This element on the page",
				Common.isThisElementOnPage(By.className(info.getProperty("el_01"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_02"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_03"))));
		assertElement04("This element on the page",
				Common.isThisElementOnPage(By.className(info.getProperty("el_04"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_05"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_06"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_07"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_08"))));
		assertElement04("This element on the page",
				Common.isThisElementOnPage(By.className(info.getProperty("el_09"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_11"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_12"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_14"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_15"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_16"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_17"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_18"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_19"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_20"))));
		assertElement04("This element on the page",
				Common.isThisElementOnPage(By.className(info.getProperty("el_21"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.id(info.getProperty("el_22"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_23"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_24"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_25"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_26"))));
		Common.scrollDown();
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_27"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_28"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.id(info.getProperty("el_29"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.id(info.getProperty("el_30"))));
		Common.scrollDown2();
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_34"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_35"))));
		Common.scrollDown();
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_37"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_38"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_39"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_40"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_41"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_42"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_43"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_44"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_45"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_46"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_47"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_48"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_49"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_50"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_51"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_52"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_53"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_54"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_55"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_56"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_57"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_58"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_59"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_60"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_61"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_62"))));
		Common.scrollUp();
		Common.leftClickOnElement(By.xpath(info.getProperty("el_63")));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_64"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_65"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_66"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_67"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_68"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_69"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_70"))));
		Common.leftClickOnElement(By.xpath(info.getProperty("el_71")));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_72"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_73"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_74"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_75"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_76"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_77"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_78"))));
//		   Assert.assertEquals("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_79"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_80"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_81"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_82"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_83"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_84"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_85"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_86"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_87"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_88"))));
//		   assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_89"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_90"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_91"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_92"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_93"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_94"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_95"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_96"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_97"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_98"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_99"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_100"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_101"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_102"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_103"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_104"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_105"))));
		Common.leftClickOnElement(By.xpath(info.getProperty("el_106")));
		Common.moveElement(By.className(info.getProperty("el_107")));
		assertElement04("This element on the page",
				Common.isThisElementOnPage(By.className(info.getProperty("el_108"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_109"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_110"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_111"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_112"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_113"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_114"))));
		Common.leftClickOnElement(By.xpath(info.getProperty("el_113")));

	}

	@Test(dependsOnMethods = { "MainPageTest" }, priority = 2, description = "Fishing Page")
	@Description("Comparising weather in Fahrenheit and Celsius, Findig User,s Location and Elements Validation")
	public void FishingPageTest() throws Exception {

		Common.waitTitlePage("Fishing - weather.com");

		assertElement01(MainPage.compareFahrenheit(), MainPage.cleanFahrenheit());
		assertElement02(MainPage.compareCelsius(), MainPage.convertInCelsius());
		assertElement03(MainPage.compareLocation(), Common.takeValue(By.xpath(info.getProperty("el_12"))));

		assertElement04("This element on the page",
				Common.isThisElementOnPage(By.className(info.getProperty("el_01"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_02"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_03"))));
		assertElement04("This element on the page",
				Common.isThisElementOnPage(By.className(info.getProperty("el_04"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_05"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_06"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_07"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_08"))));
		assertElement04("This element on the page",
				Common.isThisElementOnPage(By.className(info.getProperty("el_09"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_11"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_12"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_115"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_116"))));
		Common.scrollDown();
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_37"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_38"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_39"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_40"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_41"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_42"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_43"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_44"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_45"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_46"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_47"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_48"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_49"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_50"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_51"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_52"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_53"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_54"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_55"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_56"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_57"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_58"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_59"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_60"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_61"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_62"))));
		Common.scrollUp();
		Common.leftClickOnElement(By.xpath(info.getProperty("el_63")));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_64"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_65"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_66"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_67"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_68"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_69"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_70"))));
		Common.leftClickOnElement(By.xpath(info.getProperty("el_71")));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_72"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_73"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_74"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_75"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_76"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_77"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_78"))));
//		   Assert.assertEquals("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_79"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_80"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_81"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_82"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_83"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_84"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_85"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_86"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_87"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_88"))));
//		   assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_89"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_90"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_91"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_92"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_93"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_94"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_95"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_96"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_97"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_98"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_99"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_100"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_101"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_102"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_103"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_104"))));
		assertElement04("This element on the page", Common.isThisElementOnPage(By.xpath(info.getProperty("el_105"))));
		Common.leftClickOnElement(By.xpath(info.getProperty("el_106")));

	}

	@BeforeClass
	@Step("Step [open browser]")
	public void setUp() throws Exception {
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
	@Step("Step [close browser]")
	public void tearDowm() {
		Common.stopDriver();
	}
}