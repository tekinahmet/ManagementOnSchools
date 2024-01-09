//package stepDefinitions.API_StepDefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.restassured.response.Response;
//import pojos.viceDeanManagement.ViceDeanPojo;
//import pojos.viceDeanManagement.ViceDeanPostPojo;
//
//
//import static baseUrl.BaseUrl.setup;
//import static baseUrl.BaseUrl.spec;
//
//import static io.restassured.RestAssured.given;
//import static org.junit.Assert.assertEquals;
//
//
//
//
//
//public class US_10_mertcan_Api_StepDefs {
//
//    ViceDeanPostPojo payLoad;
//    Response response;
//
//
//
//    @Given("enter as {string}")
//    public void enterAs(String arg0) {
//        setup("ViseDeanAmede","Project13+");
//    }
//    @And("the URL is configured for saved Vice Dean")
//    public void theURLIsConfiguredForSavedViceDean() {
//        //https://managementonschools.com/app/lessonPrograms/save
//        spec.pathParams("first","dean","second","save");
//    }
//
//    @And("the payload is configured for saved Vice Dean")
//    public void thePayloadIsConfiguredForSavedViceDean() {
//        payLoad = new ViceDeanPostPojo("2000-04-06","Turkey","MALE", "Martin", "12345678Aa", "535-455-7894", "523-98-4561", "Luther","MartinLuther");
//        /*
//        {
//      "2000-04-06", "Turkey","MALE", "Martin", "12345678Aa", "535-455-7894", "523-98-4561", "Luther","MartinLuther"
//}
//         */
//
//    }
//
//    @When("a POST request for saved Vice Dean Info,and the response is received")
//    public void aPOSTRequestForSavedViceDeanInfoAndTheResponseIsReceived() {
//        //given(spec).body(payLoad).when().post("{first}/{second}");
//        Response response =given(spec).body(payLoad).post("{first}/{second}");
//        response.prettyPrint();
//    }
//
//    @Then("verify the response body for Vice Dean")
//    public void verifyTheResponseForSavedViceDean() {
//        ViceDeanPojo actualData = response.as(ViceDeanPojo.class);
//
//        assertEquals(payLoad.getBirthDay(),actualData.getObject().getBirthDay());
//        assertEquals(payLoad.getBirthPlace(),actualData.getObject().getBirthPlace());
//        assertEquals(payLoad.getGender(),actualData.getObject().getGender());
//        assertEquals(payLoad.getName(),actualData.getObject().getName());
//        assertEquals(payLoad.getPhoneNumber(),actualData.getObject().getPhoneNumber());
//        assertEquals(payLoad.getSsn(),actualData.getObject().getSsn());
//        assertEquals(payLoad.getSurname(),actualData.getObject().getSurname());
//        assertEquals(payLoad.getUsername(),actualData.getObject().getUsername());
//
//
//    }
//
//
//    @Then("verify the status code is {int}")
//    public void verifyTheStatusCodeIs(int code) {
//        assertEquals(code,response.statusCode());
//    }
//
//}
//
