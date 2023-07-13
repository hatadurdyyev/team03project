package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuestUserPage {
    public GuestUserPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h5[.='Guest User List']")
    public WebElement guestUserListTxt;

//    @FindBy(className = "table table-striped table-bordered table-hover")
//    public WebElement guestUserListTable;

    @FindBy(xpath = "//tbody//tr[1]//td[5]//button")
    public WebElement guestUserListR1C5DeleteBtn;

    @FindBy(xpath = "//tbody//tr[1]//td[4]//span")
    public WebElement guestUserListR1C4UserName;

    @FindBy(xpath = "(//div[.=' Guest User deleted Successful'])[5]")
    public WebElement guestUserDeletedSuccessfulTxt;

}
