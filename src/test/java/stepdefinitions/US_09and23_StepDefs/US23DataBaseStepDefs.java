package stepdefinitions.US_09and23_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US23DataBaseStepDefs {
  Connection connection;

  ResultSet resultSet;




    @Given("send query  by username {string}")
    public void send_query_by_username(String username) throws SQLException {

        connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");

       Statement statement=connection.createStatement();

       String sqlQuery="SELECT * FROM  vice_dean where username='"+username+"'";
       resultSet=statement.executeQuery(sqlQuery);

    }
    @Then("verify the resultSet  contains username {string} , name {string}, surname {string}, birth_place {string}, birth_day {string}, phone_number {string}, ssn {string},gender {string}")
    public void verify_the_result_set_contains_username_name_surname_birth_place_birth_day_phone_number_ssn_gender(String username, String name, String surname, String birth_place, String birth_day, String phone_number, String ssn, String gender) throws SQLException {

        resultSet.next();

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
