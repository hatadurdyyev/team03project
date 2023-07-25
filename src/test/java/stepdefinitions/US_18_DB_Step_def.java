package stepdefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.sql.*;
public class US_18_DB_Step_def {


    Connection connection;
    ResultSet resultSet;


    @Given("user connects to the application database for teacher account")
    public void user_connects_to_the_application_database_for_teacher_account() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");




    }
    @Given("user gets students data via {string}")
    public void user_gets_students_data_via(String id) throws SQLException {

        Statement statement = connection.createStatement();
        String sqlQuery = "select * from student_info where id ='" + id + "'";
        resultSet = statement.executeQuery(sqlQuery);

    }
    @Then("verify teacher db if body after update contains midtermExam {string} , finalExam {string}")
    public void verify_teacher_db_if_body_after_update_contains_midterm_exam_final_exam(String midtermExam, String finalExam) throws SQLException {
        resultSet.next();//To move the pointer to the next record from header, use next() method
        String actMidtermExam = resultSet.getString("midterm_exam");
        String actFinalExam = resultSet.getString("final_exam");

        Assert.assertEquals(midtermExam,actMidtermExam);
        Assert.assertEquals(finalExam,actFinalExam);
    }















    }


