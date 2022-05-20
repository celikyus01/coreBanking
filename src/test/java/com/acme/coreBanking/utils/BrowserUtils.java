package com.acme.coreBanking.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BrowserUtils {

    public static void click(WebElement element){
        try {
            element.click();
        }catch (ElementClickInterceptedException e){
            clickWithJSE(element);
        }
    }

    public static void clickWithJSE(WebElement element){
        executeJSE("arguments[0].click();",element);
    }


    public static void executeJSE(String script,WebElement element){
        JavascriptExecutor executor= (JavascriptExecutor) Driver.getDriver();
        executor.executeScript(script, element);
    }

    public static void executeJSE(String script){
        JavascriptExecutor executor= (JavascriptExecutor) Driver.getDriver();
        executor.executeScript(script);
    }

    public static void clickByText(String text){
        click(getElementByText(text));
    }


    public static WebElement getElementByText(String text){
        String xpath = "//*[.='"+text+"']";
        return Driver.getDriver().findElement(By.xpath(xpath));

    }



}
