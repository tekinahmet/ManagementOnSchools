package stepDefinitions.DB_StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static junit.framework.TestCase.assertEquals;

public class US_20_mertcan_DB_StepDefs {
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("Take Meet by {string}")
    public void take_meet_by(String string) throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery(" id ");
        resultSet.next();

    }
    @Then("verify resultSet body id={string},date={string},description={string},start_time ={string}, stop_time={string}, advisor_teacher_id={string}")
    public void verify_result_set_body_id_date_description_start_time_stop_time_advisor_teacher_id(String date, String description, String start_time, String stop_time, String string5, String string6) throws SQLException {
        String actDate = resultSet.getString("date");
        String actDescription = resultSet.getString("description");
        String actStartTime = resultSet.getString("start_time");
        String actStopTime = resultSet.getString("stop_time");
        String actAdvisorTeacherId = resultSet.getString("advisor_teacher_id");

        assertEquals(date , actDate);
        assertEquals(description , actDescription);
        assertEquals(start_time , actStartTime);
        assertEquals(stop_time , actStopTime);
        assertEquals(actAdvisorTeacherId , actAdvisorTeacherId);

    }




}
