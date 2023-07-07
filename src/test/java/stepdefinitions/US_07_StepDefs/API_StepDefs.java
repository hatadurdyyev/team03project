package stepdefinitions.US_07_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static base_urls.ManagementonSchoolBaseUrl.spec2;
import static io.restassured.RestAssured.given;

public class API_StepDefs {

    Response response;


    @Given("end the request get all")
    public void end_the_request_get_all() {

        //Set the url

        spec2.pathParams("first","contactMessages","second","getAll");

        //Set the expected data


        //Send the request and get the response
        response = given(spec2).header("Authorization","Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtaWxlcyIsImlhdCI6MTY4ODcxNTgzMCwiZXhwIjoxNjg4NzI0NDcwfQ.oRO61YPkxIoluslPKlFbn_PoWgJJgVJAX_u2fUcVvQd_X1ZTpRF997uN9WMQn4OpHCkWufjhnYDMDxtob6SaQw").get("/{first}/{second}");

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
