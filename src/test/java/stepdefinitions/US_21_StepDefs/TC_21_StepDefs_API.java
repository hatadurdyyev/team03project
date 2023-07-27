package stepdefinitions.US_21_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_urls.ManagementonSchoolBaseUrl.spec2;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class TC_21_StepDefs_API {
    Response response;
    @Given("sent getAll request by lessonName {string}")
    public void sent_get_all_request_by_lesson_name(String lessonName) {

        spec2.pathParams("first", "lessonPrograms", "second", "search").queryParams("page", "0", "size", "1000", "sort", "lesson", "type", "desc");

        response = given(spec2).get("{first}/{second}");


    }
    @Then("student should be able to see the day {string}, lesson_name {string}, start_time {string}, stop Time {string} in body")
    public void student_should_be_able_to_see_the_day_lesson_name_start_time_stop_time_in_body(String day, String lessonName, String startTime , String stopTime) {


        JsonPath jsonPath = response.jsonPath();

        String actDay = jsonPath.getList("content.findAll{it.lessonName[0].lessonName=='"+lessonName+"'}.day").get(0).toString();
        String actStartTime = jsonPath.getList("content.findAll { it.lessonName[0].lessonName == '"+lessonName+"'}.startTime").get(0).toString();
        String actStopTime = jsonPath.getList("content.findAll { it.lessonName[0].lessonName == '"+lessonName+"'}.stopTime").get(0).toString();

        assertEquals(200, response.statusCode());
        assertEquals(day,actDay);
        assertEquals(startTime,actStartTime);
        assertEquals(stopTime, actStopTime);
    }
    @Given("sent get request to see meetings by {string}")
    public void sent_get_request_to_see_meetings_by(String lessonName) {

        spec2.pathParams("first", "meet", "second", "search").queryParams("page", "0", "size", "10", "sort", "advisorTeacherId", "type", "desc");

        response = given(spec2).get("{first}/{second}");


    }

    @Given("student should be able to see {string},{string},{string},{string},{string}")
    public void student_should_be_able_to_see(String advisorTeacherId, String description, String startTime, String stopTime, String teacherName) {

        JsonPath jsonPath = response.jsonPath();

        String actdesc = jsonPath.getList("content.findAll{it.advisorTeacherId=="+advisorTeacherId+"}.description").get(0).toString();
        String actstartTime = jsonPath.getList("content.findAll{it.advisorTeacherId=="+advisorTeacherId+"}.startTime").get(0).toString();
        String actstopTime = jsonPath.getList("content.findAll{it.advisorTeacherId=="+advisorTeacherId+"}.stopTime").get(0).toString();
        String actteacherName = jsonPath.getList("content.findAll{it.advisorTeacherId=="+advisorTeacherId+"}.teacherName").get(0).toString();

        assertEquals(200, response.statusCode());
        assertEquals(description,actdesc);
        assertEquals(startTime,actstartTime);
        assertEquals(stopTime, actstopTime);
        assertEquals(teacherName, actteacherName);

    }

}
