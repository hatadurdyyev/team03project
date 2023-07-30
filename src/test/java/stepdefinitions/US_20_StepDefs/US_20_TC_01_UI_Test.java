package stepdefinitions.US_20_StepDefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.MeetMngPage;
import pages.MenuPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

public class US_20_TC_01_UI_Test {

    MenuPage menuPage = new MenuPage();
    MeetMngPage meetMngPage = new MeetMngPage();
    Actions actions = new Actions(Driver.getDriver());


    @When("user clicks on Meet Management button")
    public void user_clicks_on_meet_management_button() throws IOException {

        WaitUtils.waitFor(1);
        menuPage.meetManagementButton.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

    }
    @When("user clicks edit button in one of the meetings")
    public void user_clicks_edit_button_in_one_of_the_meetings() throws IOException {

        WaitUtils.waitFor(1);
        meetMngPage.firstMeetingEditButton.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

    }
    @When("user chooses a student")
    public void user_chooses_a_student() throws IOException {

        WaitUtils.waitFor(1);
        meetMngPage.editMeetChooseStudentsTextBox.click();
        WaitUtils.waitFor(2);
        actions.sendKeys("hakan",Keys.ENTER).perform();
        MediaUtils.takeScreenshotOfTheEntirePage();

    }
    @When("user changes date of meet")
    public void user_changes_date_of_meet() throws IOException {

        WaitUtils.waitFor(1);
        meetMngPage.editMeetDateOfMeetTextBox.click();
        actions.sendKeys("12122024").perform();
        MediaUtils.takeScreenshotOfTheEntirePage();

    }
    @When("user changes start time")
    public void user_changes_start_time() throws IOException {

        WaitUtils.waitFor(1);
        meetMngPage.editMeetStartTimeTextBox.click();
        actions.sendKeys("0100p").perform();
        MediaUtils.takeScreenshotOfTheEntirePage();

    }
    @When("user changes stop time")
    public void user_changes_stop_time() throws IOException {

        WaitUtils.waitFor(1);
        meetMngPage.editMeetStopTimeTextBox.click();
        actions.sendKeys("0300p").perform();
        MediaUtils.takeScreenshotOfTheEntirePage();

    }
    @When("user changes description")
    public void user_changes_description() throws IOException {

        WaitUtils.waitFor(1);
        meetMngPage.editMeetDescriptionTextBox.click();
        actions.sendKeys("HeyHeyHeyBla").perform();
        //sendKeys("HeyHeyHeyBla");
        MediaUtils.takeScreenshotOfTheEntirePage();

    }
    @When("user clicks on {string} button")
    public void user_clicks_on_button(String string) throws IOException {

        WaitUtils.waitFor(1);
        meetMngPage.editMeetSubmitButton.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

    }
    @When("verify the meeting is changed")
    public void verify_the_meeting_is_changed() throws IOException {

        WaitUtils.waitFor(1);
        meetMngPage.editMeetMeetUpdatedSuccessfully.isDisplayed();
        MediaUtils.takeScreenshotOfTheEntirePage();

    }
}
