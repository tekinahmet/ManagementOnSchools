package stepDefinitions.DB_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.*;

public class US_04_Melik_DB_StepDefs {


    Connection connection;
    Statement statement;

    @Given("User set connection_MS")
    public void userSetConnection_MS() throws SQLException {
        connection = DriverManager.getConnection
                ("jdbc:postgresql://managementonschools.com:5432/school_management",
                "select_user", "43w5ijfso");
    }

    @And("User creates statement_MS")
    public void userCreatesStatement_MS() throws SQLException {

        statement = connection.createStatement();
    }

    @When("User execute query for created Dean_MS")
    public void userExecuteQueryForCreatedDean_MS() throws SQLException {

        ResultSet resultSet = statement.executeQuery("select * from dean where name = 'Clement'");


    }

    @Then("validates result set_MS")
    public void validatesResultSet_MS() {
    }

    @And("Close the connection_MS")
    public void closeTheConnection_MS() {
    }
}
