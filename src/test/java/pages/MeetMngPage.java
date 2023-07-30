 package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

 public class MeetMngPage {

    public MeetMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    /*  -- sample --
    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginLink;
     */
     @FindBy(xpath = "//div[@class=' css-19bb58m']")
     public WebElement addMeetChooseStudentsButton;
     @FindBy(id = "date")
     public WebElement addMeetDateOfMeetTextBox;
     @FindBy(id = "startTime")
     public WebElement addMeetStartTimeTextBox;
     @FindBy(id = "stopTime")
     public WebElement addMeetStopTimeTextBox;
     @FindBy(id = "description")
     public WebElement addMeetDescriptionTextBox;
     @FindBy(xpath = "//button[text()='Submit']")
     public WebElement addMeetSubmitButton;
     @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[1]")
     public WebElement firstMeetingEditButton;
     @FindBy(xpath = "(//div[@class=' css-19bb58m'])[2]")
     public WebElement editMeetChooseStudentsTextBox;
     @FindBy(xpath = "(//input[@id='date'])[2]")
     public WebElement editMeetDateOfMeetTextBox;
     @FindBy(xpath = "(//input[@id='startTime'])[2]")
     public WebElement editMeetStartTimeTextBox;
     @FindBy(xpath = "(//input[@id='stopTime'])[2]")
     public WebElement editMeetStopTimeTextBox;
     @FindBy(xpath = "(//input[@id='description'])[2]")
     public WebElement editMeetDescriptionTextBox;
     @FindBy(xpath = "(//button[text()='Submit'])[2]")
     public WebElement editMeetSubmitButton;
     @FindBy(xpath = "(//div[text()='Meet Updated Successfully'])[1]")
     public WebElement editMeetMeetUpdatedSuccessfully;
     @FindBy(xpath = "//div[text()='Meet deleted successfully ']")
     public WebElement meetDeletedSuccessfully;
     @FindBy(xpath = "(//button[@class='btn btn-danger'])[1]")
     public WebElement firstDeleteMeetButton;



}
