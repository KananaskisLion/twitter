package com.Google.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;

public class GoogleHomePage extends BasePage{

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="(//input)[1]")
    private WebElement searchBox;

    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")
    private WebElement searchButton;



    public void searchFor(String keyword) throws InterruptedException {
        Thread.sleep(1000);
        searchBox.sendKeys(keyword + Keys.ENTER);
        Thread.sleep(1000);
    }

    public void titleVerification(String expectedTitle) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
        Thread.sleep(1000);
    }


}
