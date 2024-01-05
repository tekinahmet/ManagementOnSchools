package stepDefinitions.API_StepDefinitions;

import baseUrl.BaseUrl;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;

public class US6_OG_API_StepDefs extends BaseUrl {
    String payLoad;
    Response response;


    @Given("Dean logs in with existed credentials")
    public void dean_logs_in_with_existed_credentials() {
       setup("jackdoe159","Jackdough159");
    }
    @Given("set the URL for post")
    public void set_the_url_for_post() {
    spec.pathParams("first","vicedean","second","save");
    }
    @Given("create the payload")
    public void create_the_payload() {
     payLoad ="  {\n" +
            "  \"birthDay\": \"1776-08-05\",\n" +
            "  \"birthPlace\": \"Delta\",\n" +
            "  \"gender\": \"MALE\",\n" +
            "  \"name\": \"XYZGeoSrge\",\n" +
            "  \"password\": \"123aTTsTTss54\",\n" +
            "  \"phoneNumber\": \"115-353-6732\",\n" +
            "  \"ssn\": \"847-64-9112\",\n" +
            "  \"surname\": \"XWhiteSTeethB\",\n" +
            "  \"username\": \"XYMeloniVT\"\n" +
            "}";
    }
    @When("send the Request and get the Response")
    public void send_the_request_and_get_the_response() {
        response = given(spec).body(payLoad).when().post("{first}/{second}");
        response.prettyPrint();
    }


    @Then("do the assertion")
    public void do_the_assertion() {
        JsonPath json = response.jsonPath();
       assertEquals("Delta",json.getString("birthPlace"));
        assertEquals("XYZGeorge",json.getString("name"));
    }

}
