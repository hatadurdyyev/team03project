package stepdefinitions.US_06_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePageSc;
import pages.ViceDeanManSc;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.MediaUtils;

import java.io.IOException;


public class TC_06_StepDefs_UI {

    HomePageSc homePage = new HomePageSc();
    ViceDeanManSc viceDeanMan = new ViceDeanManSc();



    @Given("user enters all the credentials under given conditions")
    public void user_enters_all_the_credentials_under_given_conditions() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschool_url"));
        MediaUtils.takeScreenshotOfTheEntirePage();
        homePage.hpLogin.click();
        homePage.hpUser.sendKeys(ConfigReader.getProperty("dean_user"));
        homePage.hpPass.sendKeys(ConfigReader.getProperty("dean_pass"));
        homePage.hpLoginBttn.click();
        MediaUtils.takeScreenshotOfTheEntirePage();
        viceDeanMan.vDeanName.sendKeys(ConfigReader.getProperty("vd_name"));
        viceDeanMan.vDeanSurname.sendKeys(ConfigReader.getProperty("vd_surname"));
        viceDeanMan.vDeanBirthPlace.sendKeys(ConfigReader.getProperty("vd_birth_place"));
        viceDeanMan.vDeanGender.click();
        viceDeanMan.vDeanBirthDay.sendKeys(ConfigReader.getProperty("Vd_birth_date"));
        viceDeanMan.vDeanPhoneNumber.sendKeys(ConfigReader.getProperty("vd_phone"));
        viceDeanMan.vDeanSsn.sendKeys(ConfigReader.getProperty("vd_ssn"));
        viceDeanMan.vDeanUsername.sendKeys(ConfigReader.getProperty("vd_username"));
        viceDeanMan.vDeanPassword.sendKeys(ConfigReader.getProperty("vd_password"));
        viceDeanMan.vDeanSubmit.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

    }
    @Given("verify Vice Dean account created")
    public void verify_vice_dean_account_created() throws IOException {
        viceDeanMan.vDeanMenu.click();
        viceDeanMan.vDeanLogout.click();
        viceDeanMan.vDeanYes.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

        homePage.hpUser.sendKeys(ConfigReader.getProperty("vd_username"));
        homePage.hpPass.sendKeys(ConfigReader.getProperty("vd_password"));
        homePage.hpLoginBttn.click();

        WebElement verify = Driver.getDriver().findElement(By.xpath("//span[text()='Hi']"));
        MediaUtils.takeScreenshotOfTheEntirePage();
        Assert.assertTrue(verify.isDisplayed());
    }
    @Then("close the application")
    public void close_the_application() {

    Driver.closeDriver();

    }
    @Given("user enters all the credentials under given conditions but password")
    public void user_enters_all_the_credentials_under_given_conditions_but_password() throws IOException {

        Driver.getDriver().get(ConfigReader.getProperty("managementonschool_url"));
        MediaUtils.takeScreenshotOfTheEntirePage();
        homePage.hpLogin.click();
        homePage.hpUser.sendKeys(ConfigReader.getProperty("dean_user"));
        homePage.hpPass.sendKeys(ConfigReader.getProperty("dean_pass"));
        homePage.hpLoginBttn.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

        viceDeanMan.vDeanName.sendKeys(ConfigReader.getProperty("vd_namef"));
        viceDeanMan.vDeanSurname.sendKeys(ConfigReader.getProperty("vd_surnamef"));
        viceDeanMan.vDeanBirthPlace.sendKeys(ConfigReader.getProperty("vd_birth_placef"));
        viceDeanMan.vDeanGender.click();
        viceDeanMan.vDeanBirthDay.sendKeys(ConfigReader.getProperty("Vd_birth_date"));
        viceDeanMan.vDeanPhoneNumber.sendKeys(ConfigReader.getProperty("vd_phonef"));
        viceDeanMan.vDeanSsn.sendKeys(ConfigReader.getProperty("vd_ssnf"));
        viceDeanMan.vDeanUsername.sendKeys(ConfigReader.getProperty("vd_usernamef"));
        viceDeanMan.vDeanPassword.sendKeys(ConfigReader.getProperty("vd_password"));
        viceDeanMan.vDeanSubmit.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

    }

    @Given("verify if Vice Dean account created")
    public void verify_if_vice_dean_account_created() throws IOException {

        viceDeanMan.vDeanMenu.click();
        viceDeanMan.vDeanLogout.click();
        viceDeanMan.vDeanYes.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

        homePage.hpUser.sendKeys(ConfigReader.getProperty("vd_usernamef"));
        homePage.hpPass.sendKeys(ConfigReader.getProperty("vd_password"));
        homePage.hpLoginBttn.click();

        WebElement verify = Driver.getDriver().findElement(By.xpath("//span[text()='Hi']"));
        MediaUtils.takeScreenshotOfTheEntirePage();
        Assert.assertFalse(verify.isDisplayed());
    }
}
