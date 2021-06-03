import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Test01_Get {

    @Test
    void test_01(){
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println(response.getStatusCode());
        System.out.println("----");
        System.out.println(response.getBody());
        System.out.println("----");
        System.out.println(response.asString());
        System.out.println("----");
        System.out.println(response.getStatusCode());
        System.out.println("----");
        System.out.println(response.getHeader("contant-type"));

    }

    @Test
    void test_02(){

        given()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("data.id[0]",equalTo(7)).
                body("data.id[1]",equalTo(8));



    }


}
