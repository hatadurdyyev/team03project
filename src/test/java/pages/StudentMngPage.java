package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentMngPage {

    public StudentMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /*  -- sample --
    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginLink;
     */

    @FindBy(id = "advisorTeacherId")
    public WebElement addStudentChooseTeacherDropdwon;
    @FindBy(id = "name")
    public WebElement addStudentNameTextBox;
    @FindBy(id = "surname")
    public WebElement addStudentSurnameTextBox;
    @FindBy(id = "birthPlace")
    public WebElement addStudentBirthPlaceTextBox;
    @FindBy(id = "email")
    public WebElement addStudentEmailTextBox;
    @FindBy(id = "phoneNumber")
    public WebElement addStudentPhoneNumberTextBox;
    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement genderFemaleButton;
    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement genderMaleButton;
    @FindBy(id = "birthDay")
    public WebElement gateOfBirthTextBox;
    @FindBy(id = "ssn")
    public WebElement snnTextBox;
    @FindBy(id = "username")
    public WebElement usernameTextBox;
    @FindBy(id = "password")
    public WebElement passwordTextBox;
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;



}
