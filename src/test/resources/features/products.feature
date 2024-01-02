@regression
Feature: Product Page
  As a User, I would like to use Product page

  @author_SP @smoke
    Scenario: User should verify all products and product detail page
    Given I am on homepage
    When I click on products tab
#    Then I should see text ALL PRODUCTS on product page
    And I click on view product of first product Blue Top
    And I am on product details page and verify the URL
    And I should see product name Blue Top
    And I should see category Category: Women > Tops
    And I should see price Rs. '500'
    And I should see availability Availability: In Stock
    And I should see condition Condition: New
    And I should see brand Brand: Polo

@author_SP @smoke
  Scenario: User should search product
    Given I am on homepage
    When I click on products tab
    Then I should see text "ALL PRODUCTS" on product page
    And I enter product name "Men Tshirt" in search bar
    And I click on search button
    Then I should see the text "SEARCHED PRODUCTS" on the page
    And I should see the searched product "Men Tshirt"

  @author_SP @smoke
  Scenario: User should add products in cart
    Given I am on homepage
    When I click on products tab
    Then I add product "Men Tshirt" to the cart
    And I click on continue shopping link
    And I add product "Blue Top" to the cart
    And I click on view cart in popup
    Then I verify the product "Blue Top" in shopping cart
    Then I verify the product "Men Tshirt" in shopping cart

  @author_SP @smoke
  Scenario: User should verify product quantity in cart
    Given I am on homepage
    When I click on view product of first product Blue Top
    And I am on product details page and verify the URL
    And I should see product name Blue Top
    And I should see category Category: Women > Tops
    And I should see price Rs. "500"
    And I should see availability Availability: In Stock
    And I should see condition Condition: New
    And I should see brand Brand: Polo
    And I increase the quantity "4"
    And I click on add to cart button
    And I click on view cart link in success message
    Then I should see quantity "4"

  @author_SP @smoke
  Scenario: User should search product and verify cart after login
    Given I am on homepage
    When I click on products tab
    Then I should see text "ALL PRODUCTS" on product page
    And I enter product name "Men Tshirt" in search bar
    And I click on search button
    Then I should see the text "SEARCHED PRODUCTS" on the page
    And I should see the searched product "Men Tshirt"
    And I add product "Men Tshirt" to the cart
    And I click on view cart in popup
    Then I verify the product "Men Tshirt" in shopping cart
    When  I click on 'Signup/Login' button
    And I should see the text Login to your account
    And I enter "dylan123@gmail.com" email and "dylan@123" password
    And I click on button "Login"
    And I click on add to cart button
    Then I verify the product "Men Tshirt" in shopping cart

  @author_SP @smoke
  Scenario: User should add review on product
    Given I am on homepage
    When I click on products tab
    Then I should see text "ALL PRODUCTS" on product page
    And I click on view product of first product "Blue Top"
    And I enter "Cole" name at your name field
    And I enter "cole123@gmail.com" email at email address field
    And I enter "This is a great product." message to add review here field
    And I click on review submit button
    Then I should see "Thank you for your review." message

  @author_SP @smoke
  Scenario: User should add to cart from recommended items
    Given I am on homepage
    When I scroll down up to recommended items text
    Then I should see "RECOMMENDED ITEMS" text
    And I add to cart "Stylish Dress" product from recommended items
    And I click on view cart in popup
    Then I verify the product "Stylish Dress" in shopping cart
