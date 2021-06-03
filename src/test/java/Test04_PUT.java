import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test04_PUT {

    @Test
    void test01_put(){

        JSONObject request = new JSONObject();

        request.put("name" , "Melih");
        request.put("job" , "Developer");


        System.out.println(request);
        System.out.println(request.toJSONString());

        given().
            header("Content-type","application/json").
            contentType(ContentType.JSON).
            body(request.toJSONString()).
        when().
            put("https://reqres.in/api/users/2").
        then().
            statusCode(200);
    }


    @Test
    void test02_patch(){

        JSONObject request = new JSONObject();

        request.put("name" , "Melih");
        request.put("job" , "Developer");


        System.out.println(request);
        System.out.println(request.toJSONString());

        given().
                header("Content-type","application/json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).
                when().
                put("https://reqres.in/api/users/2").
                then().
                statusCode(200);
    }


}
