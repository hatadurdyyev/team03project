package stepdefinitions.US_08_StepDefs;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import static base_urls.ManagementonSchoolBaseUrl.*;
import static io.restassured.RestAssured.given;

public class API_StepDefs {

    Response response;


    @Given("us_{int} send the API request")
    public void us_send_the_api_request(Integer int1) {
 //https://managementonschools.com/app/lessons/getAll

        spec2.pathParams("first","lessons","second","getAll");

        response = given(spec2).get("/{first}/{second}");

        response.prettyPrint();

    }

    @Given("us_{int} validate the API response")
    public void us_validate_the_api_response(Integer int1) {

        response.then().statusCode(200);


    }
}