package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminPage {
    public AdminPage() {PageFactory.initElements(Driver.getDriver(), this);
    }










































    //Fatma Ka
    @FindBy(xpath = "//h5[@class='fw-bold p-3 card-header']")
    public WebElement adminVisibilityFK;


    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement nameInputFK;

    @FindBy(xpath = "//input[@placeholder='Surname']")
    public WebElement surnameInputFK;


    @FindBy(xpath = "//input[@placeholder='Birth Place']")
    public WebElement birthPlaceFK;


    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleGenderFK;


    @FindBy(xpath = "//input[@type='date']")
    public WebElement dateFK;

    @FindBy(id ="phoneNumber")
    public WebElement phoneNoFK;

    @FindBy(id ="ssn")
    public WebElement ssnFK;

    @FindBy(id ="username")
    public WebElement usernameFK;

    @FindBy(id ="password")
    public WebElement passwordFK;

    @FindBy(xpath ="//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButtonFK;


    @FindBy(xpath ="//div[.='Admin Saved']")
    public WebElement adminSavedMessageFK;


    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[1]")
    public WebElement requiredMessage1FK;

    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[2]")
    public WebElement requiredMessage2FK;

    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[3]")
    public WebElement requiredMessage3FK;


    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[4]")
    public WebElement requiredMessage4FK;


    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[5]")
    public WebElement requiredMessage5FK;


    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[6]")
    public WebElement requiredMessage6FK; //min 11 char for ssn

    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[7]")
    public WebElement requiredMessage7FK;


    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[8]")
    public WebElement requiredMessage8FK;

    @FindBy(xpath = "//div[.='Please enter valid SSN number']")
    public WebElement enterValidSSNFK;
//Fatma Ka







}


































