package com.acme.coreBanking.pages;

import com.acme.coreBanking.utils.BrowserUtils;
import com.acme.coreBanking.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

    public WelcomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void navigate(String menuName){
//        String navigationMenu= String.format("//h5[.='%s']", menuName);
        String navigationMenu= "//h5[.='"+menuName+"']";
        WebElement element = Driver.getDriver().findElement(By.xpath(navigationMenu));
        BrowserUtils.click(element);
    }


}
