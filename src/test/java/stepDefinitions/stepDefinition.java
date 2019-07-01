package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^that I run a search for \"([^\"]*)\" on Google$")
    public void that_i_run_a_search_for_something_on_google(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Given("^I click on the link to the TruNarrative Team$")
    public void i_click_on_the_link_to_the_trunarrative_team() throws Throwable {
        throw new PendingException();
    }

    @When("^I select the link to the homepage $")
    public void i_select_the_link_to_the_homepage() throws Throwable {
        throw new PendingException();
    }

    @When("^I view \"([^\"]*)\" leadership team members $")
    public void i_view_something_leadership_team_members(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^I can view the TruNarrative strap line $")
    public void i_can_view_the_trunarrative_strap_line() throws Throwable {
        throw new PendingException();
    }

    @Then("^that the following members have their respective roles: $")
    public void that_the_following_members_have_their_respective_roles() throws Throwable {
        throw new PendingException();
    }

    @And("^it appears as the first search result $")
    public void it_appears_as_the_first_search_result() throws Throwable {
        throw new PendingException();
    }

}