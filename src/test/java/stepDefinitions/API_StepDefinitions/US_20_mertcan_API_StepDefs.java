package stepDefinitions.API_StepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;


import java.util.ArrayList;
import java.util.List;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;


public class US_20_mertcan_API_StepDefs {
    public static MeetPojo expectedData;
    public static Response response;
    public static MeetResponse actualData;
    public static String expectedDelete;
    public static int idMeet;

    @Given("taken id no for saved meetings")
    public void taken_id_no_for_saved_meetings() {
        setup("teacherjane","janeTeacher9");
        spec.pathParams("first","meet","second","update","third",idMeet);


    }

    @Given("being prepare meet info's needs to be fix")
    public void being_prepare_meet_info_s_needs_to_be_fix() {
        List<Integer> studentList = new ArrayList<>();
        studentList.add(22);
        expectedData = new MeetPojo("2023-10-26","Don't be late!");

    }

    @When("saved meet id update")
    public void saved_meet_id_update() {
        response =given(spec).body(expectedData).when().put("{first}/{second}/{third}");
        response.prettyPrint();

        actualData = response.as(MeetResponse.class);
        System.out.println("actualData = " +actualData);


    }

    @Given("preparing meeting for delete meet")
    public void preparingMeetingForDeleteMeet() {
        setup("teacherjane","janeTeacher9");
        spec.pathParams("first", "meet", "second", "delete", "third",idMeet);
    }
    @And("delete with saved meet id")
    public void deleteWithSavedMeetId() {
        expectedDelete = "Meet deleted successfully";
        response = given(spec).when().delete("{first}/{second}/{third}");

    }

    @Then("verify meet delete")
    public void verifyMeetDelete() {
        assertEquals(200, response.statusCode());
        assertEquals(expectedDelete, response.jsonPath().getString("message"));
    }


    private class MeetPojo {
        public MeetPojo(String date, String s) {

        }
    }

    private class MeetResponse {
    }
}
