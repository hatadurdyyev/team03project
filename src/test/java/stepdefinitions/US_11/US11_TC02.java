package stepdefinitions.US_11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.DeanMngPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ViceDeanMngPage;
import utilities.Driver;

public class US11_TC02 {

    @Test
    public void dropDown() throws InterruptedException {

        Driver.getDriver().get("https://managementonschools.com/");

        HomePage login = new HomePage();
        login.loginHome.click();

        LoginPage loginPage = new LoginPage();
        loginPage.userName.sendKeys("zeyneb_");
        loginPage.password.sendKeys("zeyneb123");
        loginPage.loginButton.click();

        DeanMngPage deanMngPage = new DeanMngPage();
        deanMngPage.menuButton.click();

        ViceDeanMngPage lessonManagement = new ViceDeanMngPage();
        lessonManagement.lessonManagementLink.click();
        lessonManagement.lessonProgram.click();

        lessonManagement.chooseLessons.sendKeys("Java" + Keys.ENTER);


        Select select = new Select(lessonManagement.chooseDay);
        Thread.sleep(2000);
        select.selectByIndex(4);

        Select select1 = new Select(lessonManagement.eduTerm);
        Thread.sleep(2000);
        select1.selectByIndex(4);

        lessonManagement.startTime.sendKeys("0837AM");
        lessonManagement.stopTime.sendKeys("848AM");

        lessonManagement.submitButton.click();















    }
}
