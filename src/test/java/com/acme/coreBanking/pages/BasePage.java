package com.acme.coreBanking.pages;

import com.acme.coreBanking.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @FindBy(id = "search")
    public WebElement searchBox;

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




}
