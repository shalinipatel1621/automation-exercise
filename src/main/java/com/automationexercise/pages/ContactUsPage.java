package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends Utility {

    private static final Logger log = LogManager.getLogger(ContactUsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    WebElement getInTouchText;


    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Contact us']")
    WebElement contactUsTab;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement nameField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement emailField;


    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Subject']")
    WebElement subjectField;

    @CacheLookup
    @FindBy(xpath = "//textarea[@id='message']")
    WebElement messageField;

    @CacheLookup
    @FindBy(xpath = "//input[@name='submit']")
    WebElement submitButton;

    @CacheLookup
    @FindBy(xpath = "//input[@name='upload_file']")
    WebElement uploadFile;

    @CacheLookup
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    WebElement successMessageText;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Home']")
    WebElement homeButton;

    public void clickOnContactUsButton() {
        clickOnElement(contactUsTab);
        log.info("click on contact" + contactUsTab.toString());
    }

    public void getContactUsMessageText() {
        getTextFromElement(successMessageText);
        log.info("success message" + successMessageText.toString());
    }

    public void verifyGetInTouchText() {
        getTextFromElement(getInTouchText);
        log.info("get in touch message" + getInTouchText);
    }

    public void sendDataToNameField(String name, String email, String subject, String message) {
        log.info("Sending " + name + " to name field : " + nameField.toString());
        sendTextToElement(nameField, name);
        log.info("Sending " + email + " to email field : " + emailField.toString());
        sendTextToElement(emailField, email);
        log.info("Sending " + subject + " to subject field : " + subjectField.toString());
        sendTextToElement(subjectField, subject);
        log.info("Sending " + message + " to message field : " + messageField.toString());
        sendTextToElement(messageField, message);
    }

    public void clickOnSubmitButton() {
        //clickOnElement(submitButton);
        try {
            submitButton.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@name='submit']")));
        }
        log.info("Clicking on submit button : " + submitButton.toString());
    }


    public void uploadFile() {
        uploadFile.sendKeys("C:/soft/automation.txt");
        log.info("Uploading file : " + uploadFile.toString());
    }

    public void acceptPopupMessage() {
        acceptAlert();
        log.info("Accepting the alert:");
    }

    public void clickOnHomeButton() {
        clickOnElement(homeButton);
        log.info("Clicking on home button : " + homeButton.toString());
    }

    public String getCurrentURL() {
        log.info("Getting Login Page URL ");
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }
}

