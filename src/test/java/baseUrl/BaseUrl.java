package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilities.Authentication.generateToken;

public class BaseUrl {
    public static RequestSpecification spec;
   public static void setup(String username, String password) {
       spec = new RequestSpecBuilder()
               .setBaseUri("https://managementonschools.com/app")
               .addHeader("Authorization", generateToken(username, password))
               .setContentType(ContentType.JSON)
               .build();
   }

}

