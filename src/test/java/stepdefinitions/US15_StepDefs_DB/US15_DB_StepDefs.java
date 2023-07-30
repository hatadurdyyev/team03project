package stepdefinitions.US15_StepDefs_DB;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US15_DB_StepDefs {
    Connection connection;
    ResultSet resultSet;
    @Given("get student user via username {string}")
    public void get_student_user_via_username(String username) throws SQLException {
       connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
       Statement statement =connection.createStatement();

        String sqlQuery ="SELECT * FROM student WHERE username='"+ username+"'";
       resultSet =statement.executeQuery(sqlQuery);


    }

    @Then("body contains birth_day {string},gender {string},name {string},phone_number{string},ssn {string},surname{string},username{string},email{string},father_name{string},mother_name {string}")
    public void body_contains_birth_day_gender_name_phone_number_ssn_surname_username_email_father_name_mother_name(String birth_day, String gender, String name, String phone_number, String ssn, String surname ,String username, String email, String father_name,String mother_name) throws SQLException {
        resultSet.next();

     String actBirth_day = resultSet.getString("birth_day");
     String actGender = resultSet.getString("gender");
     String actName = resultSet.getString("name");
     String actPhone_number = resultSet.getString("phone_number");
     String actSsn = resultSet.getString("ssn");
     String actSurname = resultSet.getString("surname");
     String actUsername = resultSet.getString("username");
     String actEmail = resultSet.getString("email");
     String actFather_name = resultSet.getString("father_name");
     String actMother_name = resultSet.getString("mother_name");

     assertEquals(birth_day,actBirth_day);
     assertEquals(gender,actGender);
     assertEquals(name,actName);
     assertEquals(phone_number,actPhone_number);
     assertEquals(ssn,actSsn);
     assertEquals(surname,actSurname);
     assertEquals(username,actUsername);
     assertEquals(email,actEmail);
     assertEquals(father_name,actFather_name);
     assertEquals(mother_name,actMother_name);



    }


}