package stepdefinitions.US_17_StepDefs;

import io.cucumber.java.de.Wenn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.Driver;
import utilities.MediaUtils;
import utilities.WaitUtils;

import javax.print.attribute.standard.Media;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class US_17_UI_StepDefs {

    TeacherMngPage teacherMngPage = new TeacherMngPage();

    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();

    MenuPage menuPage= new MenuPage();

    StudentInfoManagementPage studentInfoManagementPage=new StudentInfoManagementPage();




    @Given("teacher goes to {string}")
    public void teacher_goes_to(String string) {
        Driver.getDriver().get(string);

    }

    @When("teacher clicks on login link")
    public void teacher_clicks_on_login_link() {
        homePage.loginHome.click();
        WaitUtils.waitFor(2);

    }

    @When("teacher enters username {string} and password {string}")
    public void teacher_enters_username_and_password(String username, String password) {

        loginPage.userName.sendKeys(username);
        loginPage.password.sendKeys(password);
        WaitUtils.waitFor(2);
    }

    @When("teacher clicks on login button")
    public void teacher_clicks_on_login_button() {

        loginPage.loginButton.click();
        WaitUtils.waitFor(2);
    }

    @When("teacher clicks on menu button")
    public void teacher_clicks_on_menu_button() {

        homePage.menuButton.click();
        WaitUtils.waitFor(2);
    }

    @When("teacher clicks on student info management  button")
    public void teacher_clicks_on_student_info_management_button() {

        menuPage.studentInfoManagementButton.click();
        WaitUtils.waitFor(2);
    }

    @Given("teacher clicks on the select Choose lesson dropdown")
    public void teacher_clicks_on_the_select_choose_lesson_dropdown() {
    studentInfoManagementPage.chooseLessonDropDown.click();

    }

    @Given("teacher selects a Lesson from the Select Lesson input")
    public void teacher_selects_a_lesson_from_the_select_lesson_input() {
        Select select = new Select(studentInfoManagementPage.chooseLessonDropDown);
        select.selectByVisibleText("Java");
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Given("teacher clicks on the Choose Student dropdown")
    public void teacher_clicks_on_the_choose_student_dropdown() {
        studentInfoManagementPage.chooseStudentDropDown.click();
    }

    @Given("teacher selects a student from the Select Students input")
    public void teacher_selects_a_student_from_the_select_students_input() {
        Select select = new Select(studentInfoManagementPage.chooseStudentDropDown);
        select.selectByIndex(22);
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Given("teacher clicks on the Choose Education Term dropdown")
    public void teacher_clicks_on_the_choose_education_term_dropdown() {
         studentInfoManagementPage.chooseEducationTermDropDown.click();

    }

    @Given("teacher selects a term from the Education Term dropdown")
    public void teacher_selects_a_term_from_the_education_term_dropdown() {

       Select select= new Select(studentInfoManagementPage.chooseEducationTermDropDown);
       select.selectByIndex(18);
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

    @Given("the teacher clicks on the Absentee")
    public void the_teacher_clicks_on_the_absentee() {
        studentInfoManagementPage.absenteeTextBox.click();


    }

    @Given("the teacher enters absentee")
    public void the_teacher_enters_absentee() {
        studentInfoManagementPage.absenteeTextBox.sendKeys("5");
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Given("the teacher clicks on the Midterm Exam field.")
    public void the_teacher_clicks_on_the_midterm_exam_field() {
        studentInfoManagementPage.midtermExamTextBox.click();
    }

    @Given("the teacher enters the grade to Midterm Exam field.")
    public void the_teacher_enters_the_grade_to_midterm_exam_field() {

        studentInfoManagementPage.midtermExamTextBox.sendKeys("55");
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Given("the teacher clicks on Final Exam field.")
    public void the_teacher_clicks_on_final_exam_field() {

        studentInfoManagementPage.finalExamTextBox.click();
    }

    @Given("the teacher enters the grade to Final Exam field.")
    public void the_teacher_enters_the_grade_to_final_exam_field() {

        studentInfoManagementPage.finalExamTextBox.sendKeys("59");
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Given("the teacher clicks on Info Note")
    public void the_teacher_clicks_on_ınfo_note() {
        studentInfoManagementPage.infoNoteTextBox.click();
    }

    @Given("the teacher enters an info note in the Info Note field")
    public void the_teacher_enters_an_info_note_in_the_ınfo_note_field() {

        studentInfoManagementPage.infoNoteTextBox.sendKeys("Student passed the claas.");
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Given("the teacher clicks on submit button")
    public void the_teacher_clicks_on_submit_button() {

        studentInfoManagementPage.submitButton.click();
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        WaitUtils.waitFor(1);
    }

    @Then("verify the success message {string} is displayed")
    public void verify_the_success_message_is_displayed(String string) {
        String alertText = studentInfoManagementPage.savedSuccessfully.getText();
        assertTrue(alertText.contains("Student Info saved Successfully"));
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        WaitUtils.waitFor(3);

    }


}
