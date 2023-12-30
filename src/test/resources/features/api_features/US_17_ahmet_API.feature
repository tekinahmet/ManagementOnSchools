@API_US_17
Feature: Teacher should add student info

  @API_US_17_TC_01
  Scenario: Test to add student info
    Given set the url and authorize
    And set expected data for Add Student Info
    When send put request and get response
    Then verify response body
    And verify status code is 200


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
