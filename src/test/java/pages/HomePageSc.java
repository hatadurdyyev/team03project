package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePageSc {
    public HomePageSc(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement hpLogin;
    @FindBy(id = "username")
    public WebElement hpUser;
    @FindBy(id = "password")
    public WebElement hpPass;
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement hpLoginBttn;



}