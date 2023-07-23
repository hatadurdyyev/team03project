package stepdefinitions.US_20_StepDefs;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static base_urls.ManagementonSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class US_20_TC_01_API_Test {

    Response response;


    @Given("send the request")
    public void send_the_request() {

        spec.pathParams("first","meet","second","getAll");

        response = given(spec).get("/{first}/{second}");

        response.prettyPrint();

    }
    @When("verify the response")
    public void verify_the_response() {


        response.then().statusCode(200);


    }



}
