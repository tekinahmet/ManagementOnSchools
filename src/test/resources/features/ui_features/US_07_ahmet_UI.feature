@US_07_ahmet_UI @regression
Feature: US_07 Deans should be able to see the messages sent by users.

  Background: login_successfully
    Given go to homepage_AT
    When click login button_AT
    And enter username_AT "jackdoe159"
    And enter password_AT "Jackdough159"
    And click login_AT

  @TC_01
  Scenario: TC_01 User should login successfully.
    Then verify User logged in_AT
    When User signed out_AT

  @TC_02
  Scenario: TC_02 User should be able to see the delete button.
    When click menu button_AT
    And verify that User sees contact get all_AT
    And click Contact Get All_AT
    Then verify User sees Contact Message header_AT
    And verify User sees Delete button_AT
    When User signed out_AT

  @TC_03
  Scenario: TC_03 Deans should be able to view messages, authors, emails, sending dates and subject information.
    When click menu button_AT
    Then verify that User sees contact get all_AT
    When click Contact Get All_AT
    And verify User sees Contact Message header_AT
    And verify User sees Name_AT
    And verify User sees Email_AT
    And verify User sees Date_AT
    And verify User sees Subject_AT
    And verify User sees Message_AT
    When User signed out_AT

  @TC_04
  Scenario: TC_04 Deans should be able to delete messages.
    When click menu button_AT
    And verify that User sees contact get all_AT
    And click Contact Get All_AT
    Then verify User sees Contact Message header_AT
    And verify User deletes messages_AT
    When User signed out_AT