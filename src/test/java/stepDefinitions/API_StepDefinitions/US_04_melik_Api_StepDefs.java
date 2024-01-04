package stepDefinitions.API_StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.deanManagement.AddDeanMsPojo;
import pojos.deanManagement.ResponsePojo;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;


public class US_04_melik_Api_StepDefs {

    AddDeanMsPojo payLoad_Ms;
    Response response;
//    AddDeanMsPojo actualData;

    ResponsePojo actualData;
    JsonPath jsonPath;

    @Given("User sets the Url for Dean Save_MS")
    public void user_sets_the_url_for_dean_save_ms() {
        setup("AdminProject13", "Project13+");
        spec.pathParams("first", "dean", "second", "save");
    }

    @Given("sets the payLoad for Dean Save_MS")
    public void sets_the_pay_load_for_dean_save_ms() {


        payLoad_Ms = new AddDeanMsPojo("1995-01-01","Oslo","MALE",
                "Semih","Valhalla12","515-219-2365","111-55-3626",
                "Karakurt","SemihKarakurt");

    }

    @When("sends post request and get response_MS")
    public void sends_post_request_and_get_response_ms() {

        response = given(spec).when().body(payLoad_Ms).post("{first}/{second}");
        response.prettyPrint();


    }

    @Then("verify status code_MS is {int}")
    public void verifyStatusCode_MSIs(int statusCode200) {

        assertEquals(statusCode200, response.statusCode());


    }

    @Then("verifies response body_MS")
    public void verifies_response_body_ms() {
        actualData=response.as(ResponsePojo.class);
        assertEquals(payLoad_Ms.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(payLoad_Ms.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(payLoad_Ms.getGender(),actualData.getObject().getGender());
        assertEquals(payLoad_Ms.getName(),actualData.getObject().getName());
        assertEquals(payLoad_Ms.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(payLoad_Ms.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(payLoad_Ms.getSsn(),actualData.getObject().getSsn());
        assertEquals(payLoad_Ms.getSurname(),actualData.getObject().getSurname());
        assertEquals(payLoad_Ms.getUsername(),actualData.getObject().getUsername());



    }


}
