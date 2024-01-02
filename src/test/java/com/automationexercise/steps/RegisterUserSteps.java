package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterUserSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on {string} button")
    public void iClickOnSignupLoginButton(String login) {
        new HomePage().clickOnSignupAndLoginButton("Signup/Login");
    }

    @Then("Verify New User Signup! is visible")
    public void verifyNewUserSignupIsVisible() {
        new RegisterPage().verifySignUpTextIsVisible();
    }

    @And("I enter {string} in the name and enter {string} in the email address")
    public void iEnterInTheNameAndEnterInTheEmailAddress(String name, String email) {
        new RegisterPage().enterNameAndEmailAddress(name, email);
    }

    @And("I click on Signup button")
    public void iClickOnSignupButton() {
        new RegisterPage().clickOnSignUpButton();
    }

    @And("Verify the text ENTER ACCOUNT INFORMATION is visible")
    public void verifyTheTextENTERACCOUNTINFORMATIONIsVisible() {
        new RegisterPage().verifyAccountText();
    }

    @And("I select radiobutton Title {string} and I enter Name {string} and I enter Email {string} and I enter Password {string} and I enter Date of Birth as Day {string} Month {string} Year {string}")
    public void iSelectRadiobuttonTitleAndIEnterNameAndIEnterEmailAndIEnterPasswordAndIEnterDateOfBirthAsDayMonthYear(String title, String name, String email, String password, String day, String month, String year) {
        new RegisterPage().fillDataInSignUpForm(title, password, day, month, year);
    }

    @And("I select the checkbox for Sign up for our newsletter!")
    public void iSelectTheCheckboxForSignUpForOurNewsletter() {
        new RegisterPage().clickOnSignUpNewsLetterCheckBox();
    }

    @And("I select the checkbox for Receive special offers from our partners!")
    public void iSelectTheCheckboxForReceiveSpecialOffersFromOurPartners() {
        new RegisterPage().clickOnReceiveSpecialOffersCheckBox();
    }

    @And("I enter first name {string}")
    public void iEnterFirstName(String firstName) {
        new RegisterPage().enterFirstNameInAddressInfo(firstName);
    }

    @And("I enter last name {string}")
    public void iEnterLastName(String lastName) {
        new RegisterPage().enterLastNameInAddressInfo(lastName);
    }

    @And("I enter company {string}")
    public void iEnterCompany(String company) {
        new RegisterPage().enterCompanyNameInAddressInfo(company);
    }

    @And("I enter Address {string}")
    public void iEnterAddress(String address) {
        new RegisterPage().enterAddressLineOne(address);
    }

    @And("I enter Addresstwo {string}")
    public void iEnterAddresstwo(String addressTwo) {
        new RegisterPage().enterAddressLineTwo(addressTwo);
    }

    @And("I enter country {string}")
    public void iEnterCountry(String country) {
        new RegisterPage().selectCountryFromDropdown(country);
    }

    @And("I enter state {string}")
    public void iEnterState(String state) {
        new RegisterPage().enterStateInAddressForm(state);
    }

    @And("I enter City {string}")
    public void iEnterCity(String city) {
        new RegisterPage().enterCityInAddressForm(city);
    }

    @And("zipcode {string}")
    public void zipcode(String zipcode) {
        new RegisterPage().enterZipcodeInAddressInfo(zipcode);
    }

    @And("mobile number {string}")
    public void mobileNumber(String mobile) {
        new RegisterPage().enterMobileNumberInAddressInfo(mobile);
    }

    @And("I click Create Account button")
    public void iClickCreateAccountButton() {
        new RegisterPage().clickOnCreateAccountButton();
    }

    @Then("I verify that ACCOUNT CREATED! is visible")
    public void iVerifyThatACCOUNTCREATEDIsVisible() {
        new RegisterPage().getAccountCreatedText();
    }


    @And("I click Continue button")
    public void iClickContinueButton() {
        new RegisterPage().clickOnContinueButton();
    }


    @Then("I verify that Logged in as username is visible")
    public void iVerifyThatLoggedInAsUsernameIsVisible() {
        new RegisterPage().getLoggedInAsUsernameText();
    }

    @And("I click Delete Account button")
    public void iClickDeleteAccountButton() {
        new RegisterPage().clickOnDeleteAccount();
    }

    @Then("I verify that text ACCOUNT DELETED! is visible and click Continue button")
    public void iVerifyThatTextACCOUNTDELETEDIsVisibleAndClickContinueButton() {
        new RegisterPage().getDeleteAccountText();
        new RegisterPage().clickOnContinueAfterDelete();
    }


    @Then("I should see error message Email Address already exist!")
    public void iShouldSeeErrorMessageEmailAddressAlreadyExist() {
        new RegisterPage().getEmailAlreadyExist();
    }

    @And("I enter {string} in the name and enter {string} in the email address field")
    public void iEnterInTheNameAndEnterInTheEmailAddressField(String name, String email) {
        new RegisterPage().enterNameAndEmailAddressField(name, email);
    }

    @And("I should see the welcome text on shopping cart page {string}")
    public void iShouldSeeTheWelcomeTextOnShoppingCartPage(String expectedText) {
        Assert.assertEquals(new ShoppingCartPage().getShoppingCartWelcomeText(), expectedText);
    }

    @And("I click on Proceed to Checkout button")
    public void iClickOnProceedToCheckoutButton() {
        new ShoppingCartPage().clickOnProceedToCheckoutButton();
    }

    @And("I click on register link in the checkout popup")
    public void iClickOnRegisterLinkInTheCheckoutPopup() {
    }

    @And("I click on button {string}")
    public void iClickOnButton(String arg0) {
    }

    @And("I fill all details in signup page {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void iFillAllDetailsInSignupPage(String title, String pass, String day, String month,
                                            String year, String fName, String lName, String add1, String add2,
                                            String country, String state, String city, String zipcode, String pNumber) {
        new RegisterPage().fillDataInSignUpForm(title, pass, day, month, year);

    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new RegisterPage().clickOnContinueButton();
    }

    @Then("I should see the text {string} {string}")
    public void iShouldSeeTheText(String arg0, String arg1) {
    }

    @And("I should see the text on checkout page {string}")
    public void iShouldSeeTheTextOnCheckoutPage(String expectedText) {
        Assert.assertEquals(new CheckoutPage().verifyTextOnCheckoutPage(expectedText), expectedText);
    }

    @And("I enter details into comment area {string}")
    public void iEnterDetailsIntoCommentArea(String comment) {
        new CheckoutPage().sendTextToCommentArea(comment);
    }

    @And("I click on place order button")
    public void iClickOnPlaceOrderButton() {
        new CheckoutPage().clickOnPlaceOrderButton();
    }

    @And("I enter payment details {string} {string} {string} {string} and {string}")
    public void iEnterPaymentDetailsAnd(String name, String cNumber, String CVC, String month, String year) {
        new PaymentPage().sendPaymentDetails(name, cNumber, CVC, month, year);
    }

    @And("I click on Pay and Confirm Order button")
    public void iClickOnPayAndConfirmOrderButton() {
        new PaymentPage().clickOnPayAndConfirmOrderButton();
    }

    @Then("I should see the order confirmation message {string}")
    public void iShouldSeeTheOrderConfirmationMessage(String expectedMessage) {
        Assert.assertEquals(new PaymentPage().getOrderConfirmationMessage(), expectedMessage);
    }

    @Then("I should see the delivery address is same address filled at the time registration of account {string}")
    public void iShouldSeeTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount(String expectedAddress) {
        Assert.assertEquals(new CheckoutPage().getDeliveryAddress(), expectedAddress);
    }

    @And("I should see billing address is same address filled at the time registration of account {string}")
    public void iShouldSeeBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount(String expectedAddress) {
        Assert.assertEquals(new CheckoutPage().getBillingAddress(), expectedAddress);
    }
}

