package stepDefinitions.API_StepDefinitions;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
public class US_16_Oguz_API_StepDefs {
    Response response;
    @Given("set the URL Og")
    public void set_the_url_og() {
        setup("HakanKaya3", "HakanKaya123");
        spec.pathParams("first","contactMessages","second","getAll").
                queryParams("size","1000");
    }
    @When("send the Get Request and get the Response to view messages Og")
    public void send_the_get_request_and_get_the_response_to_view_messages_og() {
        response= given(spec).get("{first}/{second}");
//  to print response
//  response.prettyPrint();
    }
    @When("verify status code is {int} Og")
    public void verify_status_code_is_og(Integer int1) {
    }
    @Then("Verify content {string}, {string}, {string}, {string}, {string} Og")
    public void verify_content_og(String name, String email, String subject, String message, String date) {
        JsonPath jsonPath = response.jsonPath();
        //contactMessages/searchByEmail
        String contentName = jsonPath.getList("content.findAll{it.email=='Deneme123@gmail.com'}.name").getFirst().toString();
        String contentEmail = jsonPath.getList("content.findAll{it.email=='Deneme123@gmail.com'}.email").getFirst().toString();
        String contentSubject = jsonPath.getList("content.findAll{it.email=='Deneme123@gmail.com'}.subject").getFirst().toString();
        //contactMessages/searchBySubject
        String contentMessage = jsonPath.getList("content.findAll{it.subject=='this is a trial'}.message").getFirst().toString();
        String contentDate = jsonPath.getList("content.findAll{it.subject=='MessageToTry'}.date").getFirst().toString();
        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(name, contentName);
        Assert.assertEquals(email, contentEmail);
        Assert.assertEquals(subject, contentSubject);
        Assert.assertEquals(message, contentMessage);
        Assert.assertEquals(date, contentDate);
    }
}