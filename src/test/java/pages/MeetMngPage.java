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



}
