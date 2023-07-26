package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherMngPage {

    public TeacherMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Meet Management']")
    public WebElement meetMngPageButton;

    @FindBy(xpath = "(//div[@class=' css-19bb58m'])[1]")
    public WebElement chooseStdDropDown;

    @FindBy(xpath = "(//div[text()='Kemal ARZU'])[0]")
    public WebElement anyStudent;

    @FindBy(xpath = "//*[@id='date']")
    public WebElement dateOfMeet;

    @FindBy(xpath = "//*[@id='startTime']")
    public WebElement startTimeInput;

    @FindBy(xpath = "(//input[@id='stopTime'])[1]")
    public WebElement stopTimeInput;

    @FindBy(xpath = "//*[@id='description']")
    public WebElement descriptionInput;

    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement submitButtonTchrMng;

    @FindBy(xpath = "//div[text()='Meet Saved Successfully']")
    public WebElement meetSavedTextMessage;

    @FindBy(xpath = "//div[text()='must be a future date']")
    public WebElement futureDateErrorAlert;

    @FindBy(xpath = "//div[text()='Error: start time must not be greater than or equal to stop time']")
    public WebElement startStopTimeErrorAlert;



}
