package core;

import java.io.FileInputStream;
import java.io.Writer;
import java.util.Properties;
import org.openqa.selenium.By;
import com.aventstack.extentreports.ExtentTest;
public class FishingPage {
	
	static Properties info = new Properties();
	static Writer report;
	
	static void validateElementsAndConvertInFahrenheit(ExtentTest logger) throws Exception {
		info.load(new FileInputStream("./elements.properties"));

		Common.writeLineWithInformation("Actual your weather now in °F on Fishing Page", MainPage.compareFahrenheit(), MainPage.cleanFahrenheit(), logger);

		Common.writeLineWithInformation("Actual your weather now in °C on Fishing Page", MainPage.compareCelsius(), MainPage.convertInCelsius(), logger);

		Common.writeLineWithInformation("Actual your location now on Fishing Page", MainPage.compareLocation(),
				Common.takeValue(By.xpath(info.getProperty("el_12"))), logger);
	}

}
