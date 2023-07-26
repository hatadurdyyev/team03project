package stepdefinitions.US_09and23_StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Wait;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

public class LessonsStepDefs {

    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();
    MenuPage menuPage=new MenuPage();
    DeanMngPage deanMngPage=new DeanMngPage();

    LessonMngPage lessonMngPage=new LessonMngPage();

    ViceDeanMngPage viceDeanMngPage=new ViceDeanMngPage();

    ViceDeanManSc viceDeanManSc=new ViceDeanManSc();


    @Given("The user go to {string}")
    public void theUserGoTo(String Url) {

        Driver.getDriver().get(Url);

    }

    @When("The user clicks Login button")
    public void theUserClicksLoginButton() {
       homePage.loginHome.click();
        WaitUtils.waitFor(2);

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

    @And("The user click ViceDeanManagement button")
    public void theUserClickViceDeanManagementButton() {

       menuPage.viceDeanManagementButton.click();






    }

    @And("The admin enter valid name")
    public void theAdminEnterValidName() {

        viceDeanManSc.vDeanName.sendKeys(ConfigReader.getProperty("name"));
        WaitUtils.waitFor(4);



    }

    @And("The admin enter surname")
    public void theAdminEnterSurname() {
        viceDeanManSc.vDeanSurname.sendKeys(ConfigReader.getProperty("surname"));
        WaitUtils.waitFor(4);
    }

    @And("The admin enter Birth Place")
    public void theAdminEnterBirthPlace() {

        viceDeanManSc.vDeanBirthPlace.sendKeys(ConfigReader.getProperty("birth_place"));
        WaitUtils.waitFor(4);

    }

    @And("The admin click gender")
    public void theAdminClickGender() {
        viceDeanManSc.vDeanGender.click();
        WaitUtils.waitFor(4);


    }

    @Then("The admin enter  date of birth")
    public void theAdminEnterDateOfBirth() {
        viceDeanManSc.vDeanBirthDay.sendKeys(ConfigReader.getProperty("birth_date"));
        WaitUtils.waitFor(4);

    }

    @And("admin enter phone number")
    public void adminEnterPhoneNumber() {
        viceDeanManSc.vDeanPhoneNumber.sendKeys(ConfigReader.getProperty("phone"));
        WaitUtils.waitFor(4);
    }

    @And("admin enter ssn")
    public void adminEnterSsn() {
        viceDeanManSc.vDeanSsn.sendKeys(ConfigReader.getProperty("ssn"));
        WaitUtils.waitFor(4);

    }

    @And("admin enter user name")
    public void adminEnterUserName() {
        viceDeanManSc.vDeanUsername.sendKeys(ConfigReader.getProperty("username"));
        WaitUtils.waitFor(4);

    }

    @And("admin enter password")
    public void adminEnterPassword() throws IOException {
        viceDeanManSc.vDeanPassword.sendKeys(ConfigReader.getProperty("password"));
        WaitUtils.waitFor(4);
        MediaUtils.takeScreenshotOfTheEntirePage();


    }

    @And("Admin click submit buton")
    public void adminClickSubmitButon() throws IOException {
        viceDeanManSc.vDeanSubmit.click();
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
}



