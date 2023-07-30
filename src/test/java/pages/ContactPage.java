package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactPage {

    public ContactPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    /*  -- sample --
    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginLink;
     */

    @FindBy(xpath = "//h5[@bg='primary']")
    public WebElement contactMessage;

    @FindBy(xpath = "//th[text()='Name']")
    public WebElement nameSection;

    @FindBy(xpath = "//th[text()='Email']")
    public WebElement emailSection;

    @FindBy(xpath = "//th[text()='Date']")
    public WebElement dateSection;

    @FindBy(xpath = "//th[text()='Subject']")
    public WebElement subjectSection;

    @FindBy(xpath = "//th[text()='Message']")
    public WebElement messageSection;

    @FindBy(xpath = "(//span[text()=.])[3]")
    public WebElement firstMessageNameSection;

    @FindBy(xpath = "(//span[text()=.])[4]")
    public WebElement firstMessageEmailSection;

    @FindBy(xpath = "(//span[text()=.])[5]")
    public WebElement firstMessageDateSection;

    @FindBy(xpath = "(//span[text()=.])[6]")
    public WebElement firstMessageSubjectSection;

    @FindBy(xpath = "(//span[text()=.])[7]")
    public WebElement firstMessageMessageSection;


    @FindBy(id = "name")
    public WebElement yourname;
    @FindBy(id ="email")
    public WebElement email;
    @FindBy(id = "subject")
    public WebElement subject;
    @FindBy(id ="message")
    public WebElement message;
    @FindBy(xpath = "(//button[@type ='button'])[3]")
    public WebElement safeMessage;
    @FindBy(xpath = "//div[text()='Please enter valid email']")
    public WebElement emailErrorAlert;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alert;



}
