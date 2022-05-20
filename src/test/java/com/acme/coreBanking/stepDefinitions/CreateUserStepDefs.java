package com.acme.coreBanking.stepDefinitions;

import com.acme.coreBanking.pages.PracticeForms;
import com.acme.coreBanking.pages.WelcomePage;
import com.acme.coreBanking.utils.ConfigurationReader;
import com.acme.coreBanking.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CreateUserStepDefs {

    PracticeForms practiceForms = new PracticeForms();

    @Given("I am on the login screen")
    public void i_am_on_the_login_screen() throws InterruptedException {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String url = ConfigurationReader.get("url");
        Driver.getDriver().get(url);
    }

    @When("I navigate to create user page")
    public void i_navigate_to_create_user_page() {


    }

    @Then("I verify the page header as {string}")
    public void i_verify_the_page_header_as(String string) {
     //TODO will be implemented
    }

    @Then("Verify title as {string}")
    public void verifyTitleAs(String expectedPageTitle) {
        String actualPageTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Mismatch between expected and actual title.",expectedPageTitle,actualPageTitle);
        PracticeForms forms = new PracticeForms();
        WebElement searchBox = forms.searchBox;

    }

    @When("I put firstname as {string}")
    public void iPutFirstnameAs(String firsName) {
        practiceForms.firstNameInputBox.sendKeys(firsName);
    }

    @And("I put lastName as {string}")
    public void iPutLastNameAs(String lastName) {
        practiceForms.firstNameInputBox.sendKeys(lastName);
    }

    @When("I navigate to {string} page")
    public void iNavigateToPage(String menuName) {
        new WelcomePage().navigate(menuName);
    }
}
