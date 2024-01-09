package stepDefinitions.API_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.deanManagement.AddDeanMsPojo;
import pojos.deanManagement.DeanValidationMSpojoms;
import pojos.deanManagement.Objectpojoms;
import pojos.deanManagement.ResponsePojo;

import java.util.List;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import static stepDefinitions.UI_StepDefinitions.US_04_Melik_UI_StepDefs.*;


public class US_04_melik_Api_StepDefs {

    public static AddDeanMsPojo payLoad_Ms;
    Response response_MS;
    public static int deanForValidation;
    public static DeanValidationMSpojoms expectedData_MS;

    DeanValidationMSpojoms actualData2_MS;

    ResponsePojo actualData_MS;
    Response response1_MS;


    @Given("User sets the Url for Dean Save_MS")
    public void user_sets_the_url_for_dean_save_ms() {
        setup("AdminProject13", "Project13+");
        spec.pathParams("first", "dean", "second", "save");
    }

    @Given("sets the payLoad for Dean Save_MS")
    public void sets_the_pay_load_for_dean_save_ms() {


        payLoad_Ms = new AddDeanMsPojo("1995-11-11",birthPlace_MS,"MALE",
                firstName_MS,password_MS,phoneNumber_MS,ssnNumber_MS,
                surname_MS,userName_MS);

    }

    @When("sends post request and get response_MS")
    public void sends_post_request_and_get_response_ms() {

        response_MS = given(spec).when().body(payLoad_Ms).post("{first}/{second}");
        response_MS.prettyPrint();


    }

    @Then("verify status code_MS is {int}")
    public void verifyStatusCode_MSIs(int statusCode200) {

        assertEquals(statusCode200, response_MS.statusCode());


    }

    @Then("verifies response body_MS")
    public void verifies_response_body_ms() {
        actualData_MS = response_MS.as(ResponsePojo.class);
        assertEquals(payLoad_Ms.getBirthDay(), actualData_MS.getObject().getBirthDay());
        assertEquals(payLoad_Ms.getBirthPlace(), actualData_MS.getObject().getBirthPlace());
        assertEquals(payLoad_Ms.getGender(), actualData_MS.getObject().getGender());
        assertEquals(payLoad_Ms.getName(), actualData_MS.getObject().getName());
        assertEquals(payLoad_Ms.getPhoneNumber(), actualData_MS.getObject().getPhoneNumber());
        assertEquals(payLoad_Ms.getSsn(), actualData_MS.getObject().getSsn());
        assertEquals(payLoad_Ms.getSurname(), actualData_MS.getObject().getSurname());
        assertEquals(payLoad_Ms.getUsername(), actualData_MS.getObject().getUsername());



    }


    @Given("User sets the Url for Dean Get_MS")
    public void userSetsTheUrlForDeanGet_MS() {
        setup("AdminProject13","Project13+");
        spec.pathParams("first","dean","second","getAll");
        Response response = given(spec).when().get("{first}/{second}");
        JsonPath jsonPath1 = response.jsonPath();
        List<Integer> deanList = jsonPath1.getList("findAll{it.username=='"+userName_MS+"'}.userId");
        deanForValidation = deanList.get(0);
        System.out.println("deanForValidation = " + deanForValidation);





    }

    @And("sets the expected Data for Dean Get_MS")
    public void setsTheExpectedDataForDeanGet_MS() {
        spec.pathParams("first","dean","second","getManagerById","third",deanForValidation);
        Objectpojoms validationData = new Objectpojoms(deanForValidation,userName_MS,firstName_MS,surname_MS,"1995-11-11",ssnNumber_MS,birthPlace_MS,phoneNumber_MS,"MALE");
        expectedData_MS = new DeanValidationMSpojoms(validationData,"Dean successfully found","OK");

    }

    @When("sends getMethod request and get response_MS")
    public void sendsGetMethodRequestAndGetResponse_MS() {
        response1_MS = given(spec).when().get("{first}/{second}/{third}");
        actualData2_MS = response1_MS.as(DeanValidationMSpojoms.class);


    }

    @Then("verify status code for getMethod_MS is {int}")
    public void verifyStatusCodeForGetMethod_MSIs(int statusCode200) {

        assertEquals(statusCode200, response1_MS.statusCode());
    }

    @And("verify response body for getMethod_MS")
    public void verifyResponseBodyForGetMethod_MS() {

        assertEquals(expectedData_MS.getObject().getUserId(), actualData2_MS.getObject().getUserId());
        assertEquals(expectedData_MS.getObject().getUsername(), actualData2_MS.getObject().getUsername());
        assertEquals(expectedData_MS.getObject().getName(), actualData2_MS.getObject().getName());
        assertEquals(expectedData_MS.getObject().getSurname(), actualData2_MS.getObject().getSurname());
        assertEquals(expectedData_MS.getObject().getBirthDay(), actualData2_MS.getObject().getBirthDay());
        assertEquals(expectedData_MS.getObject().getSsn(), actualData2_MS.getObject().getSsn());
        assertEquals(expectedData_MS.getObject().getBirthPlace(), actualData2_MS.getObject().getBirthPlace());
        assertEquals(expectedData_MS.getObject().getPhoneNumber(), actualData2_MS.getObject().getPhoneNumber());
        assertEquals(expectedData_MS.getObject().getGender(), actualData2_MS.getObject().getGender());
        assertEquals(expectedData_MS.getMessage(), actualData2_MS.getMessage());
        assertEquals(expectedData_MS.getHttpStatus(), actualData2_MS.getHttpStatus());
    }
}
