package stepdefinitions.US_02_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitUtils;

import static org.junit.Assert.assertTrue;

public class US_02_StepDefs_UI {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AdminMngPage adminMngPage = new AdminMngPage();
    MenuPage menuPage = new MenuPage();
    GuestUserPage guestUserPage = new GuestUserPage();

    @Given("admin goes to {string}")
    public void admin_goes_to(String url) {
        WaitUtils.waitFor(1);
        Driver.getDriver().get(url);
    }
    @When("admin clicks on login link")
    public void admin_clicks_on_login_link() {
        WaitUtils.waitFor(1);
        homePage.loginHome.click();
    }
    @When("admin enters username {string}")
    public void admin_enters_username(String username) {
        WaitUtils.waitFor(1);
        loginPage.userName.sendKeys(username);
    }
    @When("admin enters password {string}")
    public void admin_enters_password(String password) {
        WaitUtils.waitFor(1);
        loginPage.password.sendKeys(password);
    }
    @When("admin clicks on login button")
    public void admin_clicks_on_login_button() {
        WaitUtils.waitFor(1);
        loginPage.loginButton.click();
    }
    @Given("admin clicks on menu button")
    public void admin_clicks_on_menu_button() {
        WaitUtils.waitFor(1);
        adminMngPage.menuButton.click();
    }
    @Given("admin clicks guest user link")
    public void admin_clicks_guest_user_link() {
        WaitUtils.waitFor(1);
        menuPage.guestUserButton.click();
    }
    @Given("admin validates guest user list text on the page")
    public void admin_validates_guest_user_list_text_on_the_page() {
        WaitUtils.waitFor(1);
        assertTrue(guestUserPage.guestUserListTxt.isDisplayed());
    }
    @Given("admin deletes information on the guest user list")
    public void admin_deletes_information_on_the_guest_user_list() {

    }

}
