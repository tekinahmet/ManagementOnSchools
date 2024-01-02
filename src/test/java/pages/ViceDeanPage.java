package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanPage {




    public ViceDeanPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    //ZEYNEP 19-77

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginzz;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernamezz;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordzz;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement loginButtonzz;
    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menuButtonzz;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/a[3]")
    public WebElement studentManagementzz;

    //TC_01

    @FindBy (xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[1]/div[1]/select")
    public WebElement chooseTeacherzz;
    @FindBy (xpath ="/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[1]/div[2]/div/input")
    public WebElement nameFieldzz;

    @FindBy (xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[1]/div[3]/div/input")
    public  WebElement surnameFieldzz;
    @FindBy (xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[2]/div[1]/div/input")
    public  WebElement birthPlaceFieldzz;
    @FindBy (xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[2]/div[2]/div/input")
    public  WebElement emailFieldzz;
    @FindBy (xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[2]/div[3]/div/input")
    public  WebElement phoneNumberFieldzz;
    @FindBy (xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[2]/div[4]/div/div[1]/div/input")
    public  WebElement genderSelectzz;
    @FindBy (xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[2]/div[5]/div/input")
    public  WebElement dateOfBirthzz;
    @FindBy (xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[1]/div/input")
    public  WebElement ssnNumberFieldzz;
    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[2]/div/input")
    public WebElement usernameFieldzz;
    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[3]/div/input")
    public WebElement fatherNameFieldzz;
    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[4]/div/input")
    public WebElement motherNameFieldzz;
    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[5]/div/input")
    public WebElement passwordFieldzz;
    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[6]/div/button")
    public WebElement submitButtonzz;

    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[1]/div[2]/div/div")
    public WebElement invalidMessagezz;

    @FindBy(xpath ="//div[.='Please enter valid SSN number']")
    public WebElement ssnAlertMessagezz;


    @FindBy(xpath = "//div[.='Student saved Successfully']")
    public WebElement savedStudentAlertMessagezz;





}
