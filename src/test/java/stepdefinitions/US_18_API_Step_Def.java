package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_urls.ManagementonSchoolBaseUrl.spec2;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

//public class US_18_API_Step_Def {
//    Response response;
//
//    @Given("send get request by id")
//    public void send_get_request_by_id() {
//        spec2.pathParams("first", "studentInfo", "second", "get", "third", 896);
//        //https://managementonschools.com/app/studentInfo/get/896
//        response = given(spec2).get("{first}/{second}/{third}");
//        response.prettyPrint();
//    }
//    @Then("validate the body after update midtermExam {string} , finalExam {string} ,{string}")
//    public void validateTheBodyAfterUpdateMidtermExamFinalExam(String midtermExam, String finalExam, String id) {
//        JsonPath jsonPath = response.jsonPath();
//        //do assertion
//      String actId = jsonPath.getList("findAll{it.midtermExam=='" + midtermExam + "'}.id").get(0).toString();
//      String actMidExam = jsonPath.getList("findAll{it.midtermExam=='" + midtermExam + "'}.midtermExam").get(0).toString();
//      String actFinalExam = jsonPath.getList("findAll{it.midtermExam=='" + midtermExam + "'}.finalExam").get(0).toString();
//
//        //String actMidExam = jsonPath.getList("findAll{it.id=='"+id+"'}.midtermExam").get(0).toString();
//        //String actFinalExam = jsonPath.getList("findAll{it.id=='"+id+"'}.finalExam").get(0).toString();
//
//        assertEquals(200, response.statusCode());
//        assertEquals(midtermExam, actMidExam);
//        assertEquals(finalExam, actFinalExam);
//        assertEquals(id, actId);
//
//


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_urls.ManagementonSchoolBaseUrl.spec2;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

        public class US_18_API_Step_Def {
            Response response;

            @Given("send get request by id")
            public void send_get_request_by_id() {
                spec2.pathParams("first", "studentInfo", "second", "get", "third", 896);
                //https://managementonschools.com/app/studentInfo/get/896
                response = given(spec2).get("{first}/{second}/{third}");
                response.prettyPrint();


            }

            @Then("validate the body after update midtermExam {string} , finalExam {string} ,{string}")
            public void validateTheBodyAfterUpdateMidtermExamFinalExam(String midtermExam, String finalExam, String id) {


                JsonPath jsonPath = response.jsonPath();

                //do assertion
                String actualId = jsonPath.getString("id");
                String actualMidtermExam = jsonPath.getString("midtermExam");
                String actualFinalExam = jsonPath.getString("finalExam");

                // Perform assertions
                assertEquals(200, response.statusCode());
                assertEquals(midtermExam, actualMidtermExam); // Use a delta to handle double comparisons
                assertEquals(finalExam, actualFinalExam); // Use a delta to handle double comparisons
                assertEquals(id, actualId);


            }
        }









/*
{
    "id": 896,
    "midtermExam": 100.0,
    "finalExam": 90.0,
    "absentee": 1,
    "infoNote": "aaaa bbbb cccc.",
    "lessonName": "Cypress",
    "creditScore": 10,
    "educationTerm": "SPRING_SEMESTER",
    "average": 94.0,
    "studentResponse": {
        "userId": 37,
        "username": "asala",
        "name": "xxxxx",
        "surname": "yyyyy",
        "birthDay": "1000-12-31",
        "birthPlace": "asycde",
        "phoneNumber": "532-025-2502",
        "gender": "FEMALE",
        "studentNumber": 1036,
        "motherName": "hhhhhhhh",
        "fatherName": "zzzzzzzzz",
        "email": "xddx@dfffclcx",
        "active": true
    },
    "compulsory": true,
    "note": "AA"
}
 */
