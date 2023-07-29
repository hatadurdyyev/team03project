package stepdefinitions.US15_StepDefs_DB;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static base_urls.ManagementonSchoolBaseUrl.spec;
import static base_urls.ManagementonSchoolBaseUrl.spec2;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US15_Api_StepDefs {

    Response response;


    @Given("send the get request by username {string}")
    public void send_the_get_request_by_username(String username) {
        //set the url https://managementonschools.com/app/students/getAll
        spec2.pathParams("first", "students", "second", "getAll");
        //set expect data
        response = given(spec2).get("{first}/{second}");
        response.prettyPrint();
    }

    @Then("body should contains name {string}, username {string}, surname {string}, birthDay {string}, birthPlace {string} , phoneNumber {string} , gender {string}, studentNumber {string} , motherName {string} , fatherName {string} , email {string} , active {string}")
    public void body_should_contains_name_username_surname_birth_day_birth_place_phone_number_gender_student_number_mother_name_father_name_email_active(String name, String username, String surname, String birthDay, String birthPlace, String phoneNumber, String gender, String studentNumber, String motherName, String fatherName, String email, String active) {
        JsonPath jsonPath = response.jsonPath();

        String actName = jsonPath.getList("findAll{it.username=='" + username + "'}.name").get(0).toString();
        String actUsername = jsonPath.getList("findAll{it.username=='" + username + "'}.username").get(0).toString();
        String actSurname = jsonPath.getList("findAll{it.username=='" + username + "'}.surname").get(0).toString();
        String actBirthDay = jsonPath.getList("findAll{it.username=='" + username + "'}.birthDay").get(0).toString();
        String actBirtPlace = jsonPath.getList("findAll{it.username=='" + username + "'}.birthPlace").get(0).toString();
        String actPhoneNumber = jsonPath.getList("findAll{it.username=='" + username + "'}.phoneNumber").get(0).toString();
        String actGender = jsonPath.getList("findAll{it.username=='" + username + "'}.gender").get(0).toString();
        String actStudentNumber = jsonPath.getList("findAll{it.username=='" + username + "'}.studentNumber").get(0).toString();
        String actMotherName = jsonPath.getList("findAll{it.username=='" + username + "'}.motherName").get(0).toString();
        String actFatherName = jsonPath.getList("findAll{it.username=='" + username + "'}.fatherName").get(0).toString();
        String actEmail = jsonPath.getList("findAll{it.username=='" + username + "'}.email").get(0).toString();
        String actActive = jsonPath.getList("findAll{it.username=='" + username + "'}.active").get(0).toString();

        assertEquals(200, response.statusCode());
        assertEquals(name, actName);
        assertEquals(username, actUsername);
        assertEquals(surname, actSurname);
        assertEquals(birthDay, actBirthDay);
        assertEquals(birthPlace, actBirtPlace);
        assertEquals(phoneNumber, actPhoneNumber);
        assertEquals(gender, actGender);
        assertEquals(studentNumber, actStudentNumber);
        assertEquals(motherName, actMotherName);
        assertEquals(fatherName, actFatherName);
        assertEquals(email, actEmail);
        assertEquals(actActive, actActive);

    }

}

    /*
      "userId": 1333,
        "username": "Kaipitt",
        "name": "Kai",
        "surname": "Piit",
        "birthDay": "2000-10-15",
        "birthPlace": "London",
        "phoneNumber": "897-987-9999",
        "gender": "MALE",
        "studentNumber": 2326,
        "motherName": "Alana",
        "fatherName": "Tom",
        "email": "Pittkai@gamil.com",
        "active": true
     */
