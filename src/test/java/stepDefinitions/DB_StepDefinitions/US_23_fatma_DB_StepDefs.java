package stepDefinitions.DB_StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.*;

import static junit.framework.TestCase.assertEquals;

public class US_23_fatma_DB_StepDefs {
    Connection connection;
    Statement statement;

    ResultSet resultSet;


    @When("Connected with database FK23")
    public void connected_with_database_fk23() throws SQLException {

        connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management",
                "select_user", "43w5ijfso");



    }
    @When("Select the ViceDean query already exist FK23")
    public void select_the_vice_dean_query_already_exist_fk23() throws SQLException {

        statement =connection.createStatement();
       resultSet = statement.executeQuery("select * from vice_dean where id=2776");



    }
    @Then("Verify it FK23")
    public void verify_it_fk23() throws SQLException {
        resultSet.next();
        assertEquals(2776,resultSet.getInt("id"));
        //assertEquals("Jan 1, 2000, 12:00:00 AM",resultSet.getInt("birth_day"));
        assertEquals("Nowhere",resultSet.getString("birth_place"));
        assertEquals("Someone",resultSet.getString("name"));
        assertEquals("409-432-9821",resultSet.getString("phone_number"));
        assertEquals("452-23-4091",resultSet.getString("ssn"));
        assertEquals("None",resultSet.getString("surname"));
        assertEquals("SoNo123",resultSet.getString("username"));
        assertEquals(3,resultSet.getInt("user_role_id"));


    }

}
