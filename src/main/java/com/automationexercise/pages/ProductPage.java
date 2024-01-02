package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[@class='title text-center']")
    WebElement allProductText;

    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'nav nav-pills nav-justified']/li/a")
    WebElement viewProductTab;

    @CacheLookup
    @FindBy (xpath = "//input[@id='search_product']")
    WebElement searBar;


    @CacheLookup
    @FindBy (xpath = "//i[@class='fa fa-search']")
    WebElement searchButton;

    @CacheLookup
    @FindBy (xpath = "//h2[normalize-space()='Searched Products']")
    WebElement searchedProductsText;

    @CacheLookup
    @FindBy (xpath = "//div[@class = 'single-products']/div/p")
    WebElement searchedProductName;




    public String getAllProductText() throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(allProductText);
    }

    public void clickOnBlueTop(){
        clickOnElement(viewProductTab);
    }

    public void sendTextToSearchBar(String pName) {
        sendTextToElement(searBar, pName);
        log.info("Sending "+ pName + " to search bar : " + searBar.toString());
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
        log.info("Clicking on the search button : " + searchButton.toString());
    }

    public String getSearchedProductsText(){
        log.info("Getting Searched Products text : " + searchedProductsText.toString());
        return getTextFromElement(searchedProductsText);
    }

    public String getSearchedProductName() {
        log.info("Getting Searched Product name : " + searchedProductName.toString());
        return getTextFromElement(searchedProductName);
    }

}
