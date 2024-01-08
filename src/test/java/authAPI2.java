import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.given;

public class authAPI2 {

    public static void main(String[] args) {

            String payLoad = "{\n" +
                    "  \"userId\": \"string\",\n" +
                    "  \"isbn\": \"string\"\n" +
                    "}";

            String uri = "https://bookstore.toolsqa.com/swagger/";
        //Perform authentication and get the token
            Response authMethod = given().contentType(ContentType.JSON).get(uri);
            System.out.println("Auth token"+authMethod.asString());
            Assert.assertEquals(authMethod.statusCode(),200);

            //Extract the token from the respomse body
        String token = authMethod.jsonPath().get("token");

        //use the token for subsequent requests
        Response order = given().contentType(ContentType.JSON).body(payLoad).header("Authorization","Bearer QpwL5tke4Pnpja"+token).post(uri);
        order.prettyPrint();
        Assert.assertEquals(order.statusCode(),200);


    }
}
