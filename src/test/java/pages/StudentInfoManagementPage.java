package pages;

import io.cucumber.java.de.Wenn;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentInfoManagementPage {

    @FindBy(id = "lessonId")
    public WebElement chooseLessonDropDown;
    @FindBy(id = "studentId")
    public Wenn chooseStudentDropDown;
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

}
