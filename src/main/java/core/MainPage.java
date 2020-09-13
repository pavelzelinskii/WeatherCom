package core;

import java.io.FileInputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import com.aventstack.extentreports.ExtentTest;

class MainPage {

	static Properties info = new Properties();
	static Writer report;

	static void open(String browser) throws Exception {
		info.load(new FileInputStream("./elements.properties"));
		Common.openBrowser(browser, info.getProperty("uri"));
	}

	static String convertInCelsius() throws Exception {

		info.load(new FileInputStream("./elements.properties"));
		String inFahrenheit = Common.takeValue(By.xpath(info.getProperty("el_11")));
		String regex = info.getProperty("regex");
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(inFahrenheit);
		m.find();
		double cleanFar = Double.parseDouble(m.group(1).replace("°", ""));
		double inCel = new BigDecimal((cleanFar - 32) * 5 / 9).setScale(1, RoundingMode.HALF_UP).doubleValue();
		String inCelsius = String.valueOf(inCel);

		return inCelsius;
	}

	static String cleanFahrenheit() throws Exception {

		info.load(new FileInputStream("./elements.properties"));
		String inFahrenheit = Common.takeText(By.xpath(info.getProperty("el_11")));
		String regex = info.getProperty("regex");
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(inFahrenheit);
		m.find();
		double Fahrenheit = Double.parseDouble(m.group(1).replace("°", ""));
		String cleanFahr = String.valueOf(Fahrenheit);

		return cleanFahr;
	}
	
	static String compareFahrenheit() throws Exception {

		info.load(new FileInputStream("./elements.properties"));
		
		String getWeather = cleanFahrenheit();
		String regex = info.getProperty("regexweather");
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(getWeather);
		m.find();
		double weather1 = Double.parseDouble(m.group(1));
		String weather = String.valueOf(weather1);
		
		return weather;
	}
	
	static String compareCelsius() throws Exception {

		info.load(new FileInputStream("./elements.properties"));
		
		String getWeather = convertInCelsius();
		String regex = info.getProperty("regexweather");
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(getWeather);
		m.find();
		double weather1 = Double.parseDouble(m.group(1));
		String weather = String.valueOf(weather1);
		
		return weather;
	}
	
	static String compareLocation() throws Exception {

		info.load(new FileInputStream("./elements.properties"));
		
		String getLocation = Common.takeValue(By.xpath(info.getProperty("el_12")));
		String regex = info.getProperty("regexlocation");
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(getLocation);
		m.find();
		
		return getLocation;
	}

	static void validateElementsAndConvertFahrenheit(ExtentTest logger) throws Exception {
		info.load(new FileInputStream("./elements.properties"));

		Common.writeLineWithInformation("Actual your weather now in °F on Main Page", compareFahrenheit(), cleanFahrenheit(), logger);

		Common.writeLineWithInformation("Actual your weather now in °C on Main Page", compareCelsius(), convertInCelsius(), logger);

		Common.writeLineWithInformation("Actual your location now on Main Page ", compareLocation(),
				Common.takeValue(By.xpath(info.getProperty("el_12"))), logger);

	}
}
