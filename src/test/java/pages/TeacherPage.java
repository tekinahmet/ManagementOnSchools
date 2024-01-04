package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TeacherPage {
    public TeacherPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //AHMET 15-70
    //TC_01
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginButton;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement login;
    @FindBy(xpath = "//span[.='teacherdonald']")
    public WebElement verifyUsername;
    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menu;
    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logout;
    @FindBy(xpath = "//button[.='Yes']")
    public WebElement confirmLogout;
    //TC_02
    @FindBy(xpath = "//select[@id='lessonId']")
    public WebElement chooseLesson;
    @FindBy(xpath = "//select[@id='studentId']")
    public WebElement chooseStudent;
    @FindBy(xpath = "//select[@id='educationTermId']")
    public WebElement educationTerm;
    //TC_03
    @FindBy(xpath = "//input[@id='absentee']")
    public WebElement absentee;
    @FindBy(xpath = "//input[@id='midtermExam']")
    public WebElement midtermExam;
    @FindBy(xpath = "//input[@id='finalExam']")
    public WebElement finalExam;
    @FindBy(xpath = "//input[@id='infoNote']")
    public WebElement infoNote;
    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//span[.='Jmeter']")
    public WebElement verifyLessonName;
    @FindBy(xpath = "//div[.='Please select lesson']")
    public WebElement verifyLesson;
    @FindBy(xpath = "//div[.='Please select student']")
    public WebElement verifyStudent;
    @FindBy(xpath = "//div[.='Please select education term ']")
    public WebElement verifyTerm;
    @FindBy(xpath = "//div[.='Required']")
    public WebElement verifyAbsenteeRequired;
    @FindBy(xpath = "//div[.='Required']")
    public WebElement verifyMidtermExamRequired;
    @FindBy(xpath = "//div[.='Required']")
    public WebElement verifyFinalExamRequired;
    @FindBy(xpath = "//div[.='Required']")
    public WebElement verifyInfoNoteRequired;













    //Mertcan
    //TC_01
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement login_MM_;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName_MM_;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password_MM_;
    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginbutton_MM_;
    @FindBy(xpath = "//span[.='teachermartin")
    public WebElement verifyUsername_MM_;
    //TC_02-TC_03
    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menuButton_MM_;
    @FindBy(xpath = "//a[.='Meet Management']")
    public WebElement meetmanagement_MM_;
    @FindBy(xpath = "//div[@class='table-responsive']//tr[1]//td[1]")
    public WebElement studentName_MM_;
    @FindBy(xpath = "//div[@class='table-responsive']//tr[1]//td[2]")
    public WebElement meetingDate_MM_;
    @FindBy(xpath = "//div[@class='table-responsive']//tr[1]//td[3]")
    public WebElement startTime_MM_;
    @FindBy(xpath = "//div[@class='table-responsive']//tr[1]//td[4]")
    public WebElement stopTime_MM_;
    @FindBy(xpath = "//div[@class='table-responsive']//tr[1]//td[5]")
    public WebElement description_MM_;
    @FindBy(xpath = "//button[.='  Edit']")
    public WebElement editButton_MM_;
    @FindBy(xpath = "//div[@aria-label='Remove Aa12 Aa12']")
    public WebElement deletestudent_MM_;
    @FindBy(xpath = "//div[.='Select Students02']")
    public WebElement selectstudent_MM_;
    @FindBy(xpath = "//div[.='Aaaa12 Aaaa12']")
    public WebElement addnewstudent_MM_;
    @FindBy(xpath = "(//input[@id='date'])[2]")
    public WebElement dateofmeet_MM_;
    @FindBy(xpath = "(//input[@id='startTime'])[2]")
    public WebElement changedstarttime_MM_;
    @FindBy(xpath = "(//input[@id='stopTime'])[2]")
    public WebElement changedstoptime_MM_;
    @FindBy(xpath = "(//input[@id='description'])[2]")
    public WebElement changedescp_MM_;
    @FindBy(xpath = "(//button[.='Submit'])[2]")
    public WebElement changedsubmitb_MM_;
    @FindBy(xpath = "(//button[@aria-label='Close'])[3]")
    public WebElement closebutton_MM_;





















































    //Melik 180-215
    @FindBy(xpath = "//h5[.='Add Teacher']")
    public WebElement teacherText_MS;

    @FindBy(xpath = "(//input)[14]")
    public WebElement chooseLessons_MS;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(xpath = "//tbody[@class='table-group-divider']//tr[18]//td[4]")
    public WebElement verifyTeacherCreated_MS;

    @FindBy(xpath = "(//span//button[@type='button'])[18]")
    public WebElement editButton_MS;

    @FindBy(xpath = "//div[.='Teacher updated Successful']")
    public WebElement alertForUpdated_MS;

    @FindBy(xpath = "//*[@class='form-control is-invalid']")
    public WebElement passwordforTeacher_MS;

    @FindBy(xpath = "(//*[@class='form-check-input'])[4]")
    public WebElement advisorTeacher_MS;

    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement submitButtonForTeacher_MS;








}
