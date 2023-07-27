package stepdefinitions.US_21_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePageSc;
import pages.StudentManPageSc;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;

public class TC_21_StepDefs_UI {

    HomePageSc homePageSc = new HomePageSc();
    StudentManPageSc studentManPageSc = new StudentManPageSc();


    @Given("student login with username and password")
    public void student_login_with_username_and_password() {

    Driver.getDriver().get(ConfigReader.getProperty("managementonschool_url"));

    homePageSc.hpLogin.click();
    homePageSc.hpUser.sendKeys(ConfigReader.getProperty("studentuser"));
    homePageSc.hpPass.sendKeys(ConfigReader.getProperty("studentpass"));
    homePageSc.hpLoginBttn.click();

    }
    @Given("student clicks menu button then choose lesson link")
    public void student_clicks_menu_button_then_choose_lesson_link() {

    studentManPageSc.menuBttn.click();
    studentManPageSc.chooseLssn.click();

    }
    @Given("verify if all choose lesson headers is visible")
    public void verify_if_all_choose_lesson_headers_is_visible() {

    Assert.assertTrue(studentManPageSc.teacher.isDisplayed());
    Assert.assertTrue(studentManPageSc.day.isDisplayed());
    Assert.assertTrue(studentManPageSc.startTime.isDisplayed());
    Assert.assertTrue(studentManPageSc.stopTime.isDisplayed());

    }
    @Then("close the application")
    public void close_the_application() {

    Driver.closeDriver();

    }

    @Given("verify if student is able to select first four and last four lessons")
    public void verify_if_student_is_able_to_select_first_and_last_lessons() throws InterruptedException {

    studentManPageSc.firstChck.click();
    studentManPageSc.secChck.click();
    studentManPageSc.thirdChck.click();
    studentManPageSc.forthChck.click();

        JSUtils.scrollIntoViewJS(studentManPageSc.submit);
        Thread.sleep(1000);
        JSUtils.scrollup(-500);
        Thread.sleep(1000);

    studentManPageSc.last4ChckDeutsch0409Monday.click();
    studentManPageSc.last3Chck.click();
    studentManPageSc.last2ChckStacklessPythonMonday.click();
    studentManPageSc.last1Chck.click();
        Thread.sleep(1000);
    }

    @Given("verify if student is able to select two lessons coincides with same time period")
    public void verify_if_student_is_able_to_select_lessons_coincides_with_same_time_period() throws InterruptedException {

        Thread.sleep(2000);
        JSUtils.scrollIntoViewJS(studentManPageSc.submit);
        Thread.sleep(2000);
        JSUtils.scrollup(-500);
        Thread.sleep(2000);

    studentManPageSc.last2ChckStacklessPythonMonday.click();
    studentManPageSc.last4ChckDeutsch0409Monday.click();
    studentManPageSc.submit.click();
        Thread.sleep(1000);
    Assert.assertTrue(studentManPageSc.popup.isDisplayed());

    }

    @Given("verify if student should be able to delete a lesson")
    public void verify_if_student_should_be_able_to_delete_a_lesson() throws InterruptedException {

        Thread.sleep(2000);
        studentManPageSc.deleteLesson.click();

    }

    @Given("verify id student see the selected lessons in Program List")
    public void verify_id_student_see_the_selected_lessons_in_program_list() throws InterruptedException {

        Thread.sleep(2000);
        JSUtils.scrollIntoViewJS(studentManPageSc.submit);
        Thread.sleep(2000);
        JSUtils.scrollup(-300);
        Assert.assertTrue(studentManPageSc.programListChck.isDisplayed());

    }

    @Given("student add a lesson")
    public void student_add_a_lesson() throws InterruptedException {

        Thread.sleep(2000);
        JSUtils.scrollIntoViewJS(studentManPageSc.submit);
        Thread.sleep(2000);
        JSUtils.scrollup(-350);
        Thread.sleep(2000);

        studentManPageSc.last3Chck.click();
        studentManPageSc.submit.click();

    }

    @Given("student clicks menu button then grades and announcements link")
    public void student_clicks_menu_button_then_grades_and_announcements_link() {

        studentManPageSc.menuBttn.click();
        studentManPageSc.gradesAnno.click();

    }
    @Given("verify if grade displayed")
    public void verify_if_grade_displayed() throws InterruptedException {

        Thread.sleep(2000);
        Assert.assertTrue(studentManPageSc.java.isDisplayed());

    }

    @Given("verify if meeting displayed")
    public void verify_if_meeting_displayed() throws InterruptedException {

        Thread.sleep(2000);
        Assert.assertTrue(studentManPageSc.meeting.isDisplayed());
    }


}
