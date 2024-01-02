package stepDefinitions.API_StepDefinitions;

import baseUrl.BaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;

public class US_22_fatma_API_StepDefs extends BaseUrl {

    Response response;
    String payLoad;


    String expectedData;

    //    ******************TC01***************************

    @Given("Admin logs in with exist account FK_{int}")
    public void admin_logs_in_with_exist_admin_account_fk(Integer int1) {

        setup("AdminProject13", "Project13+");

    }

    @Given("URL is edited to create an admin account FK_{int}")
    public void url_is_edited_to_create_an_admin_account_fk(Integer int1) {
        spec.pathParams("first", "admin", "second", "save");

    }

    @Given("Payload is edited FK_{int}")
    public void payload_is_edited_fk(Integer int1) {

        payLoad = "{\n" +
                "  \"birthDay\": \"2000-01-01\",\n" +
                "  \"birthPlace\": \"Nowhere\",\n" +
                "  \"built_in\": \"True\",\n" +
                "  \"gender\": \"FEMALE\",\n" +
                "  \"name\": \"Fairytale\",\n" +
                "  \"password\": \"Abcdef123\",\n" +
                "  \"phoneNumber\": \"532-254-1068\",\n" +
                "  \"ssn\": \"843-01-6844\",\n" +
                "  \"surname\": \"Fa\",\n" +
                "  \"username\": \"FairyT\"\n" +
                "}";


    }

    @When("Send request and get the response FK_{int}")
    public void send_request_and_take_response_fk(Integer int1) {

        response = given(spec).body(payLoad).when().post("{first}/{second}");
        response.prettyPrint();

    }


    @Then("Do assertion FK_{int}")
    public void do_assertion_fk(Integer int1) {

        JsonPath json = response.jsonPath();

        assertEquals("Admin Saved", json.getString("message"));

        assertEquals("2000-01-01", json.getString("birthDay"));
        assertEquals("Jo", json.getString("username"));
        assertEquals("Joseph", json.getString("name"));
        assertEquals("Fa", json.getString("surname"));
        assertEquals("2000-01-01", json.getString("birthDay"));
        assertEquals("337-54-1030", json.getString("ssn"));
        assertEquals("Nowhere", json.getString("birthPlace"));
        assertEquals("101-935-3582", json.getString("phoneNumber"));
        assertEquals("Nowhere", json.getString("gender"));
        assertEquals("Admin Saved", json.getString("message"));
        assertEquals("CREATED", json.getString("httpStatus"));


    }
}




