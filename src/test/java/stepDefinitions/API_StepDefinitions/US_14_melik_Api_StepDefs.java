package stepDefinitions.API_StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.deanManagement.AddDeanMsPojo;
import pojos.deanManagement.ObjectPojo;
import pojos.deanManagement.ResponsePojo;
import pojos.teacherManagement.LessonPojo;
import pojos.teacherManagement.LessonsProgramListPojo;
import pojos.teacherManagement.ObjectPojo_MS;
import pojos.teacherManagement.TeacherIdForGetRequestPojo_Ms;

import java.util.List;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepDefinitions.UI_StepDefinitions.US_14_Melik_UI_StepDefs.teacherName_MS;


public class US_14_melik_Api_StepDefs {
    Response response;
    public static int teacherId_Ms;
    ObjectPojo_MS dataforTeacher;
    TeacherIdForGetRequestPojo_Ms expectedData;
    TeacherIdForGetRequestPojo_Ms actualData;
    @Given("Get teacher's id_MS")
    public void get_teacher_s_id_ms() {
        setup("Valhalla","Valhalla12");
        spec.pathParams("first","teachers","second","getAll");
        response = given(spec).when().get("{first}/{second}");
        JsonPath json = response.jsonPath();
        List<Integer> teacherIdList = json.getList("findAll{it.username=='FelixKeeling'}.userId");
        teacherId_Ms = teacherIdList.get(0);
        System.out.println("teacherId_Ms = " + teacherId_Ms);

    }
    @Given("set the url for teacher getSavedById")
    public void set_the_url_for_teacher_get_saved_by_ıd() {
        setup("Valhalla","Valhalla12");
        spec.pathParams("first", "teachers","second","getSavedTeacherById","third",teacherId_Ms);



    }
    @Given("set the expected data")
    public void set_the_expected_data() {

        dataforTeacher = new ObjectPojo_MS(teacherId_Ms,"FelixKeeling","Sheryll","Bashirian","coy.thompson@hotmail.com","FEMALE","Emardland","876-620-0026","775-95-8242","1996-09-22",true);
        expectedData = new TeacherIdForGetRequestPojo_Ms(dataforTeacher,"Teacher successfully found","OK");
    }
    @When("sends get request and get response_MS")
    public void sends_get_request_and_get_response_ms() {
        response = given(spec).when().get("{first}/{second}/{third}");
        actualData = response.as(TeacherIdForGetRequestPojo_Ms.class);

    }
    @Then("verify status code for teacher_MS is {int}")
    public void verify_status_code_for_teacher_ms_is(int statuscode) {

        assertEquals(statuscode,response.statusCode());

    }
    @Then("verify response body for Teacher_MS")
    public void verify_response_body_for_teacher_ms() {

        assertEquals(expectedData.getObject().getId(),actualData.getObject().getId());
        assertEquals(expectedData.getObject().getUsername(),actualData.getObject().getUsername());
        assertEquals(expectedData.getObject().getName(),actualData.getObject().getName());
        assertEquals(expectedData.getObject().getSurname(),actualData.getObject().getSurname());
        assertEquals(expectedData.getObject().getEmail(),actualData.getObject().getEmail());
        assertEquals(expectedData.getObject().getGender(),actualData.getObject().getGender());
        assertEquals(expectedData.getObject().getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getObject().getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getObject().getSsn(),actualData.getObject().getSsn());
        assertEquals(expectedData.getObject().getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(expectedData.getObject().isAdvisor(),actualData.getObject().isAdvisor());
        assertEquals(expectedData.getMessage(),actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(),actualData.getHttpStatus());
    }

}
