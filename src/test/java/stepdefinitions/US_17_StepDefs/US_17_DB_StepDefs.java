package stepdefinitions.US_17_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.*;

public class US_17_DB_StepDefs {

    Connection connection;
    ResultSet resultSet;

    @Given("send to the database request")
    public void send_to_the_database_request() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
        Statement statement=connection.createStatement();
        String sql= "SELECT * FROM student_info\n" +
                "Where info_note = 'SERENCASANOVA';";
        resultSet=statement.executeQuery(sql);


    }
    @Then("verify the database body")
    public void verify_the_database_body() throws SQLException {

   resultSet.next();
   String actualId= resultSet.getString("id");
   String actualAbsentee= resultSet.getString("absentee");
   String actualExamAverage= resultSet.getString("exam_average");
   String actualFinalExam= resultSet.getString("final_exam");
   String actualInfoNote= resultSet.getString("info_note");
   String actualLetterGrade= resultSet.getString("letter_grade");
   String actualMidtermExam= resultSet.getString("midterm_exam");
   String actualEducationTermId= resultSet.getString("education_term_id");
   String actualLessonId= resultSet.getString("lesson_lesson_id");
   String actualStudentId= resultSet.getString("student_id");
   String actualTeacherId= resultSet.getString("teacher_id");

       /* requestBody.put("absentee", 2);
        requestBody.put("educationTermId", 5);
        requestBody.put("finalExam", 67);
        requestBody.put("infoNote", "Student passed the class.");
        requestBody.put("lessonId", 45);
        requestBody.put("midtermExam", 55);
        requestBody.put("studentId", 65);
        Absentee 5, Id993, examavarage21 double decision 250info note SEREN CASANOVA,
         midterm 15, educationterm Id 5, lesson Id2 student id 212 teacher I'd 1662
        */

      String expectedAbsentees= "5";
      String expectedEducationTermID= "5";
      String expectedFinalExam="25";
      String expectedMidtermExam= "15";
      String expectedInfoNote="SERENCASANOVA";
        Assert.assertEquals(expectedAbsentees, actualAbsentee);







    }

}
