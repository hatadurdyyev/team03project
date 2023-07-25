package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /*  -- sample --
    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginLink;
     */

    @FindBy(xpath = "//*[@class='header_link ms-2']")
    public WebElement loginIcon;

    @FindBy(id="username")
    public WebElement userName;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

}
