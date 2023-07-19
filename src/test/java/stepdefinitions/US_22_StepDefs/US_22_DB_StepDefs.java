package stepdefinitions.US_22_StepDefs;

import io.cucumber.java.en.*;

import java.sql.*;

public class US_22_DB_StepDefs {

    Connection connection;
    ResultSet resultSet;


    @Given("user gets admin data via {string}")
    public void user_gets_admin_data_via(String username) throws SQLException {

        Statement statement= connection.createStatement();
        String sqlQuery ="select * from admins where username ='"+username+"'";
        resultSet= statement.executeQuery(sqlQuery);

    }


    @Given("user connects to the application database for admin account")
    public void user_connects_to_the_application_database_for_admin_account() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }
    @Then("verify admin db if body contains birth_day {string} , birth_place {string} , gender {string} , name {string} , phone_number {string} , ssn {string} , surname {string} , username {string}")
    public void verify_admin_db_if_body_contains_birth_day_birth_place_gender_name_phone_number_ssn_surname_username(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws SQLException {
        resultSet.next();//To move the pointer to the next record from header, use next() method

        String actBirth_day = resultSet.getString("birth_day");
        String actBirth_place = resultSet.getString("birth_place");
        String actGender = resultSet.getString("gender");
        String actName = resultSet.getString("name");
        String actPhone_number = resultSet.getString("phone_number");
        String actSsn = resultSet.getString("ssn");
        String actSurname = resultSet.getString("surname");
        String actUsername = resultSet.getString("username");

    }

}
