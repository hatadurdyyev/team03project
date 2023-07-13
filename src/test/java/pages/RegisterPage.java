package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.Driver;

public class RegisterPage {

    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[text()='Register']")
    public WebElement registerBlueButton;
    @FindBy(id = "name")
    public WebElement nameTextBox;
    @FindBy(id = "surname")
    public WebElement surnameTextBox;
    @FindBy(id = "birthPlace")
    public WebElement birthPlaceTextBox;
    @FindBy(id = "phoneNumber")
    public WebElement phoneNumberTextBox;
    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement genderFemaleButton;
    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement genderMaleButton;
    @FindBy(id = "birthDay")
    public WebElement dateOfBirthTextBox;
    @FindBy(id = "ssn")
    public WebElement snnTextBox;
    @FindBy(id = "username")
    public WebElement usernameTextBox;
    @FindBy(id = "password")
    public WebElement passwordTextBox;



}
