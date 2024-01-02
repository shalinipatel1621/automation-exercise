package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ExtraSteps {
    @When("I click on Contact Us button")
    public void iClickOnContactUsButton() {
        new ContactUsPage().clickOnContactUsButton();
    }

    @And("I can see the GET IN TOUCH text")
    public void iCanSeeTheGETINTOUCHText() {
        new ContactUsPage().verifyGetInTouchText();

    }

    @Then("I enter {string} name and {string} email and {string} subject and {string} message")
    public void iEnterNameAndEmailAndSubjectAndMessage(String name, String email, String subject, String message) {
        new ContactUsPage().sendDataToNameField(name, email, subject, message);
    }

    @And("I upload file")
    public void iUploadFile() {
        new ContactUsPage().uploadFile();
    }

    @And("I click on Submit button")
    public void iClickOnSubmitButton() {
        new ContactUsPage().clickOnSubmitButton();
    }

    @And("I click on OK button")
    public void iClickOnOKButton() {
        new ContactUsPage().acceptPopupMessage();
    }

    @And("I see the text Success! Your details have been submitted successfully.")
    public void iSeeTheTextSuccessYourDetailsHaveBeenSubmittedSuccessfully() {
        new ContactUsPage().getContactUsMessageText();
    }

    @And("I click on Home button and I am on homepage")
    public void iClickOnHomeButtonAndIAmOnHomepage() {
        new ContactUsPage().clickOnHomeButton();
        Assert.assertEquals(new ContactUsPage().getCurrentURL(), "https://automationexercise.com/");
    }

    @When("I click on Test Cases button")
    public void iClickOnTestCasesButton() {
        new TestCasesPage().clickOnTestCasesButton();
    }

    @Then("I am navigated to test cases page")
    public void iAmNavigatedToTestCasesPage() {
        Assert.assertEquals(new TestCasesPage().getCurrentURL(), "https://automationexercise.com/test_cases");
    }

    @When("I scroll down up to subscription link")
    public void iScrollDownUpToSubscriptionLink() {
        new HomePage().scrollDownToSubscriptionLink();

    }

    @Then("I enter email {string}")
    public void iEnterEmail(String email) {
        new HomePage().sendDataToSubscriptionEmail(email);
    }

    @And("I click on arrow button")
    public void iClickOnArrowButton() {
        new HomePage().clickOnArrowToSubscribe();
    }

    @And("I should see the success subscription message {string}")
    public void iShouldSeeTheSuccessSubscriptionMessage(String expectedMessage) {
        Assert.assertEquals(new HomePage().getSubscriptionSuccessMessage(), expectedMessage);
    }


    @When("I click on header menu option Cart")
    public void iClickOnHeaderMenuOptionCart() {
        new HomePage().clickOnCartButton();
    }

    @Then("I should see the subscription {string} text")
    public void iShouldSeeTheSubscriptionText(String expectedText) {
        Assert.assertEquals(new HomePage().getSubscriptionText(), expectedText);
    }

    @And("I click on arrow up button at bottom right corner")
    public void iClickOnArrowUpButtonAtBottomRightCorner() {
        new HomePage().clickOnBottomRightArrowButton();
    }

    @And("I should see the message {string}")
    public void iShouldSeeTheMessage(String expectedText) {
        Assert.assertEquals(new HomePage().getFullFledgedText(), expectedText);
    }

    @And("I scroll up")
    public void iScrollUp() {
        new HomePage().scrollUp();
    }

    @Then("I click on cross button to remove the product from the cart")
    public void iClickOnCrossButtonToRemoveTheProductFromTheCart() {
        new ShoppingCartPage().clickOnCrossButtonAcrossProductToRemove();
    }

    @And("I click on download invoice after order success")
    public void iClickOnDownloadInvoiceAfterOrderSuccess() {
        new PaymentPage().clickOnDownloadInvoiceButtonAfterOrderSuccessMessage();
    }

    @And("I click on continue button after order success")
    public void iClickOnContinueButtonAfterOrderSuccess() {
        new PaymentPage().clickOnContinueButtonAfterOrderSuccessMessage();
    }
}

