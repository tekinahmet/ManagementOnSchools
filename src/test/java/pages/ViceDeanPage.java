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



















































// Sibel Start Point *************************************
    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menuSY;

    @FindBy(xpath = "//a[.='Lesson Management']")
    public WebElement lessonManagementSY;

    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonsList']")
    public WebElement lessonListSY;

    @FindBy(xpath = "//div[@id='controlled-tab-example-tabpane-lessonsList']//table//tr[2]//td[1]")
    public WebElement lessonNameOnSecondRowSY;

    @FindBy(xpath = "//div[@id='controlled-tab-example-tabpane-lessonsList']//table//tr[2]//td[2]")
    public WebElement compulsorySecondRowSY;

    @FindBy(xpath = "//div[@id='controlled-tab-example-tabpane-lessonsList']//table//tr[2]//td[3]")
    public WebElement creditScoreSY;

    @FindBy(xpath = "//button[@class='btn btn-danger']")
    public WebElement viceDeleteButtonSY;
    @FindBy(linkText = "Lesson Deleted")
    public WebElement deletedAlert;
    @FindBy(linkText = "Update")
    public WebElement updateButtonSY;
    // Sibel End Point *******************************************


}
