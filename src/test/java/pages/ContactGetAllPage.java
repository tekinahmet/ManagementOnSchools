package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactGetAllPage {

    public ContactGetAllPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[.='Contact']")
    public WebElement contactLink;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "subject")
    public WebElement subject;

    @FindBy(id = "message")
    public WebElement message;

    @FindBy(xpath = "//*[.='Send Message']")
    public WebElement sendMessageButton;

    @FindBy(xpath = "//*[.='Required']")
    public WebElement requiredTextMessage;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement contactCreatedAlertMessage;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement invalidEmailAlertMessage;









}
