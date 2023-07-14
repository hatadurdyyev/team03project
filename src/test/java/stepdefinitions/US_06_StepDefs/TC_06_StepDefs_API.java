package stepdefinitions.US_06_StepDefs;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static base_urls.ManagementonSchoolBaseUrl.spec2;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class TC_06_StepDefs_API {
    Response rs;

    @Given("user enters all the credentials under given conditions api")
    public void user_enters_all_the_credentials_under_given_conditions_api() {

        spec2.pathParams("first","vicedean","second","save");
        Map<String,String> exp = new HashMap<>();
        exp.put("birthDay","1980-05-20");
        exp.put("birthPlace","newyork");
        exp.put("gender","MALE");
        exp.put("name","guruk");
        exp.put("password","Abc12345");
        exp.put("phoneNumber","119-128-4457");
        exp.put("ssn","291-89-5219");
        exp.put("surname","kulu");
        exp.put("username","apipass08");

        rs = given().spec(spec2).header("Authorization","Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJQcm9qZWN0MDlBZG1pbiIsImlhdCI6MTY4OTA1Mzk3MywiZXhwIjoxNjg5MDYyNjEzfQ.hCxZxI04dwjaTCLmPVAVTwopFIBcSgjuqW7XHJxSZBQpNJrt64UoVzphJUtCjWylsHH-9gqU0GDzaRTEjb2P7A").contentType(ContentType.JSON).body(exp).when().post("/{first}/{second}");

    }
    @Given("verify Vice Dean account created api")
    public void verify_vice_dean_account_created_api() {

        assertEquals(200, rs.statusCode());
    }

    @Given("user enters all the credentials under given conditions but password api")
    public void user_enters_all_the_credentials_under_given_conditions_but_password_api() {

        spec2.pathParams("first","vicedean","second","save");
        Map<String,String> exp = new HashMap<>();
        exp.put("birthDay","1980-05-20");
        exp.put("birthPlace","newyork");
        exp.put("gender","MALE");
        exp.put("name","guruk");
        exp.put("password","12345678");
        exp.put("phoneNumber","424-128-4427");
        exp.put("ssn","421-89-5429");
        exp.put("surname","kulu");
        exp.put("username","apifail08");

        rs = given().spec(spec2).header("Authorization","Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJQcm9qZWN0MDlBZG1pbiIsImlhdCI6MTY4OTA1Mzk3MywiZXhwIjoxNjg5MDYyNjEzfQ.hCxZxI04dwjaTCLmPVAVTwopFIBcSgjuqW7XHJxSZBQpNJrt64UoVzphJUtCjWylsHH-9gqU0GDzaRTEjb2P7A").contentType(ContentType.JSON).body(exp).when().post("/{first}/{second}");

    }
    @Given("verify if Vice Dean account created api")
    public void verify_if_vice_dean_account_created_api() {

        assertEquals(409, rs.statusCode());
    }

}