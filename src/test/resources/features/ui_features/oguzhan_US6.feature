@US_06
Feature: US-6 Deans should be able to create a Vice Dean account.

Background: dean_creates_viceDeans
  Given go to homepage_Og
  When click login button_Og
  And enter username_Og "Final Project"
  And enter password_Og "123Pro_*Je"
  And click login_Og
  Then verify user logged in_Og
  When click menu button_Og
  And click Vice Dean Management_Og
  Then verify User sees Vice Dean Management header_Og

@TC_01_US6
  Scenario: TC-1 Testing if the Dean can create Male VD account successfully.
  When user click name box_Og "ALICAN1"
  And user click surname box_Og "LongBaseL"
  And user click Birth Place box_Og "California"
  And user click male in gender_Og "Male"
  And user enters birthday_Og "10-10-1991"
  And user enters phone number as xxx-xxx-xxxx_Og  "145-456-5553"
  And user enters SSN as xxx-xx-xxxx_Og "123-44-7892"
  And user enters userName as_Og "deneme1234"
  And user enters password (at least eight characters, one number, uppercase letter, lowercase letter) as_Og "Pro123JEcT"
  And user click submit_Og
  Then verify Vice dean Saved_Og
  When user signed out_Og




@TC_02_US6
  Scenario: TC-2 Testing if the Dean can create Female VD account successfully.
  When user click name box_Og "ALICIA"
  And user click surname box_Og "ShortBase1"
  And user click Birth Place box_Og "LitteHill"
  And user click female in gender_Og "Female"
  And user enters birthday_Og "11-05-1975"
  And user enters phone number as xxx-xxx-xxxx_Og  "145-457-5551"
  And user enters SSN as xxx-xx-xxxx_Og "183-44-7894"
  And user enters userName as_Og "denemE12345"
  And user enters password (at least eight characters, one number, uppercase letter, lowercase letter) as_Og "Pro123JEEcT"
  And user click submit_Og
  Then verify Vice dean Saved_Og
  When user signed out_Og

@TC_03_US6
  Scenario: TC-3 Testing if the Dean is able to create VD account by leaving VD's Personal info blank
  And User directly clicks on the submit button_Og
  Then verify that the user sees a red Required warning each box_Og
  When user signed out_Og

@TC_4_US6
 Scenario: Dean should not be able to create VD account by providing wrong format for the SSN
 When user click name box_Og "ALICIA"
 And user click surname box_Og "ShortBase1"
 And user click Birth Place box_Og "LitteHill"
 And user click female in gender_Og "Female"
 And user enters birthday_Og "11-05-1975"
 And user enters phone number as xxx-xxx-xxxx_Og  "145-457-5551"
 And user enters SSN in wrong format_Og
 And user enters userName as_Og "denemE12345"
 And user enters password (at least eight characters, one number, uppercase letter, lowercase letter) as_Og "Pro123JEEcT"
 And user click submit_Og
 Then verify that the user sees a red wrong SSN warning at related box_Og
 When user signed out_Og

@TC_5_US6
Scenario: Testing if the Dean is able to create VD account with wrong format password(less than 8 characters)
When user click name box_Og "ALICAN1"
And user click surname box_Og "LongBaseL"
And user click Birth Place box_Og "California"
And user click male in gender_Og "Male"
And user enters birthday_Og "10-10-1991"
And user enters phone number as xxx-xxx-xxxx_Og "145-456-5553"
And user enters SSN as xxx-xx-xxxx_Og "123-44-7892"
And user enters userName as_Og "deneme1234"
And user enters password less than eight characters as_Og "Trial12"
And user click submit_Og
Then verify user sees At least 8 characters warning_Og
When user signed out_Og

@TC_6_US6
Scenario: Testing if the Dean is able to create VD account with wrong format password (without upper case)
    When user click name box_Og "ALICAN1"
    And user click surname box_Og "LongBaseL"
    And user click Birth Place box_Og "California"
    And user click male in gender_Og "Male"
    And user enters birthday_Og "10-10-1991"
    And user enters phone number as xxx-xxx-xxxx_Og  "145-456-5553"
    And user enters SSN as xxx-xx-xxxx_Og "123-44-7892"
    And user enters userName as_Og "deneme1234"
    And user enters password less than eight characters as_Og "trial1234"
    And user click submit_Og
    Then verify user sees missing upper case warning_Og
    When user signed out_Og

@TC_7_US6
  Scenario: Testing if the Dean is able to create VD account with wrong format password(without lowercase character)
    When user click name box_Og "ALICAN1"
    And user click surname box_Og "LongBaseL"
    And user click Birth Place box_Og "California"
    And user click male in gender_Og "Male"
    And user enters birthday_Og "10-10-1991"
    And user enters phone number as xxx-xxx-xxxx_Og  "145-456-5553"
    And user enters SSN as xxx-xx-xxxx_Og "123-44-7892"
    And user enters userName as_Og "deneme1234"
    And user enters password less than eight characters as_Og "TRIAL12345"
    And user click submit_Og
    Then verify user sees missing One lowercase character_Og
    When user signed out_Og

@TC_8_US6
  Scenario: Testing if the Dean is able to create VD account with wrong format password(without a number)
    When user click name box_Og "ALICAN1"
    And user click surname box_Og "LongBaseL"
    And user click Birth Place box_Og "California"
    And user click male in gender_Og "Male"
    And user enters birthday_Og "10-10-1991"
    And user enters phone number as xxx-xxx-xxxx_Og  "145-456-5553"
    And user enters SSN as xxx-xx-xxxx_Og "123-44-7892"
    And user enters userName as_Og "deneme1234"
    And user enters password less than eight characters as_Og "TRIALtest"
    And user click submit_Og
    Then verify user sees missing One number character_Og
    When user signed out_Og
    Then user closes driver_Og











