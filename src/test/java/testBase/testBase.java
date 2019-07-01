package testBase;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testBase {
	public WebDriver driver;
	public Properties prop;

	public WebDriver browserInitialize() throws IOException
	{
		prop = new Properties();
		FileInputStream fileInputStream = new FileInputStream("/Users/varun/Desktop/Coding/Projects/trunarrative-framework/src/test/java/testBase/data.properties");
		prop.load(fileInputStream);
		
		if (prop.getProperty("browser").contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/varun/Desktop/Coding/Projects/chromedriver");
			driver = new ChromeDriver();
		}
		else if (prop.getProperty("browser").contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/varun/Desktop/Coding/Projects/geckodriver");
			driver = new FirefoxDriver();
		}
		return driver;
//		driver.get(prop.getProperty("googleURL"));
//		driver.get(prop.getProperty("truNarrativeURL"));
	}
	
}