@regression
Feature: Login User Functionality
  As a User, I would like to login account

  @author_SP @smoke
    Scenario: User should login with correct email and password
    Given I am on homepage
    When  I click on 'Signup/Login' button
    And I should see the text Login to your account
    And I enter "cole123@gmail.com" email and "cole123" password
    And I click on Login button
    Then I verify that Logged in as username is visible
    And I click Delete Account button
    Then I verify that text ACCOUNT DELETED! is visible

  @author_SP @smoke
  Scenario: User login with incorrect email and password
    Given I am on homepage
    When  I click on 'Signup/Login' button
    And I should see the text Login to your account
    And I enter "cole321@gmail.com" email and "cole123" password
    And I click on Login button
    Then I can see text Your email or password is incorrect!

  @author_SP @smoke
  Scenario: Logout User
    Given I am on homepage
    When  I click on 'Signup/Login' button
    And I should see the text Login to your account
    And I enter "dylan123@gmail.com" email and "dylan@123" password
    And I click on Login button
    Then I verify that Logged in as username is visible
    And I click on logout button
    And I am navigated to login page







