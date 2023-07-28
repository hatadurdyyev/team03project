package stepdefinitions.US_22_StepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AdminMngPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static stepdefinitions.US_13_StepDefs.US_13_UI_StepDefs.generatePhoneNumber;

public class US_22_UI_StepDefs {

    AdminMngPage adminMngPage = new AdminMngPage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("user clicks on admin name field")
    public void user_clicks_on_admin_name_field() {

        adminMngPage.addAdminNameTextBox.click();
    }
    @Then("user verifies admin name required message")
    public void user_verifies_admin_name_required_message() {
        assertTrue(adminMngPage.adminNameRequiredMessage.getText().contains("Required"));

    }
    @Given("user clicks on admin surname field")
    public void user_clicks_on_admin_surname_field() {
        adminMngPage.addAdminSurnameTextBox.click();
    }
    @Then("user verifies admin surname required message")
    public void user_verifies_admin_surname_required_message() {
        assertTrue(adminMngPage.adminSurnameRequiredMessage.getText().contains("Required"));
    }

    @Given("user clicks on admin birthplace field")
    public void user_clicks_on_admin_birthplace_field() {
        adminMngPage.addAdminBirthPlaceTextBox.click();
    }
    @Then("verify admin birthplace required message")
    public void verify_admin_birthplace_required_message() {
        assertTrue(adminMngPage.adminBirthplaceRequiredMessage.getText().contains("Required"));
    }

    @Given("user enters admin name in the name field")
    public void user_enters_admin_name_in_the_name_field() {
        adminMngPage.addAdminNameTextBox.sendKeys(Faker.instance().name().firstName());
    }
    @When("user enters admin surname in the surname field")
    public void user_enters_admin_surname_in_the_surname_field() {
        adminMngPage.addAdminSurnameTextBox.sendKeys(Faker.instance().name().lastName());
    }
    @When("user enters admin birthplace in the birthplace field")
    public void user_enters_admin_birthplace_in_the_birthplace_field() {
        adminMngPage.addAdminBirthPlaceTextBox.sendKeys(Faker.instance().address().city().substring(0,5));
    }
    @Given("user clicks on admin date of birth field")
    public void user_clicks_on_admin_date_of_birth_field() {
        adminMngPage.addAdminBirthdayTextBox.click();
    }
    @When("user enters admin date of birth in the date of birth field")
    public void user_enters_admin_date_of_birth_in_the_date_of_birth_field() {
        adminMngPage.addAdminBirthdayTextBox.sendKeys("11111111");
    }
    @When("user enters admin phone number in the phone number field")
    public void user_enters_admin_phone_number_in_the_phone_number_field() {
        adminMngPage.addAdminPhoneNumberTextBox.sendKeys(generatePhoneNumber());

    }
    @When("user enters admin SSN in the SSN field")
    public void user_enters_admin_ssn_in_the_ssn_field() {
        adminMngPage.addAdminSsnTextBox.sendKeys(Faker.instance().idNumber().ssnValid());

    }
    @When("user enters admin username in the user name field")
    public void user_enters_admin_username_in_the_user_name_field() {
        adminMngPage.addAdminUsernameTextBox.sendKeys(Faker.instance().name().username().substring(0,7));
    }
    @When("user enters admin password in the password field")
    public void user_enters_admin_password_in_the_password_field() {
        adminMngPage.addAdminPasswordTextBox.sendKeys(Faker.instance().internet().password());
    }
    @Then("verify gender required message")
    public void verify_gender_required_message() {
        assertFalse(true); // there is no gender required message

    }

    @Then("verify admin date of birth required message")
    public void verify_admin_date_of_birth_required_message() {
        WaitUtils.waitFor(2);
        assertTrue(adminMngPage.adminBirthdateRequiredMessage.getText().contains("Required"));
    }

    @Given("user clicks on admin phone number field")
    public void user_clicks_on_admin_phone_number_field() {
        adminMngPage.addAdminPhoneNumberTextBox.click();
    }
    @Then("verify phone number required message")
    public void verify_phone_number_required_message() {
        assertTrue(adminMngPage.adminPhoneNumberRequiredMessage.getText().contains("Required"));
    }

