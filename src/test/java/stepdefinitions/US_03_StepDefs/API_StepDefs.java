package stepdefinitions.US_03_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_urls.ManagementonSchoolBaseUrl.*;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class API_StepDefs {

    Response response;

    @Given("send get request by {string}")
    public void send_get_request_by(String subject) {

        spec2.pathParams("first","contactMessages","second","searchBySubject").queryParam("subject","Java");
        response = given(spec2).get("{first}/{second}");
        response.prettyPrint();

    }
    @Then("body should contains name {string},email {string},subject {string},message {string}, date {string}")
    public void body_should_contains_name_email_subject_message_date(String name, String email, String subject, String message, String date) {
        // do assertion
        JsonPath jsonPath = response.jsonPath();

        String actName=jsonPath.getList("content.findAll{it.subject=='"+subject+"'}.name").get(7).toString();
        String actEmail=jsonPath.getList("content.findAll{it.subject=='"+subject+"'}.email").get(7).toString();
        String actSubject=jsonPath.getList("content.findAll{it.subject=='"+subject+"'}.subject").get(7).toString();
        String actMessage=jsonPath.getList("content.findAll{it.subject=='"+subject+"'}.message").get(7).toString();
        String actDate=jsonPath.getList("content.findAll{it.subject=='"+subject+"'}.date").get(7).toString();

        assertEquals(200, response.statusCode());
        assertEquals(name,actName);
        assertEquals(email,actEmail);
        assertEquals(subject,actSubject);
        assertEquals(message,actMessage);
        assertEquals(date,actDate);
    }
      /*
        {
            "name": "John",
            "email": "John123@gmial.com",
            "subject": "Java",
            "message": "Learn Java earn money",
            "date": "2023-07-11"
        },
        */






    }

