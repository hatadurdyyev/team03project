package stepdefinitions.US_07_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static base_urls.ManagementonSchoolBaseUrl.*;
import static io.restassured.RestAssured.given;

public class API_StepDefs {

    Response response;


    @Given("end the request get all")
    public void end_the_request_get_all() {

        //Set the url

        spec.pathParams("first","contactMessages","second","getAll");

        //Set the expected data


        //Send the request and get the response
        //response = given(spec3).header("Authorization","Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJQcm9qZWN0MDlBZG1pbiIsImlhdCI6MTY4ODkxODM2NiwiZXhwIjoxNjg4OTI3MDA2fQ.Rjms2shGzVtP398eNidQp1BohASqxcGO5OfzP_XnjduDcRUlrzuHOr_n-v0ZifkmqrfYNPrsuycjdvKS4gtOUA").get("/{first}/{second}");

        response = given(spec).get("/{first}/{second}");

        response.prettyPrint();


    }
    @Then("validate the body")
    public void validate_the_body() {

        //Do assertion

        response.
                then()
                .statusCode(200);


    }

}
