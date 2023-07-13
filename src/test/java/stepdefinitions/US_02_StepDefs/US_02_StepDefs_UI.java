package stepdefinitions.US_02_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.*;
import utilities.Driver;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class US_02_StepDefs_UI {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AdminMngPage adminMngPage = new AdminMngPage();
    MenuPage menuPage = new MenuPage();
    GuestUserPage guestUserPage = new GuestUserPage();

    @Given("admin goes to {string}")
    public void admin_goes_to(String url) throws IOException {
        Driver.getDriver().get(url);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @When("admin clicks on login link")
    public void admin_clicks_on_login_link() throws IOException {
        homePage.loginHome.click();
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @When("admin enters username {string}")
    public void admin_enters_username(String username) throws IOException {
        loginPage.userName.sendKeys(username);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @When("admin enters password {string}")
    public void admin_enters_password(String password) throws IOException {
        loginPage.password.sendKeys(password);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @When("admin clicks on login button")
    public void admin_clicks_on_login_button() throws IOException {
        loginPage.loginButton.click();
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Given("admin clicks on menu button")
    public void admin_clicks_on_menu_button() throws IOException {
        adminMngPage.menuButton.click();
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Given("admin clicks guest user link")
    public void admin_clicks_guest_user_link() throws IOException {
        menuPage.guestUserButton.click();
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Given("admin validates guest user list text on the page")
    public void admin_validates_guest_user_list_text_on_the_page() throws IOException {
        WaitUtils.waitFor(1);
        assertTrue(guestUserPage.guestUserListTxt.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Given("admin deletes information on the guest user list")
    public void admin_deletes_information_on_the_guest_user_list() throws IOException {
        String username = guestUserPage.guestUserListR1C4UserName.getText();
        MediaUtils.takeScreenshotOfTheEntirePage();
        System.out.println("username = " + username);
        guestUserPage.guestUserListR1C5DeleteBtn.click();
        MediaUtils.takeScreenshotOfTheEntirePage();
        WaitUtils.waitFor(1);
        assertTrue(guestUserPage.guestUserDeletedSuccessfulTxt.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

}
