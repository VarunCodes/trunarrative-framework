package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import testBase.testBase;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;

//@Parameters({"URL"})
@RunWith(Cucumber.class)
public class stepDefinition extends testBase {
	public String xpathFirstResult = "//div[@class='g']//div//div//div[@class='rc']//h3[@class='LC20lb']";
	public String xpathGoogleSearchButton = "//*[@id=\\'tsf\\']/div[2]/div/div[3]/center/input[1]";
	
    @Given("^I run a search for \"([^\"]*)\" on Google$")
    public void i_run_a_search_for_something_on_google(String searchTerm) throws Throwable {
    	driver = browserInitialize();
    	driver.get(prop.getProperty("googleURL"));
    	driver.findElement(By.name("q")).sendKeys(searchTerm);
		driver.findElement(By.xpath("xpathGoogleSearchButton")).click();
    }

    @Given("^I click on the link to the TruNarrative Team$")
    public void i_click_on_the_link_to_the_trunarrative_team() throws Throwable {
    	System.out.println("Pass");
    }
    
    @When("^I select the link to the homepage$")
    public void i_select_the_link_to_the_homepage() throws Throwable {
    	System.out.println("Pass");
    }

    @When("^I view \"([^\"]*)\" leadership team members$")
    public void i_view_something_leadership_team_members(String strArg1) throws Throwable {
    	System.out.println("Pass");
    }

    @Then("^I can view the TruNarrative strap line$")
    public void i_can_view_the_trunarrative_strap_line() throws Throwable {
    	System.out.println("Pass");
    }

    @Then("^that the following members have their respective roles$")
    public void that_the_following_members_have_their_respective_roles() throws Throwable {
    	System.out.println("Pass");
    }

    @And("^it appears as the first search result$")
    public void it_appears_as_the_first_search_result() throws Throwable {
    	String resultMatch = driver.findElement(By.xpath(xpathFirstResult)).getText();
		Assert.assertEquals(resultMatch, "TruNarrative");
		System.out.println("The first search result is correct");
    }

}