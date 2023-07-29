package stepdefinitions.US_19_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;
public class US_19_DB_StepDefs {
    Connection connection;
    ResultSet resultSet;
    @Given("get the added meeting via advisor_teacher_id {string} to get all the meetings with students")
    public void get_the_added_meeting_via_advisor_teacher_id_to_get_all_the_meetings_with_students(String advisor_teacher_id) throws SQLException {

        connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");

        Statement statement= connection.createStatement();

        String sqlQuery ="SELECT * FROM meet WHERE advisor_teacher_id ='"+advisor_teacher_id+"'";

        resultSet= statement.executeQuery(sqlQuery);

    }

    @Then("verify the body should contain advisor_teacher_id {string} , description {string} , date {string} , startTime {string} , stopTime {string}")
    public void verify_the_body_should_contain_advisor_teacher_id_description_date_start_time_stop_time(String advisor_teacher_id, String description, String date, String startTime, String stopTime ) throws SQLException {

        //SELECT * FROM "public".meet WHERE advisor_teacher_id= '1569'

        resultSet.next();//To move the pointer to the next record from header, use next() method

        String actDate = resultSet.getString("date");
        String actDescription = resultSet.getString("description");
        String actStartTime = resultSet.getString("start_time");
        String actStopTime = resultSet.getString("stop_time");
        String actAdvisorId = resultSet.getString("advisor_teacher_id");

        assertEquals(advisor_teacher_id,actAdvisorId);
        assertEquals(description,actDescription);
        assertEquals(date,actDate);
        assertEquals(startTime,actStartTime);
        assertEquals(stopTime,actStopTime);

    }
    //--> tc02_DB

    @Given("get added meeting via description {string} to get all the meetings with students")
    public void get_added_meeting_via_description_to_get_all_the_meetings_with_students(String description) throws SQLException {

        connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");

        Statement statement= connection.createStatement();

        String sqlQuery ="SELECT * FROM meet WHERE description ='"+description+"'";

        resultSet= statement.executeQuery(sqlQuery);
    }

    @Then("verify body contains advisor_teacher_id {string} , description {string} , date {string} , startTime {string} , stopTime {string}")
    public void verify_body_contains_advisor_teacher_id_description_date_start_time_stop_time(String advisor_teacher_id, String description, String date, String startTime, String stopTime) throws SQLException {

        resultSet.next();//To move the pointer to the next record from header, use next() method

        String actDate1 = resultSet.getString("date");
        String actDescription1 = resultSet.getString("description");
        String actStartTime1 = resultSet.getString("start_time");
        String actStopTime1 = resultSet.getString("stop_time");
        String actAdvisorId1 = resultSet.getString("advisor_teacher_id");

        assertEquals(advisor_teacher_id,actAdvisorId1);
        assertEquals(description,actDescription1);
        assertEquals(date,actDate1);
        assertEquals(startTime,actStartTime1);
        assertEquals(stopTime,actStopTime1);
    }
}
