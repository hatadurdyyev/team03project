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
    @FindBy(id = "name")
    public WebElement addDeanNameTextBox;
    @FindBy(id = "surname")
    public WebElement addDeanSurnameTextBox;
    @FindBy(id = "birthPlace")
    public WebElement addDeanBirthPlace;
    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement addDeanGenderFemaleButton;
    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement addDeanGenderMaleButton;
    @FindBy(id = "birthDay")
    public WebElement addDeanDateOfBirthTextBox;
    @FindBy(id = "phoneNumber")
    public WebElement addDeanPhoneNumberTextBox;
    @FindBy(id = "ssn")
    public WebElement addDeanSnnTextBox;
    @FindBy(id = "username")
    public WebElement addDeanUsernameTextBox;
    @FindBy(id = "password")
    public WebElement addDeanPasswordTextBox;
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement addDeanSubmitButton;



}
