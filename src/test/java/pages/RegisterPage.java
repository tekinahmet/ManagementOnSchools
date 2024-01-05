package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {
    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='header_link me-2']")
    public WebElement registerButton_SK;

    //input 1 den 10 name den password a
    @FindBy(css = " #name")    //input[1]
    public WebElement nameKutusu_SK;

    @FindBy(css = "#surname")    //2
    public WebElement surnameKutusu_SK;

    @FindBy(css = "#birthPlace")    //3
    public WebElement birthPlaceKutusu_SK;


    @FindBy(css = "#phoneNumber")   //4
    public WebElement phoneNumberKutusu_SK;


    @FindBy(xpath = "//input[@value='FEMALE']")  //5  erkek 6
    public WebElement genderRadioButtun_SK;

    @FindBy (xpath = "//input[@value='MALE']")
    public WebElement getGenderMaleRadioButtun_SK;
    @FindBy(xpath = "(//input)[7]")
    public WebElement birthDayKutusu_SK;


    @FindBy(xpath = "(//input)[8]")
    public WebElement ssnKutusu_SK;

    @FindBy(xpath = "(//input)[9]")
    public WebElement userNameKutusu_SK;
    @FindBy(xpath = "(//input)[10]")
    public WebElement passwordKutusu_SK;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement registerMaviButton_SK;

    @FindBy(xpath = " (//div[@class='invalid-feedback'])[1]")
    public WebElement nameRequried_SK;

    @FindBy(xpath = " (//div[@class='invalid-feedback'])[2]")
    public WebElement surnameRequried_SK;

    @FindBy(xpath = " (//div[@class='invalid-feedback'])[3]")
    public WebElement birthplaceRequried_SK;

    @FindBy(xpath = " (//div[@class='invalid-feedback'])[4]")
    public WebElement phoneRequried_SK;

    @FindBy(xpath = " (//div[@class='invalid-feedback'])[5]")
    public WebElement birthdayRequried_SK;

    @FindBy(xpath = " (//div[@class='invalid-feedback'])[6]")
    public WebElement ssnRequried_SK;

    @FindBy(xpath = " (//div[@class='invalid-feedback'])[7]")
    public WebElement usernameRequried_SK;

    @FindBy(xpath = " (//div[@class='invalid-feedback'])[8]")
    public WebElement passwordRequried_SK;    //At least 8 characters .. gibi uyari mesajlari ayni locate de

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")   //div[text()='Guest User registered.']
    public WebElement guestUserRegisterYazisi_SK;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement ssnAlreadyRegisterYazisi_SK;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement ssnHataYazisi_SK;

    @FindBy(xpath = "//div[text()='Please enter valid phone number']")
    public WebElement phoneNumberUyari_SK;

    //div[@class="Toastify__toast-body"]  cikan alert in locate
    //div[@role='alert']




}