    @Given("user clicks on admin SSN field")
    public void user_clicks_on_admin_ssn_field() {
        adminMngPage.addAdminSsnTextBox.click();
    }
    @Then("user verifies SSN required message")
    public void user_verifies_ssn_required_message() {
        assertTrue(adminMngPage.adminSsnRequiredMessage.getText().contains("Required"));
    }
    @When("user enters any digit in admin SSN field")
    public void user_enters_any_digit_in_admin_ssn_field() {
        adminMngPage.addAdminSsnTextBox.sendKeys("1");
    }
    @Then("user verifies must enter eleven characters message")
    public void user_verifies_must_enter_characters_message() {
        WaitUtils.waitFor(2);
        assertTrue(adminMngPage.adminSsnRequiredMessage.getText().equals("Minimum 11 character (XXX-XX-XXXX)"));
    }

    @When("user selects female admin gender")
    public void user_selects_female_admin_gender() {
        adminMngPage.addAdminFemaleButton.click();
    }

    @When("user enters admin SSN with the first hyphen in wrong place in the SSN field")
    public void user_enters_admin_ssn_with_the_first_hyphen_in_wrong_place_in_the_ssn_field() {
        adminMngPage.addAdminSsnTextBox.sendKeys("65-558-4894");
    }


    @Then("verify wrong SSN message")
    public void user_verifies_wrong_ssn_message() {
        WaitUtils.waitFor(2);
        String text = adminMngPage.enterValidSSNMessage.getText();
        Assert.assertTrue(text.contains("Please enter valid SSN number"));
    }
    @When("user enters admin SSN with the second hyphen in wrong place in the SSN field")
    public void user_enters_admin_ssn_with_the_second_hyphen_in_wrong_place_in_the_ssn_field() {
       adminMngPage.addAdminSsnTextBox.click();
        for (int i = 0; i < 12; i++) {
            actions.sendKeys(Keys.BACK_SPACE).perform();
        }
       adminMngPage.addAdminSsnTextBox.sendKeys("659-5584-94");
    }
    @When("user enters admin SSN with both hyphen in wrong place in the SSN field")
    public void user_enters_admin_ssn_with_both_hyphen_in_wrong_place_in_the_ssn_field() {
        adminMngPage.addAdminSsnTextBox.click();
        for (int i = 0; i < 12; i++) {
            actions.sendKeys(Keys.BACK_SPACE).perform();
        }
        adminMngPage.addAdminSsnTextBox.sendKeys("6-5955849-4");
    }

    @Given("user clicks on admin user name field")
    public void user_clicks_on_admin_user_name_field() {
        adminMngPage.addAdminUsernameTextBox.click();
    }
    @Then("verify admin user name required message")
    public void verify_admin_user_name_required_message() {
        assertTrue(adminMngPage.adminUsernameRequiredMessage.getText().contains("Required"));
    }

    @Given("user clicks on admin password field")
    public void user_clicks_on_admin_password_field() {
        adminMngPage.addAdminPasswordTextBox.click();
    }
    @Then("user verifies admin password required message")
    public void user_verifies_admin_password_required_message() {
        assertTrue(adminMngPage.adminPasswordRequiredMessage.getText().contains("Required"));
    }
    @When("user enters any digit in admin password field")
    public void user_enters_any_digit_in_admin_password_field() {
        adminMngPage.addAdminPasswordTextBox.sendKeys("a");
    }
    @Then("verify minimum eight character required message")
    public void verify_minimum_character_required_message() {
        assertTrue(adminMngPage.adminPasswordRequiredMessage.getText().contains("Minimum 8 character"));
    }

    @When("user enters admin password which is not the criteria in the password field")
    public void user_enters_admin_password_which_is_not_the_criteria_in_the_password_field() {
        adminMngPage.addAdminPasswordTextBox.sendKeys("aaabbbcc");
    }
    @Then("verify password error message")
    public void verify_password_error_message() {
        WaitUtils.waitFor(2);
        assertFalse(adminMngPage.adminSavedMessage.isDisplayed());
    }

}
