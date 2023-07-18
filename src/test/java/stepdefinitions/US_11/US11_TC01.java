package stepdefinitions.US_11;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.DeanMngPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ViceDeanMngPage;
import utilities.Driver;


public class US11_TC01 {


    @Test
    public void viceDeanTest() throws InterruptedException {

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

        /* i need to verify that i am seeing lesson, day, start time and stop time */

        lessonManagement.chooseLessons.click();

        String t1 = lessonManagement.lessonText.getText();
        System.out.println(t1);

        if(t1.equals("Lesson")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("EXPECTED TITLE : Lesson ");
        }

        String t2 = lessonManagement.dayText.getText();
        System.out.println(t2);

        if(t2.equals("Day")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("EXPECTED TITLE : Day ");
        }

        String t3 = lessonManagement.startTimeText.getText();
        System.out.println(t3);

        if(t3.equals("Start Time")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("EXPECTED TITLE : Start Time");
        }

        String t4 = lessonManagement.stopTimeText.getText();
        System.out.println(t4);

        if(t4.equals("Stop Time")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("EXPECTED TITLE : Stop Time ");
        }


































    }
}
