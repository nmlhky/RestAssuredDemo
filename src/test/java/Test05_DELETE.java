import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class Test05_DELETE {

    @Test
    void test01(){



        when().
            delete("https://reqres.in/api/users/2").
        then().
            statusCode(204);
    }



}
