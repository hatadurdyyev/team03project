package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminMngPage {

    public AdminMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /*  -- sample --
    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginLink;
     */

    //https://managementonschools.com/admin-management

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButton;
    @FindBy(xpath = "//img[@src='/static/media/logo.631e4888a6e3684fc004.png']")
    public WebElement logoButton;
    @FindBy(xpath = "//a[text()='Home']")
    public WebElement homeButton;
    @FindBy(xpath = "//a[text()='Courses']")
    public WebElement coursesButton;
    @FindBy(xpath = "//a[text()='Events']")
    public WebElement eventsButton;
    @FindBy(xpath = "//a[text()='Blog']")
    public WebElement blogButton;
    @FindBy(xpath = "//a[text()='Contact']")
    public WebElement contactButton;
    @FindBy(id = "name")
    public WebElement addAdminNameTextBox;
    @FindBy(id = "surname")
    public WebElement addAdminSurnameTextBox;
    @FindBy(id = "birthPlace")
    public WebElement addAdminBirthPlaceTextBox;
    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement addAdminFemaleButton;
    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement addAdminMaleButton;
    @FindBy(id ="birthDay" )
    public WebElement addAdminBirthdayTextBox;
    @FindBy(id = "phoneNumber")
    public WebElement addAdminPhoneNumberTextBox;
    @FindBy(id = "ssn")
    public WebElement addAdminSsnTextBox;
    @FindBy(id = "username")
    public WebElement addAdminUsernameTextBox;
    @FindBy(id = "password")
    public WebElement addAdminPasswordTextBox;
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement addAdminSubmitButton;







}
