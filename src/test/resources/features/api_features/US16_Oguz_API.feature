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