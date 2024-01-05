package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GuestUserPage {
    public GuestUserPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#password")
    public WebElement adminPasswoord_SK;
    @FindBy(css = "#username")
    public WebElement adminUserName_SK;
    @FindBy(xpath = " //a[text()='Guest User']")
    public WebElement mainMenuGuestUser_SK;
    @FindBy(xpath = " //h5[text()='Guest User List']")
    public WebElement guestUserListYazisi_SK;
    @FindBy(xpath = " //tbody[@class='table-group-divider']//tr//td[1]")
    public List<WebElement> names_SK;
    @FindBy(xpath = " //tbody[@class='table-group-divider']//tr//td[2]")
    public List<WebElement> phoneNumbers_SK;
    @FindBy(xpath = " //tbody[@class='table-group-divider']//tr//td[3]")
    public List<WebElement> Ssn_SK;
    @FindBy(xpath = " //tbody[@class='table-group-divider']//tr//td[4]")
    public List<WebElement> userNames_SK;
    @FindBy(xpath = " (//button[@class='btn btn-danger'])[1]")
    public WebElement deleteButton_SK;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']")   //div[text()='Guest User registered.']
    public WebElement deletesuccesfullYazisi_SK;












}
