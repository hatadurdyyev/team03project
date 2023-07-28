package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentMngPage {

    public StudentMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // ========================= ADD STUDENT LOCATORS =========================
    @FindBy(id = "advisorTeacherId")
    public WebElement addAdvisorTeacher;

    @FindBy(id = "name")
    public WebElement addName;

    @FindBy(id = "surname")
    public WebElement addSurname;

    @FindBy(id = "birthPlace")
    public WebElement addBirthPlace;

    @FindBy(id = "email")
    public WebElement addEmail;

    @FindBy(id = "phoneNumber")
    public WebElement addPhoneNumber;

    @FindBy(id = "birthDay")
    public WebElement addBirthDay;

    @FindBy(id = "ssn")
    public WebElement addSSN;

    @FindBy(id = "username")
    public WebElement addUsername;

    @FindBy(id = "fatherName")
    public WebElement addFatherName;

    @FindBy(id = "motherName")
    public WebElement addMotherName;

    @FindBy(id = "password")
    public WebElement addPassword;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement addSubmitBtn;

    @FindBy(xpath = "(//div[.='Student saved Successfully'])[5]")
    public WebElement studentSavedSuccessfullyMessage;



    // ========================= STUDENT LIST LOCATORS FOR EDIT =========================
    @FindBy(xpath = "(//button[contains(text(), 'Edit')])[1]")
    public WebElement editBtn;

    @FindBy(xpath = "(//select[@id='advisorTeacherId'])[2]")
    public WebElement editAdvisorTeacher;

    @FindBy(xpath = "(//input[@id='name'])[2]")
    public WebElement editName;

    @FindBy(xpath = "(//input[@id='surname'])[2]")
    public WebElement editSurname;

    @FindBy(xpath = "(//input[@id='birthPlace'])[2]")
    public WebElement editBirthPlace;

    @FindBy(xpath = "(//input[@id='email'])[2]")
    public WebElement editEmail;

    @FindBy(xpath = "(//input[@id='phoneNumber'])[2]")
    public WebElement editPhoneNumber;

    @FindBy(xpath = "(//input[@id='ssn'])[2]")
    public WebElement editSSN;

    @FindBy(xpath = "(//input[@id='birthDay'])[2]")
    public WebElement editBirthDay;

    @FindBy(xpath = "(//input[@id='username'])[2]")
    public WebElement editUsername;

    @FindBy(xpath = "(//input[@id='fatherName'])[2]")
    public WebElement editFatherName;

    @FindBy(xpath = "(//input[@id='motherName'])[2]")
    public WebElement editMotherName;

    @FindBy(xpath = "(//input[@id='password'])[2]")
    public WebElement editPassword;

    @FindBy(xpath = "(//button[.='Submit'])[2]")
    public WebElement editSubmitBtn;

}
