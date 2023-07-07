package stepdefinitions.US_07_StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.DeanMngPage;
import pages.HomePage;
import pages.LoginPage;

import utilities.Driver;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

public class UI_StepDefs {

    HomePage managementSchoolsMainPage = new HomePage();
    LoginPage managementSchoolsLoginPage = new LoginPage();

    DeanMngPage deanMngPage = new DeanMngPage();


    @Given("user goes to {string}")
    public void user_goes_to(String url) throws IOException {

        Driver.getDriver().get(url);
        MediaUtils.takeScreenshotOfTheEntirePage();

    }
    @When("user clicks on Login button")
    public void user_clicks_on_login_button() throws IOException {

        managementSchoolsMainPage.loginHome.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

    }
    @When("user enters {string} to the username text box")
    public void user_enters_to_the_username_text_box(String string) throws IOException {

        managementSchoolsLoginPage.userName.sendKeys("miles");
        MediaUtils.takeScreenshotOfTheEntirePage();

    }
    @When("user enters {string} to the password text box")
    public void user_enters_to_the_password_text_box(String string) throws IOException {

        managementSchoolsLoginPage.password.sendKeys("milesmiles");
        MediaUtils.takeScreenshotOfTheEntirePage();

    }

    @And("user clicks on Login button on Login page")
    public void userClicksOnLoginButtonOnLoginPage() throws IOException {

        managementSchoolsLoginPage.loginButton.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

    }

    @Given("user clicks on Menu button")
    public void user_clicks_on_menu_button() throws IOException {

        deanMngPage.menuButton.click();
        WaitUtils.waitFor(2);
        MediaUtils.takeScreenshotOfTheEntirePage();

    }
    @When("user clicks on Contact Get All button")
    public void user_clicks_on_contact_get_all_button() throws IOException {

        deanMngPage.contactGetAllButton.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

    }
    @When("close the app")
    public void close_the_app() throws IOException {

        WaitUtils.waitFor(3);
        MediaUtils.takeScreenshotOfTheEntirePage();
        Driver.closeDriver();

    }


}