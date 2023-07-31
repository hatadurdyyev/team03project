package stepdefinitions.US_21_API_StepsDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

import static base_urls.ManagementonSchoolBaseUrl.spec2;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_21_API_StepDefs {
    Response response;

    @Given("sent getAll request by lessonName {string}")
    public void sent_get_all_request_by_lesson_name(String lessonName) {

        //managementonschools.com/app/lessonPrograms/search?page=0&size=1000&sort=lesson&type=desc
        spec2.pathParams("first", "lessonPrograms", "second", "search").queryParams("page", "0", "size", "1000", "sort", "lesson", "type", "desc");

        //Send the request and get the response

        response = given(spec2).get("{first}/{second}");

        response.prettyPrint();
/*
"content": [
        {
            "lessonProgramId": 2599,
            "startTime": "15:00:00",
            "stopTime": "18:00:00",
            "lessonName": [
                {
                    "lessonId": 2119,
                    "lessonName": "Flesson",
                    "creditScore": 5,
                    "compulsory": true
                }
            ],
            "teachers": [

            ],
            "students": [

            ],
            "day": "MONDAY"
        },
        {
            "lessonProgramId": 2601,
            "startTime": "15:00:00",
            "stopTime": "18:00:00",
            "lessonName": [
                {
                    "lessonId": 2119,
                    "lessonName": "Flesson",
                    "creditScore": 5,
                    "compulsory": true
                }
            ],
*/

    }


    @Then("student should be able to see the day {string}, lesson_name {string}, start_time {string}, stop Time {string} in body")
    public void student_should_be_able_to_see_the_day_lesson_name_start_time_stop_time_in_body(String day, String lessonName, String startTime , String stopTime) {

//      do assertion
        JsonPath jsonPath = response.jsonPath();

        String actDay = jsonPath.getList("content.findAll{it.lessonName[0].lessonName=='"+lessonName+"'}.day").get(0).toString();
        System.out.println("actDay = " + actDay);

        String actStartTime = jsonPath.getList("content.findAll { it.lessonName[0].lessonName == '"+lessonName+"'}.startTime").get(0).toString();
        System.out.println("actStartTime = " + actStartTime);

        String actStopTime = jsonPath.getList("content.findAll { it.lessonName[0].lessonName == '"+lessonName+"'}.stopTime").get(0).toString();
        System.out.println("actStopTime = " + actStopTime);

//        String actLessonName = jsonPath.getList("content.findAll { it.lessonName[0].lessonName == '"+lessonName+"'}.lessonName").get(0).toString();
//        System.out.println("actLessonName = " + actLessonName);

        assertEquals(200, response.statusCode());
        assertEquals(day,actDay);
//        assertEquals(lessonName,actLessonName);
        assertEquals(startTime,actStartTime);
        assertEquals(stopTime, actStopTime);

//        assertTrue(response.asString().contains("students"));
//        assertTrue(response.asString().contains("teachers"));
    }

    @Given("sent post request to select the desired lesson or lessons")
    public void sentPostRequestToSelectTheDesiredLessonOrLessons() {
        // https://managementonschools.com/app/lessonPrograms/save

        spec2.pathParams("first", "lessonPrograms", "second", "save");

        //Send the request and get the response

        response = given(spec2).get("{first}/{second}");

        response.prettyPrint();




        /*
        {
 "lessonProgramId": 2633,
   "startTime": "17:08:00",
  "stopTime": "18:20:00",
  "lessonName": [
  {
  "lessonId": 18,
  "lessonName": "English",
  "creditScore": 7,
  "compulsory": true
  }
         */


    }



    @Then("student should be able to see the day {string}, lesson_name {string}, lessonProgramId {string}, start_time {string}, stop Time {string} in body")
    public void studentShouldBeAbleToSeeTheDayLesson_nameLessonProgramIdStart_timeStopTimeInBody(String arg0, String arg1, String arg2, String arg3, String arg4) {
    }
}