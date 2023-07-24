package stepdefinitions.US_16_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Driver;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US_16_DB_StepDefs {
    Connection connection;
    ResultSet resultSet;

    @Given("send get all sent messages via email {string}")
    public void send_get_all_sent_messages_via_email(String email) throws SQLException {
// create connection
     Connection connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management"
             ,"select_user","43w5ijfso");
     //create statement
        Statement statement=connection.createStatement();
        // create resultSet
        String sqlQuery="SELECT *FROM contact_message WHERE  email='"+email+"'";
        resultSet= statement.executeQuery(sqlQuery);
        resultSet.next();
        System.out.println(resultSet.getString("date"));
    }
    @Then("response body contains email {string},date {string}, message {string},name  {string}, subject  {string}")
    public void response_body_contains_email_date_message_name_subject(String email, String date, String message, String name, String subject) throws SQLException {


        String actDate = resultSet.getString("date");
        String actEmail = resultSet.getString("email");
        String actMessage = resultSet.getString("message");
        String actName = resultSet.getString("name");
        String actSubject = resultSet.getString("subject");

        assertEquals(email,actEmail);
        assertEquals(date,actDate);
        assertEquals(message,actMessage);
        assertEquals(name,actName);
        assertEquals(subject,actSubject);


    }

}
