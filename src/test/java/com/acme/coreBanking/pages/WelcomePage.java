package com.acme.coreBanking.pages;

import com.acme.coreBanking.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

    public WelcomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
