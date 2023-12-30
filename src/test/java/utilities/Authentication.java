package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Authentication {
    public static void main(String[] args) {
        System.out.println("generateToken = " + generateToken("teacherjack", "Sparrow123"));
    }

    public static String generateToken(String username, String password){
        String body = "{\n" +
                "  \"password\": \""+password+"\",\n" +
                "  \"username\": \""+username+"\"\n" +
                "}";

        Response response = given().body(body).contentType(ContentType.JSON).when().post("https://managementonschools.com/app/auth/login");
        return response.jsonPath().getString("token");
    }
}