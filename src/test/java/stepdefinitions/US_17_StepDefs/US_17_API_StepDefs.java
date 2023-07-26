package stepdefinitions.US_17_StepDefs;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static base_urls.ManagementonSchoolBaseUrl.spec2;
import static io.restassured.RestAssured.given;

public class US_17_API_StepDefs {

/*
The lesson, student and semester should be selectable.
Absences should be able to be entered.
Midterm and Final Exam grades should be able to be entered
Info note about the student should be able to be entered.
 */

    Response response;

    @Given("send the request")
    public void send_the_request() {
        // Create a Map to store the API request body information
        Map<String, Object> requestBody = new HashMap<>();
        // Populate the Map with the given information
        requestBody.put("absentee", 2);
        requestBody.put("educationTermId", 3);
        requestBody.put("finalExam", 67);
        requestBody.put("infoNote", "Student passed the class.");
        requestBody.put("lessonId", 45);
        requestBody.put("midtermExam", 55);
        requestBody.put("studentId", 65);

    spec2.pathParams("first", "studentInfo", "second", "save");

    response = given(spec2).contentType(ContentType.JSON).body(requestBody).post("/{first}/{second}");
    response.prettyPrint();


    }
    @Then("verify the response body")
    public void verify_the_response_body() {




    }
}
