package stepdefinitions.US_21_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

public class TC_21_StepDefs_DB {

    Connection connection;
    ResultSet resultSet;

    @Given("get meeting infos via {string}")
    public void get_meeting_infos_via(String id) throws SQLException {

        connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");

        Statement statement= connection.createStatement();
        String sqlQuery ="select * from meet where id ='"+id+"'";
        resultSet= statement.executeQuery(sqlQuery);


    }
    @Then("body contains {string}, {string},{string},{string},{string}")
    public void body_contains(String date, String description, String start_time, String stop_time, String advisor_teacher_id) throws SQLException {
        resultSet.next();

        String actdate = resultSet.getString("date");
        String actdescription = resultSet.getString("description");
        String actstart_time = resultSet.getString("start_time");
        String actstop_time = resultSet.getString("stop_time");
        String actadvisor_teacher_id = resultSet.getString("advisor_teacher_id");

        assertEquals(date,actdate);
        assertEquals(description,actdescription);
        assertEquals(start_time,actstart_time);
        assertEquals(stop_time,actstop_time);
        assertEquals(advisor_teacher_id,actadvisor_teacher_id);
    }

    @Given("get grades info via {string}")
    public void get_grades_info_via(String student_id) throws SQLException {
        connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");

        Statement statement= connection.createStatement();
        String sqlQuery ="select exam_average from student_info where id ='"+student_id+"'";
        resultSet= statement.executeQuery(sqlQuery);

    }
    @Then("body contains {string}")
    public void body_contains(String exam_average) throws SQLException {
        resultSet.next();

        String actexam_average = resultSet.getString("exam_average");
        assertEquals(exam_average,actexam_average);

    }


    @Given("get student_lessonprogram via {string}")
    public void get_student_lessonprogram_via(String student_id) throws SQLException {
        connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");

        Statement statement= connection.createStatement();
        String sqlQuery ="select * from student_lessonprogram where student_id ='"+student_id+"'";
        resultSet= statement.executeQuery(sqlQuery);
    }

    @Then("body containss {string}")
    public void body_containss(String lesson_program_id) throws SQLException {

        resultSet.next();

        String actlesson_program_id = resultSet.getString("lesson_program_id");
        assertEquals(lesson_program_id,actlesson_program_id);



    }


}
