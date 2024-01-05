@US_17_DB
Feature: The teacher should be able to give grades to the students.
 Scenario Outline: Test to give grades to the students by a teacher
    Given User sets connection_US17
    When User creates statement_US17
    Then User validates result set_US17 "<id>", "<absentee>", "<exam_average>", "<final_exam>", "<info_note>", "<letter_grade>", "<midterm_exam>", "<education_term_id>", "<lesson_lesson_id>", "<student_id>", "<teacher_id>"
    And User terminates connection_US17
   Examples: test_data
   |id    |absentee|exam_average|final_exam|info_note   |letter_grade|midterm_exam|education_term_id|lesson_lesson_id|student_id|teacher_id|
   | 3226 |12      | 100        | 100      |good student|AA          |100         |16               |1931            |1880      |1723      |
