package stepdefinitions.US_08_StepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ViceDeanMngPage;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;

public class US_08_UI_StepDefs {
    ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();

    @Given("user enters the vice deans {string} and {string}")
    public void user_enters_the_vice_deans_username_and_password(String username, String password) throws IOException {
        WaitUtils.waitFor(1);

        viceDeanMngPage.viceDeanUserName.sendKeys("SevgiKutlu09");
        WaitUtils.waitFor(1);
        viceDeanMngPage.viceDeanPassWord.sendKeys("SevgiKutlu09123");
        WaitUtils.waitFor(1);
        MediaUtils.takeScreenshotOfTheEntirePage();
        viceDeanMngPage.loginSubmitButton.click();
        WaitUtils.waitFor(1);
    }

    @Given("user clicks on the menu button")
    public void user_clicks_on_the_menu_button() throws IOException {
        viceDeanMngPage.menuButton.click();
        WaitUtils.waitFor(1);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

    @And("user  selects Lesson Management on the main page")
    public void userSelectsLessonManagementOnTheMainPage() {
        viceDeanMngPage.lessonManagementLink.click();
        WaitUtils.waitFor(1);
    }

    @And("user clicks Lessons button")
    public void userClicksLessonsButton() {
        viceDeanMngPage.lessonsButton.click();
        WaitUtils.waitFor(1);
    }


    @And("user enters the lessonName and creditScore")
    public void userEntersTheLessonNameAndCreditScore() throws IOException {

        int fakeLessonName1 =new Faker().number().numberBetween(0,10);
        int fakeCreditScore1 =new Faker().number().numberBetween(0,500);
        viceDeanMngPage.lessonName.sendKeys("son"+fakeLessonName1);
        WaitUtils.waitFor(2);
        viceDeanMngPage.creditScore.sendKeys(fakeCreditScore1+"");
        WaitUtils.waitFor(2);
    }

    @And("user marks whether the course is compulsory or not")
    public void userMarksWhetherTheCourseIsCompulsoryOrNot() throws IOException {
        viceDeanMngPage.compulsoryCheckBox.click();
        WaitUtils.waitFor(2);
    }

    @When("user clicks the Submit button")
    public void userClicksTheSubmitButton() {
        viceDeanMngPage.AddLessonSubmitButton.click();
        WaitUtils.waitFor(1);
    }
    @Then("validate lesson created alert")
    public void validate_lesson_created_alert()  throws InterruptedException {
        String alertText = viceDeanMngPage.alert.getText();
        assertTrue(alertText.contains("Lesson Created"));
        WaitUtils.waitFor(3);
    }

    @And("user enters the lessonName as number and special character and creditScore")
    public void userEntersTheLessonNameAsNumberAndSpecialCharacterAndCreditScore() throws IOException {
        int fakeLessonName =new Faker().number().numberBetween(0,14);
        int fakeCreditScore =new Faker().number().numberBetween(0,500);
        viceDeanMngPage.lessonName.sendKeys("?!"+fakeLessonName);
        WaitUtils.waitFor(2);
        viceDeanMngPage.creditScore.sendKeys(fakeCreditScore+"");
        WaitUtils.waitFor(2);
    }

    @Then("assert the success alert is not displayed")
    public void assertTheSuccessAlertIsNotDisplayed() throws IOException {
        String alertText = viceDeanMngPage.alert.getText();
        assertFalse(alertText.contains("Lesson Created"));
        WaitUtils.waitFor(3);
    }


    @And("user enters the lessonName and creditScore as other than numbers between zero and five hundred")
    public void userEntersTheLessonNameAndCreditScoreAsOtherThanNumbersBetweenZeroAndFiveHundred() throws IOException {
        int fakeLessonName =new Faker().number().numberBetween(0,14);
        int fakeCreditScore =new Faker().number().numberBetween(-500,0);
        viceDeanMngPage.lessonName.sendKeys("mat"+fakeLessonName);
        WaitUtils.waitFor(2);
        viceDeanMngPage.creditScore.sendKeys(fakeCreditScore+"");
        WaitUtils.waitFor(2);
    }



}
