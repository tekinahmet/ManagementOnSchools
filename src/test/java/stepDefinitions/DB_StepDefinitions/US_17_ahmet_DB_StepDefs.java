package stepDefinitions.DB_StepDefinitions;

import io.cucumber.java.en.*;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US_17_ahmet_DB_StepDefs {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("User sets connection_US17")
    public void user_sets_connection_US17() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management",
                "select_user", "43w5ijfso");
    }
    @When("User creates statement_US17")
    public void user_creates_statement_US17() throws SQLException {
        statement=connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM student_info WHERE id = 3226");
    }
    @Then("User validates result set_US17 {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_validates_result_set_us17(String id, String absentee, String exam_average, String final_exam, String info_note, String letter_grade, String midterm_exam, String education_term_id, String lesson_lesson_id, String student_id, String teacher_id) throws SQLException {
        resultSet.next();
        assertEquals(id, resultSet.getString("id"));
        assertEquals(absentee, resultSet.getString("absentee"));
        assertEquals(exam_average, resultSet.getString("exam_average"));
        assertEquals(final_exam, resultSet.getString("final_exam"));
        assertEquals(info_note, resultSet.getString("info_note"));
        assertEquals(letter_grade, resultSet.getString("letter_grade"));
        assertEquals(midterm_exam, resultSet.getString("midterm_exam"));
        assertEquals(education_term_id, resultSet.getString("education_term_id"));
        assertEquals(lesson_lesson_id, resultSet.getString("lesson_lesson_id"));
        assertEquals(student_id, resultSet.getString("student_id"));
        assertEquals(teacher_id, resultSet.getString("teacher_id"));
    }
    @Then("User terminates connection_US17")
    public void user_terminates_connection_US17() throws SQLException {
        connection.close();
        statement.close();
    }

}
