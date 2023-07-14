package stepdefinitions.US_11;
import io.cucumber.java.en.*;
import io.restassured.response.Response;

import static base_urls.ManagementonSchoolBaseUrl.spec2;
import static io.restassured.RestAssured.given;

public class US_11_apiStepDefs {

    Response response;

    @Given("send get request by lesson_name {string} to get the lesson schedule")
    public void send_get_request_by_lesson_name_to_get_the_lesson_schedule(String string) {

        //        https://managementonschools.com/app/lessonPrograms/getAllUnassigned

        spec2.pathParams("first", "lessonPrograms", "second", "getAllUnassigned");

        //Set the expected data
        //it is already exist in my api feature file

        //Send the request and get the response
        response = given(spec2).get("{first}/{second}");
        response.prettyPrint();
    }
    @Then("body should contains lesson_name {string} , start_time {string}, stop_time {string}, day {string}")
    public void body_should_contains_lesson_name_start_time_stop_time_day(String string, String string2, String string3, String string4) {

    }
}




