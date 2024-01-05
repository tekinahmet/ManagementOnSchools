package stepDefinitions.API_StepDefinitions;
import baseUrl.BaseUrl;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
public class US6_Oguz_API_StepDefs extends BaseUrl {
    Response response;
    String payLoad;
    String expectedData;
    @Given("Dean logs in with existed credentials OG")
    public void dean_logs_in_with_existed_credentials_og() {
        setup("jackdoe159", "Jackdough159");
    }
    @Then("set the url to post vice dean OG")
    public void set_the_url_to_post_vice_dean_og() {
        spec.pathParams("first", "vicedean", "second", "save");
    }
    @Then("create the payload for vice dean OG")
    public void create_the_payload_for_vice_dean_og() {
        payLoad ="  {\n" +
                "  \"birthDay\": \"1991-02-01\",\n" +
                "  \"birthPlace\": \"boston\",\n" +
                "  \"gender\": \"MALE\",\n" +
                "  \"name\": \"Billy\",\n" +
                "  \"password\": \"Bil123Pro\",\n" +
                "  \"phoneNumber\": \"315-111-6732\",\n" +
                "  \"ssn\": \"123-31-1111\",\n" +
                "  \"surname\": \"John\",\n" +
                "  \"username\": \"Johny\"\n" +
                "}";
    }
    @When("send the Request and get the Response_OG")
    public void send_the_request_and_get_the_response_og() {
        response = given(spec).body(payLoad).when().post("{first}/{second}");
        response.prettyPrint();
    }
    @Then("do the assertion OG")
    public void do_the_assertion_og() {
        JsonPath json = response.jsonPath();
        assertEquals("1991-02-01", json.getString("birthDay"));
        assertEquals("Billy", json.getString("name"));
        assertEquals("John", json.getString("surname"));
        assertEquals("Johny", json.getString("username"));
    }
}