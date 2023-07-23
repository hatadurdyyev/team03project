package stepdefinitions.US_09_StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.*;
import utilities.Driver;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

public class US_09_UI_StepDefs {

    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();
    MenuPage menuPage=new MenuPage();
    DeanMngPage deanMngPage=new DeanMngPage();

    LessonMngPage lessonMngPage=new LessonMngPage();


    @Given("The user go to {string}")
    public void theUserGoTo(String Url) {

        Driver.getDriver().get(Url);

    }

    @Then("The user enter the vice dean’s username")
    public void theUserEnterTheViceDeanSUsername() {
        loginPage.userName.sendKeys("Project09Admin", Keys.ENTER);
        WaitUtils.waitFor(2);


    }

    @And("The user enter the vice dean’s password")
    public void theUserEnterTheViceDeanSPassword() {
        loginPage.password.sendKeys("12345678",Keys.ENTER);
        WaitUtils.waitFor(2);

    }

    @And("The user click firstLogin button")
    public void theUserClickFirstLoginButton() {
        loginPage.loginButton.click();
        WaitUtils.waitFor(2);

    }

    @And("The user click  on the menu button")
    public void theUserClickOnTheMenuButton() {
        deanMngPage.menuButton.click();
        WaitUtils.waitFor(2);


    }

    @And("The user  click Lesson Management on the main page")
    public void theUserClickLessonManagementOnTheMainPage() {
        menuPage.lessonManagementButton.click();
        WaitUtils.waitFor(2);

    }

    @And("The user click Lessons")
    public void theUserClickLessons() {
        lessonMngPage.lessonButton.click();
        WaitUtils.waitFor(2);


    }

    @Given("The user view Lesson Name,Compulsory and Credit Score")
    public void theUserViewLessonNameCompulsoryAndCreditScore() throws IOException {
        MediaUtils.takeScreenshotOfTheEntirePage();



    }

    @Given("The user click delete button")
    public void theUserClickDeleteButton() {
        lessonMngPage.lessonDeletebutton.click();

    }

    @And("The user close the page")
    public void theUserCloseThePage() {

        Driver.closeDriver();

    }

    @Given("The user click first lesson")
    public void theUserClickFirstLesson() {


    }
}