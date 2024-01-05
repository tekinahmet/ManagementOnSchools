@US_16
Feature: US_16 The Vice Dean should be able to view the messages sent by users.



  Background: login_successfully
    Given go to homepage_OG
    When click login button_OG
    And enter username_OG "HankTheVD"
    And enter password_OG "321Pro-*Je"
    And click login_OG

  @TC_01
  Scenario: TC_01 User should login successfully.
    Then verify User logged in_OG
    When User signed out_OG

  @TC_02
  Scenario: TC_02 VD should be able to see the delete button.
    When click menu button_OG
    And click Contact Get All_OG
    Then verify User sees Contact Message header_OG
    And verify User sees Delete button_OG
    When User signed out_OG

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

  @TC_04
  Scenario: TC_04 VD should be able to delete messages.
    When click menu button_OG
    And click Contact Get All_OG
    Then verify User sees Contact Message header_OG
    And verify User deletes messages_OG
    When User signed out_OG
#   Then User closes the driver