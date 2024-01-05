@API_US_17
Feature: Teacher should add student info
  Scenario: Test to add student info
    Given the URL is configured for Add Student Info
    And the payload is configured for Add Student Info
    When a POST request for Add Student Info is sent, and the response is received
    Then verify that the status code is 200
    And verify that the response for Add Student Info is valid

  Scenario: Test to retrieve registered Student Info
    Given the ID of a registered Student Info is obtained
    And the URL is configured for GetByStudentInfo
    When expected data for Student Info is created
    When a request for GetByStudentInfo is sent, and the response is received
    Then verify that the status code is 200
    And verify that the response for GetByStudentInfo is valid

  Scenario: Test to update registered Student Info
    Given the ID of a registered Student Info is obtained
    And the URL is configured to update the Student Info details
    And the payload is configured to update the Student Info details
    When a request to update the Student Info details is sent, and the response is received
    Then verify that the status code is 200
    And verify that the updated response body is valid

  Scenario: Test to delete registered Student Info
    Given the ID of a registered Student Info is obtained
    And the URL is configured to delete the Student Info details
    When a request to delete the Student Info details is sent, and the response is received
    Then verify that the status code is 200