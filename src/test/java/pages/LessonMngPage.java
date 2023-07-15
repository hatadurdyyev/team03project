package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LessonMngPage {

    public LessonMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /*  -- sample --
    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginLink;
     */
    @FindBy(id = "controlled-tab-example-tab-lessonsList")
    public WebElement lessonButton;
    @FindBy(id = "controlled-tab-example-tab-educationTerm")
    public WebElement educationTermButton;
    @FindBy(id = "controlled-tab-example-tab-lessonProgram")
    public WebElement lessonProgramButton;
    @FindBy(id = "term")
    public WebElement addEducationTermChooseEducationTermDropdown;
    @FindBy(id = "startDate")
    public WebElement addEducationTermStartDateTextBox;
    @FindBy(id = "endDate")
    public WebElement addEducationTermEndDateTextBox;
    @FindBy(id = "lastRegistrationDate")
    public WebElement addEducationTermLastRegistrationDateTextBox;
    @FindBy(xpath = "(//button[text()='Submit'])[1]")
    public WebElement addEducationTermSubmitButton;
    @FindBy(id = "lessonName")
    public WebElement addLessonLessonNameTextBox;
    @FindBy(id = "compulsory")
    public WebElement addLessonCompulsoryButton;
    @FindBy(id = "creditScore")
    public WebElement addLessonCreditScoreTextBox;
    @FindBy(xpath = "(//button[text()='Submit'])[2]")
    public WebElement addLessonSubmitButton;
    @FindBy(xpath = "//div[@class=' css-19bb58m']")
    public WebElement addLessonProgramSelectLessonButton;
    @FindBy(id = "educationTermId")
    public WebElement addLessonProgramChooseEducationTermDropdown;
    @FindBy(id = "day")
    public WebElement addLessonProgramChooseDayDropdown;
    @FindBy(id = "startTime")
    public WebElement addLessonProgramStartTimeTextBox;
    @FindBy(id = "stopTime")
    public WebElement addLessonProgramStopTimeTextBox;
    @FindBy(xpath = "(//button[text()='Submit'])[3]")
    public WebElement addLessonProgramSubmitButton;

    @FindBy (xpath="//*[@class='btn btn-danger']")
    public WebElement lessonDeletebutton;

}
