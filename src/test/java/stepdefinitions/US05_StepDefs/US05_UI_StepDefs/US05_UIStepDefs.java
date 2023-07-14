package stepdefinitions.US05_StepDefs.US05_UI_StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.DeanMngPage;
import utilities.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class US05_UIStepDefs {

    DeanMngPage deanMngPage = new DeanMngPage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("admin navigates to url {string}")
    public void admin_navigates_to_url(String string) {
        Driver.getDriver().get(string);
    }

    @When("admin clicks to login icon")
    public void adminClicksToLoginIcon() {
        deanMngPage.loginIconForDnMng.click();
    }

    @When("admin enters username {string}")
    public void admin_enters_username(String string) {
        deanMngPage.loginAdminUsernameForDnMng.sendKeys("Project09Admin");
    }

    @When("admin enters password {string}")
    public void admin_enters_password(String string) {
        deanMngPage.loginAdminPasswordForDnMng.sendKeys("12345678");
    }

    @When("admin click to login button")
    public void admin_click_to_login_button() {
        deanMngPage.loginButtonForDnMng.click();
        WaitUtils.waitFor(2);
    }

    @When("close the website")
    public void close_the_website() {
        Driver.closeDriver();
    }

    //----->>>>>admin can see all the dean list and pages and dean management page
    //---->>>>>admin should update deans

    @Given("admin clicks menu button")
    public void admin_clicks_menu_button() {
        deanMngPage.menuButton.click();
        WaitUtils.waitFor(1);
    }

    @When("admin clicks dean management option")
    public void admin_clicks_dean_management_option() {
        deanMngPage.deanMngOptionButton.click();
        WaitUtils.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        WaitUtils.waitFor(4);
    }

    @When("admin clicks on edit button")
    public void admin_clicks_on_edit_button() {

        deanMngPage.deanFromList.click();
        WaitUtils.waitFor(2);

    }

    @When("admin enters dean name {string}")
    public void admin_enters_dean_name(String deanName) {

        deanMngPage.newNameInputEditPage.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        deanMngPage.newNameInputEditPage.sendKeys(deanName);
        WaitUtils.waitFor(2);
    }

    @When("admin enters dean surname {string}")
    public void admin_enters_dean_surname(String deanSurname) {
        deanMngPage.newSurnameInputEditPage.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        deanMngPage.newSurnameInputEditPage.sendKeys(deanSurname);
        WaitUtils.waitFor(2);
    }

    @When("admin enters dean birthplace {string}")
    public void admin_enters_dean_birthplace(String deanBirthPlace) {
        deanMngPage.newBirthPlaceInput.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        deanMngPage.newBirthPlaceInput.sendKeys(deanBirthPlace);
        WaitUtils.waitFor(2);
    }

    @When("admin selects dean gender")
    public void admin_selects_dean_gender() {
        deanMngPage.genderFemaleRadioButton.click();
        WaitUtils.waitFor(2);
    }

    @When("admin enters dean dateofbirth {string}")
    public void admin_enters_dean_dateofbirth(String deanDateOfBirth) {
        deanMngPage.newDateOfBirthInput.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        deanMngPage.newDateOfBirthInput.sendKeys(deanDateOfBirth);
        WaitUtils.waitFor(2);
    }

    @When("admin enters dean phonenumber {string}")
    public void admin_enters_dean_phonenumber(String deanPhoneNumber) {
        deanMngPage.newPhoneNumberInput.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        deanMngPage.newPhoneNumberInput.sendKeys(deanPhoneNumber);
        WaitUtils.waitFor(2);
    }

    @When("admin enters dean SSN {string}")
    public void admin_enters_dean_ssn(String deanSSN) {
        deanMngPage.newSsnNumberInput.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        deanMngPage.newSsnNumberInput.sendKeys(deanSSN);
        WaitUtils.waitFor(2);
    }

    @When("admin enters dean username {string}")
    public void admin_enters_dean_username(String deanUsername) {
        deanMngPage.newUsernameInputEditPage.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        deanMngPage.newUsernameInputEditPage.sendKeys(deanUsername);
        WaitUtils.waitFor(2);
    }

    @When("admin enters dean password {string}")
    public void admin_enters_dean_password(String deanPassword) {
        deanMngPage.newPasswordInputEditPage.sendKeys(deanPassword);
        WaitUtils.waitFor(2);
    }

    @When("admin clicks submit button in edit page")
    public void admin_clicks_submit_button_in_edit_page() {
        deanMngPage.editPageSubmitButton.click();
        WaitUtils.waitFor(2);
    }

    @Then("assert {string} message displayed")
    public void assert_message_displayed(String string) {
        String alertText = deanMngPage.deanUpdtScssMessage.getText();
        assertTrue(alertText.contains("Dean updated Successful"));
        WaitUtils.waitFor(2);
    }

    @Then("admin clicks on cross sign")
    public void admin_clicks_on_cross_sign() {
        deanMngPage.crossSignInEditPage.click();
        WaitUtils.waitFor(2);

    }
}