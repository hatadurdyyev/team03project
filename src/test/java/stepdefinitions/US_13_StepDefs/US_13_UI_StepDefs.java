package stepdefinitions.US_13_StepDefs;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.ViceDeanMngPage;
import pages.ViceDeanTeacherMngPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.WaitUtils;

import java.util.Random;

import static junit.framework.TestCase.assertTrue;

public class US_13_UI_StepDefs {
    ViceDeanTeacherMngPage viceDeanTeacherMngPage = new ViceDeanTeacherMngPage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();
    @Given("User goes to school page {string}")
    public void user_goes_to_school_page(String url) {
        Driver.getDriver().get(url);
    }
    @When("user clicks Login button")
    public void user_clicks_login_button() {
        homePage.loginHome.click();
    }

    @And("user enters VD username {string} to the username text box")
    public void userEntersVDToTheUsernameTextBox(String username) {

        loginPage.userName.sendKeys(username);

    }

    @And("user enters VD password {string} to the password text box")
    public void userEntersVDToThePasswordTextBox(String password) {

        loginPage.password.sendKeys(password);

    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.loginButton.click();
    }

    @And("user clicks on submit button")
    public void userClicksOnSubmitButton() {
        viceDeanTeacherMngPage.teacherSubmitButton.click();
    }

    @Then("user verifies if account was created")
    public void userVerifiesIfAccountWasCreated() {


        Assert.assertTrue(viceDeanTeacherMngPage.accountCreatedPopUp.isDisplayed());

    }

    @Given("clicks on Teacher Management")
    public void clicks_on_teacher_management() {
        viceDeanMngPage.teacherManagementLink.click();

    }
    @Then("verify if user is on Teacher Management page")
    public void verify_if_user_is_on_teacher_management_page() {
        Assert.assertTrue(viceDeanTeacherMngPage.teacherManagementPageTitle.isDisplayed());

    }
    @When("Click on Select lesson dropdown")
    public void click_on_select_lesson_dropdown() {
        viceDeanTeacherMngPage.chooseLessonsY.click();

    }
    @When("Click on any lesson")
    public void click_on_any_lesson() {

        ReusableMethods.waitFor(2);
        viceDeanTeacherMngPage.chooseLessonsY.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys("Java" + Keys.ENTER).perform();

    }
    @Then("Verify if a lesson is selected")
    public void verify_if_a_lesson_is_selected() {

    Assert.assertTrue(viceDeanTeacherMngPage.lessonSelected.isDisplayed());

    }
    @When("Click on name text field")
    public void click_on_name_text_field() {

        viceDeanTeacherMngPage.teacherName.click();

    }
    @When("Click on submit button")
    public void click_on_submit_button() {

        viceDeanTeacherMngPage.teacherSubmitButton.click();

    }
    @Then("Verify name is required")
    public void verify_name_is_required() {

        Assert.assertTrue(viceDeanTeacherMngPage.teacherNameAssertMessage.isDisplayed());

    }
    @When("Click on Surname text field")
    public void click_on_surname_text_field() {

        viceDeanTeacherMngPage.teacherSurname.click();

    }
    @Then("Verify Surname is required")
    public void verify_surname_is_required() {

        Assert.assertTrue(viceDeanTeacherMngPage.teacherSurnameAssertMessage.isDisplayed());

    }
    @When("Click on Birthplace text field")
    public void click_on_birthplace_text_field() {

        viceDeanTeacherMngPage.teacherBirthplace.click();

    }
    @Then("Verify Birthplace is required")
    public void verify_birthplace_is_required() {

        Assert.assertTrue(viceDeanTeacherMngPage.teacherBirthplaceAssertMessage.isDisplayed());

    }
    @When("Click on Email text field")
    public void click_on_email_text_field() {

        viceDeanTeacherMngPage.teacherEmail.click();

    }
    @Then("Verify Email is required")
    public void verify_email_is_required() {

        Assert.assertTrue(viceDeanTeacherMngPage.teacherEmailAssertMessage.isDisplayed());

    }
    @When("Click on phone number text field")
    public void click_on_phone_number_text_field() {

        viceDeanTeacherMngPage.teacherPhoneNumber.click();

    }
    @Then("Verify phone number is required")
    public void verify_phone_number_is_required() {

        Assert.assertTrue(viceDeanTeacherMngPage.teacherPhoneNumberAssertMessage.isDisplayed());

    }
    @When("Click on Advisor Teacher checkbox")
    public void click_on_advisor_teacher_checkbox() {

        viceDeanTeacherMngPage.isAdvisorTeacherCheckBox.click();

    }
    @Then("Verify if Advisor Teacher is selected")
    public void verify_if_advisor_teacher_is_selected() {

        Assert.assertTrue(viceDeanTeacherMngPage.isAdvisorTeacherCheckBox.isSelected());

    }
    @When("Select a lesson")
    public void select_a_lesson() {

        ReusableMethods.waitFor(2);
        viceDeanTeacherMngPage.chooseLessonsY.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys("Java" + Keys.ENTER).perform();

    }
    @When("Enter name in the name text field")
    public void enter_name_in_the_name_text_field() {

        viceDeanTeacherMngPage.teacherName.sendKeys(Faker.instance().name().firstName());


    }
    @When("Enter surname in the surname text field")
    public void enter_surname_in_the_surname_text_field() {

        viceDeanTeacherMngPage.teacherSurname.sendKeys(Faker.instance().name().lastName());

    }
    @When("Enter birth place in the birthplace text field")
    public void enter_birth_place_in_the_birthplace_text_field() {

        viceDeanTeacherMngPage.teacherBirthplace.sendKeys(Faker.instance().address().city().substring(0,5));

    }
    @When("Enter email in the email text field")
    public void enter_email_in_the_email_text_field() {

        viceDeanTeacherMngPage.teacherEmail.sendKeys(Faker.instance().internet().emailAddress());

    }
    @When("Enter phone number in the phone number text field")
    public void enter_phone_number_in_the_phone_number_text_field() {

        viceDeanTeacherMngPage.teacherPhoneNumber.sendKeys(generatePhoneNumber());

    }

