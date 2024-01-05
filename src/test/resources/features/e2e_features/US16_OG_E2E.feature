@US16_OG_E2E
@TC_03
Scenario: TC_03 VD should be able to view messages, authors, emails, sending dates and subject information.
When click menu button_OG
When click Contact Get All_OG
And verify User sees Contact Message header_OG
And verify User sees Name_OG
And verify User sees Email_OG
And verify User sees Date_OG
And verify User sees Subject_OG
And verify User sees Message_OG
When User signed out_OG
@US16_Oguz_API
Feature: Vice Dean should see messages sent by users
  Scenario Outline: US-16 Vice Dean should view messages, authors, emails, sending dates and subject information.
    Given set the URL Og
    When send the Get Request and get the Response to view messages Og
    And verify status code is 200 Og
    Then Verify content "<name>", "<email>", "<subject>", "<message>", "<date>" Og
    Examples: test_data
      | name | email              | subject      | message       | date       |
      | oguz1 | Deneme123@gmail.com| MessageToTry | this is a trial|2024-03-01 |
  @US16_Oguz_DB
  Feature: US 16 Vice Dean should see messages sent by users
  Scenario: Vice Dean sees sent messages
    Given Vice Dean connects to data-base oG
    And select the message exists in the data-base oG
    Then verify the message oG