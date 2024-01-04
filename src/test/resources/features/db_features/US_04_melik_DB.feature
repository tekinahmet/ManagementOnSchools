@US_04_melik_DB
Feature: Dean Creation Validation DB
 Scenario: User Validates Created Dean from DB
    Given User set connection_MS
    And User creates statement_MS
    When User execute query for created Dean_MS
    Then validates result set_MS
    And Close the connection_MS
