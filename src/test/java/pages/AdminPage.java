package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminPage {
    public AdminPage() {PageFactory.initElements(Driver.getDriver(), this);
    }










    //Ibrahim 20-100
    @FindBy(xpath = "//*[@*='header_link ms-2']")
    public WebElement loginLinki_IO;
    @FindBy(css = "#username")
    public WebElement userNameKutusu_IO;
    @FindBy(css = "#password")
    public WebElement passwordKutusu_IO;
    @FindBy(xpath = "//button[.='Login']")
    public WebElement logonButonu_IO;
    @FindBy(xpath = "//h3[.='Admin Management']")
    public WebElement adminManagementYazisi_IO;
    @FindBy(css = "#name")
    public WebElement nameKutusu_IO;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement nameKutusuRequiredUyari_IO;
    @FindBy(css = "#surname")
    public WebElement surnameKutusu_IO;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement surnameKutusuRequiredUyari_IO;
    @FindBy(css = "#birthPlace")
    public WebElement birthPlaceKutusu_IO;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement birthplaceKutusuRequiredUyari_IO;
    @FindBy(xpath = "(//*[@type='radio'])[1]")
    public WebElement femaleRadioButonu_IO;
    @FindBy(xpath = "(//*[@type='radio'])[2]")
    public WebElement maleRadioButonu_IO;
    @FindBy(css = "#birthDay")
    public WebElement dateOfBirthKutusu_IO;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement dateOfBirthKutusuRequiredUyari_IO;
    @FindBy(css = "#phoneNumber")
    public WebElement phoneNumberKutusu_IO;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement phoneKutusuRequiredUyari_IO;
    @FindBy(css = "#ssn")
    public WebElement ssnKutusu_IO;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement ssnKutusuRequiredUyari_IO;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement usernameKutusuRequiredUyari_IO;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public WebElement EnterYourPasswordUyari_IO;
    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButonuAdmin_IO;
    @FindBy(xpath = "(//tbody//td)[4]")
    public WebElement ssnKutusuAdminList_IO;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement finalRequiredUyari_IO;

    @FindBy(xpath = "(//*[.='Admin Saved'])[5]")
    public WebElement adminSavedYazisi_IO;

    @FindBy(xpath = "(//*[.='Please enter valid SSN number'])[5]")
    public WebElement pleaseEnterValidSsnNumberUyariYazisi_IO;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[8]")
    public WebElement atLeast8CharactersUyariYazisi_IO;

    @FindBy(xpath = "(//tbody//td)[4]")
    public List<WebElement> ssnKutulariListesi_AdminList_IO;

















































































    //Kenan 101-200
    @FindBy(xpath = "(//*[@class='fw-bold p-3 card-header'])[1]")
    public WebElement adminBasligi;

    @FindBy(xpath = "//*[@aria-controls='offcanvasNavbar-expand-false']")
    public WebElement adminMenuButonKI;

    @FindBy(xpath = "(//*[@role='button'])[12]")
    public WebElement viceDeanSelectKI;

    @FindBy(css = "div[class='Toastify__toast-body']")
    public WebElement viceDeanSavedKI;
    @FindBy(xpath = "(//*[@class='form-label'])[1]")
    public WebElement genderSelectedKI;





}


































