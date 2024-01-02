@US_05
Feature: US_05 Admins should be able to see and delete Deans
  Background: login
    Given go to webpagee ZS
    When click on loginn ZS
    And enter usernamee "AdminProject13" ZS
    And enter passwordd "Project13+" ZS
    And click login buttonn ZS
    And click on Menu buttonn ZS
    And click on Dean Management ZS

  @US_05_TC_01
  Scenario: Admin should be able to see Name, Gender, Phone Number, SSN and User Name information of Deans
    Then Verify Name column is visible ZS
    Then Verify Gender column is visible ZS
    Then Verify Phone Number column is visible ZS
    Then Verify SSN column is visible ZS
    Then Verify User Name Information is visible ZS

  @US_05_TC_03
  Scenario: Admin should be able to update Deans
    Then Click on edit button at the end of the row ZS
    And enter name ZS
    And enter surname "sahlo" ZS
    And birth place "london" ZS
    And gender ZS
    And date of birth "01.01.2001" ZS
    And phone number "444-789-7894" ZS
    And ssn "444-44-7894" ZS
    And user name information "DeanFolina" ZS
    And passwordz "Project13+" ZS
    And click on submit button ZS
    Then Verify that Dean updated successful message is visible ZS
