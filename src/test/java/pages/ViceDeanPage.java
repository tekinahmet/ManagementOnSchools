package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanPage {
    public ViceDeanPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    //Mertcan
    //TC_01
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement login_MM;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName_MM;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password_MM;
    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginbutton_MM;
    @FindBy(xpath = "//span[.='TonyStark123")
    public WebElement verifyUsername_MM;
    //TC_02
    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menuButton_MM;
    @FindBy(xpath = "//a[.='Lesson Management']")
    public WebElement lessonmanagament_MM;
    @FindBy(xpath ="//button[.='Lesson Program']")
    public WebElement lessonProgram_MM;
    @FindBy(xpath = "//div[.='Select lesson']")
    public WebElement chooselessonbutton_MM;
    @FindBy(xpath = "//div[.='Java']")
    public WebElement java_MM;
    //TC_03
    @FindBy(xpath = "(//option[.='Choose Education Term'])[2]")
    public WebElement chooseeducationterm_MM;
    @FindBy(xpath = "(//option[.='FALL_SEMESTER'])[1]")
    public WebElement semesterselected_MM;
    @FindBy(xpath = "//option[.='Choose Day']")
    public WebElement chooseday_MM;
    @FindBy(xpath ="//option[.='FRIDAY']")
    public WebElement fridayselected_MM;
    @FindBy(xpath = "//input[@id='startTime']")
    public WebElement starttime_MM;
    @FindBy(xpath = "//input[@id='stopTime']")
    public WebElement stoptime_MM;
    @FindBy(xpath ="(//button[.='Submit'])[3]")
    public WebElement submitButtonlesprog_MM;
























































    //Durdygul 201-300
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginButton_DB;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement loginUserNameBox_DB;
    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement menuButton_DB;
    @FindBy(xpath = "//a[text()='Student Management']")
    public WebElement studentManagement_DB;
    @FindBy(css= "select[class='form-select']")
    public WebElement chooseTeacher_DB;
    @FindBy(css= "#name")
    public WebElement nameBox_DB;
    @FindBy(css= "input#surname")
    public WebElement sunameBox_DB;
    @FindBy(css= "input#birthPlace")
    public WebElement birthPlaceBox_DB;
    @FindBy(css= "input#email")
    public WebElement emailBox_DB;
    @FindBy(css= "input#phoneNumber")
    public WebElement phoneNumberBox_DB;
    @FindBy(css= "input#birthDay")
    public WebElement birthDayBox_DB;
    @FindBy(css= "input#ssn")
    public WebElement ssnBox_DB;
    @FindBy(css= "input#username")
    public WebElement usernameBox_DB;
    @FindBy(css= "input#fatherName")
    public WebElement fatherNameBox_DB;
    @FindBy(css= "input#motherName")
    public WebElement motherNameBox_DB;
    @FindBy(css= "input#password")
    public WebElement passwordBox_DB;
    @FindBy(xpath= "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButton_DB;
    @FindBy(xpath= "(//input[@name='gender'])[1]")
    public WebElement femaleRadioButton_DB;
    @FindBy(xpath= "(//input[@name='gender'])[2]")
    public WebElement maleRadioButton_DB;
    @FindBy(xpath= "//div[text()='Student saved Successfully']")
    public WebElement studentVerify_DB;
    @FindBy(xpath= "(//div[@class='invalid-feedback'])[1]") //(//div[text()='Required'])[1]
    public WebElement requiredName_DB;
    @FindBy(xpath= "(//div[@class='invalid-feedback'])[2]")
    public WebElement requiredSurname_DB;
    @FindBy(xpath= "(//div[@class='invalid-feedback'])[3]")
    public WebElement requiredBirthPlace_DB;
    @FindBy(xpath= "(//div[@class='invalid-feedback'])[4]")
    public WebElement requiredEmail_DB;
    @FindBy(xpath= "(//div[@class='invalid-feedback'])[5]")
    public WebElement requiredPhone_DB;
    @FindBy(xpath= "(//div[@class='invalid-feedback'])[6]")
    public WebElement requiredDateOfBrith_DB;
    @FindBy(xpath= "(//div[@class='invalid-feedback'])[7]")
    public WebElement requiredSsn_DB;
    @FindBy(xpath= "(//div[@class='invalid-feedback'])[8]")
    public WebElement requiredUserName_DB;
    @FindBy(xpath= "(//div[@class='invalid-feedback'])[9]")
    public WebElement requiredFatherName_DB;
    @FindBy(xpath= "(//div[@class='invalid-feedback'])[10]")
    public WebElement requiredMotherName_DB;
    @FindBy(xpath= "(//div[@class='invalid-feedback'])[11]")
    public WebElement requiredPassword_DB;
    @FindBy(xpath= "//div[text()='You have entered an invalid value. Valid values are: MALE, FEMALE']")
    public WebElement assertGender_DB;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement ssnHataYazisi_DB;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement ssnAlreadyRegisterYazisi_DB;














}
