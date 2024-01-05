#@US_13
#Feature: Vice Deans should be able to create a teacher
#
#  Background: go_homepage_and_login
#    Given user navigates to "https://managementonschools.com/"
#    And user clicks on login link
#    And user enters username "tomVice"
#    And user enters password "tomVice1"
#    And user clicks on login button
#
#  @US_13_TC01
#  Scenario: With_Valid_Credentials
#    And click menu button
#    And click TeacherManagementLink
#    And select lesson from choose lesson
#    And enter Teacher Name
#    And enter Teacher Surname
#    And enter Teacher Birth Place
#    And enter Teacher email
#    And enter Teacher valid phone number
#    And select teacher has advisory role
#    And select Teacher Male Gender
#    Then enter Teacher date of birth
#    And enter Teacher valid SSN
#    And enter username for teacher
#    And enter password
#    And click submit button
#    And verify teacher created successfully confirmation message
#
#  @US_13_TC02
#  Scenario: Without choosing lesson program
#    And click menu button
#    And click TeacherManagementLink
#    And enter Teacher Name
#    And enter Teacher Surname
#    And enter Teacher Birth Place
#    And enter Teacher email
#    And enter Teacher valid phone number
#    And select teacher has advisory role
#    And select Teacher Male Gender
#    Then enter Teacher date of birth
#    And enter Teacher valid SSN
#    And enter username for teacher
#    And enter password
#    And click submit button
#    Then verify submit fails
#
#  @US_13_TC03
#  Scenario: Name field blank
#    And click menu button
#    And click TeacherManagementLink
#    And select lesson from choose lesson
#    And enter Teacher Surname
#    And enter Teacher Birth Place
#    And enter Teacher email
#    And enter Teacher valid phone number
#    And select teacher has advisory role
#    And select Teacher Male Gender
#    Then enter Teacher date of birth
#    And enter Teacher valid SSN
#    And enter username for teacher
#    And enter password
#    Then verify fails Required
#
#  @US_13_TC04
#  Scenario: Surname field blank
#    And click menu button
#    And click TeacherManagementLink
#    And select lesson from choose lesson
#    And enter Teacher Name
#    And enter Teacher Birth Place
#    And enter Teacher email
#    And enter Teacher valid phone number
#    And select teacher has advisory role
#    And select Teacher Male Gender
#    Then enter Teacher date of birth
#    And enter Teacher valid SSN
#    And enter username for teacher
#    And enter password
#    Then verify fails Required
#
#  @US_13_TC05
#  Scenario: Password with less than 8 characters
#    And click menu button
#    And click TeacherManagementLink
#    And select lesson from choose lesson
#    And enter Teacher Name
#    And enter Teacher Surname
#    And enter Teacher Birth Place
#    And enter Teacher email
#    And enter Teacher valid phone number
#    And select teacher has advisory role
#    And select Teacher Male Gender
#    Then enter Teacher date of birth
#    And enter Teacher valid SSN
#    And enter username for teacher
#    And enter password with only seven chars
#    Then verify fails At Least 8 Characters
#
#  @US_13_TC06
#  Scenario: Without selecting gender
#    And click menu button
#    And click TeacherManagementLink
#    And select lesson from choose lesson
#    And enter Teacher Name
#    And enter Teacher Surname
#    And enter Teacher Birth Place
#    And enter Teacher email
#    And enter Teacher valid phone number
#    And select teacher has advisory role
#    Then enter Teacher date of birth
#    And enter Teacher valid SSN
#    And enter username for teacher
#    And enter password
#    And click submit button
#    Then verify submit fails for gender