//package stepDefinitions.DB_StepDefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import utilities.ReusableMethods;
//
//import java.sql.*;
//
//import static org.junit.Assert.assertEquals;
//import static stepDefinitions.API_StepDefinitions.US_04_melik_Api_StepDefs.expectedData_MS;
//import static stepDefinitions.UI_StepDefinitions.US_04_Melik_UI_StepDefs.firstName_MS;
//import static stepDefinitions.UI_StepDefinitions.US_04_Melik_UI_StepDefs.userName_MS;
//
//public class US_04_Melik_DB_StepDefs {
//
//
//    Connection connection;
//    Statement statement;
//    ResultSet resultSet;
//
//    @Given("User set connection_MS")
//    public void userSetConnection_MS() throws SQLException {
//        connection = DriverManager.getConnection
//                ("jdbc:postgresql://managementonschools.com:5432/school_management",
//                "select_user", "43w5ijfso");
//    }
//
//    @And("User creates statement_MS")
//    public void userCreatesStatement_MS() throws SQLException {
//
//        statement = connection.createStatement();
//    }
//
//    @When("User execute query for created Dean_MS")
//    public void userExecuteQueryForCreatedDean_MS() throws SQLException {
//        //   statement = connection.createStatement();
//        ReusableMethods.createStatement();
//
//
//        ReusableMethods.executeQuery("select * from dean where username = '"+firstName_MS+"'");
//
//
//    }
//
//    @Then("validates result set_MS")
//    public void validatesResultSet_MS() throws SQLException {
//
//        resultSet.next();
//        assertEquals(expectedData_MS.getObject().getBirthDay(),resultSet.getString("birth_day"));
//        assertEquals(expectedData_MS.getObject().getBirthPlace(),resultSet.getString("birth_place"));
//        assertEquals(expectedData_MS.getObject().getGender(),resultSet.getString("gender"));
//        assertEquals(expectedData_MS.getObject().getName(),resultSet.getString("name"));
//        assertEquals(expectedData_MS.getObject().getPhoneNumber(),resultSet.getString("phone_number"));
//        assertEquals(expectedData_MS.getObject().getSsn(),resultSet.getString("ssn"));
//        assertEquals(expectedData_MS.getObject().getSurname(),resultSet.getString("surname"));
//        assertEquals(expectedData_MS.getObject().getUsername(),resultSet.getString("username"));
//
//
//
//    }
//
//    @And("Close the connection_MS")
//    public void closeTheConnection_MS() throws SQLException {
//
//        statement.close();
//        connection.close();
//    }
//}
