package stepdefinitions.US_19_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static base_urls.ManagementonSchoolBaseUrl.spec2;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class US_19_API_StepDefs {
    Response response;
    @Given("send getAll request by teacherName {string} to get all the meetings with students")
    public void send_get_all_request_by_teacher_name_to_get_all_the_meetings_with_students(String teacherName) {

        spec2.pathParams("first", "meet", "second", "getAll");
        response = given(spec2).get("{first}/{second}");
        response.prettyPrint();
    }
    @Then("verify the body contains teacherName {string} , description {string} , date {string} , startTime {string} , stopTime {string}")
    public void verify_the_body_contains_teacher_name_description_date_start_time_stop_time(String teacherName, String description, String date, String startTime, String stopTime) {

        JsonPath jsonPath = response.jsonPath();

        String actDescription1 = jsonPath.getList("findAll{it.teacherName=='"+teacherName+"'}.description").get(0).toString();
        String actStartTime1 = jsonPath.getList("findAll{it.teacherName=='"+teacherName+"'}.startTime").get(0).toString();
        String actStopTime1 = jsonPath.getList("findAll{it.teacherName=='"+teacherName+"'}.stopTime").get(0).toString();
        String actDate1 = jsonPath.getList("findAll{it.teacherName=='"+teacherName+"'}.date").get(0).toString();

        System.out.println(jsonPath.getList("findAll{it.teacherName=='"+teacherName+"'}.description").get(0).toString());
        System.out.println(jsonPath.getList("findAll{it.teacherName=='"+teacherName+"'}.startTime").get(0).toString());
        System.out.println(jsonPath.getList("findAll{it.teacherName=='"+teacherName+"'}.stopTime").get(0).toString());
        System.out.println(jsonPath.getList("findAll{it.teacherName=='"+teacherName+"'}.date").get(0).toString());

        assertEquals(description,actDescription1);
        assertEquals(date,actDate1);
        assertEquals(startTime,actStartTime1);
        assertEquals(stopTime,actStopTime1);
    }

    @Given("send getAll request by teacherName {string} to get the meetings with three students")
    public void send_get_all_request_by_teacher_name_to_get_the_meetings_with_three_students(String teacherName) {

        spec2.pathParams("first", "meet", "second", "getAll");
        response = given(spec2).get("{first}/{second}");
        response.prettyPrint();

    }
    @Then("verify the body with teacherName {string} , description {string} , date {string} , startTime {string} , stopTime {string}")
    public void verify_the_body_with_teacher_name_description_date_start_time_stop_time(String teacherName, String description, String date, String startTime, String stopTime) {

        JsonPath jsonPath2 = response.jsonPath();

        String actDescription2 = jsonPath2.getList("findAll{it.teacherName=='"+teacherName+"'}.description").get(1).toString();
        String actStartTime2 = jsonPath2.getList("findAll{it.teacherName=='"+teacherName+"'}.startTime").get(1).toString();
        String actStopTime2 = jsonPath2.getList("findAll{it.teacherName=='"+teacherName+"'}.stopTime").get(1).toString();
        String actDate2 = jsonPath2.getList("findAll{it.teacherName=='"+teacherName+"'}.date").get(1).toString();

        System.out.println(jsonPath2.getList("findAll{it.teacherName=='"+teacherName+"'}.description").get(1).toString());
        System.out.println(jsonPath2.getList("findAll{it.teacherName=='"+teacherName+"'}.startTime").get(1).toString());
        System.out.println(jsonPath2.getList("findAll{it.teacherName=='"+teacherName+"'}.stopTime").get(1).toString());
        System.out.println(jsonPath2.getList("findAll{it.teacherName=='"+teacherName+"'}.date").get(1).toString());

        assertEquals(description,actDescription2);
        assertEquals(date,actDate2);
        assertEquals(startTime,actStartTime2);
        assertEquals(stopTime,actStopTime2);

    }
}



