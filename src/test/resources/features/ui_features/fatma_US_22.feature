@US_22
Feature:US_22 Add admin

  Background: log in
    Given User goes to the "https://managementonschools.com/" FK_22
    When user clicks on login button FK_22
    And user enters the username "AdminProject13" FK_22
    And user enters the password "Project13+" FK_22
    And user clicks on login FK_22
    Then user must see the Add Admin on the page FK_22

  @US_22_TC_01
  Scenario: TC_01 User can add admin successfully
    And  User enters a name FK_22
    And  User  enters a surname FK_22
    And  User enters a birth place FK_22
    And  User chooses a gender (clicks on male or female) FK_22
    And  User enters a birth date FK_22
    And  User enters a phone number as required FK_22
    And  User enters a SSN as required FK_22
    And  User enters an username FK_22
    And  User enters a password as required FK_22
    And  User clicks on the submit button FK_22
    And user must see the Admin Saved message FK_22


  @US_22_TC_02
  Scenario: TC_02 User leaves the blank everything
    And User directly clicks on the submit button FK_22
    Then verify that the user sees a red Required warning each box FK_22

  @US_22_TC_03
  Scenario: TC_03 Testing the gender section
    And User enters a name FK_22
    And User  enters a surname FK_22
    And User enters a birth place FK_22
    And User leaves the blank gender section FK_22
    And User enters a birth date FK_22
    And User enters a phone number as required FK_22
    And User enters a SSN as required FK_22
    And  User enters an username FK_22
    And  User enters a password as required FK_22
    And  User clicks on the submit button FK_22
    Then the user must not be able to add admin FK_22


  @US_22_TC_04
  Scenario: TC_04 Testing the year section  with critical years
    And User enters a name FK_22
    And  User  enters a surname FK_22
    And User enters a birth place FK_22
    And User chooses a gender (clicks on male or female) FK_22
    And User enters a date (trying critical values) FK_22
    And User enters a phone number as required FK_22
    And  User enters a SSN as required FK_22
    And  User enters an username FK_22
    And User enters a password as required FK_22
    And User clicks on the submit button FK_22
    Then user should not be able to log in with that imposible date FK_22


  @US_22_TC_05
  Scenario: TC_05 Testing the SSN part with possibilities
    And User enters a SSN first - missing FK_22
    Then must see the "Minimum 11 character (XXX-XX-XXXX)" message FK_22
    And User enters a SSN second - missing FK_22
    Then must see the "Minimum 11 character (XXX-XX-XXXX)" message FK_22
    And User enters more than eleven character FK_22
    And  User enters a name FK_22
    And  User  enters a surname FK_22
    And  User enters a birth place FK_22
    And  User chooses a gender (clicks on male or female) FK_22
    And  User enters a birth date FK_22
    And  User enters a phone number as required FK_22
    And  User enters an username FK_22
    And  User enters a password as required FK_22
    And  User clicks on the submit button FK_22
    Then must see the "Please enter a valid SSN number" FK_22


  @US_22_TC_06
  Scenario: TC_06 Testing password requirements
    And User enters a password just one char FK_22
    Then It has to appear "At least 8 characters" on the below FK_22
    And User enters a password all lowercase eight char FK_22
    Then It has to appear "One uppercase character" on the below FK_22
    And User enters a password all uppercase eight char FK_22
    Then It has to appear "One lowecase character" on the below FK_22
    And User enters a password with one uppercase but without number FK_22
    Then  It has to appear "One number" on the below FK_22


























