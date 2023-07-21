package stepdefinitions.US_16_StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ContactPage;
import pages.MenuPage;
import pages.ViceDeanMngPage;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class US_16_UI_StepDefs {
    ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();
    MenuPage menuPage = new MenuPage();
    ContactPage contactPage=new ContactPage();

    @And("user  clicks Contact Get All button  on the main page")
    public void userClicksContactGetAllButtonOnTheMainPage() {
     menuPage.contactGetAllButton.click();
        WaitUtils.waitFor(2);
    }


    @And("user views the {string}")
    public void userViewsThe(String string) throws IOException {
        String allMessages = contactPage.contactMessage.getText();
        assertTrue(allMessages.contains("Contact Message"));
        MediaUtils.takeScreenshotOfTheEntirePage();
        WaitUtils.waitFor(1);
    }

    @Then("user assert the messages, their authors, emails, sending date and subject information")
    public void userAssertTheMessagesTheirAuthorsEmailsSendingDateAndSubjectInformation() throws IOException {
      contactPage.nameSection.isDisplayed();
        WaitUtils.waitFor(1);
      contactPage.emailSection.isDisplayed();
        WaitUtils.waitFor(1);
      contactPage.dateSection.isDisplayed();
        WaitUtils.waitFor(1);
      contactPage.subjectSection.isDisplayed();
        WaitUtils.waitFor(1);
      contactPage.messageSection.isDisplayed();
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

    @And("ses the delete button")
    public void sesTheDeleteButton() throws IOException {
        MediaUtils.takeScreenshotOfTheEntirePage();

    }

    @And("deletes messages.")
    public void deletesMessages() throws IOException {
        MediaUtils.takeScreenshotOfTheEntirePage();

    }



}

