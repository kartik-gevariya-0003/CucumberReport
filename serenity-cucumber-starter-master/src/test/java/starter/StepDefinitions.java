package starter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class StepDefinitions extends ScenarioSteps {

    @Steps
    private DemoPage demoPage;

    public StepDefinitions() {

    }

    @When("^User hit Google page URL$")
    public void when_User_hit_google_page_URL() throws Throwable {
        demoPage.open();
    }

    @Then("^google search screen should display to user$")
    public void google_search_screen_should_display_to_user() throws Throwable {
        Assert.assertTrue(demoPage.isSearchDisplayed());
    }

    @When("^User enters any keyword$")
    public void user_enters_keyword() throws Throwable {
        demoPage.search("Selenium with cucumber in java");
        demoPage.clickSearch();
    }

    @Then("^search results should display to user$")
    public void search_results_should_display_to_user() throws Throwable {

    }

}
