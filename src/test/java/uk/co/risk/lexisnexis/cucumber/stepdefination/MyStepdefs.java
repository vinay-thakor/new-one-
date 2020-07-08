package uk.co.risk.lexisnexis.cucumber.stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.risk.lexisnexis.pages.HomePage;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class MyStepdefs {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {

    }

    @When("^I click on productSignIn link$")
    public void iClickOnProductSignInLink() {
        new HomePage().clickOnProductSignIn();

    }

    @Then("^I will navigate to product sing in page$")
    public void iWillNavigateToProductSingInPage() {
    }
}
