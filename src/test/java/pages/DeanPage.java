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








    //Melik 65-140
    @FindBy(xpath = "//*[text()='Add Dean']")
    public WebElement addDeanText_MS;

    @FindBy(id = "name")
    public WebElement name_MS;

    @FindBy(id = "surname")
    public WebElement surname_MS;

    @FindBy(id = "birthPlace")
    public WebElement birthPlace_MS;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement male_MS;

    @FindBy(xpath = "//body//div[contains(@role,'dialog')]//div[contains(@class,'row')]//div[contains(@class,'row')]//div[1]//div[1]//input[1]")
    public WebElement female_MS;

    @FindBy(xpath = "//input[@type='date']")
    public WebElement DateOfBirth_MS;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber_MS;

    @FindBy(id = "ssn")
    public WebElement ssnNumber_MS;

    @FindBy(id = "username")
    public WebElement username_MS;

    @FindBy(id = "password")
    public WebElement password_MS;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton_MS;

    @FindBy(xpath = "//div[.='Dean Saved']")
    public WebElement alertForDean_MS;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement verifyName_MS;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement verifySurname_MS;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement verifyBirthPlace_MS;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement verifyDateOfBirth_MS;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement verifyPhoneNumber_MS;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement verifySsnNumber_MS;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement verifyUserName_MS;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public WebElement verifyPassword_MS;

    @FindBy(xpath = "//div[.='Please enter valid SSN number']")
    public WebElement alertForSsn_MS;

    //ZEYNEP 63-133

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginz;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernamez;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordz;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement loginButtonz;

    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menuButtonz;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/a[2]")
    public WebElement deanManagementz;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/thead/tr/th[1]")
    public WebElement nameColumnz;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/thead/tr/th[2]")
    public WebElement genderColumnz;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/thead/tr/th[3]")
    public WebElement phoneNumberColumnz;

    @FindBy(xpath ="//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/thead/tr/th[4]" )
    public WebElement ssnColumnz;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/thead/tr/th[5]")
    public WebElement userNameColumnz;

    //TC03
    @FindBy (xpath = "//button[@class='text-dark btn btn-outline-info']")
    public WebElement editButtonz;

    @FindBy (xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[1]/div/input")
    public WebElement nameFieldz;

    @FindBy (xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[2]/div/input")
    public WebElement surnameFieldz;

    @FindBy (xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[3]/div/input")
    public WebElement birthPlaceFieldz;

    @FindBy (xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[4]/div/div[1]/div/input")
    public WebElement genderOptionz;

    @FindBy (xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[5]/div/input")
    public WebElement dateOfBirthz;

    @FindBy (xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[6]/div/input")
    public WebElement phoneFieldz;

    @FindBy (xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[7]/div/input")
    public WebElement ssnFieldz;

    @FindBy (xpath ="/html/body/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[8]/div/input" )
    public WebElement userNameFiledz;

    @FindBy (xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[9]/div/input")
    public WebElement passwordFieldz;

    @FindBy (xpath = "/html/body/div[3]/div/div/div[2]/div[2]/button")
    public WebElement submitButtonz;

    @FindBy(xpath = "//div[.='Dean updated Successful']")
    public WebElement verifyMessagez;



}
