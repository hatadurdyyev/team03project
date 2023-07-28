package stepdefinitions.US_19_StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LoginPage;
import pages.TeacherMngPage;
import utilities.*;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class US_19_UI_StepDefs {
    TeacherMngPage teacherMngPage = new TeacherMngPage();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

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
        WaitUtils.waitFor(2);
        loginPage.password.sendKeys(password);
        WaitUtils.waitFor(2);
    }

    @When("teacher clicks on login button")
    public void teacher_clicks_on_login_button() {

        loginPage.loginButton.click();
        WaitUtils.waitFor(2);

    }
    @Given("teacher clicks on menu button")
    public void teacher_clicks_on_menu_button() {

       homePage.menuButton.click();
       WaitUtils.waitFor(2);

    }

    @When("teacher clicks on meet management category button")
    public void teacher_clicks_on_meet_management_category_button() throws IOException {

        teacherMngPage.meetMngPageButton.click();
        WaitUtils.waitFor(5);
        MediaUtils.takeScreenshotOfTheEntirePage();

    }

    @When("teacher clicks on Select Students dropdown list")
    public void teacher_clicks_on_select_students_dropdown_list() throws IOException {

        teacherMngPage.chooseStdDropDown.click();
        WaitUtils.waitFor(2);
        MediaUtils.takeScreenshotOfTheEntirePage();

    }
    @When("teacher selects a student from the dropdown list")
    public void teacher_selects_a_student_from_the_dropdown_list() throws IOException {

        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//div[text()='Kemal ARZU']"));
        WebElement firstElement = elements.get(0);
        firstElement.click();
        WaitUtils.waitFor(2);
        MediaUtils.takeScreenshotOfTheEntirePage();

    }

    //-->>TC02

    @Given("teacher selects a second student from the dropdown list")
    public void teacher_selects_a_second_student_from_the_dropdown_list() throws IOException {
        List<WebElement> secondElements = Driver.getDriver().findElements(By.xpath("//div[text()='Ayse ARZU']"));
        WebElement secondElement = secondElements.get(0);
        secondElement.click();
        WaitUtils.waitFor(2);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Given("teacher selects a third student from the dropdown list")
    public void teacher_selects_a_third_student_from_the_dropdown_list() throws IOException {
        List<WebElement> thirdElements = Driver.getDriver().findElements(By.xpath("//div[text()='hakan kara']"));
        WebElement thirdElement = thirdElements.get(0);
        thirdElement.click();
        WaitUtils.waitFor(2);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

    @Given("teacher enters future_time {string} date of meet")
    public void teacher_enters_future_time_date_of_meet(String future_time) throws IOException {
        WaitUtils.waitFor(2);
        teacherMngPage.dateOfMeet.sendKeys(future_time);
        MediaUtils.takeScreenshotOfTheEntirePage();
        WaitUtils.waitFor(2);
    }
    @Given("teacher enters start_time {string}")
    public void teacher_enters_start_time(String start_time) throws IOException {
        teacherMngPage.startTimeInput.sendKeys(start_time);
        WaitUtils.waitFor(2);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Given("teacher enters stop_time {string}")
    public void teacher_enters_stop_time(String stop_time) throws IOException {
        teacherMngPage.stopTimeInput.sendKeys(stop_time);
        WaitUtils.waitFor(2);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Given("teacher enters a description {string} in the description field")
    public void teacher_enters_a_description_in_the_description_field(String description) throws IOException {
        teacherMngPage.descriptionInput.sendKeys(description);
        WaitUtils.waitFor(2);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

    @When("teacher clicks on submit button")
    public void teacher_clicks_on_submit_button() throws IOException {
        teacherMngPage.submitButtonTchrMng.click();
        WaitUtils.waitFor(2);
    }

    @Then("verify the meet saved successfully alert message")
    public void verify_the_meet_saved_successfully_alert_message() throws IOException {
        String meetSavedAlertText = teacherMngPage.meetSavedTextMessage.getText();
        assertTrue(meetSavedAlertText.contains("Meet Saved Successfully"));
        WaitUtils.waitFor(2);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

    @Then("close the web application")
    public void close_the_web_application() {
        WaitUtils.waitFor(2);
        Driver.closeDriver();
    }

    //---->>>tc03/tc04

    @When("the teacher enters a past_time {string} date for meeting")
    public void the_teacher_enters_a_past_time_date_for_meeting(String past_time) throws IOException {
        teacherMngPage.dateOfMeet.sendKeys(past_time);
        WaitUtils.waitFor(2);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

    @Then("verify the must be a future date error alert message is displayed")
    public void verify_the_must_be_a_future_date_error_alert_message_is_displayed() {

        String futureDateAlertText = teacherMngPage.futureDateErrorAlert.getText();
        assertTrue(futureDateAlertText.contains("must be a future date"));
        WaitUtils.waitFor(2);
    }

    @When("teacher enters grater start_time {string} than the stop_time")
    public void teacher_enters_grater_start_time_than_the_stop_time(String start_time) {

        teacherMngPage.startTimeInput.sendKeys(start_time);
        WaitUtils.waitFor(2);

    }
    @When("teacher enters stop_time {string} less than start time")
    public void teacher_enters_stop_time_less_than_start_time(String stop_time) {

        teacherMngPage.stopTimeInput.sendKeys(stop_time);
        WaitUtils.waitFor(2);

    }

    @Then("verify the error alert message Error: start time must not be greater than or equal to stop time is displayed")
    public void verify_the_error_alert_message_error_start_time_must_not_be_greater_than_or_equal_to_stop_time_is_displayed() {

        String startStopTimeErrorAlertText = teacherMngPage.startStopTimeErrorAlert.getText();
        assertTrue(startStopTimeErrorAlertText.contains("Error: start time must not be greater than or equal to stop time"));
        WaitUtils.waitFor(2);

    }
}
