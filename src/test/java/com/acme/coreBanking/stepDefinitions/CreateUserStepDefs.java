package com.acme.coreBanking.stepDefinitions;

import com.acme.coreBanking.utils.ConfigurationReader;
import com.acme.coreBanking.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateUserStepDefs {

    @Given("I am on the login screen")
    public void i_am_on_the_login_screen() throws InterruptedException {

        String url = ConfigurationReader.get("url");
        Driver.getDriver().get(url);
    }

    @When("I navigate to create user page")
    public void i_navigate_to_create_user_page() {


    }

    @Then("I verify the page header as {string}")
    public void i_verify_the_page_header_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify title as {string}")
    public void verifyTitleAs(String expectedPageTitle) {
        String actualPageTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Mismatch between expected and actual title.",expectedPageTitle,actualPageTitle);

    }


}
