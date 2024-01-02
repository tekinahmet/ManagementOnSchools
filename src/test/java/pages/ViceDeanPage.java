package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanPage {
   public ViceDeanPage() {
      PageFactory.initElements(Driver.getDriver(), this);
   }








































































































   //Mertcan 173-213
   //US_10_mertcan
   //TC_01
   @FindBy(xpath = "//a[@href='/login']")
   public WebElement loginMM;
   @FindBy(xpath = "//input[@id='username']")
   public WebElement userNameMM;
   @FindBy(xpath = "//input[@id='password']")
   public WebElement passwordMM;
   @FindBy(xpath = "//button[.='Login']")
   public WebElement loginbuttonMM;
   @FindBy(xpath = "//span[.='TonyStark123")
   public WebElement verifyUsernameMM;

   //TC_02
   @FindBy(xpath = "//button[.='Menu']")
   public WebElement menuButtonMM;
   @FindBy(xpath = "//a[.='Lesson Management']")
   public WebElement lessonmanagamentMM;
   @FindBy(xpath ="//button[.='Lesson Program']")
   public WebElement lessonProgramMM;
   @FindBy(xpath = "//div[.='Select lesson']")
   public WebElement chooselessonbuttonMM;
   @FindBy(xpath = "//div[.='Java']")
   public WebElement javaMM;

   //TC_03
   @FindBy(xpath = "(//option[.='Choose Education Term'])[2]")
   public WebElement chooseeducationtermMM;
   @FindBy(xpath = "(//option[.='FALL_SEMESTER'])[1]")
   public WebElement semesterselectedMM;
   @FindBy(xpath = "//option[.='Choose Day']")
   public WebElement choosedayMM;
   @FindBy(xpath ="//option[.='FRIDAY']")
   public WebElement fridayselectedMM;
   @FindBy(xpath = "//input[@id='startTime']")
   public WebElement starttimeMM;
   @FindBy(xpath = "//input[@id='stopTime']")
   public WebElement stoptimeMM;
   @FindBy(xpath ="(//button[.='Submit'])[3]")
   public WebElement submitButtonlesprogMM;















































































































































   //Fatma Karmis
   @FindBy(xpath = "(//button[@aria-label='Toggle navigation'])[1]")
   public WebElement menuButtonFK;


   @FindBy(linkText = "Vice Dean Management")
   public WebElement viceDeanFK;


   @FindBy(xpath = "(//h5[@bg='primary'])[1]")
   public WebElement addViceDeanFK;


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

   @FindBy(id = "phoneNumber")
   public WebElement phoneNoFK;

   @FindBy(id = "ssn")
   public WebElement ssnFK;

   @FindBy(id = "username")
   public WebElement usernameFK;

   @FindBy(id = "password")
   public WebElement passwordFK;

   @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']")
   public WebElement submitButtonFK;


   @FindBy(xpath = "//div[.='Vice Dean Saved']")
   public WebElement viceDeanSavedFK;


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

//Fatma Karmis

}