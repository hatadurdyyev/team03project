package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherMngPage {

    public TeacherMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /*  -- sample --
    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginLink;
     */

    @FindBy(xpath = "//a[.='Meet Management']")
    public WebElement meetMngPageButton;

    @FindBy(xpath = "//div[text()='Select Students']")
    public WebElement selectStdDropDown;

    @FindBy(xpath = "//input[@type='date']")
    public WebElement dateOfMeetInput;




}
