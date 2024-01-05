package stepDefinitions.DB_StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pojos.contactGetAllManagement.ContactObjectPojo;
import pojos.deanManagement.ObjectPojo;
import java.sql.*;
import static org.junit.Assert.assertEquals;
public class US16_Oguz_DB_StepDefs {
    static Connection connection;
    Statement statement;
    ResultSet resultSet;
    public static ContactObjectPojo contactObjectPojo;
    @Given("Vice Dean connects to data-base oG")
    public void vice_dean_connects_to_data_base_o_g() throws SQLException {
        connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management",
                "select_user", "43w5ijfso");
    }
    @Given("select the message exists in the data-base oG")
    public void select_the_message_exists_in_the_data_base_o_g() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from contact_message where id=1446");
    }
    @Then("verify the message oG")
    public void verify_the_message_o_g() throws SQLException {
        // Write code here that turns the phrase above into concrete actions
        resultSet.next();
        assertEquals(contactObjectPojo.getName(),resultSet.getString("name"));
        assertEquals(contactObjectPojo.getSubject(),resultSet.getString("subject"));
        assertEquals(contactObjectPojo.getEmail(),resultSet.getString("email"));
        assertEquals(contactObjectPojo.getMessage(),resultSet.getString("message"));
    }
}