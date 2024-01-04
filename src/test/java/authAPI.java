import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.given;

public class authAPI {

    public static void main(String[] args) {

        String payLoad ="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        String Uri = "https://restful-booker.herokuapp.com/auth";

        //Perform authentication and get the token
        Response authMethod  = given().contentType(ContentType.JSON).body(payLoad).post("https://restful-booker.herokuapp.com/auth");
        System.out.println(("Authentication Response"+authMethod.asString()));
        Assert.assertEquals(authMethod.statusCode(),200);

        //Extract the token from the response body
        String token = authMethod.jsonPath().get("token");

        //use the token for subsequent requests
        Response order = given().contentType(ContentType.JSON).body(payLoad).header("Authorization","Bearer QpwL5tke4Pnpja" + token).post("https://restful-booker.herokuapp.com/auth");
        order.prettyPrint();
        Assert.assertEquals(order.statusCode(),200);



    }

}
