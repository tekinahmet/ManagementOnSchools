@US_19_E2E
Feature: US_19 E2E Test


@US_19_UI_E2E
  Scenario: UI_Test_Create a Student Meeting when user in the Teacher account
  Given User navigates to home page "https://managementonschools.com" SY
  And Click on Login ButtonSY
  And Type UserName "teacherjane" and Password "janeTeacher9" SY
  And Click on the login buttonSY
  When Click Menu from right top off the page in teacher pageSY
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
  Then verify Description is visible on the created meetingSY
  Then close the browserSY

@US_19_API_E2E
Scenario:API_Test_Create a Student Meeting when user in the Teacher account
  Given Authorize with Teacher Credentials and get TokenSY
  And Set the Url for save meetingSY
  And Set payload with pojo classSY
  And Send post response body for save meetingSY
  Then Verify if the status code is 200 SY

  @US_19_DB_E2E
  Scenario Outline:DB_Test_Validate if the meeting Created successfully
    Given Set connection to DATABASE_us19SY
    And Gets the column "*" from the table "meet" SY
    Then verify table "<table_name>" and column "<column_name>" contains data "<data_name>" SY
    Examples: data
      | table_name | column_name | data_name      |
      | meet       | description | importante     |
      | meet       | description | Lesson related |

