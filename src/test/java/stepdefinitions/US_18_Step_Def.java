package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LoginPage;
import pages.TeacherMngPage;
import utilities.*;

import javax.swing.text.Utilities;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class US_18_Step_Def {

    TeacherMngPage teacherMngPage = new TeacherMngPage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("user navigates to the {string}")
    public void userNavigatesTo(String url) {
        Driver.getDriver().get(url);
    }
    @When("click on the login icon")
    public void clickOnLoginIcon() {
        homePage.loginHome.click();
    }

    @And("user enters the {string} for user name")
    public void userEntersForUserName(String username) {
        loginPage.userName.sendKeys(username);
    }
    @And("user enters the {string} for password")
    public void userEntersForPassword(String password) {
        loginPage.password.sendKeys(password);
    }
    @When("user clicks on the login button")
    public void user_clicks_on_login_button() {
        loginPage.loginButton.click();
    }

    @Given("user checks if name,Lesson Name,Absentee,Midterm,Final Exam,Note,Info Note,Average exist in the student info list")
    public void user_checks_if_name_lesson_name_absentee_midterm_final_exam_note_info_note_average_exist_in_the_student_info_list() {
        List<String> valuesList = Arrays.asList("xxxxx yyyyy", "Java", "1", "2", "22", "FF", "aaaa bbbb cccc..", "14", "  Edit", "");
        List<WebElement> elements = teacherMngPage.tableData;
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getText());
            ReusableMethods.verifyElementDisplayed(elements.get(i));
            Assert.assertTrue(elements.get(i).getText().equals(valuesList.get(i)));
        }
    }

    @Given("user should be able to click on Edit Button in the student info list")
    public void user_should_be_able_to_click_on_edit_button_in_the_student_info_list() {
        ReusableMethods.scrollIntoView(teacherMngPage.editButton);
        WaitUtils.waitFor(3);
        JSUtils.clickWithTimeoutByJS(teacherMngPage.editButton);
        //teacherMngPage.editButton.click();
    }

    @When("user should be able to update the grade in Midterm Exam")
    public void user_should_be_able_to_update_the_grade_in_midterm_exam() {
        teacherMngPage.midTermInputField.sendKeys(Keys.CONTROL + "a");
        teacherMngPage.midTermInputField.sendKeys(Keys.BACK_SPACE);
        WaitUtils.waitFor(2);
        teacherMngPage.midTermInputField.sendKeys("55");
    }

    @When("user should be able to update the grade in Final Exam")
    public void user_should_be_able_to_update_the_grade_in_final_exam() {
        WaitUtils.waitFor(5);
        teacherMngPage.finalExamInputField.sendKeys(Keys.CONTROL + "a");
        teacherMngPage.finalExamInputField.sendKeys(Keys.BACK_SPACE);
        teacherMngPage.finalExamInputField.sendKeys(Keys.BACK_SPACE);
        teacherMngPage.finalExamInputField.sendKeys("44");
    }

    @When("user should be able to click on Submit button")
    public void user_should_be_able_to_click_on_submit_button() throws IOException {
        teacherMngPage.submitButton.click();
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

    @When("user should be able to delete the grade in Midterm Exam")
    public void user_should_be_able_to_delete_the_grade_in_midterm_exam() {

    }

    @When("user should be able to delete the grade in Final Exam")
    public void user_should_be_able_to_delete_the_grade_in_final_exam() {

    }

}
