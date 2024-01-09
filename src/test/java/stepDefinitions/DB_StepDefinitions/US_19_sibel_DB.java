package stepDefinitions.DB_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class US_19_sibel_DB {
    Statement statement;
    Connection connection;
    ResultSet resultSet;


    @Given("Set connection to DATABASE_us19SY")
    public void set_connection_to_database_us19SY() {
        DBUtils.createConnection();
    }
    @And("Gets the column {string} from the table {string} SY")
    public void getsTheColumnFromTheTableSY(String arg0, String arg1) {
        DBUtils.executeQuery( "select "+arg0+" from "+arg1+"" );
    }
    @Then("verify table {string} and column {string} contains data {string} SY")
    public void verifyTableAndColumnContainsDataSY(String table, String column, String data) {
        List<Object> allColumnData = DBUtils.getColumnData("select "+column+" from "+table+"",column);
        System.out.println(allColumnData);
//        assert if that list contains the given data
        Assert.assertTrue(allColumnData.contains(data));

    }
    @Then("Terminate the connection us19SY")
    public void terminate_the_connection_us19SY() {
//       DBUtils.getConnection().close();
    }



}

