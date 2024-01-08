import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ReqRes2 {

    public static void main(String[] args) {

        //Status code and time
        String uri = "https://reqres.in/api/users?page=2";
        String payLoad = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        Response getMethod = given().get(uri);
        getMethod.prettyPrint();
        System.out.println(getMethod.time());
        System.out.println(getMethod.statusCode());

        //PatchMethod
        String payLoadPatch = "{\n" +
                "    \"username\" : \"Lothar\",\n" +
                "    \"password\" : \"Dias\"\n" +
                "}";
        String uriPatch = "https://reqres.in/api/users";
        Response patchMethod = given().contentType(ContentType.JSON).body(payLoadPatch).post("https://reqres.in/api/users");
        patchMethod.prettyPrint();
        System.out.println("The response code is "+patchMethod.statusCode());
        System.out.println("The time taken is"+patchMethod.time());

        //postMethod
        String payLoadPost = "{\n" +
                "    \"username\" : \"Lothar\",\n" +
                "    \"password\" : \"Dias\"\n" +
                "}";
        Response postMethod = given().contentType(ContentType.JSON).body(payLoadPost).get("https://reqres.in/api/users");
        postMethod.prettyPrint();
        System.out.println();
        System.out.println("The Response code is "+postMethod.statusCode());
        System.out.println("The Time taken is"+ postMethod.time());

        //Put Method
        String payLoadPut = "{\n" +
                "    \"name\": \"lotharrrrrrrrrrrrrr\",\n" +
                "    \"job\": \"wembley resident\"\n" +
                "}";
        Response putMethod = given().contentType(ContentType.JSON).body(payLoadPut).put("https://reqres.in/api/users/2");
        putMethod.prettyPrint();
        System.out.println("The response code is"+putMethod.statusCode());
        System.out.println("The Time taken is"+ putMethod.time());

        //Delete Method
        Response deletMethod = given().delete("https://reqres.in/api/users/2");
        deletMethod.prettyPrint();
        System.out.println("The Response code is for deletion " + deletMethod.statusCode());
        System.out.println("The Time taken is deletion " + deletMethod.time());



    }
}
