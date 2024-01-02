package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    WebElement loginText;

    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement loginEmail;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement loginPassword;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButtonOnLogin;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    WebElement verifyIncorrectEmailText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutButton;

    public String getCurrentURL(){
        log.info("Getting Login Page URL ");
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl();
        }


    public void verifyLoginText() {
        getTextFromElement(loginText);
        log.info("Login to your account message" + loginText.toString());


    }

    public void enterLoginEmail(String loginEmailAdd) {
        sendTextToElement(loginEmail, loginEmailAdd);
        log.info("Enter email" + loginEmail.toString());
    }

    public void enterLoginPassword(String loginPasswordAdd) {
        sendTextToElement(loginPassword, loginPasswordAdd);
        log.info("Enter password" + loginPassword.toString());
    }

    public void iClickOnLoginButtonOnLoginPage() {
        clickOnElement(loginButtonOnLogin);
        log.info("click on login" + loginButtonOnLogin.toString());
    }

    public void enterIncorrectEmailText() {
        getTextFromElement(verifyIncorrectEmailText);
        log.info("Incorrect Email text" + verifyIncorrectEmailText.toString());
    }
public void clickOnLogoutButton(){
        clickOnElement(logoutButton);
        log.info("Click on logout" + logoutButton.toString());
}


}
