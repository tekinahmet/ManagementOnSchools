package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanPage {




    public ViceDeanPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }












    //Kenan 20-100




















































































//Mustafa

    public static WebElement contactEmail;
    public WebElement loginUserNameBox;
    public WebElement loginButton;

    public static WebElement contactName;
    public static WebElement contactDate;

    public static WebElement contactSubject;

    public static WebElement contactMessage;
    public static WebElement deleteButon;




    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement lessonProgram;
    @FindBy(id = "react-select-2-input")
    public WebElement chooseLessonsInLessonProgramasViceDean;
    @FindBy(xpath = "//select[@class='mt-5 form-select']")
    public WebElement chooseEducationTermInLessonProgramasViceDean;
    @FindBy(xpath = "(//option[@class='fw-semibold m-2'])[2]")
    public WebElement chooseSPRING_SEMESTERInEducationTermInLessonProgramasViceDean;

    @FindBy(xpath = "//select[@class='mb-3 form-select']")
    public WebElement chooseDayInLessonProgramasViceDean;
    @FindBy(xpath = "//*[text()='MONDAY']")
    public WebElement chooseMondayInLessonProgramasViceDean;
    @FindBy(xpath = "//*[@id='startTime']")
    public WebElement chooseStartTimeInLessonProgramasViceDean;
    @FindBy(xpath = "//*[@id='stopTime']")
    public WebElement chooseStopTimeInLessonProgramasViceDean;
    @FindBy(xpath = "(//*[text()='Submit'])[3]") //(//*[@class='fw-semibold btn btn-primary btn-lg'])[4]
    public WebElement submitButtonAddLessonProgram;


    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover'])[3]")
    public WebElement lessonProgramList;

    @FindBy(css = "#controlled-tab-example-tabpane-lessonProgram > div:nth-child(2) > div:nth-child(2) > div > div > table > tbody")
    public WebElement tableInLessonProgram;
    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonProgram\"]/div[2]/div[2]/div/div/table/thead/tr/th[1]")
    public WebElement lessonText;
    @FindBy(xpath = "//*[@class=' css-9jq23d']")
    public WebElement sendedLesson;
    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonProgram\"]/div[2]/div[2]/div/div/table/thead/tr/th[2]")
    public WebElement dayText;
    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonProgram\"]/div[2]/div[2]/div/div/table/thead/tr/th[3]")
    public WebElement startTimeText;
    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonProgram\"]/div[2]/div[2]/div/div/table/thead/tr/th[4]")
    public WebElement stopTimeText;
    @FindBy(xpath = "(//tbody[@class='table-group-divider'])[3]")
    public WebElement lessonProgramListTable;
    @FindBy(xpath = "(//*[@id='lessonProgramId'])[1]")
    public WebElement selectALessonInLessonProgramAssign;



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




    // Oguzhan 215-260 ViceDean Page
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginOg;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement viceDeanNameOg;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement viceDeanPasswordOg;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement loginButtonOg;

    @FindBy(xpath = "//span[.='HankTheVD']")
    public WebElement verifyViceDeanNameOg;

    //TC_02
    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menuOg;

    @FindBy(xpath = "//a[.='Contact Get All']")
    public WebElement clickContactGetAllOg;
    @FindBy(xpath = "//h5[.='Contact Message']")
    public WebElement contactMessageHeaderOg;
    @FindBy
    public WebElement deleteButtonOg;
    //TC_03
    @FindBy(xpath = "//th[.='Name']")
    public WebElement verifyNameOg;
    @FindBy(xpath = "//th[.='Email']")
    public WebElement verifyEmailOg;
    @FindBy(xpath = "//th[.='Date']")
    public WebElement verifyDateOg;
    @FindBy(xpath = "//th[.='Subject']")
    public WebElement verifySubjectOg;
    @FindBy(xpath = "//th[.='Message']")
    public WebElement verifyMessageOg;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logOutOg;
    @FindBy(xpath = "//button[.='Yes']")
    public WebElement confirmLogOutOg;



















































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
