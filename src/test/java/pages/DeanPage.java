package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DeanPage {
    public DeanPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //AHMET 13-60
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signIn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement loginButton;

    @FindBy(xpath = "//span[.='jackdoe159']")
    public WebElement verifyUsername;

    //TC_02
    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menu;
    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logOut;
    @FindBy(xpath = "//button[.='Yes']")
    public WebElement confirmLogOut;
    @FindBy(xpath = "//a[.='Contact Get All']")
    public WebElement verifyContactGetAll;
    @FindBy(xpath = "//a[.='Contact Get All']")
    public WebElement clickContactGetAll;
    @FindBy(xpath = "//h5[.='Contact Message']")
    public WebElement contactMessageHeader;
    @FindBy
    public WebElement deleteButton;
    //TC_03
    @FindBy(xpath = "//th[.='Name']")
    public WebElement verifyName;
    @FindBy(xpath = "//th[.='Email']")
    public WebElement verifyEmail;
    @FindBy(xpath = "//th[.='Date']")
    public WebElement verifyDate;
    @FindBy(xpath = "//th[.='Subject']")
    public WebElement verifySubject;
    @FindBy(xpath = "//th[.='Message']")
    public WebElement verifyMessage;



















































































// Oguzhan 140-230 Dean Page
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginOG;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement DeanNameOG;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement DeanPasswordOG;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement loginButtonOG;


    @FindBy(xpath = "//span[.='Final Project']")
    public WebElement verifyDeanNameOG;

    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menuOG;

    @FindBy(xpath = "//a[text()='Vice Dean Management']")
    public WebElement viceDeanManagementOG;

    @FindBy(xpath = "//h3[@class='fw-bold p-3 card-header' and text()='Vice Dean Management']")
    public WebElement verifyVDManagementPageOG;
    // common use for all test cases
    @FindBy(id = "name")
    public WebElement nameOG;

    @FindBy(id = "surname")
    public WebElement surnameOG;

    @FindBy(id = "birthPlace")
    public WebElement birthPlaceOG;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleOG;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement femaleOG;

    @FindBy(id = "birthDay")
    public WebElement DateOfBirthOG;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumberOG;

    @FindBy(id = "ssn")
    public WebElement ssnNumberOG;

    @FindBy(id = "username")
    public WebElement usernameOG;

    @FindBy(id = "password")
    public WebElement passwordOG;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButtonOG;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logOutOG;

    @FindBy(xpath = "//button[.='Yes']")
    public WebElement confirmLogOutOG;

    @FindBy(xpath ="//div[.='Vice dean Saved']")
    public WebElement savedAlertOG;

    // Type here required alert message
    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement requiredAlertOG;
    // Type here alert SSN
    @FindBy(xpath = "//div[.='Please enter valid SSN number']")
    public WebElement alertSSNOG;
    // At least 8 character alert
    @FindBy(xpath = "//div[@class='invalid-feedback' and text()='At least 8 characters']")
    public WebElement charAlertOG;

    @FindBy(xpath = "//div[@class='invalid-feedback' and text()='One uppercase character']")
    public WebElement upperCaseAlertOG;

    @FindBy(xpath = "//div[@class='invalid-feedback' and text()='One lowercase character']")
    public WebElement lowerCaseAlertOG;

    @FindBy(xpath = "//div[@class='invalid-feedback' and text()='One number']")
    public WebElement oneNumberOG;
}

