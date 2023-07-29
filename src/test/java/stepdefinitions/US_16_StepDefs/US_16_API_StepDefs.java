package stepdefinitions.US_16_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_urls.ManagementonSchoolBaseUrl.spec2;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class US_16_API_StepDefs {

    Response response;

    @Given("send get all request by  to get all sent messages")
    public void sendGetAllRequestByToGetAllSentMessages() {
        // https://managementonschools.com/app/contactMessages/getAll?page=0&size=10&sort=date&type=desc
        spec2.pathParams("first","contactMessages","second","getAll");

        //Send the request and get the response

        response = given(spec2).get("{first}/{second}");

        response.prettyPrint();

    }

    @Then("response body should contains {string}")
    public void responseBodyShouldContains(String content) {
        JsonPath jsonPath = response.jsonPath();
        assertEquals(200,response.statusCode());
        assertTrue(response.asString().contains("content"));


    }

}
