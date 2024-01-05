@US6_OG_E2E
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
@US6_Oguz_API
Feature: Dean should create Vice Dean
  Scenario: Dean should add Vice Dean
    Given Dean logs in with existed credentials OG
    Then set the url to post vice dean OG
    And create the payload for vice dean OG
    When send the Request and get the Response_OG
    Then do the assertion OG
  @US6_Oguz_DB
  Feature: US6 Dean should create Vice Dean Account
  Scenario: Dean should see vice dean that has been created
    When connected to database OG
    And Select the vice dean info that exists in the database OG
    Then verify vice dean OG