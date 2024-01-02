
@US_10
Feature: US_10 Vice Deans should be able to create a lesson schedule.


  @TC_01
  Scenario:  TC_01 Vice Dean should login successfully.
    Given navigate homepage_MM
    When  click on Login button_MM
    And   enter name "TonyStark123"_MM
    And   submit password "TonyStark123"_MM
    And   click login button_MM

    Then verify user logged in_MM





  @TC_02
  Scenario: Vice Dean should be able to select a course
    When click menu button_MM
    And  click choose lesson management button_MM
    And  click lesson program_MM
    And  click choose lesson button_MM
    Then choose lesson_MM


  @TC_03
  Scenario: Vice Dean should be able to select a semester,day for the course and the start,end time
    When click 'choose education term'_MM
    And  choose day_MM
    And  choose start time_MM
    And  choose stop time_MM
    And  click submit button_MM
    And  verify submit button clicked_MM
