package stepdefinitions.US_08_StepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static base_urls.ManagementonSchoolBaseUrl.*;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken3;
import static base_urls.ManagementonSchoolBaseUrl.spec2;
public class US_08_API_StepDefs {

    Response response;


    @Given("send get request by lesson_name {string} to get the lesson schedule")
    public void sendGetRequestByLesson_nameToGetTheLessonSchedule(String lessonName) {
        //https://managementonschools.com/app/lessons/getAll



        spec2 = new RequestSpecBuilder()
                .addHeader("Authorization", generateToken3())
                .setBaseUri("https://managementonschools.com/app").build();

        spec2.pathParams("first","lessons","second","getAll");

        //Send the request and get the response

        response = given(spec2).get("{first}/{second}");

        response.prettyPrint();
    }

    @Then("body should contains lesson_name {string} , compulsory {string}, creditScore {string}")
    public void bodyShouldContainsLesson_nameCompulsoryCreditScore(String lessonName, String compulsory, String creditScore) {

        JsonPath jsonPath = response.jsonPath();
        //do assertion
        String actLessonName = jsonPath.getList("findAll{it.lessonName=='"+lessonName+"'}.lessonName").get(0).toString();
        String actCreditScore= jsonPath.getList("findAll{it.lessonName=='"+lessonName+"'}.creditScore").get(0).toString();
        String actCompulsory = jsonPath.getList("findAll{it.lessonName=='"+lessonName+"'}.compulsory").get(0).toString();
// Do assertion
        assertEquals(200,response.statusCode());
        assertEquals(lessonName,actLessonName);
        assertEquals(creditScore,actCreditScore);
        assertEquals(compulsory,actCompulsory);
    }
}