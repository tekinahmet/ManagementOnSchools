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


}
