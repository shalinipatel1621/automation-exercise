package com.automationexercise.steps;

import com.automationexercise.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SearchProductSteps {
    @Then("I should see text {string} on product page")
    public void iShouldSeeTextOnProductPage(String expectedText) throws InterruptedException {
        Assert.assertEquals(new ProductPage().getAllProductText(), expectedText);
    }

    @And("I enter product name {string} in search bar")
    public void iEnterProductNameInSearchBar(String productName) {
        new ProductPage().sendTextToSearchBar(productName);
    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        new ProductPage().clickOnSearchButton();
    }

    @Then("I should see the text {string} on the page")
    public void iShouldSeeTheTextOnThePage(String expectedText) {
        Assert.assertEquals(new ProductPage().getSearchedProductsText(), expectedText);

    }

    @And("I should see the searched product {string}")
    public void iShouldSeeTheSearchedProduct(String pName) {
        Assert.assertEquals(new ProductPage().getSearchedProductName(), pName);
    }
}
