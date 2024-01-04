package stepDefinitions.DB_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.API_StepDefinitions.US_15_zeynep_Api_StepDefs.payload;

public class US_15_zeynep_DB_StepDefs {

    Statement statement;
    ResultSet resultSet;
    Connection connection;

    @Given("connect databasee ZS")
    public void connect_databasee_zs() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");

    }

    @When("Send Query to Retrieve Registered Student Information ZS")
    public void sendQueryToRetrieveRegisteredStudentInformationZS() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from student where username ='FolinaSahlooo'");


    }

    @Then("verifies registered student information ZS")
    public void verifiesRegisteredStudentInformationZS() throws SQLException {
        assertEquals(payload.getBirthDay(), resultSet.getString("birth_day"));
        assertEquals( payload.getBirthPlace(), resultSet.getString("birth_place"));
        assertEquals( 1, resultSet.getInt("gender"));
        assertEquals( payload.getName(), resultSet.getString("name"));
        assertEquals(payload.getPassword() , resultSet.getString("password"));
        assertEquals( payload.getPhoneNumber(), resultSet.getString("phone_number"));
        assertEquals( payload.getSsn(), resultSet.getString("ssn"));
        assertEquals(payload.getSurname() , resultSet.getString("surname"));
        assertEquals( payload.getUsername(), resultSet.getString("username"));
        assertEquals(payload.getEmail() , resultSet.getString("email"));
        assertEquals( payload.getFatherName(), resultSet.getString("father_name"));
        assertEquals(payload.getMotherName() , resultSet.getString("mother_name"));
        assertEquals(payload.getAdvisorTeacherId() , resultSet.getInt("advisor_teacher_id"));

    }

    @And("terminate connectionn ZS")
    public void terminateConnectionnZS() throws SQLException {
        statement.close();
        connection.close();
    }
}
