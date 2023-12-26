package pages;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.List;
import static org.junit.Assert.assertTrue;
import javax.swing.plaf.PanelUI;
import java.util.List;

public class LessonPage {
    public static ReusableMethods studentContact;
    public WebElement editSubmitVerifyEp;
    public WebElement Update;

    public LessonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //Saadet 20-100
    public @FindBy(xpath = "(//*[@class='nav-link'])[8]")
    WebElement LessonManagementButonuSo;

    public @FindBy(xpath = "//*[@id='controlled-tab-example-tab-lessonsList']")
    WebElement LessonButonuSo;
    public @FindBy(xpath = "//*[@id='lessonName']")
    WebElement LessonNameKutusuSo;
    public @FindBy(xpath = "//*[@type='checkbox']")
    WebElement CompulsoryKutusuSo;
    public @FindBy(xpath = "//*[@id='creditScore']")
    WebElement CreditScoreKutusuSo;
    public @FindBy(xpath = "(//button[@type='button'])[9]")
    WebElement SubmitButonuSo;
    public @FindBy(xpath = "//div[@id='controlled-tab-example-tabpane-lessonsList']//span[text()='»']")
    WebElement dersListesiIlerlemeButonuSo;
    @FindBy(xpath = "//th[text()=‘Lesson Name’]")
    public List<WebElement> tumLessonNames;

    @FindBy(xpath = "(//tbody[@class='table-group-divider'])[2]/tr/td[2]")
    public List<WebElement> tumCompulsoriealanlari;

    @FindBy(xpath = "(//tbody[@class='table-group-divider'])[2]/tr/td[3]")
    public List<WebElement> tumCreditScorealanlari;
    @FindBy(xpath = "(//table)[2]")
    public WebElement lessonList;
    @FindBy(xpath = "(//*[@class='fa-solid fa-trash'])[10]")
    public WebElement lessonDelete;

     @FindBy(xpath = " (//tbody[@class='table-group-divider'])[2]//tr[last()]")
    public WebElement eklenenSonDers;

    @FindBy(xpath = "//*[@id='lessonName']")
    public WebElement lessonName;

    @FindBy(xpath = "//div[@id='controlled-tab-example-tabpane-lessonsList']//div[@class='mt-5 ms-3 me-3 text-center border border-3 shadow-sm bg-body rounded card border-warning']//table//tbody//tr//td")
    public List<WebElement> dersListesi;

    @FindBy(xpath = "//*[@class='Toastify__toast-icon Toastify--animate-icon Toastify__zoom-enter']")
    public WebElement lessonDeleted;
    @FindBy(xpath = "//*[text()='Lesson Created']")
    public WebElement alert;

    @FindBy(xpath = "(//*[text()='›'])[2]")
    public WebElement birSonrakiSayfaButonu;

    @FindBy(xpath = "(//button[@class='btn btn-danger'])[last()]")
    public WebElement sonDersiSilmeButonu;

































  //Yasemin 101-200
    @FindBy(xpath = "(//*[@class='nav-link'])[8]")
    public WebElement lessonManagementY;
    @FindBy(xpath = "//*[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement lessonProgramY;
    @FindBy(xpath = "//*[@class=' css-19bb58m']")
    public WebElement selectLessonY;
    @FindBy(xpath = "//*[@id='educationTermId']")
    public WebElement educationTermY;
    @FindBy(xpath = "//*[@id='day']")
    public WebElement chooseDayY;
    @FindBy(xpath = "//*[@id='startTime']")
    public WebElement startTimeY;
    @FindBy(xpath = "//*[@id='stopTime']")
    public WebElement stopTimeY;
    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[3]")
    public WebElement buttonSubmitY;

    /*@FindBy(xpath = "(//div)[95]")
    public WebElement submitButonY;*/
    @FindBy(xpath = "//*[@id='teacherId']")
    public WebElement teacherY;
    //@FindBy(css = "div[class='Toastify__toast-container Toastify__toast-container--top-center']")
   // public WebElement createdLessonProgY;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement createdLessonProgY;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement alertEduTermY;
    @FindBy(xpath = "(//div)[136]")
    public WebElement lessonNotEmptyY;
    @FindBy(xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement alertDayY;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement errorTimeY;
    @FindBy(xpath = " //*[@class=' css-9jq23d']")
    public WebElement topologyDisplayY;
    @FindBy(xpath = "//*[@class='table-responsive']")
    public WebElement lessonDisplayY;
    @FindBy(xpath = "(//div)[182]")
    public WebElement lastLineY;
    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click']")
    public WebElement addedTeacherY;
    @FindBy(xpath = "(//*[@class='col'])[15]")
    public WebElement chooseTeacherY;
    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click']")
    public WebElement timeUyariY;
    @FindBy(xpath = "(//*[@class='form-check-input'])[48]")
    public WebElement chooseButtonY;
    @FindBy(xpath = "(//*[@class='form-check-input'])[150]")
    public WebElement lastChooseLessonButtonY;
    @FindBy(xpath = "//*[@class=' mb-3 mt-4 col']")
    public WebElement submitButtonSonY;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[7]")
    public WebElement requiredY;


















































//Mustafa 201-300

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButton;

    @FindBy(id = "controlled-tab-example-tab-lessonsList")
    public WebElement lessonsButton;
    @FindBy(id="controlled-tab-example-tab-lessonProgram")
    public WebElement lessonProgramButton;
    @FindBy(xpath = "//*[@class=' css-19bb58m']")
    public WebElement dersAdi;
    @FindBy(id="educationTermId")
    public WebElement donem;
    @FindBy(id="day")
    public WebElement day;
    @FindBy(id="startTime")
    public WebElement start;
    @FindBy(id="stopTime")
    public WebElement stop;
    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement vdProgramButton;
    @FindBy(xpath = "//*[@id='controlled-tab-example-tabpane-lessonProgram']/div[2]/div[2]/div/div/table/thead/tr")
    public List<WebElement> lessonProgramListHeader;
    @FindBy(xpath = "(//table)[3]//tr[2]//td[1]")
    public WebElement dersIsmiGorunur;
    @FindBy(xpath = "(//table)[3]//tr[2]//td[2]")
    public WebElement dayGorunur;
    @FindBy(xpath = "(//table)[3]//tr[2]//td[3]")
    public WebElement startTimeGorunur;
    @FindBy(xpath = "(//table)[3]//tr[2]//td[4]")
    public WebElement stopTimeGorunur;


    }

