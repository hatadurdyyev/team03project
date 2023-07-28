package stepdefinitions.US_05_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;
import java.sql.ResultSet;
import static org.junit.Assert.assertEquals;

public class US05_DBStepDefs {

    Connection connection;
    ResultSet resultSet;

    @Given("get the updated dean via {string}")
    public void get_the_updated_dean_via(String username) throws SQLException {

        connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");

        Statement statement= connection.createStatement();

        String sqlQuery ="select * from dean where username ='"+username+"'";

        resultSet= statement.executeQuery(sqlQuery);

    }

    @Then("body will contains birth_day {string} , birth_place {string} , gender {string} , name {string} , phone_number {string} , ssn {string} , surname {string} , username {string}")
    public void body_will_contains_birth_day_birth_place_gender_name_phone_number_ssn_surname_username(String birth_day, String birth_place, String gender, String name, String phone_number, String ssn, String surname, String username) throws SQLException {


        resultSet.next();//To move the pointer to the next record from header, use next() method
        //System.out.println(resultSet.getString("phone_number"));

        String actBirth_day = resultSet.getString("birth_day");
        String actBirth_place = resultSet.getString("birth_place");
        String actGender = resultSet.getString("gender");
        String actName = resultSet.getString("name");
        String actPhone_number = resultSet.getString("phone_number");
        String actSsn = resultSet.getString("ssn");
        String actSurname = resultSet.getString("surname");
        String actUsername = resultSet.getString("username");

        assertEquals(birth_day,actBirth_day);
        assertEquals(birth_place,actBirth_place);
        assertEquals(gender,actGender);
        assertEquals(name,actName);
        assertEquals(phone_number,actPhone_number);
        assertEquals(ssn,actSsn);
        assertEquals(surname,actSurname);
        assertEquals(username,actUsername);

    }
}