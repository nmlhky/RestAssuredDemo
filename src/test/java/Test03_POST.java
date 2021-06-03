import io.restassured.http.ContentType;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Test03_POST {

    @Test
    void test01(){

//        Map<String, Object> map = new HashMap<String, Object>();
//
//        map.put("name" , "Melih");
//        map.put("job" , "Developer");
//
//        System.out.println(map);

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
            post("https://reqres.in/api/users").
        then().
            statusCode(201);
    }
}
