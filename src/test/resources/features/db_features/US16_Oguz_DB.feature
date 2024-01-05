@US16_Oguz_DB
Feature: US 16 Vice Dean should see messages sent by users
  Scenario: Vice Dean sees sent messages
    Given Vice Dean connects to data-base oG
    And select the message exists in the data-base oG
    Then verify the message oG