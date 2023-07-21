package stepdefinitions.US_04;

import io.cucumber.java.en.Given;
import pages.DeanMngPage;
import pages.MenuPage;
import utilities.JSUtils;
import utilities.MediaUtils;
import utilities.ReusableMethods;
import utilities.WaitUtils;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class US04_TC01_UI_StepDefs {

    MenuPage menuPage = new MenuPage();
    DeanMngPage deanMngPage = new DeanMngPage();

    @Given("admin clicks dean management link")
    public void admin_clicks_dean_management_link() throws IOException {
        menuPage.deanManagementButton.click();
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

    @Given("admin enters dean name {string} to add dean section")
    public void admin_enters_dean_name_to_add_dean_section(String addDeanName) throws IOException {
        WaitUtils.waitFor(1);
        deanMngPage.addName.sendKeys(addDeanName);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Given("admin enters dean surname {string} to add dean section")
    public void admin_enters_dean_surname_to_add_dean_section(String addDeanSurname) throws IOException {
        deanMngPage.addSurname.sendKeys(addDeanSurname);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Given("admin enters dean birthplace {string} to add dean section")
    public void admin_enters_dean_birthplace_to_add_dean_section(String addDeanBirthPlace) throws IOException {
        deanMngPage.addBirthPlace.sendKeys(addDeanBirthPlace);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

    @Given("admin selects dean gender {string} from add dean section")
    public void admin_selects_dean_gender_from_add_dean_section(String index) throws IOException {
        ReusableMethods.clickRadioByIndex(Integer.parseInt(index));
        MediaUtils.takeScreenshotOfTheEntirePage();
    }


    @Given("admin enters dean dateofbirth {string} to add dean section")
    public void admin_enters_dean_dateofbirth_to_add_dean_section(String addDeanDateOfBirth) throws IOException {
        deanMngPage.addBirthDay.sendKeys(addDeanDateOfBirth);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Given("admin enters dean phonenumber {string} to add dean section")
    public void admin_enters_dean_phonenumber_to_add_dean_section(String phoneNumber) throws IOException {
        deanMngPage.addPhoneNumber.sendKeys(phoneNumber);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Given("admin enters dean SSN {string} to add dean section")
    public void admin_enters_dean_ssn_to_add_dean_section(String ssn) throws IOException {
        deanMngPage.addSSN.sendKeys(ssn);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Given("admin enters dean username {string} to add dean section")
    public void admin_enters_dean_username_to_add_dean_section(String username) throws IOException {
        deanMngPage.addUsername.sendKeys(username);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Given("admin enters dean password {string} to add dean section")
    public void admin_enters_dean_password_to_add_dean_section(String password) throws IOException {
        deanMngPage.addPassword.sendKeys(password);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

    @Given("admin click submit button")
    public void admin_click_submit_button() throws IOException {
        MediaUtils.takeScreenshotOfTheEntirePage();
        deanMngPage.submitBtn.click();
    }

    @Given("admin validates dean saved alert message")
    public void admin_validates_dean_saved_alert_message() throws IOException {
        WaitUtils.waitFor(1);
        assertTrue(deanMngPage.deanSavedMessage.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
}
