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
