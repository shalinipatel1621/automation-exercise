package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TestCasesPage extends Utility {

    private static final Logger log = LogManager.getLogger(TestCasesPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Test Cases')]")
    WebElement testCasesLink;

    public void clickOnTestCasesButton() {
        log.info("Click on Test Cases Button" + testCasesLink.toString());
        clickOnElement(testCasesLink);
    }

    public String getCurrentURL(){
        waitUntilVisibilityOfElementLocated(By.xpath("//b[normalize-space()='Test Cases']"), 5);
        log.info("Getting Home Page URL : ");
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl();
}

    }

