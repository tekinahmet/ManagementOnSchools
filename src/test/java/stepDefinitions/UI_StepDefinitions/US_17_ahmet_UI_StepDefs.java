package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_17_ahmet_UI_StepDefs {
    TeacherPage teacherPage = new TeacherPage();

    //background
    @Given("navigate to homepage_US_17")
    public void navigate_to_homepage_US_17() {
        Driver.getDriver().get(ConfigReader.getProperty("schoolsUrl"));
    }

    @When("click on login button_US_17")
    public void click_on_login_button_US_17() {
        teacherPage.loginButton.click();
    }

    @When("enter user name_US_17 {string}")
    public void enter_user_name_US_17(String string) {
        teacherPage.username.sendKeys(string);
    }

    @When("enter password_US_17 {string}")
    public void enter_password_US_17(String string) {
        teacherPage.password.sendKeys(string);
    }

    @When("click on login_US_17")
    public void click_on_login_US_17() {
        teacherPage.login.click();
    }

    //tc_01
    @Then("verify User signed in_US_17")
    public void verify_user_signed_in_US_17() {
        teacherPage.verifyUsername.isDisplayed();
    }

    @When("User logged out_US_17")
    public void user_logged_out_US_17() {
        teacherPage.menu.click();
        teacherPage.logout.click();
        teacherPage.confirmLogout.click();
    }

    //tc_02
    @When("click on Choose Lesson option_US_17")
    public void click_on_choose_lesson_option_US_17() {
        teacherPage.chooseStudent.click();
    }

    @When("select {string} assigned to user_US_17")
    public void select_assigned_to_user_US_17(String string) {
        Select select = new Select(teacherPage.chooseLesson);
        select.selectByVisibleText(string);
    }

    @When("click on Choose Student option_US_17")
    public void click_on_choose_student_option_US_17() {
        teacherPage.chooseStudent.click();
    }

    @When("select a student_US_17 {string}")
    public void select_a_student_US_17(String string) {
        Select select = new Select(teacherPage.chooseStudent);
        select.selectByVisibleText(string);
    }

    @When("click on Choose Education Term option_US_17")
    public void click_on_choose_education_term_option_US_17() {
        teacherPage.educationTerm.click();
    }

    @When("select an education semester_US_17")
    public void select_an_education_semester_US_17() {
        Select select = new Select(teacherPage.educationTerm);
        select.selectByValue("20");
    }

    //TC_03
    @When("enter_US_17 {string}")
    public void enter_US_17(String string) {
        teacherPage.absentee.sendKeys(string);
    }

    @When("enter Midterm Exam_US_17 {string}")
    public void enter_midterm_exam_US_17(String string) {
        teacherPage.midtermExam.sendKeys(string);
    }

    @When("enter Final Exam_US_17 {string}")
    public void enter_final_exam_US_17(String string) {
        teacherPage.finalExam.sendKeys(string);
    }

    @When("enter Info Note About The Student_US_17 {string}")
    public void enter_info_note_about_the_student_US_17(String string) {
        teacherPage.infoNote.sendKeys(string);
    }

    @When("click on Submit Button_US_17")
    public void click_on_submit_button_US_17() {
        teacherPage.submitButton.click();
    }

    @Then("verify User sees lesson name in Student Info list_US_17")
    public void verify_user_sees_lesson_name_in_student_info_list_US_17() {
        teacherPage.verifyLessonName.isDisplayed();
    }

    //tc_04
    @When("leave Choose Lesson option blank_US_17")
    public void leave_choose_lesson_option_blank_US_17() {
        teacherPage.chooseLesson.sendKeys("");
    }

    @When("leave Choose Lesson option unselected_US_17")
    public void leave_choose_lesson_option_unselected_US_17() {
        teacherPage.verifyLesson.isDisplayed();
    }

    //tc_05
    @When("leave on Choose Student option blank_US_17")
    public void leave_on_choose_student_option_blank_US_17() {
        teacherPage.chooseStudent.sendKeys("");
    }
    @Then("verify User sees student name in Student Info list_US_17")
    public void verify_user_sees_student_name_in_student_info_list_US_17() {
        teacherPage.verifyStudent.isDisplayed();
    }
    //tc_06
    @When("leave on Choose Education Term option blank_US_17")
    public void leave_on_choose_education_term_option_blank_US_17() {
        teacherPage.educationTerm.sendKeys("");
    }
    @Then("verify User sees education term in Student Info list_US_17")
    public void verify_user_sees_education_term_in_student_info_list_US_17() throws InterruptedException {
        teacherPage.verifyTerm.isDisplayed();
    }

    //tc_07
    @When("leave absentee blank_US_17")
    public void leave_absentee_blank_US_17() {
        teacherPage.absentee.sendKeys("");
    }
    @Then("verify User sees absentee required message in Student Info list_US_17")
    public void verify_user_sees_absentee_required_message_in_student_info_list_US_17() {
        teacherPage.verifyAbsenteeRequired.isDisplayed();
    }

    //tc_08
    @When("leave Midterm Exam blank_US_17")
    public void leave_midterm_exam_blank_US_17() {
        teacherPage.midtermExam.sendKeys("");
    }
    @Then("verify User sees midterm exam required message in Student Info list_US_17")
    public void verify_user_sees_midterm_exam_required_message_in_student_info_list_US_17() {
        teacherPage.verifyMidtermExamRequired.isDisplayed();
    }
    //tc_09
    @When("leave Final Exam blank_US_17")
    public void leave_final_exam_blank_US_17() {
        teacherPage.finalExam.sendKeys("");
    }
    @Then("verify User sees final exam required message in Student Info list_US_17")
    public void verify_user_sees_final_exam_required_message_in_student_info_list_US_17() {
        teacherPage.verifyFinalExamRequired.isDisplayed();
    }
    //tc_10
    @When("leave Info Note About The Student blank_US_17")
    public void leave_info_note_about_the_student_blank_US_17() {
        teacherPage.infoNote.sendKeys("");
    }
    @Then("verify User sees info required message in Student Info list_US_17")
    public void verify_user_sees_info_required_message_in_student_info_list_US_17() {
        teacherPage.verifyInfoNoteRequired.isDisplayed();
    }


}