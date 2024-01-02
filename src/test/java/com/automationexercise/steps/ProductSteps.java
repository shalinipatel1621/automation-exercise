package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.ProductDetailsPage;
import com.automationexercise.pages.ProductPage;
import com.automationexercise.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ProductSteps {
    @When("I click on products tab")
    public void iClickOnProductsTab() {
        new HomePage().clickOnProductsTab();
    }

//    @Then("I should see text ALL PRODUCTS on product page")
//    public void iShouldSeeTextALLPRODUCTSOnProductPage() throws InterruptedException {
//        new ProductPage().getAllProductText();


    @And("I click on view product of first product Blue Top")
    public void iClickOnViewProductOfFirstProductBlueTop() {
        new ProductPage().clickOnBlueTop();
    }

    @And("I am on product details page and verify the URL")
    public void iAmOnProductDetailsPageAndVerifyTheURL() {
        Assert.assertTrue(new ProductDetailsPage().verifyTheURL().contains("https://automationexercise.com/product_details"));
    }

    @And("I should see product name Blue Top")
    public void iShouldSeeProductNameBlueTop() {
new ProductDetailsPage().getBlueTopText();
    }

    @And("I should see category Category: Women > Tops")
    public void iShouldSeeCategoryCategoryWomenTops() {
        new ProductDetailsPage().getProductName();
    }

    @And("I should see price Rs. {string}")
    public void iShouldSeePriceRs(String price) {
        Assert.assertEquals(new ProductDetailsPage().getProductPrice(), price);
    }

    @And("I should see availability Availability: In Stock")
    public void iShouldSeeAvailabilityAvailabilityInStock() {
        new ProductDetailsPage().getProductAvailability();
    }

    @And("I should see condition Condition: New")
    public void iShouldSeeConditionConditionNew() {
        new ProductDetailsPage().getProductCondition();
    }

    @And("I should see brand Brand: Polo")
    public void iShouldSeeBrandBrandPolo() {
        new ProductDetailsPage().getProductBrand();
    }

    @Then("I add product {string} to the cart")
    public void iAddProductToTheCart(String arg0) {
    }

    @And("I click on continue shopping link")
    public void iClickOnContinueShoppingLink() {
    }

    @And("I click on view cart in popup")
    public void iClickOnViewCartInPopup() {
    }

    @Then("I verify the product {string} in shopping cart")
    public void iVerifyTheProductInShoppingCart(String arg0) {
    }

    @And("I increase the quantity {string}")
    public void iIncreaseTheQuantity(String qua) {
        new ProductDetailsPage().sendQuantity(qua);
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new ProductDetailsPage().clickOnAddToCartButton();
    }

    @And("I click on view cart link in success message")
    public void iClickOnViewCartLinkInSuccessMessage() {
        new ProductDetailsPage().clickOnViewCartLinkInSuccessMessage();
    }

    @Then("I should see quantity {string}")
    public void iShouldSeeQuantity(String qua) {
        Assert.assertEquals(new ShoppingCartPage().getQuantity(), qua);
    }

    @And("I click on view product of first product {string}")
    public void iClickOnViewProductOfFirstProduct(String arg0) {
    }

    @And("I enter {string} name at your name field")
    public void iEnterNameAtYourNameField(String name) {
        new ProductDetailsPage().sendNameToYourNameField(name);
    }


    @And("I enter {string} email at email address field")
    public void iEnterEmailAtEmailAddressField(String email) {
        new ProductDetailsPage().sendEmailToEmailAddressField(email);
    }

    @And("I enter {string} message to add review here field")
    public void iEnterMessageToAddReviewHereField(String review) {
        new ProductDetailsPage().sendReviewToAddReviewField(review);
    }

    @And("I click on review submit button")
    public void iClickOnReviewSubmitButton() {
        new ProductDetailsPage().clickOnReviewSubmitButton();
    }

    @Then("I should see {string} message")
    public void iShouldSeeMessage(String message) {
        Assert.assertEquals(new ProductDetailsPage().getThankYouForReviewMessage(), message);
    }

    @When("I scroll down up to recommended items text")
    public void iScrollDownUpToRecommendedItemsText() {
        new HomePage().scrollDownToRecommendedItems();
    }

    @Then("I should see {string} text")
    public void iShouldSeeText(String expectedText) {
        Assert.assertEquals(new HomePage().getRecommendedItemText(), expectedText);
    }

    @And("I add to cart {string} product from recommended items")
    public void iAddToCartProductFromRecommendedItems(String pName) {
        new HomePage().clickAddToCartOnRecommendedItems();
    }
}
