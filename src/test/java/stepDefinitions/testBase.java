package stepDefinitions;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testBase {
	public WebDriver driver = null;
	
	@Test
	public void browserSelect() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fileInputStream = new FileInputStream("/Users/varun/Desktop/Coding/Projects/trunarrative-framework/src/test/java/stepDefinitions/data.properties");
		prop.load(fileInputStream);
		
		if (prop.getProperty("browser").contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/varun/Desktop/Coding/Projects/chromedriver");
			driver = new ChromeDriver();
		}
		else if (prop.getProperty("browser").contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/varun/Desktop/Coding/Projects/geckodriver");
			driver = new FirefoxDriver();
		}
		driver.get(prop.getProperty("url")); 
	}
}