@US_19
Feature: "The teacher should be able to create meetings with students.


  Background: login in the application as a Teacher
    Given User navigates to home page "https://managementonschools.com" SY
    And Click on Login ButtonSY
    And Type UserName "teacherjane" and Password "janeTeacher9" SY
    And Click on the login buttonSY

    @US_19_TC_01
    Scenario: Create a Student Meeting when user in the Teacher account
      Given Click Menu from right top off the page in teacher pageSY
    And Click Meet Management from the Left Menu BarSY
      And Click Dropdown from Student ListSY
      And Set Student name "Abby Abernaty" SY
    And Choose a Valid date From Date of Meet sectionSY
    And enter a start time for the meetingSY
    And enter valid stop time for meetingSY
    And type a Description related to meetingSY
    And Click Submit ButtonSY
      Then verify if meeting created successfullySY
    Then Verify if Student selected successfully and visible on the listSY
    Then Verify if Meeting date selected successfully and visibleSY
    Then Verify if Meeting time selected successfully and visibleSY
      Then close the browserSY


  @US_19_TC_02
  Scenario: Create a Student Meeting for more then one students
    Given Click Menu from right top off the page in teacher pageSY
    And Click Meet Management from the Left Menu BarSY
    And Click Dropdown from Student ListSY
    And Choose two Students names are "Adam Connor","Alberto Dino" SY
    And Choose a Valid date From Date of Meet sectionSY
    And enter a start time for the meetingSY
    And enter valid stop time for meetingSY
    And type a Description related to meetingSY
    And Click Submit ButtonSY
    Then verify if meeting created successfullySY
    Then Verify if Student selected successfully and visible on the listSY
    Then Verify if Meeting date selected successfully and visibleSY
    Then Verify if Meeting time selected successfully and visibleSY
    Then verify Description is visible on the created meetingSY

@US_19_TC_03
Scenario: User should not be able to Choose Past Dates for Meeting Date

  Given Click Menu from right top off the page in teacher pageSY
    And Click Meet Management from the Left Menu BarSY
    And Click Dropdown from Student ListSY
    And Set Student name "Abby Abernaty" SY
  And Choose an UNValid date From Date of Meet sectionSY
   And enter a start time for the meetingSY
   And enter valid stop time for meetingSY
   And type a Description related to meetingSY
    And Click Submit ButtonSY
    Then verify if meeting couldn't created successfullySY
    Then close the browserSY

  @US_19_TC_04
  Scenario: User should not be able to Choose stop time smaller than, or equal to start time

    Given Click Menu from right top off the page in teacher pageSY
    And Click Meet Management from the Left Menu BarSY
    And Click Dropdown from Student ListSY
    And Set Student name "Abby Abernaty" SY
    And Choose a Valid date From Date of Meet sectionSY
    And enter a start time for the meetingSY
    And enter an INVALID stop time which is before the start time for meetingSY
    And type a Description related to meetingSY
    And Click Submit ButtonSY
    Then verify if ERROR message has displayed for timesSY
    Then close the browserSY
