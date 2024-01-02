package stepDefinitions.DB_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.sql.*;
import java.util.List;
import pojos.deanManagement.ObjectPojo;
import static junit.framework.TestCase.assertEquals;

public class US_05_zeynep_DB_StepDefs {

    Connection connection;

    Statement statement;

    ResultSet resultSet;

    public static ObjectPojo objectPojo;

    @Given("connect database ZS")
    public void connectDatabaseZS() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user", "43w5ijfso");


    }

    @And("admin creates statement ZS")
    public void adminCreatesStatementZS() throws SQLException {
       statement = connection.createStatement();

    }

    @When("admin execute query for see dean' information ZS")
    public void adminExecuteQueryForSeeDeanInformationZS() throws SQLException {

        resultSet = statement.executeQuery("SELECT name,gender,phone_number,ssn,username FROM dean WHERE username ='ShayneModesto'");

    }

    @Then("validates result set ZS")
    public void validatesResultSetZS() throws SQLException {
       resultSet.next();
       assertEquals(objectPojo.getName(),resultSet.getString("Eldon"));
       assertEquals(objectPojo.getGender(),resultSet.getString("1"));
       assertEquals(objectPojo.getPhoneNumber(),resultSet.getString("544-320-4689"));
       assertEquals(objectPojo.getSsn(),resultSet.getString("ShayneModesto"));


    }

   @And("admin terminate connection ZS")
    public void adminTerminateConnectionZS() throws SQLException {
        statement.close();
        connection.close();
    }
}
