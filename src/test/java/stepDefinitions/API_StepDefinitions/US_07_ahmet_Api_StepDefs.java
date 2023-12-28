package stepDefinitions.API_StepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.ConfigReader;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_07_ahmet_Api_StepDefs {
    Response response;
    @Given("get all messages with GET REQUEST_07")
    public void get_all_messages_with_get_request_07() {
        setup(ConfigReader.getProperty("HakanKaya3"),ConfigReader.getProperty("HakanKaya123"));
        spec.pathParams("first","contactMessages","second","getAll").
                queryParams("size","1000");
        response= given(spec).get("{first}/{second}");
//        response.prettyPrint();
    }
    @Then("verify body_07 {string}, {string}, {string}, {string}, {string}")
    public void verify_body_07(String name, String email, String subject, String message, String date) {
        JsonPath jsonPath = response.jsonPath();

        //contactMessages/searchByEmail
        String contentName = jsonPath.getList("content.findAll{it.email=='itsme@gmail.com'}.name").getFirst().toString();
        String contentEmail = jsonPath.getList("content.findAll{it.email=='itsme@gmail.com'}.email").getFirst().toString();
        String contentSubject = jsonPath.getList("content.findAll{it.email=='itsme@gmail.com'}.subject").getFirst().toString();

        //contactMessages/searchBySubject
        String contentMessage = jsonPath.getList("content.findAll{it.subject=='end of the course'}.message").getFirst().toString();
        String contentDate = jsonPath.getList("content.findAll{it.subject=='end of the course'}.date").getFirst().toString();

        assertEquals(200, response.statusCode());
        assertEquals(name, contentName);
        assertEquals(email, contentEmail);
        assertEquals(subject, contentSubject);
        assertEquals(message, contentMessage);
        assertEquals(date, contentDate);


    }
}
