package stepdefinitions.US_09_StepDefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_urls.ManagementonSchoolBaseUrl.spec2;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class  US_09_API_StepDefs {
    Response response;
    @Given("send get request by {string} to get the deleted lesson")
    public void send_get_request_by_to_get_the_deleted_lesson(String string) {
        // https://managementonschools.com/app/lessons/getAll

        spec2.pathParams("first","lessons","second","getAll");
        response = given(spec2).get("{first}/{second}");
        response.prettyPrint();



    }
    @Then("body should contains lessonName {string},creditScore {string},compulsory {string}")
    public void body_should_contains_lesson_name_credit_score_compulsory(String lessonName, String creditScore, String compulsory) {
        JsonPath jsonPath = response.jsonPath();



        //do assertion

        String actCreditScore = jsonPath.getList("findAll{it.lessonName=='"+lessonName+"'}.creditScore").get(0).toString();
        String actCompulsory = jsonPath.getList("findAll{it.lessonName=='"+lessonName+"'}.compulsory").get(0).toString();
        String actLessonName = jsonPath.getList("findAll{it.lessonName=='"+lessonName+"'}.lessonName").get(0).toString();


        assertEquals(200,response.statusCode());
        assertEquals(creditScore,actCreditScore);
        assertEquals(compulsory,actCompulsory);
        assertEquals(lessonName,actLessonName);



    }



}