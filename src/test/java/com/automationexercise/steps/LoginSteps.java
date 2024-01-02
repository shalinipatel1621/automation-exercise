package com.automationexercise.steps;

import com.automationexercise.pages.LoginPage;
import com.automationexercise.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginSteps {
    @Then("I should see the text Login to your account")
    public void iShouldSeeTheTextLoginToYourAccount() {
        new LoginPage().verifyLoginText();
    }

    @And("I enter {string} email and {string} password")
    public void iEnterEmailAndPassword(String email, String password) {
        new LoginPage().enterLoginEmail(email);
        new LoginPage().enterLoginPassword(password);
    }

    @And("I click on Login button")
    public void iClickOnLoginButton() {
        new LoginPage().iClickOnLoginButtonOnLoginPage();
    }

    @Then("I verify that text ACCOUNT DELETED! is visible")
    public void iVerifyThatTextACCOUNTDELETEDIsVisible() {
        new RegisterPage().clickOnDeleteAccount();

    }

    @Then("I can see text Your email or password is incorrect!")
    public void iCanSeeTextYourEmailOrPasswordIsIncorrect() {
        new LoginPage().enterIncorrectEmailText();

    }

    @And("I click on logout button")
    public void iClickOnLogoutButton() {
        new LoginPage().clickOnLogoutButton();
    }

    @And("I am navigated to login page")
    public void iAmNavigatedToLoginPage() {
        Assert.assertEquals(new LoginPage().getCurrentURL(), "https://automationexercise.com/login");

    }
}
