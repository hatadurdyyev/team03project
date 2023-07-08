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





}
