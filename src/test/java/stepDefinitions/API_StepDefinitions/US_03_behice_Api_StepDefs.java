//package stepDefinitions.API_StepDefinitions;
//import baseUrl.BaseUrl;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.github.javafaker.Faker;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.restassured.response.Response;
//import pojos.ContactMessagePojo;
//import pojos.ContactMessageResponsePojo;
//import utilities.FakerUtils;
//import utils.ObjectMapperUtils;
//import static io.restassured.RestAssured.given;
//import static org.junit.Assert.assertEquals;
//public class US_03_behice_Api_StepDefs extends BaseUrl {
//   /*
//   Given
//      url from baseUrl
//   And
//      Request body:
//        {
//          "email": "abd@ab.com",
//          "message": "This is text",
//          "name": "Robert Smith",
//          "subject": "Registration"
//        }
//   When
//        Send post request
//   Then
//        Status code is 200
//   And
//        Response body should be like:
//        {
//        "object": {
//            "name": "Robert Smith",
//            "email": "abd@ab.com",
//            "subject": "Registration",
//            "message": "This is text",
//            "date": "2023-09-13"
//        },
//        "message": "Contact Message Created Successfully",
//        "httpStatus": "CREATED"
//        }
//*/
//
//    Response response; //declare in the class level, otherwise it will be another object
//    ContactMessagePojo expectedData;
//
//    //-------------------- TC01 -----------------------
//    @Given("send post request to send message from contact page")
//    public void send_post_request_to_send_message_from_contact_page() {
//        //Set the url
//        spec.pathParams("first", "contactMessages", "second", "save");
//
//        //Set the expected data
//        expectedData = new ContactMessagePojo(
//                FakerUtils.emailFaker(),
//                Faker.instance().book().title(),
//                FakerUtils.nameFaker(),
//                FakerUtils.lessonFaker());
//
//        //Send the request and get the response
//        response = given(spec).body(expectedData).post("{first}/{second}");
//        response.prettyPrint();
//    }
//
//    @Then("validate response data is the same with created user credentials")
//    public void validate_response_data_is_the_same_with_created_user_credentials() {
//        //Do Assertion
//        ContactMessageResponsePojo actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), ContactMessageResponsePojo.class);
//
//        assertEquals(200, response.statusCode());
//        assertEquals(expectedData.getEmail(), actualData.getObject().getEmail());
//        assertEquals(expectedData.getMessage(), actualData.getObject().getMessage());
//        assertEquals(expectedData.getName(), actualData.getObject().getName());
//        assertEquals(expectedData.getSubject(), actualData.getObject().getSubject());
//
//        //Additional assertion for the response body
//        assertEquals("Contact Message Created Successfully", actualData.getMessage());
//        assertEquals("CREATED", actualData.getHttpStatus());
//
//    }
//}
