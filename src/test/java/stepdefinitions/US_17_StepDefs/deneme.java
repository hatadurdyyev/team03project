package stepdefinitions.US_17_StepDefs;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.sql.*;

public class deneme {
    Connection connection;

    ResultSet resultSet;

    @Given("get all of the meetings")
    public void get_all_of_the_meetings() throws SQLException {

        //Create connection
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");

        //Create Statement
        Statement statement = connection.createStatement();

        //Create ResultSet
        String sqlQuery = "SELECT * FROM  \"public\" .meet";
        resultSet = statement.executeQuery(sqlQuery);

    }
    @Then("assert the response body")
    public void assert_the_response_body() throws SQLException {

        resultSet.next();

        System.out.println(resultSet.getString("id"));

        Assert.assertFalse(resultSet.wasNull());

    }

}
