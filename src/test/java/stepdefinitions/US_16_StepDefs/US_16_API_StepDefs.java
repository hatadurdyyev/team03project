package stepdefinitions.US_16_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.restassured.response.Response;

import static base_urls.ManagementonSchoolBaseUrl.spec2;

import static io.restassured.RestAssured.given;


public class US_16_API_StepDefs {

    Response response;

    @Given("send get all request by content{string} to get all sent messages")
    public void sendGetAllRequestByContentToGetAllSentMessages(String content) {
        // https://managementonschools.com/app/contactMessages/getAll?page=0&size=10&sort=date&type=desc
        spec2.pathParams("first","contactMessages","second","getAll");

        //Send the request and get the response

        response = given(spec2).get("{first}/{second}");

        response.prettyPrint();

    }

    @Then("body should contains  name{string}, email{string}, subject {string}, message {string},date {string}")
    public void bodyShouldContainsNameEmailSubjectMessageDate(String name, String email, String subject, String message, String date) {


    }


}
