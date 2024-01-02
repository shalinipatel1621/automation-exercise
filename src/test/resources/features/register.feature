@regression
Feature: Register User Functionality
  As a User, I would like to register a new account

  @author_SP @smoke
  Scenario: Register New User Account
    Given I am on homepage
    When I click on 'Signup/Login' button
    Then Verify New User Signup! is visible
    And I enter "Cole" in the name and enter "cole" in the email address
    And I click on Signup button
    And Verify the text ENTER ACCOUNT INFORMATION is visible
    And I select radiobutton Title "Mr" and I enter Name "Cole" and I enter Email "cole" and I enter Password "cole456" and I enter Date of Birth as Day "14" Month "January" Year "1990"
    And I select the checkbox for Sign up for our newsletter!
    And I select the checkbox for Receive special offers from our partners!
    And I enter first name "Cole"
    And I enter last name "Sprouse"
    And I enter company "ColeS"
    And I enter Address "New Society"
    And I enter Addresstwo "Forest Road"
    And I enter country "India"
    And I enter state "Gujarat"
    And I enter City "Anand"
    And zipcode "388001"
    And mobile number "9898254857"
    And I click Create Account button
    Then I verify that ACCOUNT CREATED! is visible
    And I click Continue button
    Then I verify that Logged in as username is visible
    And I click Delete Account button
    Then I verify that text ACCOUNT DELETED! is visible and click Continue button

  @author_SP @smoke
  Scenario: User should see error message while register with existing email
    Given I am on homepage
    When  I click on 'Signup/Login' button
    Then Verify New User Signup! is visible
    And I enter "dylan" in the name and enter "dylan123@gmail.com" in the email address field
    And I click on Signup button
    Then I should see error message Email Address already exist!

  @author_SP @smoke
  Scenario: User should Place Order: Register while Checkout
    Given I am on homepage
    When I add product "Blue Top" to the cart
    And I click on view cart in popup
    And I should see the welcome text on shopping cart page "Shopping Cart"
    And I click on Proceed to Checkout button
    And I click on register link in the checkout popup
    And I enter "Cole" in the name and enter "cole" in the email address
    And I click on button "Signup"
    And I select radiobutton Title "Mr" and I enter Name "Cole" and I enter Email "cole" and I enter Password "cole456" and I enter Date of Birth as Day "14" Month "January" Year "1990"
    And I enter first name "Cole"
    And I enter last name "Sprouse"
    And I enter company "ColeS"
    And I enter Address "New Society"
    And I enter Addresstwo "Forest Road"
    And I enter country "India"
    And I enter state "Gujarat"
    And I enter City "Anand"
    And zipcode "388001"
    And mobile number "9898254857"
    And I click Create Account button
    Then I verify that ACCOUNT CREATED! is visible
    And I click on continue button
    Then I verify that Logged in as username is visible
    And I click on header menu option Cart
    And I click on Proceed to Checkout button
    And I should see the text on checkout page "Review Your Order"
    And I should see the text on checkout page "Address Details"
    And I enter details into comment area "Please deliver it on time."
    And I click on place order button
    And I enter payment details "Raj Patel" "4263986440278279" "825" "04" and "2028"
    And I click on Pay and Confirm Order button
    Then I should see the order confirmation message "Congratulations! Your order has been confirmed!"
    And I click Delete Account button
    Then I verify that text ACCOUNT DELETED! is visible and click Continue button

  @author_SP @smoke
  Scenario: User should Place Order: Register before Checkout
    Given I am on homepage
    When I click on 'Signup/Login' button
    And I enter "Cole" in the name and enter "cole" in the email address
    And I click on button "Signup"
    And I select radiobutton Title "Mr" and I enter Name "Cole" and I enter Email "cole" and I enter Password "cole456" and I enter Date of Birth as Day "14" Month "January" Year "1990"
    And I enter first name "Cole"
    And I enter last name "Sprouse"
    And I enter company "ColeS"
    And I enter Address "New Society"
    And I enter Addresstwo "Forest Road"
    And I enter country "India"
    And I enter state "Gujarat"
    And I enter City "Anand"
    And zipcode "388001"
    And mobile number "9898254857"
    And I click Create Account button
    Then I verify that ACCOUNT CREATED! is visible
    And I click on continue button
    Then I verify that Logged in as username is visible
    And I add product "Blue Top" to the cart
    And I click on view cart in popup
    And I should see the welcome text on shopping cart page "Shopping Cart"
    And I click on Proceed to Checkout button
    And I should see the text on checkout page "Review Your Order"
    And I should see the text on checkout page "Address Details"
    And I enter details into comment area "Please deliver it on time."
    And I click on place order button
    And I enter payment details "Raj Patel" "4263986440278279" "825" "04" and "2028"
    And I click on Pay and Confirm Order button
    Then I should see the order confirmation message "Congratulations! Your order has been confirmed!"
    And I click Delete Account button
    Then I verify that text ACCOUNT DELETED! is visible and click Continue button

  @author_SP @smoke
  Scenario: User should place the order successfully : Login before Checkout
    Given I am on homepage
    When I click on 'Signup/Login' button
    And I should see the text Login to your account
    And I enter "cole123@gmail.com" email and "cole123" password
    And I click on button "Login"
    Then I verify that Logged in as username is visible
    And I add product "Blue Top" to the cart
    And I click on view cart in popup
    And I should see the welcome text on shopping cart page "Shopping Cart"
    And I click on Proceed to Checkout button
    And I should see the text on checkout page "Review Your Order"
    And I should see the text on checkout page "Address Details"
    And I enter details into comment area "Please deliver it on time."
    And I click on place order button
    And I enter payment details "Raj Patel" "4263986440278279" "825" "04" and "2028"
    And I click on Pay and Confirm Order button
    Then I should see the order confirmation message "Congratulations! Your order has been confirmed!"
    And I click on logout button

  @author_SP @smoke
  Scenario: Verify address details in checkout page
    Given I am on homepage
    When I click on 'Signup/Login' button
    And I enter "cole123@gmail.com" email and "cole123" password
    And I click on button "Signup"
    And I select radiobutton Title "Mr" and I enter Name "Cole" and I enter Email "cole" and I enter Password "cole456" and I enter Date of Birth as Day "14" Month "January" Year "1990"
    And I enter first name "Cole"
    And I enter last name "Sprouse"
    And I enter company "ColeS"
    And I enter Address "New Society"
    And I enter Addresstwo "Forest Road"
    And I enter country "India"
    And I enter state "Gujarat"
    And I enter City "Anand"
    And zipcode "388001"
    And mobile number "9898254857"
    And I click Create Account button
    Then I verify that ACCOUNT CREATED! is visible
    And I click on continue button
    Then I should see the text "Logged in as " "Hina"
    And I add product "Blue Top" to the cart
    And I click on view cart in popup
    And I should see the welcome text on shopping cart page "Shopping Cart"
    And I click on Proceed to Checkout button
    Then I should see the delivery address is same address filled at the time registration of account "New Society"
    And I should see billing address is same address filled at the time registration of account "New Society"
    And I click Delete Account button
    Then I verify that text ACCOUNT DELETED! is visible and click Continue button












