package stepDefinitions.API_StepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import pojos.studentInfoManagement.AddStudentInfoPostPojo;
import pojos.studentInfoManagement.ObjectPojo;
import pojos.studentInfoManagement.ResponseAddStudentInfoPostPojo;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_17_ahmet_Api_StepDefs {
    Response response;
    AddStudentInfoPostPojo payload;
    AddStudentInfoPostPojo actualData;
    @Given("set the url and authorize")
    public void set_the_url_and_authorize() {
        setup("teacherjack", "Sparrow123");
        spec.pathParams("first", "studentInfo", "second", "studentInfo", "third", "5099");

    }
    @Given("set expected data for Add Student Info")
    public void set_expected_data_for_add_student_info() {
        payload = new AddStudentInfoPostPojo(10,16,95.0,"successful student", 1936,95.0);
        System.out.println("payload = " + payload);
    }
    @When("send put request and get response")
    public void send_put_request_and_get_response() {
        response = given(spec).body(payload).put("{first}/{second}/{third}");
        response.prettyPrint();
    }
    @Then("verify response body")
    public void verify_response_body() {
        actualData = response.as(AddStudentInfoPostPojo.class);
        System.out.println("actualData = " + actualData);
        assertEquals(payload.getAbsentee(),actualData.getAbsentee());
        assertEquals(payload.getEducationTermId(),actualData.getEducationTermId());
        assertEquals(payload.getFinalExam(),actualData.getFinalExam());
        assertEquals(payload.getInfoNote(),actualData.getInfoNote());
        assertEquals(payload.getLessonId(),actualData.getLessonId());
        assertEquals(payload.getMidtermExam(),actualData.getMidtermExam());
//        assertEquals("Student Info saved Successfully",actualData.getMessage());
//        assertEquals("CREATED",actualData.getHttpStatus());
    }
    @Then("verify status code is {int}")
    public void verify_status_code_is(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }
}
