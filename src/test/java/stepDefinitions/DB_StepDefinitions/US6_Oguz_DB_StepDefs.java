package stepDefinitions.DB_StepDefinitions;
import io.cucumber.java.en.*;
import java.sql.*;
import static org.junit.Assert.assertEquals;
public class US6_Oguz_DB_StepDefs {
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    @When("connected to database OG")
    public void connected_to_database_og() throws SQLException {
        connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management",
                "select_user", "43w5ijfso");
    }
    @When("Select the vice dean info that exists in the database OG")
    public void select_the_vice_dean_info_that_exists_in_the_database_og() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from vice_dean where id=1606");
    }
    @Then("verify vice dean OG")
    public void verify_vice_dean_og() throws SQLException {
        resultSet.next();
        assertEquals(1606,resultSet.getInt("id"));
        assertEquals("konya",resultSet.getString("birth_place"));
        assertEquals("suat",resultSet.getString("name"));
        assertEquals("801-555-5555",resultSet.getString("phone_number"));
        assertEquals("123-11-1110",resultSet.getString("ssn"));
        assertEquals("özgültekin",resultSet.getString("surname"));
        assertEquals("EFENDİ",resultSet.getString("username"));
        assertEquals(3,resultSet.getInt("user_role_id"));
    }
}