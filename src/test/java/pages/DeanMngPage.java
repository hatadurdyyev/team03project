package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.Driver;

public class DeanMngPage {

    public DeanMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "//a[text()='Contact Get All']")
    public WebElement contactGetAllButton;

    @FindBy(xpath = "//*[@href='/login']")
    public WebElement loginIconForDnMng;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement loginAdminUsernameForDnMng;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement loginAdminPasswordForDnMng;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary' and @type='button']")
    public WebElement loginButtonForDnMng;

    @FindBy(xpath = "//a[.='Dean Management']")
    public WebElement deanMngOptionButton;

    @FindBy(xpath = "//table//tr[7]//td[6]")
    public WebElement deanFromList;

    @FindBy(xpath = "//table//tr[11]//td[6]")
    public WebElement secondDeanFromList;

    @FindBy(xpath = "(//input[@id='name'])[2]")
    public WebElement newNameInputEditPage;

    @FindBy(xpath = "(//input[@id='surname'])[2]")
    public WebElement newSurnameInputEditPage;

    @FindBy(xpath = "(//input[@id='birthPlace'])[2]")
    public WebElement newBirthPlaceInput;

    @FindBy(xpath = "(//input[@value='FEMALE'])[2]")
    public WebElement genderFemaleRadioButton;

    @FindBy(xpath = "(//input[@value='MALE'])[2]")
    public WebElement genderMaleRadioButton;

    @FindBy(xpath = "(//input[@id='birthDay'])[2]")
    public WebElement newDateOfBirthInput;

    @FindBy(xpath = "(//input[@id='phoneNumber'])[2]")
    public WebElement newPhoneNumberInput;

    @FindBy(xpath = "(//input[@id='ssn'])[2]")
    public WebElement newSsnNumberInput;

    @FindBy(xpath = "(//input[@id='username'])[2]")
    public WebElement newUsernameInputEditPage;

    @FindBy(xpath = "(//input[@id='password'])[2]")
    public WebElement newPasswordInputEditPage;

    @FindBy(xpath = "(//button[.='Submit'])[2]")
    public WebElement editPageSubmitButton;

    @FindBy(xpath = "//div[text()='Dean updated Successful']")
    public WebElement deanUpdtScssMessage;

    @FindBy(xpath = "(//button[@aria-label='Close'])[3]")
    public WebElement crossSignInEditPage;

    @FindBy(xpath = "//h3[text()='Dean Management']")
    public WebElement deanManagementTitleText;

    @FindBy(xpath = "//h5[text()='Dean List']")
    public WebElement deanListTitleText;

    // For add Dean section
    @FindBy(id = "name")
    public WebElement addName;

    @FindBy(id = "surname")
    public WebElement addSurname;

    @FindBy(id = "birthPlace")
    public WebElement addBirthPlace;

    @FindBy(id = "birthDay")
    public WebElement addBirthDay;

    @FindBy(id = "phoneNumber")
    public WebElement addPhoneNumber;

    @FindBy(id = "ssn")
    public WebElement addSSN;

    @FindBy(id = "username")
    public WebElement addUsername;

    @FindBy(id = "password")
    public WebElement addPassword;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitBtn;

    @FindBy(xpath = "//div[.='Dean Saved']")
    public WebElement deanSavedMessage;

}