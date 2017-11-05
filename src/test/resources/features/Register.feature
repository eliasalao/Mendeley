Feature: Create a new account

  @Register
  Scenario: Create a new account
    Given I am on mendeley home page
    And I click Create account button
    And I am taken to create account page
    And I enter email "maryelias@gmail.com" in email field
    And I enter first name "Elias" in first name field
    And I enter last name "Alao" in last name field
    And I enter password "ride8yu" in password field
    When I Click on the continue button
    And I select field of study
    And I select academics
    And I click submit button to join















