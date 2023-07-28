package stepdefinitions.US_25;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class US25_TC03_DB_StepDefs {
    Connection connection;
    ResultSet resultSet;

    @Given("send the get request by username {string}")
    public void sendTheGetRequestByUsername(String username) throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
        Statement statement =connection.createStatement();

        String sqlQuery ="SELECT * FROM student WHERE username='"+ username+"'";
        resultSet =statement.executeQuery(sqlQuery);
    }

    @Then("body should contains birth_day {string},gender {string},name {string}, phone_number {string},ssn {string} , surname {string} , username {string}, email {string} , father_name {string} , mother_name {string}")
    public void bodyShouldContainsBirth_dayGenderNamePhone_numberSsnSurnameUsernameEmailFather_nameMother_name(String birth_day, String gender, String name, String phone_number, String ssn, String surname ,String username, String email, String father_name,String mother_name) throws SQLException {
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
