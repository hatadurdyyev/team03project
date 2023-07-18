package stepdefinitions.US_12_StepDefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.ViceDeanMngPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

public class US_12_UI_StepDefs {

    ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();

    @Given("user clicks to Menu")
    public void user_clicks_to_menu() {

        viceDeanMngPage.menuButton.click();
        WaitUtils.waitFor(1);
    }
    @Then("user clicks to lesson management")
    public void user_clicks_to_lesson_management() {

        viceDeanMngPage.lessonManagementLink.click();
        WaitUtils.waitFor(1);

    }
    @Then("user clicks to lesson program")
    public void user_clicks_to_lesson_program() {

        viceDeanMngPage.lessonProgram.click();
        WaitUtils.waitFor(1);

    }
    @Then("user click on Choose lesson")
    public void user_click_on_choose_lesson() {

        viceDeanMngPage.chooseLessons.click();
        WaitUtils.waitFor(1);

    }
    @Then("user select a lesson")
    public void user_select_a_lesson() {

        Actions actions = new Actions(Driver.getDriver());
        viceDeanMngPage.chooseLessons.sendKeys("Cypress", Keys.ENTER);
        WaitUtils.waitFor(1);

    }
    ////    @Then("user click a Choose Education Term")
////    public void user_click_a_choose_education_term() {
////
////        viceDeanMngPage.educationTerm.click();
////        WaitUtils.waitFor(1);
//
//    }
    @Then("user select a Educatin Term")
    public void user_select_a_educatin_term() {

        Select select = new Select(viceDeanMngPage.educationTerm);
        select.selectByIndex(3);
        WaitUtils.waitFor(1);
    }
    @Then("user clicks the Choose Day")
    public void user_clicks_the_choose_day() {

        viceDeanMngPage.chooseDay.click();
        WaitUtils.waitFor(1);
    }
    @Then("user select a Day")
    public void user_select_a_day() {

        Select select = new Select(viceDeanMngPage.chooseDay);
        select.selectByIndex(2);
        WaitUtils.waitFor(1);
    }
    @Then("user types start time in time box")
    public void user_types_start_time_in_time_box() {

        viceDeanMngPage.startTime.sendKeys("11:11");
        WaitUtils.waitFor(1);
    }
    @Then("user types end time in time box")
    public void user_types_end_time_in_time_box() {

        viceDeanMngPage.stopTime.sendKeys("12:12");
        WaitUtils.waitFor(1);
    }
    @Then("user clicks Submit button")
    public void user_clicks_lesson_submit_button() {

        viceDeanMngPage.AddLessonSubmitButton.click();
        WaitUtils.waitFor(1);
    }
    @Then("user checks the checkbox for the lesson from the list")
    public void user_checks_the_checkbox_for_the_lesson_from_the_list() {

        WaitUtils.waitFor(2);
        JSUtils.clickWithTimeoutByJS(viceDeanMngPage.theFirstLessonCheckBoxButton);
        WaitUtils.waitFor(1);


    }
    @Then("user chooses a teacher")
    public void user_chooses_a_teacher() {

        Select select = new Select(viceDeanMngPage.chooseTeacher);
        select.selectByIndex(2);
        WaitUtils.waitFor(1);

    }
    @Then("user clicks submit button")
    public void user_clicks_submit_button() {

        viceDeanMngPage.teacherAssignmentSubmitButton.click();
        WaitUtils.waitFor(4);

    }
}