    public static String generatePhoneNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        // Generate the first three digits
        for (int i = 0; i < 3; i++) {
            int digit = random.nextInt(10);
            sb.append(digit);
        }

        sb.append("-");

        // Generate the next three digits
        for (int i = 0; i < 3; i++) {
            int digit = random.nextInt(10);
            sb.append(digit);
        }

        sb.append("-");

        // Generate the last four digits
        for (int i = 0; i < 4; i++) {
            int digit = random.nextInt(10);
            sb.append(digit);
        }

        return sb.toString();
    }
    @When("Enter date of birth in the date of birth field")
    public void enter_date_of_birth_in_the_date_of_birth_field() {

        viceDeanTeacherMngPage.teacherBirthdate.sendKeys("11111111");



    }
    @When("Enter SSN in the SSN field")
    public void enter_ssn_in_the_ssn_field() {

        viceDeanTeacherMngPage.teacherSsn.sendKeys(Faker.instance().idNumber().ssnValid());

    }
    @When("Enter username in the username field")
    public void enter_username_in_the_username_field() {

        viceDeanTeacherMngPage.teacherUsername.sendKeys(Faker.instance().name().username().substring(0,10));

    }
    @When("Enter password in the password field")
    public void enter_password_in_the_password_field() {

        viceDeanTeacherMngPage.teacherPassword.sendKeys(Faker.instance().internet().password());

    }
    @Then("Verify if gender is required")
    public void verify_if_gender_is_required() {

        //Assert.assertTrue(viceDeanTeacherMngPage.genderAssertMessage.isDisplayed());
        WaitUtils.waitFor(2);
        String alertText = viceDeanTeacherMngPage.genderAssertMessage.getText();
        assertTrue(alertText.contains("You have entered an invalid value. Valid values are: MALE, FEMALE"));
        WaitUtils.waitFor(2);

    }
    @When("Click on date of birth field")
    public void click_on_date_of_birth_field() {

        viceDeanTeacherMngPage.teacherBirthdate.click();

    }
    @Then("Verify date of birth is required")
    public void verify_date_of_birth_is_required() {

        Assert.assertTrue(viceDeanTeacherMngPage.teacherBirthdateAssertMessage.isDisplayed());

    }
    @When("Click on SSN field")
    public void click_on_ssn_field() {

        viceDeanTeacherMngPage.teacherSsn.click();

    }
    @Then("Verify if SSN is required")
    public void verify_if_ssn_is_required() {

        Assert.assertTrue(viceDeanTeacherMngPage.teacherSsnAssertMessage.isDisplayed());

    }
    @When("Enter any digit in SSN text field")
    public void enter_any_digit_in_ssn_text_field() {

        viceDeanTeacherMngPage.teacherSsn.sendKeys("3");

    }
    @Then("Verify if minimum eleven characters are required")
    public void verify_if_minimum_characters_are_required() {

        Assert.assertTrue(viceDeanTeacherMngPage.ssnMinimum11AssertMessage.isDisplayed());

    }

    @When("Enter SSN with the hyphen in in wrong place")
    public void enter_ssn_with_the_in_in_wrong_place() {

        viceDeanTeacherMngPage.teacherSsn.sendKeys("654-864-543");



    }
    @Then("Verify the SSN error message")
    public void verify_the_ssn_error_message() {
        WaitUtils.waitFor(2);
 //       String ssnMessage = viceDeanTeacherMngPage.validSSNMessage.getText();
        assertTrue(viceDeanTeacherMngPage.validSSNMessage.isDisplayed());

    }
    @When("Clear all fields")
    public void clear_all_fields() {

        Driver.getDriver().navigate().refresh();

    }
    @When("Click on user name text field")
    public void click_on_user_name_text_field() {

        viceDeanTeacherMngPage.teacherUsername.click();

    }
    @Then("Verify if username is required")
    public void verify_if_username_is_required() {

        Assert.assertTrue(viceDeanTeacherMngPage.teacherUsernameAssertMessage.isDisplayed());

    }
    @When("Click on password text field")
    public void click_on_password_text_field() {

        viceDeanTeacherMngPage.teacherPassword.click();

    }
    @When("Enter any character")
    public void enter_any_character() {

        viceDeanTeacherMngPage.teacherPassword.sendKeys("3");

    }
    @Then("Verify if at least eight character message appears")
    public void verify_if_at_least_character_message_appears() {

        Assert.assertTrue(viceDeanTeacherMngPage.minimumEightCharactersMessage.isDisplayed());

    }
    @When("Enter any password which is not the criteria with minimum eight characters")
    public void enter_any_password_which_is_not_the_criteria_with_minimum_characters() {

    viceDeanTeacherMngPage.teacherPassword.sendKeys("12345678");

    }
    @Then("Verify password must contain uppercase letters, lowercase letters, and a number.")
    public void verify_password_must_contain_uppercase_letters_lowercase_letters_and_a_number() {

    Assert.assertTrue(viceDeanTeacherMngPage.teacherPasswordAssertMessage.isDisplayed());

    }

    @And("Select gender female")
    public void selectGenderFemale() {

        viceDeanTeacherMngPage.teacherGenderFemale.click();

    }

    @And("Enter SSN with the hyphen in wrong place")
    public void enterSSNWithTheHyphenInWrongPlace() {

        viceDeanTeacherMngPage.teacherSsn.sendKeys("654-158-489");

    }



}
