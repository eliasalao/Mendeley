# Mendeley
Automated test for Elsevir


Cumcumber Senarions 

Feature: Create a new account

  @Register
  Scenario: Create a new account
    Given I am on mendeley home page
    And I click Create account button
    And I am taken to create account page
    And I enter email "mary123@gmail.com" in email field
    And I enter first name "Elias" in first name field
    And I enter last name "Alao" in last name field
    And I enter password "ride8yu" in password field
    When I Click on the continue button
    And I select field of study
    And I select academics
    And I click submit button to join



  Scenario: Create a new account with incorrect email address and correct password format

Given I'm on the join page
And I enter email address  "eliasalao.hotmail.co.uk"
And I enter first name "Elias"
And I enter last name "Alao"
And I enter  "ride8yu" as password
When I Click on the continue button
Then An error should appear under the email address bar saying (Not a valid email. Take a closer look.)

Scenario: Create a new account with Correct email address and password with no first name

Given   Given I'm on the join page
And I enter email address "eliasalao@hotmail.co.uk"
And I leave first name box blank
And I enter last name  "Alao"
And password "ride8yu"
When I Click on the continue button
Then An error should appear under the first name bar saying "First name is required"


Scenario: Create a new account with Correct email address and password with no last name

Given  Given I'm on the join page
And I enter email address "eliasalao@hotmail.co.uk"
And  I enter first name "Elias"
And I  leave the last name box blank
And I enter password "ride8yu"
When I Click on the continue button
Then An error should appear under the last name bar saying ( last name is required)


Scenario: Create a new account with Correct email address and no password with first and last name

Given I'm on the join page
And I enter email address  "eliasalao@hotmail.co.uk"
And I enter first name  "Elias"
And  I enter last name "Alao"
And I leave the  password box blank
When I Click on the continue button
Then An error should appear under the password  bar saying ( Password is required)
