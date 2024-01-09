package stepDefinitions.API_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.meetManagement.CreateMeeting;

import java.util.List;

import static io.restassured.RestAssured.*;
import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertEquals;

public class US_09_19_Sibel {
    Response response;
    Object i;
    CreateMeeting payload;

    @Given("Authorize with Vice Dean Credentials and get TokenSY")
    public void authorize_with_vice_dean_credentials_and_get_tokenSY() {
        setup("techprojane", "Janetechpro1");
    }

    @When("Set The Url paramsSY")
    public void set_the_url_paramsSY() {
        spec.pathParams("first", "lessons", "second", "getAll");
    }

    @And("Send Get Request and get responseSY")
    public void send_get_request_and_get_responseSY() {
        response = given(spec).when().get("{first}/{second}");


//      response.prettyPrint();
    }

    @Then("Verify if the status code is {int} SY")
    public void verify_if_the_status_code_isSY(int statusCodeS) {
        assertEquals(statusCodeS, response.statusCode());
    }

    @Then("Verify lessonName is not nullSY")
    public void verifyLessonNameIsNotNullSY() {
        JsonPath json = response.jsonPath();

        assertThat(json.getString("lessonName"), notNullValue());
    }


    @Then("Verify LessonId is not nullSY")
    public void verifyLessonIdIsNotNullSY() {
        JsonPath json = response.jsonPath();

        assertThat(json.getString("lessonId"), notNullValue());
    }


    @Then("Verify creditScore is not nullSY")
    public void verifyCreditScoreIsNotNullSY() {
        JsonPath json = response.jsonPath();


        assertThat(json.getString("creditScore"), notNullValue());
    }


    @Then("Verify compulsory is not nullSY")
    public void verifyCompulsoryIsNotNullSY() {
        JsonPath json = response.jsonPath();

        assertThat(json.getString("compulsory"), notNullValue());
    }

    @When("Get an id number from the listSY")
    public void getAnIdNumberFromTheListSY() {
        JsonPath json = response.jsonPath();
        List<Object> lessonIdNum = json.getList("lessonId");
        Object i = lessonIdNum.get(5);
        System.out.println("id number" + "" + i);

    }

    @And("Set The Url params for delete commandSY")
    public void setTheUrlParamsForDeleteCommandSY() {
        spec.pathParams("first", "lessons", "second", "delete", "third", i);

    }

    @And("Send Delete request to systemSY")
    public void sendDeleteRequestToSystemSY() {
        response = given(spec).delete("{first}/{second}/{third}");
    }

    @Given("Authorize with Teacher Credentials and get TokenSY")
    public void authorizeWithTeacherCredentialsAndGetTokenSY() {
        setup("teacherjane", "janeTeacher9");
    }

    @And("Set the Url for save meetingSY")
    public void setTheUrlForSaveMeetingSY() {
        spec.pathParams("first", "meet", "second", "save");
    }

    @And("Set payload with pojo classSY")
    public void setPayloadWithPojoClassSY() {
        payload = new CreateMeeting("2024-02-01", "importante", "01:00", "02:00", 1914);
    }

    @And("Send post response body for save meetingSY")
    public void sendPostResponseBodyForSaveMeetingSY() {

        response = given(spec).body(payload).when().post("{first}/{second}");
    }

    @And("For invalid times Set payload with pojo classSY")
    public void forInvalidTimesSetPayloadWithPojoClassSY() {
        payload = new CreateMeeting("2024-02-01", "importante", "02:00", "01:00", 2697);

    }

    @And("Send post body for invalid meeting timesSY")
    public void sendPostBodyForInvalidMeetingTimesSY() {
        response = given(spec).body(payload).when().post("{first}/{second}");

    }

    @Then("Delete the meeting newly createdSY")
    public void deleteTheMeetingNewlyCreatedSY() {
        JsonPath json = response.jsonPath();
        int meetId = json.getInt("object.id");
        spec.pathParams("first","meet","second","delete","third",meetId);
        given(spec).delete("{first}/{second}/{third}");
    }
}

//    {
//        "date": "<string>",
//            "description": "<string>",
//            "startTime": "<string>",
//            "stopTime": "<string>",
//            "studentIds": [
//        "<long>",
//                "<long>"
//  ]
//    }





