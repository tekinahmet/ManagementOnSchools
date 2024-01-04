@US_14
Feature: Vice Dean should be able to see and update teachers

  Background: User should be logged in the website
    Given User navigates to the_MS "https://managementonschools.com/"
    When  User clicks the login button at the top of page_MS
    And   User enters the username_MS as "Valhalla"
    And   User enters the password_MS as "Valhalla12"
    And   User clicks the login button_MS
    And   User clicks the menu button_MS
    And   User clicks the Teacher Management button_MS
    And   Verify that User is on Teacher Management page_MS
    Then verify whether the created FelixKeeling as username are visible in the list for user_MS


  Scenario: Vice Dean should be able to see and uptade Teacher Information Successfully
    And  User clicks the edit button_MS
    And  User choose a lesson_MS
    And User types the name_MS
    And User types the surname_MS
    And User types Birth Place_MS
    And User types email into the emailbox_MS
    And User types the phone number_MS as xxx-xxx-xxxx
    And User types the Ssn Number_MS as xxx-xx-xxxx
    And User clicks the is advisor teacher_MS
    And User clicks the Female in the gender_MS
    And User types the Date of Birth_MS
    And User types the UserName_MS
    And User types Password_MS "Valhalla12"
    And User clicks the Submit button for teacher_MS
    Then verify that Teacher updated Successful_MS
