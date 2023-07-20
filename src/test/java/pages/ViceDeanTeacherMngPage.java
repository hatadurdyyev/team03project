package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanTeacherMngPage {

    public  ViceDeanTeacherMngPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//h3[@bg=\"primary\"]")
    public WebElement teacherManagementPageTitle;
    @FindBy(xpath = "//div[@class=' css-19bb58m']")
    public WebElement chooseLessonsY;

    @FindBy(id = "react-select-3-listbox")
    public WebElement chooseLessonsDropdownList;

    @FindBy(xpath = "//div[@class=\" css-1dyz3mf\"]")
    public WebElement lessonSelected;

    @FindBy(id = "name")
    public WebElement teacherName;
    @FindBy(id = "surname")
    public WebElement teacherSurname;
    @FindBy(id = "birthPlace")
    public WebElement teacherBirthplace;
    @FindBy(id = "email")
    public WebElement teacherEmail;
    @FindBy(id = "phoneNumber")
    public WebElement teacherPhoneNumber;
    @FindBy(id = "isAdvisorTeacher")
    public WebElement isAdvisorTeacherCheckBox;
    @FindBy(xpath = "//input[@value=\"FEMALE\"]")
    public WebElement teacherGenderFemale;
    @FindBy(id = "birthDay")
    public WebElement teacherBirthdate;
    @FindBy(id = "ssn")
    public WebElement teacherSsn;
    @FindBy(id = "username")
    public WebElement teacherUsername;
    @FindBy(id = "password")
    public WebElement teacherPassword;

    @FindBy(xpath = "//button[contains(@class, 'fw-semibold')][contains(@class, 'btn')][contains(@class, 'btn-primary')][contains(@class, 'btn-lg')]")
    public WebElement teacherSubmitButton;

    @FindBy(xpath = "//div[.= 'Teacher saved successfully']")
    public WebElement accountCreatedPopUp;

    //required messages for assertion

    @FindBy(xpath = "//div[@class=' css-19bb58m']/following-sibling::div[@class='invalid-feedback']")
    public WebElement chooseLessonsYAssertMessage;

    @FindBy(xpath = "//*[@id = 'name']/following-sibling::div[@class='invalid-feedback']")
    public WebElement teacherNameAssertMessage;
    @FindBy(xpath = "//*[@id = 'surname']/following-sibling::div[@class='invalid-feedback']")
    public WebElement teacherSurnameAssertMessage;
    @FindBy(xpath = "//*[@id = 'birthPlace']/following-sibling::div[@class='invalid-feedback']")
    public WebElement teacherBirthplaceAssertMessage;
    @FindBy(xpath = "//*[@id = 'email']/following-sibling::div[@class='invalid-feedback']")
    public WebElement teacherEmailAssertMessage;
    @FindBy(xpath = "//*[@id = 'phoneNumber']/following-sibling::div[@class='invalid-feedback']")
    public WebElement teacherPhoneNumberAssertMessage;
    @FindBy(xpath = "//*[@id = 'isAdvisorTeacher']/following-sibling::div[@class='invalid-feedback']")
    public WebElement isAdvisorTeacherCheckBoxAssertMessage;
    @FindBy(xpath = "//input[@value=\"FEMALE\"]/following-sibling::div[@class='invalid-feedback']")
    public WebElement teacherGenderFemaleAssertMessage;
    @FindBy(xpath = "//*[@id = 'birthDay']/following-sibling::div[@class='invalid-feedback']")
    public WebElement teacherBirthdateAssertMessage;
    @FindBy(xpath = "//*[@id = 'ssn']/following-sibling::div[@class='invalid-feedback']")
    public WebElement teacherSsnAssertMessage;
    @FindBy(xpath = "//*[@id = 'username']/following-sibling::div[@class='invalid-feedback']")
    public WebElement teacherUsernameAssertMessage;
    @FindBy(xpath = "//*[@id = 'password']/following-sibling::div[@class='invalid-feedback']")
    public WebElement teacherPasswordAssertMessage;

    //@FindBy (xpath = "//*[.=\"You have entered an invalid value. Valid values are: MALE, FEMALE\"]")
    @FindBy(xpath = "(//*[.='You have entered an invalid value. Valid values are: MALE, FEMALE'])[5]")
    public WebElement genderAssertMessage;
    @FindBy(xpath = "//div[.=\"Minimum 11 character (XXX-XX-XXXX)\"]")
    public WebElement ssnMinimum11AssertMessage;

    @FindBy(xpath = "(//*[.='Please enter valid SSN number'])[5]")
    public WebElement validSSNMessage;
    @FindBy(xpath = "//div[.=\"Minimum 8 character\"]")
    public WebElement minimumEightCharactersMessage;

}
