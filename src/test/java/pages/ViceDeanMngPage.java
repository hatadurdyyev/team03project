package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanMngPage {

    public ViceDeanMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = " //a[@href='/login']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement viceDeanUserName;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement viceDeanPassWord;

    @FindBy(xpath = " //button[.='Login']")
    public WebElement loginSubmitButton;

    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "//a[.='Lesson Management']")
    public WebElement lessonManagementLink;

    @FindBy(xpath = "//a[.='Teacher Management']")
    public WebElement teacherManagementLink;

    @FindBy(xpath = "//button[.='Lessons']")
    public WebElement lessonsButton;

    @FindBy(xpath = "//a[.='Student Management']")
    public WebElement studentManagementLink;

    @FindBy(xpath = "//a[.='Contact Get All']")
    public WebElement contactGetAllLink;
    @FindBy(xpath = "//a[.='Logout']")

    public WebElement logOutLink;
    @FindBy(id = "controlled-tab-example-tab-educationTerm")

    public WebElement educationTerm;
    @FindBy(id = "controlled-tab-example-tab-lessonsList")
    public WebElement lessonsList;
    @FindBy(id = "lessonName")
    public WebElement lessonName;
    @FindBy(id = "compulsory")
    public WebElement compulsoryCheckBox;
    @FindBy(id = "creditScore")
    public WebElement creditScore;
    @FindBy(xpath = "(//button[.='Submit'])[2]")
    public WebElement AddLessonSubmitButton;
    @FindBy(id = "controlled-tab-example-tab-lessonProgram")
    public WebElement lessonProgram;
    @FindBy(id = "react-select-2-input")
    public WebElement chooseLessons;

    @FindBy(xpath = "//*[@class=' css-b62m3t-container']")
    public WebElement selectLesson;
    @FindBy(xpath = "//*[@class=' css-9jq23d']")
    public WebElement cypress;
    @FindBy(xpath = "//*[@id='react-select-2-listbox']/div[1]")
    public WebElement cypress2;
    @FindBy(xpath = "//select[@id='day']")
    public WebElement chooseDay;
    @FindBy(xpath = "(//*[@value='TUESDAY'])[1]")
    public  WebElement tuesday;
    @FindBy(id = "educationTermId")
    public WebElement eduTerm;

    @FindBy(xpath = "(//*[@value='2'])[1]")
    public  WebElement springSemester;

    @FindBy(id = "startTime")
    public WebElement startTime;
    @FindBy(id = "stopTime")
    public WebElement stopTime;

    @FindBy(xpath = "(//button[.='Submit'])[3]")
    public WebElement submitButton;
    @FindBy(id = "lessonProgramId")
    public WebElement chooseLessonCheckBox;
    @FindBy(id = "teacherId")
    public WebElement chooseTeacher;
    @FindBy(xpath = "(//button[.='Submit'])[4]")
    public WebElement teacherAssignmentSubmitButton;


    @FindBy(xpath = "//div[text()='Lesson Created']")
    public WebElement alert;

    @FindBy(css = "[class*='Toastify__toast-body'] div:nth-child(2)")
    public WebElement successMessage;

    @FindBy(xpath = "//div[text()='Lesson Created']")
    public WebElement theFirstLessonCheckBoxButton;






}
