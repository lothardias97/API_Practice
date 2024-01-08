import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ReqRes {

    public static void main(String[] args) {

/*
        Response getMethod = given().get("https://reqres.in/api/users?page=2");
        getMethod.prettyPrint();
        System.out.println(getMethod.time());
        System.out.println(getMethod.statusCode());
*/
        //Status code and time
/*
        String payLoad = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        Response postMethod = given().contentType(ContentType.JSON).body(payLoad).post("https://reqres.in/api/users");
        postMethod.prettyPrint();
        System.out.println("The Response code is "+postMethod.statusCode());
        System.out.println("The Time taken is"+ postMethod.time());
*/

        //Patch Method
       /* String payLoad = "{\n" +
                "    \"name\": \"lothar\",\n" +
                "    \"job\": \"wembley resident\"\n" +
                "}";
        Response patchMethod = given().contentType(ContentType.JSON).body(payLoad).patch("https://reqres.in/api/users/2");
        patchMethod .prettyPrint();
        System.out.println("The Response code is "+patchMethod.statusCode());
        System.out.println("The Time taken is"+ patchMethod.time());*/

        //Put Method
/*
        String payLoad = "{\n" +
                "    \"name\": \"lotharrrrrrrrrrrr\",\n" +
                "    \"job\": \"wembley resident\"\n" +
                "}";
        Response putMethod = given().contentType(ContentType.JSON).body(payLoad).put("https://reqres.in/api/users/2");
        putMethod .prettyPrint();
        System.out.println("The Response code is "+putMethod.statusCode());
        System.out.println("The Time taken is"+ putMethod.time());*/

        //Delet Method
        //Create,Post=pass payLoad,body,information
        //Update,Put,Patch = pass payLoad,body,information
        //Delete           = no pass,no body

        Response deletMethod = given().delete("https://reqres.in/api/users/2");
        deletMethod.prettyPrint();
        System.out.println("The Response code is " + deletMethod.statusCode());
        System.out.println("The Time taken is" + deletMethod.time());

    }
}
