package stepdefinitions.US_10;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_urls.ManagementonSchoolBaseUrl.spec2;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_10_API_StepDefs {
    Response response;
    @Then("body should contains lesson_name {string} , start_time {string}, stop_time {string}, day {string}")
    public void bodyShouldContainsLesson_nameStart_timeStop_timeDay(String lesson_name, String start_time, String stop_time, String day) {

        // https://managementonschools.com/app/lessonPrograms/getAllUnassigned
        spec2.pathParams("first", "lessonPrograms", "second", "getAllUnassigned");
        response = given(spec2).get("{first}/{second}");

        response.prettyPrint();

        JsonPath jsonPath = response.jsonPath();

        //do assertion
        String actStopTime = jsonPath.getList("findAll{it.stopTime=='"+stop_time+"'}.stopTime").get(0).toString();
        String actStartTime = jsonPath.getList("findAll{it.stopTime=='"+stop_time+"'}.startTime").get(0).toString();
        String actDay = jsonPath.getList("findAll{it.stopTime=='"+stop_time+"'}.day").get(0).toString();
        String actLessonName = jsonPath.getList("findAll{it.stopTime=='"+stop_time+"'}.lessonName[0].lessonName").get(0).toString();

        assertEquals(200,response.statusCode());
        assertEquals(lesson_name,actLessonName);
        assertEquals(start_time,actStartTime);
        assertEquals(stop_time,actStopTime);
        assertEquals(day,actDay);

    }

    /*
    {
        "lessonProgramId": 1235,
        "startTime": "09:09:00",
        "stopTime": "17:17:00",
        "lessonName": [
            {
                "lessonId": 4,
                "lessonName": "Phyton",
                "creditScore": 8,
                "compulsory": true
            }
        ],
        "teachers": [],
        "students": [],
        "day": "TUESDAY"
    },
    {

     */




}