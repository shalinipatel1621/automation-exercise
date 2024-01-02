@regression
Feature: Contact Us Page
  As a User, I would like to use contact us page

  @author_SP @smoke
    Scenario: User should log the contact us form
    Given I am on homepage
    When I click on Contact Us button
    And I can see the GET IN TOUCH text
    Then I enter "robert" name and "robert123@gmail.com" email and "Product issue" subject and "Project not working" message
    And I upload file
    And I click on Submit button
    And I click on OK button
    And I see the text Success! Your details have been submitted successfully.
    And I click on Home button and I am on homepage

  @author_SP @smoke
  Scenario: User should log the contact us form
    Given I am on homepage
    When I click on Test Cases button
    Then I am navigated to test cases page

  @author_SP @smoke
  Scenario: User should subscribe in the homepage
    Given I am on homepage
    When I scroll down up to subscription link
    Then I enter email "col345@gmail.com"
    And I click on arrow button
    And I should see the success subscription message "You have been successfully subscribed!"

  @author_SP @smoke
  Scenario: User should subscribe in the Cart page
    Given I am on homepage
    When I click on header menu option Cart
    And I scroll down up to subscription link
    Then I enter email "col456@gmail.com"
    And I click on arrow button
    And I should see the success subscription message "You have been successfully subscribed!"

  @author_SP @smoke
  Scenario: User should remove the product from cart
    Given I am on homepage
    When I add product "Blue Top" to the cart
    And I click on view cart in popup
    And I should see the welcome text on shopping cart page "Shopping Cart"
    Then I click on cross button to remove the product from the cart

  @author_SP @smoke
  Scenario: User should scroll down and scroll up using Arrow button at bottom right corner
    Given I am on homepage
    When I scroll down up to subscription link
    Then I should see the subscription "SUBSCRIPTION" text
    And I click on arrow up button at bottom right corner
    And I should see the message "Full-Fledged practice website for Automation Engineers"

  @author_SP @smoke
  Scenario: User should scroll down and scroll up without Arrow button
    Given I am on homepage
    When I scroll down up to subscription link
    Then I should see the subscription "SUBSCRIPTION" text
    And I scroll up
    And I should see the message "Full-Fledged practice website for Automation Engineers"

#    @author_SP @sanity
#    Given I am on homepage
#    When I add product "Blue Top" to the cart
#    And I click on view cart in popup
#    And I should see the welcome text on shopping cart page "Shopping Cart"
#    And I click on Proceed to Checkout button
#    And I click on register link in the checkout popup
#    And I enter "dylan123@gmail.com" email and "dylan@123" password
#    And I click on button "Signup"
#    And I fill all details in signup page "Mr" "lina@123" "17" "June" "1998" "Lina" "Patel" "Rugby Avenue" "New Forest" "India" "Gujarat" "Anand" "398001" "09784766214"
#    And I click Create Account button
#    Then I verify that ACCOUNT CREATED! is visible
#    And I click on continue button
#    Then I should see the text "Logged in as " "Lina"
#    And I click on add to cart button
#    And I click on Proceed to Checkout button
#    And I should see the text on checkout page "Review Your Order"
#    And I should see the text on checkout page "Address Details"
#    And I enter details into comment area "Please deliver it on time."
#    And I click on place order button
#    And I enter payment details "Raj Patel" "4263986440278279" "825" "04" and "2028"
#    And I click on Pay and Confirm Order button
#    Then I should see the order confirmation message "Congratulations! Your order has been confirmed!"
#    And I click on download invoice after order success
#    And I click on continue button after order success
#    And I click Delete Account button
#    Then I verify that text ACCOUNT DELETED! is visible and click Continue button