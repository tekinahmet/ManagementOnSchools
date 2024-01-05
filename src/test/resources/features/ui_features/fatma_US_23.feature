@US_23
Feature:US_23 Add Vice Dean with admin account

  Background: log in as a admin and navigate to the Vice Dean Management page
    Given User goes to the "https://managementonschools.com/" FK_23
    When user clicks on login button FK_23
    And user enters the username "marktwain123" FK_23
    And user enters the password "Marktwain1" FK_23
    And user clicks on login FK_23
    Then user must see the Add Admin on the page FK_23
    And User clicks on MENU button FK_23
    And User clicks on VICE DEAN MANAGEMENT link FK_23
    Then user must see the Vice Dean Management FK_23

  @US_23_TC_01
  Scenario: TC_01 User should be able to add Vice Dean with an existing admin account
    And User enters a name FK_23
    And User  enters a surname FK_23
    And User enters a birth place FK_23
    And  User chooses a gender (clicks on male or female) FK_23
    And User enters a birth date FK_23
    And User enters a phone number as required FK_23
    And User enters a SSN as required FK_23
    And  User enters an username FK_23
    And  User enters a password as required FK_23
    And User clicks on the submit button FK_23
    Then User must see the Vice Dean Saved message FK_23


  @US_23_TC_02
  Scenario: TC_02 User leaves the blank everything
    And User directly clicks on the submit button FK_23
    Then verify that the user sees a red "Required" warning each box FK_23

  @US_23_TC_03
  Scenario: TC_03 Testing the gender section
    And User enters a name FK_23
    And  User  enters a surname FK_23
    And User enters a birth place FK_23
    And   User leaves the blank gender section FK_23
    And  User enters a birth date FK_23
    And  User enters a phone number as required FK_23
    And  User enters a SSN as required FK_23
    And User enters an username FK_23
    And  User enters a password as required FK_23
    And  User clicks on the submit button FK_23
    Then the user must not be able to add admin FK_23


  @US_23_TC_04
  Scenario: TC_04 Testing the year section  with critical years
    And User enters a name FK_23
    And  User  enters a surname FK_23
    And  User enters a birth place FK_23
    And  User chooses a gender (clicks on male or female) FK_23
    And  User enters a date (trying critical values) FK_23
    And  User enters a phone number as required FK_23
    And  User enters a SSN as required FK_23
    And  User enters an username FK_23
    And  User enters a password as required FK_23
    And  User clicks on the submit button FK_23
    Then user should not be able to log in with that impossible date FK_23

  @US_23_TC_05
  Scenario: TC_05 Testing the SSN part with possibilities
    And User enters a SSN first - missing FK_23
    Then must see the "Minimum 11 character (XXX-XX-XXXX)" message FK_23
    And  User enters a SSN second - missing FK_23
    Then must see the "Minimum 11 character (XXX-XX-XXXX)" message FK_23
    And User enters more than eleven character FK_23
    Then must see the "Please enter a valid SSN number" FK_23


  @US_23_TC_06
  Scenario: TC_06 Testing password requirements
    And  User enters a password just one char FK_23
    Then  It has to appear "At least 8 characters" on the below FK_23
    And  User enters a password all lowercase eight char FK_23
    Then  It has to appear "One uppercase character" on the below FK_23
    And  User enters a password all uppercase eight char FK_23
    Then It has to appear "One lowecase character" on the below FK_23
    And User enters a password with one uppercase but without number FK_23
    Then It has to appear "One number" on the below FK_23
















