package stepdefinitions.US_20_StepDefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MeetMngPage;
import utilities.Driver;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

public class US_20_TC_02_UI_Test {


    MeetMngPage meetMngPage = new MeetMngPage();
    @When("user clicks on delete meeting on one of the meetings")
    public void user_clicks_on_delete_meeting_on_one_of_the_meetings() throws IOException {

        WaitUtils.waitFor(1);
        meetMngPage.firstDeleteMeetButton.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

    }
    @When("assert the action")
    public void assert_the_action() throws IOException {


        meetMngPage.meetDeletedSuccessfully.isDisplayed();
        MediaUtils.takeScreenshotOfTheEntirePage();

    }

}