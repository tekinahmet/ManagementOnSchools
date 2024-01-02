package stepDefinitions.API_StepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.ConfigReader;

import java.util.Optional;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_07_ahmet_Api_StepDefs {
    Response response;
    @Given("set the url T")
    public void set_the_url_t() {
        setup("HakanKaya3", "HakanKaya123");
        spec.pathParams("first","contactMessages","second","getAll").
                queryParams("size","1000");
    }
    @When("send GET request to get all the messages T")
    public void send_get_request_to_get_all_the_messages_t() {
        response= given(spec).get("{first}/{second}");
//        response.prettyPrint();
    }
    @Then("status code is {int} T")
    public void status_code_is_t(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }
    @Then("verify body T {string}, {string}, {string}, {string}, {string}")
    public void verify_body_t(String name, String email, String subject, String message, String date) {
        JsonPath jsonPath = response.jsonPath();

        //contactMessages/searchByEmail
        String contentName = jsonPath.getList("content.findAll{it.email=='itsme@gmail.com'}.name").getFirst().toString();
        String contentEmail = jsonPath.getList("content.findAll{it.email=='itsme@gmail.com'}.email").getFirst().toString();
        String contentSubject = jsonPath.getList("content.findAll{it.email=='itsme@gmail.com'}.subject").getFirst().toString();

        //contactMessages/searchBySubject
        String contentMessage = jsonPath.getList("content.findAll{it.subject=='end of the course'}.message").getFirst().toString();
        String contentDate = jsonPath.getList("content.findAll{it.subject=='end of the course'}.date").getFirst().toString();


        assertEquals(name, contentName);
        assertEquals(email, contentEmail);
        assertEquals(subject, contentSubject);
        assertEquals(message, contentMessage);
        assertEquals(date, contentDate);


    }
}
