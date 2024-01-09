@US_09
Feature: Vice Deans should be able to VIEW/DELETE/UPDATE lessons

  Background: login in the application as a vice dean
  Given User navigates to home page "https://managementonschools.com" SY
  And Click on Login ButtonSY
  And Type UserName "techprojane" and Password "Janetechpro1" SY
  And Click on the login buttonSY

    @US_09_TC_01
  Scenario:TC_01 Check if the lessons list is visible

    Given : Click Menu from right top off the pageSY

      And Click Lesson Management from the Left Menu BarSY
      And Click LessonsSY
      Then Check the page if created Lesson names are visibleSY
      Then Check the page if created Compulsories are visibleSY
      Then Check the page if created Credit Scores are visibleSY
      Then close the browserSY

  @US_09_TC_02
  Scenario: TC_02 Vice Dean Should be able to DELETE Lesson

    Given : Click Menu from right top off the pageSY
      And Click Lesson Management from the Left Menu BarSY
      And Click LessonsSY
      And Click from first row Delete Icon from the Lessons list belowSY
      Then Check if there is a succession message for the deleted LessonSY
      Then Assert Lesson you deleted not on the list anymoreSY
      Then close the browserSY

  @US_09_TC_03
  Scenario: TC_03 Vice Dean Should be able to DELETE Lesson

    Given : Click Menu from right top off the pageSY
    And Click Lesson Management from the Left Menu BarSY
    And Click LessonsSY
    And Inspect if there is any update sectionSY
    Then close the browserSY









