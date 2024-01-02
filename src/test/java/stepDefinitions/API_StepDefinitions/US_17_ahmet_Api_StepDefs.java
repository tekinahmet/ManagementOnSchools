package stepDefinitions.API_StepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import pojos.studentInfoManagement.AddStudentInfoPostPojo;
import pojos.studentInfoManagement.ObjectPojo;
import pojos.studentInfoManagement.ResponseAddStudentInfoPostPojo;
import pojos.studentInfoManagement.StudentResponsePojo;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_17_ahmet_Api_StepDefs {
    Response response;
    AddStudentInfoPostPojo payload;
    ResponseAddStudentInfoPostPojo actualData;
    @Given("set the url and authorize")
    public void set_the_url_and_authorize() {
        setup("teacherjack", "Sparrow123");
        spec.pathParams("first", "studentInfo", "second", "update", "third", 5187);

    }
    @Given("set expected data for Add Student Info")
    public void set_expected_data_for_add_student_info() {
        payload = new AddStudentInfoPostPojo(10,16,45.0,"successful student", 1936,45.0);
        System.out.println("payload = " + payload);
    }
    @When("send put request and get response")
    public void send_put_request_and_get_response() {
        response = given(spec).body(payload).put("{first}/{second}/{third}");
        response.prettyPrint();
    }
    @Then("verify response body")
    public void verify_response_body() {
        actualData = response.as(ResponseAddStudentInfoPostPojo.class);
        System.out.println("actualData = " + actualData);
        assertEquals(payload.getAbsentee(), actualData.getObject().getAbsentee());
        assertEquals(payload.getEducationTermId(),actualData.getObject().getEducationTermId());
        assertEquals(payload.getFinalExam(),actualData.getObject().getFinalExam());
        assertEquals(payload.getInfoNote(),actualData.getObject().getInfoNote());
        assertEquals(payload.getLessonId(),actualData.getObject().getLessonId());
        assertEquals(payload.getMidtermExam(),actualData.getObject().getMidtermExam());
        assertEquals("Student Info updated Successfully",actualData.getMessage());
        assertEquals("CREATED",actualData.getHttpStatus());
    }
    @Then("verify status code is {int}")
    public void verify_status_code_is(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }
}
