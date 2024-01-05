@API_US10
  Feature: Vice Deans should be able to create a lesson schedule.

    Scenario: Test to verify create program
      Given enter as "Vice Dean"
      And the URL is configured for saved Vice Dean
      And the payload is configured for saved Vice Dean
      When a POST request for saved Vice Dean Info,and the response is received
      Then verify the respnse body for Vice Dean
      Then verify the status code is 200
