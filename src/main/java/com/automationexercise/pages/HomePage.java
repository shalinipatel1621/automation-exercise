package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement signupAndLoginButton;


    @CacheLookup
    @FindBy(xpath = "//a[@href='/products']")
    WebElement productsTab;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    WebElement subscriptionText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='susbscribe_email']")
    WebElement subscriptionEmail;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    WebElement subscriptionArrowButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert-success alert']")
    WebElement subscriptionSuccessMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cart']")
    WebElement cartMenuLink;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-angle-up']")
    WebElement bottomRightArrowButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")
    WebElement fullFledgedText;

    @CacheLookup
    @FindBy(xpath = "//div[@id = 'recommended-item-carousel']//div[@class = 'productinfo text-center']/p")
    List<WebElement> recommendedItemsProductsList;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='recommended items']")
    WebElement recommendedItemsText;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement dress;

    public void clickOnSignupAndLoginButton(String s) {
        log.info("Click on Signup/Login Button" + signupAndLoginButton.toString());
        clickOnElement(signupAndLoginButton);

    }


    public void clickOnProductsTab() {
        clickOnElement(productsTab);
        log.info("Clicking on products tab : " + productsTab.toString());
    }

    public void scrollDownToSubscriptionLink() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", subscriptionText);
        log.info("Scroll Down to Subscription");
    }

    public void sendDataToSubscriptionEmail(String email) {
        sendTextToElement(subscriptionEmail, email);
        log.info("Sending " + email + " to subscription email field : " + subscriptionEmail.toString());

    }

    public void clickOnArrowToSubscribe() {
        clickOnElement(subscriptionArrowButton);
        log.info("Clicking on subscription arrow button : " + subscriptionArrowButton.toString());
    }

    public String getSubscriptionSuccessMessage() {
        log.info("Getting subscription success message : " + subscriptionSuccessMessage.toString());
        return getTextFromElement(subscriptionSuccessMessage);
    }

    public void clickOnCartButton() {
        log.info("Click on Cart Button" + cartMenuLink.toString());
        clickOnElement(cartMenuLink);
    }


    public void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,0)", "");
        log.info("Scroll up to (0,0)");

    }

    public void clickOnBottomRightArrowButton() {
        log.info("Clicking on bottom right corner arrow button : " + bottomRightArrowButton.toString());
        clickOnElement(bottomRightArrowButton);
    }

    public String getFullFledgedText() {
        log.info("Getting full fledged text from top of the page : " + fullFledgedText.toString());
        return getTextFromElement(fullFledgedText);
    }

    public String getSubscriptionText() {
        log.info("Getting Subscription text : " + subscriptionText.toString());
        return getTextFromElement(subscriptionText);
    }

    public String getRecommendedItemText() {
        log.info("Getting recommended items text : " + recommendedItemsText.toString());
        return getTextFromElement(recommendedItemsText);
    }


    public void scrollDownToRecommendedItems() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", recommendedItemsText);
        log.info("Scroll Down to recommended items");
    }


    public void clickAddToCartOnRecommendedItems() {
        clickOnElement(dress);
            }
        }

