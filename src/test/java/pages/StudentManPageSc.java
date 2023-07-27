package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentManPageSc {
    public StudentManPageSc() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(xpath = "//*[text()='Menu']")
        public WebElement menuBttn;
        @FindBy(xpath = "//a[text()='Choose Lesson']")
        public WebElement chooseLssn;
        @FindBy(xpath = "//a[text()='Grades and Announcements']")
        public WebElement gradesAnno;


        @FindBy(xpath = "//th[text()='Teacher']")
        public WebElement teacher;
        @FindBy(xpath = "(//th[text()='Day'])[1]")
        public WebElement day;
        @FindBy(xpath = "(//th[text()='Start Time'])[1]")
        public WebElement startTime;
        @FindBy(xpath = "(//th[text()='Stop Time'])[1]")
        public WebElement stopTime;


        @FindBy(xpath ="//input[@value='1222']")
        public WebElement firstChck;
        @FindBy(xpath ="//input[@value='4']")
        public WebElement secChck;
        @FindBy(xpath ="//input[@value='5']")
        public WebElement thirdChck;
        @FindBy(xpath ="//input[@value='6']")
        public WebElement forthChck;
        @FindBy(xpath ="//input[@value='2227']")
        public WebElement last1Chck;
        @FindBy(xpath ="//input[@value='2209']")
        public WebElement last2ChckStacklessPythonMonday;
        @FindBy(xpath ="//input[@value='2203']")
        public WebElement last3Chck;
        @FindBy(xpath ="//input[@value='2036']")
        public WebElement last4ChckDeutsch0409Monday;



        @FindBy(xpath ="//button[text()='Submit']")
        public WebElement submit;

        @FindBy(xpath ="(((//div[@class='table-responsive'])[2])/table/tbody/tr/td/span)[1]")
        public WebElement programListChck;

        @FindBy(xpath = "//delete")              //no such a Delete button (bug)
        public WebElement deleteLesson;

        @FindBy(xpath = "//*[@role='alert']/div[2]")
        public WebElement popup;

        @FindBy(xpath = "//span[text()='Java']")
        public WebElement java;

        @FindBy(xpath = "(//tbody[@class='table-group-divider'])[2]/tr/td/span")
        public WebElement meeting;

}
