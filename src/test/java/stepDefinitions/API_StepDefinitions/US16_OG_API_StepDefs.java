package stepDefinitions.API_StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.deanManagement.ResponsePojo;
import utilities.ConfigReader;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;

public class US16_OG_API_StepDefs {
    public static MessagePojo_OG_US16 expectedData;
    Response response;

    public static ResponsePojo actualData;

    @Given("ViceDean logs in with existed credentials OG")
    public void vice_dean_logs_in_with_existed_credentials_og() {
        setup("ViseDeanAmede","Project13+");
    }
    @Given("set the URL for post OG")
    public void set_the_url_for_post_og() {
        spec.pathParams("first","contactMessages","second","save");
    }
    @Given("create the payload OG")
    public void create_the_payload_og() {
        expectedData = new MessagePojo_OG_US16("Tony12M@gmail.com", "helloO", "tonyB", "lesson1");
    }
    @When("send the Request and get the Response OG")
    public void send_the_request_and_get_the_response_og() {
        response = given(spec).body(expectedData).when().post("{first}/{second}");
        actualData = response.as(ResponsePojo.class);
    }
    @Then("Verifying message content: name={string}, email={string}, subject={string}, message={string}, date={string}")
    public void verifying_message_content_name_email_subject_message_date(String arg0, String arg1, String arg2, String arg3, String arg4) {
       Assert.assertEquals(ConfigReader.getProperty(arg0),actualData.getObject().getName());
        Assert.assertEquals(ConfigReader.getProperty(arg1),actualData.getObject().getEmail());
        Assert.assertEquals(ConfigReader.getProperty(arg2),actualData.getObject().getSubject());
        Assert.assertEquals(ConfigReader.getProperty(arg3),actualData.getObject().getMessage());
        Assert.assertEquals(ConfigReader.getProperty(arg4),actualData.getObject().getDate());
    }

    }


