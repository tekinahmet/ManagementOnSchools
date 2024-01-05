@US6_Oguz_DB
Feature: US6 Dean should create Vice Dean Account
  Scenario: Dean should see vice dean that has been created
    When connected to database OG
    And Select the vice dean info that exists in the database OG
    Then verify vice dean OG