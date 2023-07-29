package stepdefinitions.US_20_StepDefs;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

import static base_urls.ManagementonSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class US_20_TC_02_API_Test {

    Response response;

    @Given("Send the request and get the response")
    public void send_the_request_and_get_the_response() {

        spec.pathParams("first","meet","second","getAll");

        response = given(spec).get("/{first}/{second}");

    }
    @Then("assert the meeting are deleted")
    public void assert_the_meeting_are_deleted() {



//  There is a bug in API meet post creation. I can't continue


//        {
//            "message": "Meet deleted successfully ",
//                "httpStatus": "OK"
//        }

    }

}
