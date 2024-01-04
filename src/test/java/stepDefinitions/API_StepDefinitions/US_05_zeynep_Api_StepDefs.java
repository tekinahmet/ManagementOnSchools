package stepDefinitions.API_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.deanManagement.DeanPostPojo;
import pojos.deanManagement.ObjectPojo;
import pojos.deanManagement.ResponsePojo;
import utilities.ConfigReader;

import java.util.List;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.delete;
import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;


public class US_05_zeynep_Api_StepDefs {
    Response response;

    public  ResponsePojo actualData;

    DeanPostPojo payload;

    public static int userId;

    ObjectPojo getObject;

    public static ObjectPojo object;

    @Given("user authorized as Admin zs")
    public void user_authorized_as_admin() {
        setup(ConfigReader.getProperty("AdminProject13"), ConfigReader.getProperty("Project13+"));

    }
    @And("send the request and get the response zs")
    public void sendTheRequestAndGetTheResponse() {
        spec.pathParams("first" ,"dean", "second", "getAll" );

        response = given(spec).get("{first}/{second}");
        response.prettyPrint();

    }

   @Then("do assertion zs")
    public void doAssertion() {
        response.then().statusCode(200);
    }

    @Given("admin send post request for creating dean zs")
    public void adminSendPostRequestForCreatingDean() {
         setup(ConfigReader.getProperty("AdminProject13"), ConfigReader.getProperty("Project13+"));
         spec.pathParams("first","dean", "second", "save");

         payload = new DeanPostPojo("2752","ShayneModesto","Eldon","Vernon","1979-09-23","084-90-3399","Lake Fabiola","544-320-4689", "FEMALE");

         response = given(spec).body(payload).when().post("{first}/{second}");
         response.prettyPrint();

    }


    @Then("verifies status code is int zs")
    public void verifiesStatusCodeIsInt(int code) {
        assertEquals(code,response.statusCode());
    }

    @And("verifies response body zs")
    public void verifiesResponseBody() {
        actualData= response.as(ResponsePojo.class);

        assertEquals(payload.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(payload.getGender(),actualData.getObject().getGender());
        assertEquals(payload.getName(),actualData.getObject().getName());
        assertEquals(payload.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(),actualData.getObject().getSsn());
        assertEquals(payload.getSurname(),actualData.getObject().getSurname());
        assertEquals(payload.getUsername(),actualData.getObject().getUsername());
    }

    @And("admin gets id of the dean with username zs")
    public void adminGetsIdOfTheDeanWithUsername(String userName) {
        spec.pathParams("first", "dean", "second" , "getAll");
        response=given(spec).when().get("{first}/{second}");
        List<Integer> userIdList = response.jsonPath().getList("findAll{it.username=='"+userName+"'}.id");
        userId = userIdList.get(0);


    }

    @And("admin sets the url fot get dean by id zs")
    public void adminSetsTheUrlFotGetDeanById() {
        spec.pathParams("first", "dean", "second", "getManagerById" , "third", userId);


    }

    @Then("send delete request for delete deans zs")
    public void sendDeleteRequestForDeleteDeans() {

      response = given(spec).when().delete("{first}/{second}/{third}");
    }


}

