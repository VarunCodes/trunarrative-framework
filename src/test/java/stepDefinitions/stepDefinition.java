package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import testBase.testBase;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Point;
import org.testng.Assert;
import org.testng.annotations.Parameters;

//@Parameters({"URL"})
@RunWith(Cucumber.class)
public class stepDefinition extends testBase {
	public String resultMatch;
	public String xpathFirstResult = "//div[@class='g']//div//div//div[@class='rc']//h3[@class='LC20lb']";
	public String xpathGoogleSearchButton = "//*[@id=\\'tsf\\']/div[2]/div/div[3]/center/input[1]";
	
    @Given("^I run a search for \"([^\"]*)\" on Google$")
    public void i_run_a_search_for_something_on_google(String searchTerm) throws Throwable {
    	driver = browserInitialize();
    	driver.get(prop.getProperty("googleURL"));
    	driver.findElement(By.name("q")).sendKeys(searchTerm);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.name("btnK")).click();
    }

    @Given("^I click on the link to the TruNarrative Team$")
    public void i_click_on_the_link_to_the_trunarrative_team() throws Throwable {
    	driver.findElement(By.id("menu-item-6055")).click();
    	driver.findElement(By.id("menu-item-6388")).click();
    	System.out.println("Pass");
    }
    
    @Given("^it points to \"([^\"]*)\"$")
    public void it_points_to(String resultUrl) throws Throwable {
    	String actualFirstUrl = driver.findElement(By.linkText("TruNarrative")).getAttribute("href");
    	Assert.assertEquals(actualFirstUrl, resultUrl);
    }
    
    @Given("^I am on the TruNarrative homepage$")
    public void i_am_on_the_trunarrative_homepage() throws Throwable {
    	driver = browserInitialize();
    	driver.manage().window().maximize();
        driver.get("https://trunarrative.com/");
    }
    
    @When("^I click the first result$")
    public void i_clik_the_first_result() throws Throwable {
    	driver.findElement(By.xpath(xpathFirstResult)).click();
    }

    @When("^I view \"([^\"]*)\" leadership team members$")
    public void i_view_something_leadership_team_members(int teamCount) throws Throwable {
    	System.out.println("Pass");
    	int actualTeamCount = driver.findElements(By.className("stack-img-content")).size();
    	Assert.assertEquals(actualTeamCount, teamCount);
    }

    @Then("^I can view the TruNarrative strap line$")
    public void i_can_view_the_trunarrative_strap_line() throws Throwable {
    	System.out.println("Pass");
    }

    @Then("^the following members have their respective roles:$")
    public void the_following_members_have_their_respective_roles(DataTable teamTable) throws Throwable {
//    	getLocation()
    	List<Map<String, String>> list = teamTable.asMaps(String.class, String.class);
    	for(int i=0; i<list.size(); i++) {
    		Point namePoint = driver.findElement(By.linkText(list.get(i).get("name"))).getLocation();
    		System.out.println("X Position : " + namePoint.x);
    		System.out.println("Y Position : " + namePoint.y);
    		
    		Point rolePoint = driver.findElement(By.linkText(list.get(i).get("role"))).getLocation();
    		System.out.println("X Position : " + rolePoint.x);
    		System.out.println("Y Position : " + rolePoint.y);
    		
    		Assert.assertEquals("John Lord", list.get(i).get("name"));
    		Assert.assertEquals("Founder and CEO", list.get(i).get("role"));

    		System.out.println(list.get(i).get("name"));
    		System.out.println(list.get(i).get("role"));
    	}
    }
    
    @And("^it appears as the first search result$")
    public void it_appears_as_the_first_search_result() throws Throwable {
    	//String resultMatch = driver.findElement(By.xpath(xpathFirstResult)).getText();
    	String resultMatch = driver.findElement(By.cssSelector("h3.LC20lb")).getText();  	
		Assert.assertEquals(resultMatch, "TruNarrative");
		System.out.println("The first search result is correct");
    }

}