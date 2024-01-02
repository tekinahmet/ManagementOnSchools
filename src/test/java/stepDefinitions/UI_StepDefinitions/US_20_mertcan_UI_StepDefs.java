
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.mertcan.US_20_Teacher_Management_Page;
import utilities.Driver;
import utilities.JSUtils;



import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.WaitUtils.waitFor;

public class US_20_mertcan_UI_StepDefs {
    TeacherPage teacherPage = new TeacherPage

    //TC_01
    @Given("go to homepage_MM_")
    public void go_to_homepage_MM_() {
        Driver.getDriver().get("https://managementonschools.com/");
        waitFor(1);

    }
    @When("click login button_MM_")
    public void click_login_button_MM_() {
        teacherPage.loginbutton.click();
        waitFor(1);

    }
    @When("enter username {string}_MM_")
    public void enter_username_MM_(String string) {
        teacherPage.userName.sendKeys("teacherjane");
        waitFor(1);

    }
    @When("enter password {string}_MM_")
    public void enter_password_MM_(String string) {
        teacherPage.password.sendKeys("janeTeacher9");
        waitFor(1);

    }
    @When("click login_MM_")
    public void click_login_MM_() {
        teacherPage.loginbutton.click();
        waitFor(1);

    }
    @Then("verify User logged in_MM_")
    public void verify_user_logged_in_MM_() {
        assertTrue(teacherPage.verifyUsername.getText().contains("teachermartin"));
        waitFor(1);

    }

    //TC_02
    @Given("click menu _MM_")
    public void click_menu _MM_() {
        teacherPage.menuButton.click();
        waitFor(1);

    }
    @Given("click meet management_MM_")
    public void click_meet_management_MM_() {
        teacherPage.meetmanagement.click();
        waitFor(1);

    }
    @Given("verify date time enter_MM_")
    public void verify_date_time_enter_MM_() {
        Assert.assertTrue(teacherPage.meetingDate.isDisplayed());
        waitFor(1);


    }
    @Given("verify start time enter_MM_")
    public void verify_start_time_enter_MM_() {
        Assert.assertTrue(teacherPage.startTime.isDisplayed());
        waitFor(1);


    }
    @Given("verify stop time enter_MM_")
    public void verify_stop_time_enter_MM_() {
        Assert.assertTrue(teacherPage.stopTime.isDisplayed());
        waitFor(1);

    }
    @Then("verify description enter_MM_")
    public void verify_description_enter_MM_() {
        Assert.assertTrue(teacherPage.description.isDisplayed());
        waitFor(1);

    }
    //TC_03
    @Given("click menu button_MM_")
    public void click_menu_button_MM_() {
        teacherPage.menuButton.click();
        waitFor(1);

    }
    @Given("click meet management button_MM_")
    public void click_meet_management_button_MM_() {
        teacherPage.meetmanagement.click();
        waitFor(1);

    }
    @Given("click edit button_MM_")
    public void click_edit_button_MM_() {
        teacherPage.editButton.click();
        waitFor(1);

    }
    @Given("change date of meet_MM_")
    public void change_date_of_meet_MM_() {
        teacherPage.dateofmeet.sendKeys("15/12/2024");
        waitFor(1);

    }
    @Given("change start time_MM_")
    public void change_start_time_MM_() {
        teacherPage.changedstarttime.sendKeys("08:00PM");
        waitFor(1);

    }
    @Given("change stop time_MM_")
    public void change_stop_time_MM_() {
        teacherPage.changedstoptime.sendKeys("10:00PM");
        waitFor(1);
    }
    @Then("delete description_MM_")
    public void delete_description_MM_() {
        teacherPage.changedescp.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
        waitFor(1);
    }
    @Then("add new description_MM_")
    public void add_new_description_MM_() {
        teacherPage.changedescp.sendKeys("meeting");
        waitFor(1);
    }
    @Then("click changed submit button_MM_")
    public void click_changed_submit_button_MM_(){
        teacherPage.changedsubmitb.click();
        waitFor(1);
    }
    @And("close meeting_MM_")
    public void closeMeeting_MM_() {
        teacherPage.closebutton.click();
        waitFor(1);
    }
    @And("delete meetings_MM_")
    public void deleteMeetings_MM_() {
        int idx = 0;
        List<WebElement> allstudentname = Driver.getDriver().findElements(By.xpath("//table//tbody//tr//td[1]"));
        for (int i = 0; i < allstudentname.size(); i++) {
            if (allstudentname.get(i).getText().equals("ADASGS AGFDSJH")) {
                idx = i;

            }
        }
        WebElement editButtonWE = Driver.getDriver().findElement(By.xpath("(//tbody//tr//td//button)[2]"));
        JSUtils.JSclickWithTimeout(editButtonWE);
    }


}