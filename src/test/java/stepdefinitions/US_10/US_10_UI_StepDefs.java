package stepdefinitions.US_10;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.LoginPage;
import pages.ViceDeanMngPage;
import utilities.*;

import java.io.IOException;
public class US_10_UI_StepDefs {

    ViceDeanMngPage viceDeanMngPage =new ViceDeanMngPage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @When("click on login icon")
    public void clickOnLoginIcon() {
        homePage.loginHome.click();
    }

    @And("user enters {string} for user name")
    public void userEntersForUserName(String username) {
        loginPage.userName.sendKeys(username);
    }

    @And("user enters {string} for password")
    public void userEntersForPassword(String password) {
        loginPage.password.sendKeys(password);
    }


    @Given("user clicks on Lesson Program")
    public void userClicksOnLessonProgram() {

        viceDeanMngPage.lessonProgram.click();
    }

    @When("user clicks on select lesson dropdown")
    public void userClicksOnSelectLessonDropdown() {

        viceDeanMngPage.selectLesson.click();
        WaitUtils.waitFor(3);
        //    viceDeanMngPage.cypress.sendKeys(Keys.TAB);
        //   WaitUtils.waitFor(3);
    }
    @When("user selects a lesson")
    public void user_selects_a_lesson() {
        viceDeanMngPage.cypress2.click();

    }

    @When("user clicks on select Choose Education Term dropdown")
    public void user_clicks_on_select_choose_education_term_dropdown() {
        viceDeanMngPage.eduTerm.click();
        WaitUtils.waitFor(3);

    }
    @When("user select a semester")
    public void user_select_a_semester() {
        viceDeanMngPage.springSemester.click();
    }

    @When("user clicks on select choose day dropdown")
    public void user_clicks_on_select_choose_day_dropdown() {
        viceDeanMngPage.chooseDay.click();
        WaitUtils.waitFor(3);
    }

    @When("user select a day")
    public void user_select_a_day() {
        viceDeanMngPage.tuesday.click();
    }

    @When("user clicks on select Start Time dropdown")
    public void user_clicks_on_select_start_time_dropdown() {

        viceDeanMngPage.startTime.click();
    }
    @When("user select a start time")
    public void user_select_a_start_time() {
        viceDeanMngPage.startTime.sendKeys("09:09"); //(//*[@value='09:00'])[1]
    }

    @When("user clicks on select Stop Time dropdown")
    public void user_clicks_on_select_stop_time_dropdown() {

        viceDeanMngPage.stopTime.click();
    }
    @When("user select a stop time")
    public void user_select_a_stop_time() {
        viceDeanMngPage.stopTime.sendKeys("17:17");//(//*[@value='17:00'])[1]
    }

    @And("user clicks on Submit button")
    public void userClicksOnSubmitButton() {
        viceDeanMngPage.submitButton.click();
    }
    @And("user should see Success Message")
    public void userShouldSeeSuccessMessage() {
        WaitUtils.waitForVisibility(viceDeanMngPage.successMessage, 7);
        //System.out.println("Here is the text message: "+viceDeanMngPage.successMessage.getText());
        Assert.assertTrue(viceDeanMngPage.successMessage.getText().equals("Created Lesson Program"));
    }
}