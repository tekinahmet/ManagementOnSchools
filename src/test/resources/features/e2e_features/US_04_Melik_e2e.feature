@US_04_End2end_MS
Feature: Admin should be able to add Dean

  @US_04_TC_01
  Scenario: Successfully adding Dean by Admin
    Given User navigates to the_MS "https://managementonschools.com/"
    When  User clicks the login button at the top of page_MS
    And   User enters the username_MS as "AdminProject13"
    And   User enters the password_MS as "Project13+"
    And   User clicks the login button_MS
    And   User clicks the menu button_MS
    And   User clicks the Dean Management button_MS
    And   Verify that Admin is on Dean Management page_MS
    When User enters the name_MS "Name"
    And User enters the surname_MS "Surname"
    And User enters Birth Place_MS "Birth Place"
    And User clicks the Male in the gender_MS
    And User enters the Date of Birth_MS
    And User enters the phone number_MS "phone number" as xxx-xxx-xxxx
    And User enters the Ssn Number_MS "Ssn Number" as xxx-xx-xxxx
    And User enters the User Name_MS "User Name"
    And User enters Password_MS "Valhalla12"
    And User click the submit button_MS
    Then Verify that the alert is visible Dean Saved_MS
    And Close the application_MS

  @US_04_Melik_Api_TC02
  Scenario: Verify the Dean account created with Admin
    Given User sets the Url for Dean Get_MS
    And sets the expected Data for Dean Get_MS
    When sends getMethod request and get response_MS
    Then verify status code for getMethod_MS is 200
    And verify response body for getMethod_MS


  @US_04_melik_DB
  Scenario: User Validates Created Dean from DB
    Given User set connection_MS
    And User creates statement_MS
    When User execute query for created Dean_MS
    Then validates result set_MS
    And Close the connection_MS




