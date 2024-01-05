@API_US_09
Feature:Vice Dean Account See/Delete/Update Lessons from Lessons List

Scenario: TC_01 Vice Dean Account Should see Lesson list on get request
  Given Authorize with Vice Dean Credentials and get TokenSY
  When Set The Url paramsSY
  And Send Get Request and get responseSY
  Then Verify if the status code is 200 SY
  Then Verify LessonId is not nullSY
  Then Verify lessonName is not nullSY
  Then Verify creditScore is not nullSY
  Then Verify compulsory is not nullSY

  Scenario: TC_02 Vice Dean Acc Should Delete the Lessons from Lesson list
    Given Authorize with Vice Dean Credentials and get TokenSY
    When Set The Url paramsSY
    And Send Get Request and get responseSY
    When Get an id number from the listSY
    And  Set The Url params for delete commandSY
    And Send Delete request to systemSY
    Then Verify if the status code is 200 SY

#    For the Update There is no option on swagger docs. that Vice dean can update the lessons

