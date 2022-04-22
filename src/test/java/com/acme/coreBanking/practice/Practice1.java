package com.acme.coreBanking.practice;

import com.acme.coreBanking.utils.ConfigurationReader;
import com.acme.coreBanking.utils.Driver;
import org.openqa.selenium.WebDriver;

public class Practice1 {

    public static void main(String[] args) {
        WebDriver driver = Driver.get();
        driver.get(ConfigurationReader.get("url"));
        System.out.println("what is the name= "+ ConfigurationReader.get("name"));

        driver.manage().window().maximize();
        Driver.closeDriver();
    }






}
