@US_04
Feature: Admin should be able to add Dean

  Background: User should be logged in the website
    Given User navigates to the_MS "https://managementonschools.com/"
    When  User clicks the login button at the top of page_MS
    And   User enters the username_MS as "AdminProject13"
    And   User enters the password_MS as "Project13+"
    And   User clicks the login button_MS
    And   User clicks the menu button_MS
    And   User clicks the Dean Management button_MS
    And   Verify that Admin is on Dean Management page_MS

  @US_04_TC_01
  Scenario: Successfully adding Dean by Admin
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


  @US_04_TC_02
  Scenario Outline: Unsuccessfull adding Dean ( Personal Information should not be left blank)
    When User leaves blank into the name_MS "<Name>"
    And User leaves blank into the Surname_MS "<Surname>"
    And User leaves blank into the Birth Place_MS "<Birth Place>"
    And User clicks the Male in the gender_MS
    And User leaves blank into the Date of Birth_MS "<Date of Birth>"
    And User leaves blank into the Phone number_MS "<Phone number>"
    And User leaves blank into the Ssn Number_MS "<Ssn Number>"
    And User leaves blank into the User Name_MS "<User Name>"
    And User leaves blank into the Password_MS "<Password>"
    And User click the submit button_MS
    Then Verify that the text is visible as Required_MS
    And Close the application_MS
    Examples:
      | Name | Surname | Birth Place | Date of Birth | Phone number | Ssn Number | User Name | Password |
      |      |         |             |               |              |            |           |          |

  @US_04_TC_03
  Scenario Outline: Unsuccessfull adding Dean ( by using invalid SSN)
    When User enters the name_MS "Name"
    And User enters the surname_MS "Surname"
    And User enters Birth Place_MS "Birth Place"
    And User clicks the Male in the gender_MS
    And User enters the Date of Birth_MS
    And User enters the phone number_MS "phone number" as xxx-xxx-xxxx
    And User enters the invalid Ssn Number_MS "<Ssn Number>" as xxx-xx-xxxx
    And User enters the User Name_MS "User Name"
    And User enters Password_MS "Valhalla12"
    And User click the submit button_MS
    Then Verify that the alert is visible Please enter valid SSN number_MS
    And Close the application_MS
    Examples:
      | Ssn Number  |
      | 22-2452-875 |
      | 222-45-875a |
      | 222-45-875@ |

  @US_04_TC_04
  Scenario Outline: Unsuccessfull adding Dean ( by using invalid SSN)
    When User enters the invalid Ssn Number_MS "<Ssn Number>" as xxx-xx-xxxx
    And User click the submit button_MS
    Then Verify that the text is visible for Ssn Number_MS
    And Close the application_MS
    Examples:
      | Ssn Number |
      | 22245-2875 |
      | 222-452875 |
      | 222452875  |


  @US_04_TC_05
  Scenario Outline: Unsuccessfull adding Dean ( by using invalid Password)
    When User enters invalid Password_MS "<Password>"
    And User click the submit button_MS
    Then Verify that the text is visible for password_MS
    And Close the application_MS
    Examples:
      | Password    |
      | better1     |
      | better12    |
      | BETTER12    |
      | BetterBread |

