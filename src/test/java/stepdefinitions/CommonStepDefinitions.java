package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;
import utilities.MediaUtils;

import java.io.IOException;

public class CommonStepDefinitions {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("user goes to {string}")
    public void user_goes_to(String url) {
        Driver.getDriver().get(url);
    }

    @When("user clicks on login link")
    public void user_clicks_on_login_link() {
        homePage.loginHome.click();
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.loginButton.click();
    }

    // ADMIN CREDENTIALS
    @And("admin enters username {string} and password {string}")
    public void adminEntersUsernameAndPassword(String username, String password) throws IOException {
        loginPage.userName.sendKeys(username);
        loginPage.password.sendKeys(password);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

    @Then("close the application")
    public void close_the_application() {

        Driver.closeDriver();

    }


}
