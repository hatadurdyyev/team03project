package stepdefinitions.US_25;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import pojos.StudentPojo;


import java.io.IOException;

import static base_urls.ManagementonSchoolBaseUrl.*;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US25_TC02_API_StepDefs {
    /*
        Given
            https://managementonschools.com/app/students/save
            {
              "advisorTeacherId": 1,
              "birthDay": "2001-12-12",
              "birthPlace": "Toronto",
              "email": "jack@kyle.com",
              "fatherName": "jackfather",
              "gender": "MALE",
              "motherName": "jackmother",
              "name": "jack",
              "password": "jack1234",
              "phoneNumber": "123-123-9330",
              "ssn": "321-12-9330",
              "surname": "kyle",
              "username": "jack9330"
            }
        When
            I send POST Request to the Url
        Then
            Status code is 200
        And
            response body is like
                {
                    "object": {
                        "userId": 1448,
                        "username": "jack9330",
                        "name": "jack",
                        "surname": "kyle",
                        "birthDay": "2001-12-12",
                        "birthPlace": "Toronto",
                        "phoneNumber": "123-123-9330",
                        "gender": "MALE",
                        "studentNumber": 2441,
                        "motherName": "jackmother",
                        "fatherName": "jackfather",
                        "email": "jack@kyle.com",
                        "active": true
                    },
                    "message": "Student saved Successfully"
                }

     */

    Response response;
    StudentPojo expectedData;
    StudentPojo actualData;


    @Given("Admin send a POST request to the URL")
    public void admin_send_a_post_request_to_the_url() {

        //https://managementonschools.com/app/students/save
        spec2.pathParams("first", "students", "second", "save");

        expectedData = new StudentPojo(1, "2001-12-12", "Toronto",
                "james0@kyle.com", "jamesfather", "MALE", "jamesmother",
                "james", "james1234", "123-321-5550", "312-12-5550",
                "james", "james5550");
        //System.out.println("expectedData = " + expectedData);

        response = given(spec2).contentType(ContentType.JSON).body(expectedData).post("{first}/{second}");

    }

    @And("Response body should be received and saved as actual data")
    public void responseBodyShouldBeReceivedAndSavedAsActualData() throws IOException {

        //response.prettyPrint();
        actualData = new ObjectMapper().readValue(response.asString(), StudentPojo.class);
        //System.out.println("actualData = " + actualData);
    }

    @Then("Body message should be student saved successfully {string}")
    public void body_message_should_be_student_saved_successfully(String message) {

        System.out.println(response.jsonPath().getString("message"));
        assertEquals(message, response.jsonPath().getString("message"));
    }

    @And("Validate the expected data with actual data")
    public void validateTheExpectedDataWithActualData() {

        assertEquals(200, response.statusCode());
        assertEquals("application/json", response.contentType());

        assertEquals(expectedData.getEmail(), actualData.getEmail());
        assertEquals(expectedData.getPhoneNumber(), actualData.getPhoneNumber());
        assertEquals(expectedData.getSsn(), actualData.getSsn());
        assertEquals(expectedData.getUsername(), actualData.getUsername());
    }
}
