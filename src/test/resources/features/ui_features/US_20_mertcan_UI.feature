@US_20
Feature: US_20 The teacher should be able to view, update and delete meetings.


  @TC_01
  Scenario: TC_01 Teacher should login successfully
    Given go to homepage_MM_
    When  click login button_MM_
    And   enter username "teacherjane"_MM_
    And   enter password "janeTeacher9"_MM_
    And   click login_US_MM_

  @TC_02
  Scenario: The Date, Start Time, Stop Time and Description of the meetings should be visible to the teacher
    Given click menu_MM_
    And click meet management_MM_
    And verify date time enter_MM_
    And verify start time enter_MM_
    And verify stop time enter_MM_
    Then verify description enter_MM_
  @TC_03
  Scenario: The teacher should be able to update and delete meetings
    Given click menu button_MM_
    And   click meet management button_MM_
    And click edit button_MM_
    And change date of meet_MM_
    Then click changed submit button_MM_
    And close meeting_MM_
    And delete meetings_MM_


