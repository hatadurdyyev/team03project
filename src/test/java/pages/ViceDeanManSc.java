package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class ViceDeanManSc {
    public ViceDeanManSc(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="name")
    public WebElement vDeanName;
    @FindBy(id="surname")
    public WebElement vDeanSurname;
    @FindBy(id="birthPlace")
    public WebElement vDeanBirthPlace;
    @FindBy(xpath = "//input[@*='MALE']")
    public WebElement vDeanGender;
    @FindBy(id="birthDay")
    public WebElement vDeanBirthDay;
    @FindBy(id="phoneNumber")
    public WebElement vDeanPhoneNumber;
    @FindBy(id="ssn")
    public WebElement vDeanSsn;
    @FindBy(id="username")
    public WebElement vDeanUsername;
    @FindBy(id="password")
    public WebElement vDeanPassword;
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement vDeanSubmit;
    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement vDeanMenu;
    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement vDeanLogout;
    @FindBy(xpath = "//button[text()='Yes']")
    public WebElement vDeanYes;



}
