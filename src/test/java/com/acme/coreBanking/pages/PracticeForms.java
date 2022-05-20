package com.acme.coreBanking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeForms extends BasePage{

    @FindBy(id = "firstName")
    public WebElement firstNameInputBox;

    @FindBy(id = "lastName")
    public WebElement lastNameInputBox;

    @FindBy(id = "submit")
    public WebElement submitButton;
}
