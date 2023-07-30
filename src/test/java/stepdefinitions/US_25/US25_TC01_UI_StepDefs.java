package stepdefinitions.US_25;

import io.cucumber.java.en.When;
import pages.AdminMngPage;
import pages.MenuPage;
import pages.StudentMngPage;
import utilities.JSUtils;
import utilities.MediaUtils;
import utilities.ReusableMethods;
import utilities.WaitUtils;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class US25_TC01_UI_StepDefs {
    AdminMngPage adminMngPage = new AdminMngPage();
    MenuPage menuPage = new MenuPage();
    StudentMngPage studentMngPage = new StudentMngPage();

    @When("admin clicks to the student management link")
    public void admin_clicks_to_the_student_management_link() {
        //adminMngPage.menuButton.click();
        menuPage.studentManagementButton.click();
    }
    @When("admin selects an advisory teacher")
    public void admin_selects_an_advisory_teacher() {
        ReusableMethods.selectByValue(studentMngPage.addAdvisorTeacher, "1");
    }
    @When("admin enters a student name {string}")
    public void admin_enters_a_student_name(String name) {
        studentMngPage.addName.sendKeys(name);
    }
    @When("admin enters a student surname {string}")
    public void admin_enters_a_student_surname(String surname) {
        studentMngPage.addSurname.sendKeys(surname);
    }
    @When("admin enters a student birthplace {string}")
    public void admin_enters_a_student_birthplace(String birthPlace) {
        studentMngPage.addBirthPlace.sendKeys(birthPlace);
    }
    @When("admin enters a student email address {string}")
    public void admin_enters_a_student_email_address(String email) {
        studentMngPage.addEmail.sendKeys(email);
    }
    @When("admin enters a student phone number {string}")
    public void admin_enters_a_student_phone_number(String phoneNumber) {
        studentMngPage.addPhoneNumber.sendKeys(phoneNumber);
    }
    @When("admin selects a gender {string}")
    public void admin_selects_a_gender(String gender) {
        ReusableMethods.clickRadioByIndex(Integer.parseInt(gender));
    }
    @When("admin enters a student Date of Birth {string}")
    public void admin_enters_a_student_date_of_birth(String birthDay) {
        studentMngPage.addBirthDay.sendKeys(birthDay);
    }
    @When("admin enters a student SSN {string}")
    public void admin_enters_a_student_ssn(String ssn) {
        studentMngPage.addSSN.sendKeys(ssn);
    }
    @When("admin enters a student username {string}")
    public void admin_enters_a_student_username(String username) {
        studentMngPage.addUsername.sendKeys(username);
    }
    @When("admin enters a student fathername {string}")
    public void admin_enters_a_student_fathername(String fatherName) {
        studentMngPage.addFatherName.sendKeys(fatherName);
    }
    @When("admin enters a student mothername {string}")
    public void admin_enters_a_student_mothername(String motherName) {
        studentMngPage.addMotherName.sendKeys(motherName);
    }
    @When("admin enters a student password {string}")
    public void admin_enters_a_student_password(String password) {
        studentMngPage.addPassword.sendKeys(password);
    }
    @When("admin clicks on submit button")
    public void admin_clicks_on_submit_button() {
        studentMngPage.addSubmitBtn.click();
    }
    @When("admin validates the success alert message")
    public void admin_validates_the_success_alert_message() throws IOException {
        MediaUtils.takeScreenshotOfTheEntirePage();
        WaitUtils.waitFor(1);
        assertTrue(studentMngPage.studentSavedSuccessfullyMessage.isDisplayed());
    }

}
