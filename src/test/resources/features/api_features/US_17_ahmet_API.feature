@US_17_ahmet_API
Feature: Teacher should add student info

  Scenario: Test to add student info
    Given set the url and authorize
    And set expected data for Add Student Info
    When send put request and get response
    Then verify response body
    And verify status code is 200


