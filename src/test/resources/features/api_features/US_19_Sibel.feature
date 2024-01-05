@API_US_19
  Feature: Teacher Account create a meeting for students

    Scenario:TC_01 Teacher Account should be able to create meetings
      Given Authorize with Teacher Credentials and get TokenSY
      And Set the Url for save meetingSY
      And Set payload with pojo classSY
      And Send post response body for save meetingSY
      Then Verify if the status code is 200 SY
      Then Delete the meeting newly createdSY
      Then Verify if the status code is 200 SY

    Scenario: TC_02 Meeting Creation with invalid timesSY
      Given Authorize with Teacher Credentials and get TokenSY
      And Set the Url for save meetingSY
      And For invalid times Set payload with pojo classSY
      And Send post body for invalid meeting timesSY
      Then Verify if the status code is 200 SY

