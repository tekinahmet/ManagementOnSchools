package stepDefinitions.DB_StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.TestCase;

import java.sql.*;

import static junit.framework.TestCase.assertEquals;

public class US_22_fatma_DB_StepDefs {


    Connection connection;
    Statement statement;

    ResultSet resultSet;




    @When("Connected with database FK22")
    public void connected_with_database() throws SQLException {
        connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management",
                "select_user", "43w5ijfso");
    }


    @When("Select the admin query already exist FK22")
    public void select_the_admin_query_already_exist() throws SQLException {

       statement = connection.createStatement();
       resultSet = statement.executeQuery("select * from admins where id=1651");


    }



    @Then("Verify it FK22")
    public void verify_it() throws SQLException {
        resultSet.next();
        assertEquals(1651,resultSet.getInt("id"));
        //assertEquals("Jan 1, 2000, 12:00:00 AM",resultSet.getInt("birth_day"));
        assertEquals("Nowhere",resultSet.getString("birth_place"));
        assertEquals("Fairytale",resultSet.getString("name"));
        assertEquals("532-254-1068",resultSet.getString("phone_number"));
        assertEquals("843-01-6844",resultSet.getString("ssn"));
        assertEquals("Fa",resultSet.getString("surname"));
        assertEquals("FairyT",resultSet.getString("username"));
        assertEquals(false,resultSet.getBoolean("built_in"));
        assertEquals(1,resultSet.getInt("user_role_id"));




    }

}
