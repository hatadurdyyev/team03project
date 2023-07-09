package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MenuPage {

    public MenuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /*  -- sample --
    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginLink;
     */
    @FindBy(xpath = "//a[@href='/register']")
    public WebElement registerLink;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginLink;




}
