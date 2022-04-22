package com.acme.coreBanking.practice;

import com.acme.coreBanking.utils.ConfigurationReader;
import com.acme.coreBanking.utils.Driver;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Practice1 {

    WebDriver driver;

    @Before
    public void setupDriver(){
        driver=Driver.get();
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }

    @Test
    public void test1() throws InterruptedException {

        driver.get(ConfigurationReader.get("url"));
        Thread.sleep(3000);
        String actualTitle = driver.getTitle();
        String expectedTitle="ACME demo app";

        Assert.assertEquals("title mismatch ",expectedTitle,actualTitle);

        String actualCurrentUrl = driver.getCurrentUrl();

        driver.findElement(By.xpath("//span[.='Make Payment']")).click();


    }









}
