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
		
		if (prop.getProperty("browser").contains("Chrome")) {
			driver = new ChromeDriver();
		}
		else if (prop.getProperty("browser").contains("Firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get(prop.getProperty("url")); 
	}
}