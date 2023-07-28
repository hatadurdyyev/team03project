package stepdefinitions.US_09and23_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_urls.ManagementonSchoolBaseUrl.spec2;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US23ApiStepDefs {
  Response response;

    @Given("send  get request by username")
    public void send_get_request_by_username() {


        //        https://managementonschools.com/app/vicedean/geatAll

        spec2.pathParams("first","vicedean","second","getAll");

        //set the expected data
        //its already exist in my api feature

        //Send the request and get the response
        response = given(spec2).get("{first}/{second}");
        response.prettyPrint();


    }
    @Then("body should  contains username {string} , name {string}, surname {string}, birth_place {string}, birth_day {string}, phone_number {string}, ssn {string},gender {string}")
    public void body_should_contains_username_name_surname_birth_place_birth_day_phone_number_ssn_gender(String username, String name, String surname, String birth_place, String birth_day, String phone_number, String ssn, String gender) {

        JsonPath jsonPath = response.jsonPath();

        //System.out.println(jsonPath.getList("content.findAll{it.username=='Jeremy001'}.surname").get(0));
//        System.out.println(jsonPath.getList("findAll{it.username=='Jeremy001'}.surname"));
//        System.out.println(jsonPath.getList("findAll{it.username=='"+username+"'}.username"));
//        System.out.println(jsonPath.getList("findAll{it.username=='"+username+"'}.username").get(0));
//        System.out.println(jsonPath.getList("findAll{it.username=='Jeremy001'}.birthPlace"));
//        System.out.println(jsonPath.getList("findAll{it.username=='"+username+"'}.gender").toString());

        //do assertion
        String actName = jsonPath.getList("findAll{it.username=='"+username+"'}.name").get(0).toString();
        String actUsername = jsonPath.getList("findAll{it.username=='"+username+"'}.username").get(0).toString();
        String actSurname = jsonPath.getList("findAll{it.username=='"+username+"'}.surname").get(0).toString();
        String actBirthDay = jsonPath.getList("findAll{it.username=='"+username+"'}.birthDay").get(0).toString();
        String actBirtPlace = jsonPath.getList("findAll{it.username=='"+username+"'}.birthPlace").get(0).toString();
        String actPhoneNumber = jsonPath.getList("findAll{it.username=='"+username+"'}.phoneNumber").get(0).toString();
        String actGender = jsonPath.getList("findAll{it.username=='"+username+"'}.gender").get(0).toString();
        String actSsn = jsonPath.getList("findAll{it.username=='"+username+"'}.ssn").get(0).toString();

        assertEquals(200,response.statusCode());
        assertEquals(name,actName);
        assertEquals(username,actUsername);
        assertEquals(surname,actSurname);
        assertEquals(birth_day,actBirthDay);
        assertEquals(birth_place,actBirtPlace);
        assertEquals(phone_number,actPhoneNumber);
        assertEquals(ssn,actSsn);
        assertEquals(gender,actGender);
    }

    }


