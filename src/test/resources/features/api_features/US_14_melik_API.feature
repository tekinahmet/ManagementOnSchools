@US_14_melik_API
  Feature: Vice Dean should be able to see and update teachers.

    Scenario: Vice Dean should be able to see teachers data
      Given Get teacher's id_MS
      And set the url for teacher getSavedById
      And set the expected data
      When sends get request and get response_MS
      Then verify status code for teacher_MS is 200
      And verify response body for Teacher_MS




