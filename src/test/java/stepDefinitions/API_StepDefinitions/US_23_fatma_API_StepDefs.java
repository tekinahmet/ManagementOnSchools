package stepDefinitions.API_StepDefinitions;

import baseUrl.BaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static junit.framework.TestCase.assertEquals;

public class US_23_fatma_API_StepDefs extends BaseUrl {
    Response response;
    String payLoad;


    @Given("Admin logs in with exist admin account FK23")
    public void admin_logs_in_with_exist_admin_account_fk23() {
        setup("AdminProject13", "Project13+");


    }
    @Given("URL is edited to create an vice dean account FK23")
    public void url_is_edited_to_create_an_admin_account_fk23() {


      spec.pathParams("first","vicedean","second","save");

    }
    @Given("Payload is edited FK23")
    public void payload_is_edited_fk23() {

           payLoad = "{\n" +
                   "  \"birthDay\": \"2000-01-01\",\n" +
                   "  \"birthPlace\": \"Nowhere\",\n" +
                   "  \"gender\": \"MALE\",\n" +
                   "  \"name\": \"Someone\",\n" +
                   "  \"password\": \"Abcd1234+\",\n" +
                   "  \"phoneNumber\": \"409-432-9821\",\n" +
                   "  \"ssn\": \"452-23-4091\",\n" +
                   "  \"surname\": \"None\",\n" +
                   "  \"username\": \"SoNo123\"\n" +
                   "}";
    }
    @When("Send request and get the response FK23")
    public void send_request_and_get_the_response_fk23() {


        response = given(spec).body(payLoad).when().post("{first}/{second}");
        response.prettyPrint();





    }
    @Then("Do assertion FK23")
    public void do_assertion_fk23() {

     //   JsonPath json = response.jsonPath();

//        assertEquals("2000-01-01", json.getString("birthDay"));
//        assertEquals("elenaAbc12", json.getString("username"));
//        assertEquals("Elena", json.getString("name"));
//        assertEquals("Abc", json.getString("surname"));
//        assertEquals("2000-01-01", json.getString("birthDay"));
//        assertEquals("137-54-1830", json.getString("ssn"));
//        assertEquals("Somewhere", json.getString("birthPlace"));
//        assertEquals("491-935-3782", json.getString("phoneNumber"));
//        assertEquals("Nowhere", json.getString("gender"));
//      //  assertEquals("Admin Saved", json.getString("message"));
//      //  assertEquals("CREATED", json.getString("httpStatus"));


    }


}
