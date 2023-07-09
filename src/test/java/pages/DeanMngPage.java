package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.Driver;
import org.openqa.selenium.support.PageFactory;


public class DeanMngPage {

    public DeanMngPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@href='/login']")
    public WebElement loginIconForDnMng;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement loginAdminUsernameForDnMng;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement loginAdminPasswordForDnMng;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary' and @type='button']")
    public WebElement loginButtonForDnMng;

    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "//a[.='Dean Management']")
    public WebElement deanMngOptionButton;

    @FindBy(xpath = "//table//tr[4]//td[6]")
    public WebElement deanFromList;

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

    @FindBy(xpath = "(//span[@aria-hidden='true'])[3]")
    public WebElement nextPageInDeanList;

    @FindBy(xpath = "(//span[@aria-hidden='true'])[4]")
    public WebElement theLastPageInDeanList;

    @FindBy(xpath = "(//span[@aria-hidden='true'])[1]")
    public WebElement theFirstPageInDeanListButton;

    @FindBy(xpath = "//th[.='Name']")
    public WebElement nameColumn;

    @FindBy(xpath = "//th[.='Gender']")
    public WebElement genderColumn;

    @FindBy(xpath = "//th[.='Phone Number']")
    public WebElement phone_number;

    @FindBy(xpath = "//th[.='Ssn']")
    public WebElement SsnColumn;

    @FindBy(xpath = "//th[.='User Name']")
    public WebElement usernameColumn;






}