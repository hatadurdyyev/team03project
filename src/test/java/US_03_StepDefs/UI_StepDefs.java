package US_03_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ContactPage;
import pages.HomePage;
import utilities.Driver;
import utilities.WaitUtils;

import static org.junit.Assert.assertTrue;

public class UI_StepDefs {
    ContactPage contactPage = new ContactPage();
    HomePage homePage = new HomePage();
    @Given("user goes to {string}")
    public void user_goes_to(String url) {
        Driver.getDriver().get(url);
    }
    @When("user clicks on contact link")
    public void user_clicks_on_contact_link() {
        homePage.linkContact.click();
    }
    @When("user enters name {string}")
    public void user_enters_name(String Name) {
        contactPage.yourname.sendKeys(Name);
        WaitUtils.waitFor(1);
    }
    @When("user enters email {string}")
    public void user_enters_emial(String email) {
        contactPage.email.sendKeys(email);
        WaitUtils.waitFor(1);
    }
    @When("user enter subject {string}")
    public void user_enter_subject(String subject) {
        contactPage.subject.sendKeys(subject);
        WaitUtils.waitFor(1);
    }
    @When("user enter message {string}")
    public void user_enter_message(String message) {
        contactPage.message.sendKeys(message);
        WaitUtils.waitFor(1);
    }
    @When("user click on save message")
    public void user_click_on_save_message() {
        contactPage.safeMessage.submit();
        WaitUtils.waitFor(1);
    }


    @Then("assert the alert")
    public void assert_the_alert() {
        assertTrue(contactPage.alert.getText().contains("Contact Message Created Successfully"));
    }
    @Then("assert the error alert")
    public void assertTheErrorAlert() {

        Assert.assertTrue(contactPage.emailErrorAlert.isDisplayed());
    }
    @Then("close application")
    public void close_application() {
        Driver.closeDriver();
    }

}
