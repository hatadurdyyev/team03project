package stepdefinitions.US_13_StepDefs;

import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static base_urls.ManagementonSchoolBaseUrl.spec2;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;


public class US_13_API_StepDefs {

    Response response;

    @Given("send get request by {string}")
    public void send_get_request_by(String string) {

        //set the url https://managementonschools.com/app/teachers/getAll
        response = given()
                .spec(spec2)
                .get("/teachers/getAll");
//      response.prettyPrint();


    }
    @Then("body should contain birth_day {string} , birth_place {string} , gender {string} , name {string} , phone_number {string} , ssn {string} , surname {string} , username {string}")
    public void body_should_contain_birth_day_birth_place_gender_name_phone_number_ssn_surname_username(String birth_day, String birth_place, String gender, String name, String phone_number, String ssn, String surname, String username) {

        JsonPath jsonPath = response.jsonPath();
        System.out.println(jsonPath.getList("findAll{it.username=='Feiton.Teacheri'}").get(0));

        String actName = jsonPath.getList("findAll{it.username=='"+username+"'}.name").get(0).toString();
        String actUsername = jsonPath.getList("findAll{it.username=='"+username+"'}.username").get(0).toString();
        String actSurname = jsonPath.getList("findAll{it.username=='"+username+"'}.surname").get(0).toString();
        String actBirthDay = jsonPath.getList("findAll{it.username=='"+username+"'}.birthDay").get(0).toString();
        String actBirthPlace = jsonPath.getList("findAll{it.username=='"+username+"'}.birthPlace").get(0).toString();
        String actPhoneNumber = jsonPath.getList("findAll{it.username=='"+username+"'}.phoneNumber").get(0).toString();
        String actGender = jsonPath.getList("findAll{it.username=='"+username+"'}.gender").get(0).toString();
        String actSsn = jsonPath.getList("findAll{it.username=='"+username+"'}.ssn").get(0).toString();

        assertEquals(200,response.statusCode());
        assertEquals(name,actName);
        assertEquals(username,actUsername);
        assertEquals(surname,actSurname);
        assertEquals(birth_day,actBirthDay);
        assertEquals(birth_place,actBirthPlace);
        assertEquals(phone_number,actPhoneNumber);
        assertEquals(ssn,actSsn);
        assertEquals(gender,actGender);

  }

   }





