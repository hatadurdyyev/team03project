package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.Driver;

public class DeanMngPage {

    public DeanMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "//a[text()='Contact Get All']")
    public WebElement contactGetAllButton;





}
