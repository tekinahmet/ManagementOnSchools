package stepDefinitions.UI_StepDefinitions.US_09_19_sibel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import org.openqa.selenium.Keys;
import pages.TeacherPage;
import utilities.JSUtils;
import utilities.WaitUtils;


public class US19StepDefs {
    TeacherPage teacherPage = new TeacherPage();
    @Given("Click Menu from right top off the page in teacher pageSY")
    public void clickMenuSY() {
      teacherPage.menuSY.click();
    }
    @Given("Click Meet Management from the Left Menu BarSY")
    public void clickMeetManagementSY() {
        teacherPage.meetManagementSY.click();
    }
    @Given("Click Dropdown from Student ListSY")
    public void click_dropdown_from_student_listSY() {
       JSUtils.JSclickWithTimeout(teacherPage.selectStudentSY);
       WaitUtils.waitFor(2);

    }
    @And("Set Student name {string} SY")
    public void setStudentNameSY(String studentName) {
       teacherPage.inputStudentSY.sendKeys(studentName,""+Keys.ENTER);
    WaitUtils.waitFor(2);
    }

    @Given("Choose a Valid date From Date of Meet sectionSY")
    public void choose_a_valid_future_date_from_date_of_meet_sectionSY() {
        teacherPage.dateInputSY.sendKeys("04/03/2024");
    }
    @And("Choose an UNValid date From Date of Meet sectionSY")
    public void chooseAnUNValidDateFromDateOfMeetSectionSY() {
        teacherPage.dateInputSY.sendKeys("01/01/2023");

    }
    @Given("enter a start time for the meetingSY")
    public void enter_a_start_time_for_the_meetingSY() {
        teacherPage.timeInputSY.sendKeys("0120");
    }
    @Given("enter valid stop time for meetingSY")
    public void enter_valid_stop_time_a_time_after_the_start_time_for_meetingSY() {
       teacherPage.stopTimeInputSY.sendKeys("0200");
    }
    @And("enter an INVALID stop time which is before the start time for meetingSY")
    public void enterAnInvalidStopTimeWhichIsBeforeTheStartTimeForMeetingSY() {
        teacherPage.stopTimeInputSY.sendKeys("0110");

    }
    @Given("type a Description related to meetingSY")
    public void type_a_description_related_to_meetingSY() {
       teacherPage.descriptionInputSY.sendKeys("Lesson related");
        WaitUtils.waitFor(2);
    }
    @Given("Click Submit ButtonSY")
    public void click_submit_buttonSY() throws InterruptedException {
        JSUtils.JSclickWithTimeout(teacherPage.submitButtonSY);
        Thread.sleep(2000);

    }
    @Then("verify if meeting created successfullySY")
    public void verifyIfMeetingCreatedSuccessfullySY() {
        Assert.assertTrue(teacherPage.successMessageSY.isDisplayed());
    }
    @Then("verify if meeting couldn't created successfullySY")
    public void verifyIfMeetingCouldnTCreatedSuccessfullySY() {
Assert.assertTrue(teacherPage.invalidDateMessageSY.isDisplayed());
    }
    @Then("verify if ERROR message has displayed for timesSY")
    public void verifyIfERRORMessageHasDisplayedForTimesSY() {
        Assert.assertTrue(teacherPage.invalidTimeMessageSY.isDisplayed());
    }

    @Then("Verify if Student selected successfully and visible on the listSY")
    public void verify_if_student_selected_successfully_and_visible_on_the_listSY() {
        Assert.assertTrue(teacherPage.studentNameOnTheListSY.isDisplayed());
    }
    @Then("Verify if Meeting date selected successfully and visibleSY")
    public void verify_if_meeting_date_selected_successfully_and_visibleSY() {
        Assert.assertTrue(teacherPage.meetingDateOnTheListSY.isDisplayed());
    }
    @Then("Verify if Meeting time selected successfully and visibleSY")
    public void verify_if_meeting_time_selected_successfully_and_visibleSY() {
        Assert.assertTrue(teacherPage.startTimeOnTheListSY.isDisplayed());
        Assert.assertTrue(teacherPage.stopTimeOnTheListSY.isDisplayed());
    }
    @Then("verify Description is visible on the created meetingSY")
    public void verify_description_is_visible_on_the_created_meetingSY() {
       Assert.assertTrue(teacherPage.descriptionOnTheListSY.isDisplayed());
    }
    @And("Choose two Students names are {string},{string} SY")
    public void chooseTwoStudentsNamesAreSY(String arg0, String arg1) {
        teacherPage.inputStudentSY.sendKeys(arg0,""+Keys.ENTER);
        teacherPage.inputStudentSY.sendKeys(arg1,""+Keys.ENTER);
        WaitUtils.waitFor(2);

    }



}
