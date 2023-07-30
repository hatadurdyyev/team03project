package pages;

import io.cucumber.java.de.Wenn;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentInfoManagementPage {

    public StudentInfoManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "lessonId")
    public WebElement chooseLessonDropDown;
    @FindBy(id = "studentId")
    public WebElement chooseStudentDropDown;
    @FindBy(id = "educationTermId")
    public WebElement chooseEducationTermDropDown;
    @FindBy(id = "absentee")
    public WebElement absenteeTextBox;
    @FindBy(id = "midtermExam")
    public WebElement midtermExamTextBox;
    @FindBy(id = "finalExam")
    public WebElement finalExamTextBox;
    @FindBy(id = "infoNote")
    public WebElement infoNoteTextBox;
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;
    @FindBy(xpath="//*[@id=\"2\"]/div[1]/div[2]")
    public WebElement savedSuccessfully;



}






