package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.*;
import utilities.Driver;

import java.security.Key;

public class LessonsStepDefs {

    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();
    MenuPage menuPage=new MenuPage();
    DeanMngPage deanMngPage=new DeanMngPage();

    LessonMngPage lessonMngPage=new LessonMngPage();


    @Given("The user go to {string}")
    public void theUserGoTo(String Url) {

        Driver.getDriver().get(Url);

    }

    @When("The user clicks Login button")
    public void theUserClicksLoginButton() {
        loginPage.loginButton.click();//burayi degistir

    }

    @Then("The user enter the vice dean’s username")
    public void theUserEnterTheViceDeanSUsername() {
        loginPage.userName.sendKeys("Project09Admin", Keys.ENTER);


    }

    @And("The user enter the vice dean’s password")
    public void theUserEnterTheViceDeanSPassword() {
        loginPage.password.sendKeys("12345678",Keys.ENTER);

    }

    @And("The user click firstLogin button")
    public void theUserClickFirstLoginButton() {
        loginPage.loginButton.click();

    }

    @And("The user click  on the menu button")
    public void theUserClickOnTheMenuButton() {
        deanMngPage.menuButton.click();


    }

    @And("The user  click Lesson Management on the main page")
    public void theUserClickLessonManagementOnTheMainPage() {
        menuPage.lessonManagementButton.click();

    }

    @And("The user click Lessons")
    public void theUserClickLessons() {
        lessonMngPage.lessonButton.click();


    }

    @Given("The user view Lesson Name,Compulsory and Credit Score")
    public void theUserViewLessonNameCompulsoryAndCreditScore() {



    }

    @Given("The user click delete button")
    public void theUserClickDeleteButton() {



    }

    @And("The user close the page")
    public void theUserCloseThePage() {

    }

    @Given("The user click first lesson")
    public void theUserClickFirstLesson() {
    }
}
