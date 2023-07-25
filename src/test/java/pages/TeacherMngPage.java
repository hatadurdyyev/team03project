package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.Arrays;
import java.util.List;

public class TeacherMngPage {


    public TeacherMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /*  -- sample --
    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginLink;
     */


    @FindBy(css = ".table-responsive td span")
    public List <WebElement> tableData;

    @FindBy(css = "button.text-dark")
    public WebElement editButton;

    @FindBy(xpath = "//*[@class='page-item'][1]")
    public WebElement pageNumber;


    @FindBy(css = ".modal-body #midtermExam")
    public WebElement midTermInputField;

    @FindBy(css = ".modal-body #finalExam")
    public WebElement finalExamInputField;

    @FindBy(css = ".modal-footer button")
    public WebElement submitButton;



/*
    List<String> valuesList = Arrays.asList("Dashboard", "Store Manager", "Orders", "Downloads", "Addresses", "Account details", "Wishlist", "Support Tickets", "Followings", "Logout");
    List<WebElement> elements = pearlyVendorHomePage.titles2;
        for (int i = 0; i < elements.size(); i++) {
        System.out.println(elements.get(i).getText());
        ReusableMethods.verifyElementDisplayed(elements.get(i));
        Assert.assertTrue(elements.get(i).getText().equals(valuesList.get(i)));
    }
  */
}
