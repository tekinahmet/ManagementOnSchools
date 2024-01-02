package stepDefinitions.API_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import pojos.studentManagement.StudentObjectPojo;
import pojos.studentManagement.StudentPostPojo;
import pojos.studentManagement.StudentResponsePojo;
import utilities.ConfigReader;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_15_zeynep_Api_StepDefs {

    public static StudentPostPojo payload;
    public static Response response;
    public static StudentResponsePojo actualData;

    public static StudentObjectPojo object;


    @Given("set the url for create a student zs")
    public void set_the_url_for_create_a_student_zs() {
        setup(ConfigReader.getProperty("AdminProject13"), ConfigReader.getProperty("Project13+"));
        spec.pathParams("first", "students", "second", "save");

    }

    @And("payload zs")
    public void payloadZs() {
        payload = new StudentPostPojo(1339, "06.12.2023", "london","zsude002@gmail.com", "father","FEMALE","mother","folina","Project13+","111-111-4282", "123-46-7897","sahlo","FolinaSahlooo");;
        
    }

    @When("send a post request zs")
    public void sendAPostRequestZs() {

        response =  given(spec).body(payload).when().post("{first}/{second}");
        actualData = response.as(StudentResponsePojo.class);
        
    }

    @Then("verifies status code is {int} zs")
    public void verifiesStatusCodeIsZs(int statuscode) {
        assertEquals(statuscode, response.statusCode());

    }

    @And("verifies response body  zs")
    public void verifiesResponseBodyZs() {

        assertEquals(payload.getAdvisorTeacherId(), actualData.getObject().getAdvisorTeacherId());
        assertEquals(payload.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(payload.getEmail(), actualData.getObject().getEmail());
        assertEquals(payload.getFatherName(), actualData.getObject().getFatherName());
        assertEquals(payload.getGender(), actualData.getObject().getGender());
        assertEquals(payload.getMotherName(), actualData.getObject().getMotherName());
        assertEquals(payload.getName(), actualData.getObject().getName());
        assertEquals(payload.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(), actualData.getObject().getSsn());
        assertEquals(payload.getSurname(), actualData.getObject().getSurname());
        assertEquals(payload.getUsername(), actualData.getObject().getUsername());
    }
}
