package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentPage {
    public StudentPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }








    // Emre 20-100
    @FindBy(xpath = "(//*[@role='button'])[6]")
    public WebElement chooseLessontButtonEp;
    @FindBy(xpath = "(//td//span)[1]")
    public WebElement checkBoxBilgisiVerifyEp;
    @FindBy(xpath = "(//td//span)[2]")
    public WebElement lessonBilgisiVerifyEp;
    @FindBy(xpath = "(//tr//td/span)[3]")
    public WebElement teacherBilgisiVerifyEp;
    @FindBy(xpath = "(//td//span)[4]")
    public WebElement dayBilgisiVerifyEp;
    @FindBy(xpath = "(//td//span)[5]")
    public WebElement startTimeBilgisiVerifyEp;
    @FindBy(xpath = "(//td//span)[6]")
    public WebElement stopTimeBilgisiVerifyEp;
    @FindBy(xpath = "(//*[@id='lessonProgramId'])[1]")
    public WebElement checkBoxDersSecmeEp;
    @FindBy(xpath = "(//*[@type='checkbox'])[3]")//--//*[@value='1447']
    public WebElement dersBirEp;
    @FindBy(xpath = "(//*[@type='checkbox'])[4]")
    public WebElement dersIkiEp;
    @FindBy(xpath = "(//*[@type='button'])[5]")
    public WebElement studentSubmitEp;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement mesageVerify1Ep;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement messageVerify2Ep;
    @FindBy(xpath = "(//*[@type='checkbox'])[3]")
    public WebElement ayniGunAyniSaatDersBirEp;
    @FindBy(xpath = "(//*[@type='checkbox'])[60]")
    public WebElement ayniGunAyniSaatDersIkiEp;
    @FindBy(xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement errorMessageDersVerifyEp;
    @FindBy(xpath = "(//*[@class='nav-link'])[7]")
    public WebElement gradesAndAnnouncementEp;
    @FindBy(xpath = "(//tr//span)[3]")
    public WebElement midtermExamEp;
    @FindBy(xpath = "(//tr//span)[4]")
    public WebElement finalExamEp;
    @FindBy(xpath = "(//*[@class='fw-bold p-3 card-header'])[2]")
    public WebElement meetListVerifyEp;
    @FindBy(xpath = "(//tr//td//span)[29]")
    public WebElement dateBilgisiStudentVerifyEp;
    @FindBy(xpath = "(//tr//td//span)[30]")
    public WebElement startTimeBilgisiStudentVerifyEp;
    @FindBy(xpath = "(//tr//td//span)[31]")
    public WebElement stopTimeBilgisiStudentVerifyEp;
    @FindBy(xpath = "(//tr//td//span)[32]")
    public WebElement descriptionBilgisiVerify2Ep;




































    //Durdugül 101-200










}

