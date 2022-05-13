package com.acme.coreBanking.practice;

import com.acme.coreBanking.utils.ConfigurationReader;
import com.acme.coreBanking.utils.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebTables {

    WebDriver driver;

    @Before
    public void setUp() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        Driver.closeDriver();
    }


    @Test
    public void webTabeTest() {

        driver.get(ConfigurationReader.get("url"));

        WebElement amountOfSturbucks = getAmountByBrandName("Shopify product");

        String actualAmount = amountOfSturbucks.getText();

        Assert.assertEquals("+ 17.99 USD",actualAmount);

        List<WebElement> tableHeaders = getTableHeaders();

        for (WebElement tableHeader : tableHeaders) {
            System.out.println(tableHeader.getText());
        }

        System.out.println("getRowDataBybrandName(\"Shopify product\") = " + getRowDataBybrandName("Shopify product"));

        Map<String, String> dataMap = getRowDataBybrandName("Shopify product");
        Assert.assertEquals("Shopping",dataMap.get("CATEGORY"));

    }

    public WebElement getAmountByBrandName(String brandName) {
        return driver.findElement(By.xpath("//span[.='"+brandName+"']/../../td[5]"));

    }


    public List<WebElement> getTableHeaders(){
        List<WebElement> elements = driver.findElements(By.xpath("//th"));
        return elements;
    }


    public Map<String,String> getRowDataBybrandName(String brandName){

        String sellector = String.format("//span[.='%s']/../..//td", brandName);

        List<WebElement> cells = driver.findElements(By.xpath(sellector));
        List<WebElement> tableHeaders = getTableHeaders();

        HashMap<String, String> dataMap = new HashMap<>();

        for (int i=0; i<tableHeaders.size();i++) {
            dataMap.put(tableHeaders.get(i).getText(),cells.get(i).getText());
        }

        return dataMap;
    }




    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("ali");
        arr.add("veli");

        arr.get(1);


        Map<String, String > row = new HashMap<>();

        row.put("adi","yusuf");

        System.out.println(row.get("adi"));


    }


}
