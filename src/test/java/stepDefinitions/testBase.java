package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class testBase {
	public WebDriver driver = null;
	
	@Test
	public void Login() throws IOException
	{
		Properties properties = new Properties();
		FileInputStream fileInputStream = new FileInputStream("/Users/varun/Desktop/Coding/Projects/trunarrative-framework/src/test/java/stepDefinitions/data.properties");
		properties.load(fileInputStream);
	}
}