@US_05_DB

Feature: Admin should be able to see and delete deans
  Scenario:validation for seeing Dean information
    Given connect database ZS
    And admin creates statement ZS
    When admin execute query for see dean' information ZS
    Then validates result set ZS
    And admin terminate connection ZS



