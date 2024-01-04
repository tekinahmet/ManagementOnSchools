package stepDefinitions.UI_StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.AdminPage;
import pages.DeanPage;
import pages.TeacherPage;
import utilities.JSUtils;
import utilities.WaitUtils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_14_Melik_UI_StepDefs {

    TeacherPage teacherPage_MS = new TeacherPage();
    AdminPage adminPage_MS = new AdminPage();
    DeanPage deanPage_MS = new DeanPage();

    public static String teacherSurname_MS;
    public static String teacherName_MS;
    public static String teacherBirthPlace_MS;
    public static String teacherEmail_MS;

    public static String teacherPhoneNumber_MS;
    public static String teacherSsnNumber_MS;


    @When("User clicks the Teacher Management button_MS")
    public void user_clicks_the_teacher_management_button_ms() {

        adminPage_MS.teacherManagement_MS.click();


    }
    @When("Verify that User is on Teacher Management page_MS")
    public void verify_that_user_is_on_teacher_management_page_ms() {

        assertEquals("Add Teacher", teacherPage_MS.teacherText_MS.getText());
    }
    @Then("verify whether the created FelixKeeling as username are visible in the list for user_MS")
    public void verify_whether_the_created_felix_keeling_as_username_are_visible_in_the_list_for_user_ms() {

        //        System.out.println("teacherPage.verifyTeacherCreated.getText() = " + teacherPage.verifyTeacherCreated.getText());
//       assertEquals("TeacherAkmer",teacherPage.verifyTeacherCreated.getText());
        assertEquals("FelixKeeling", teacherPage_MS.verifyTeacherCreated_MS.getText());
    }
    @Then("User clicks the edit button_MS")
    public void user_clicks_the_edit_button_ms() {

//        System.out.println("teacherPage.editButton.getText() = " + teacherPage.editButton.getText());

        JSUtils.JSclickWithTimeout(teacherPage_MS.editButton_MS);

    }
    @Then("User choose a lesson_MS")
    public void user_choose_a_lesson_ms() {

        WaitUtils.waitFor(2);
        teacherPage_MS.chooseLessons_MS.sendKeys("JAVA", Keys.ENTER);
    }
    @Then("User types the name_MS")
    public void user_types_the_name_ms() {

        teacherName_MS = Faker.instance().name().firstName();
        teacherPage_MS.chooseLessons_MS.sendKeys(Keys.TAB, teacherName_MS);

    }
    @Then("User types the surname_MS")
    public void user_types_the_surname_ms() {

        teacherSurname_MS = Faker.instance().name().lastName();
        teacherPage_MS.chooseLessons_MS.sendKeys(Keys.TAB,Keys.TAB, teacherSurname_MS);

    }
    @Then("User types Birth Place_MS")
    public void user_types_birth_place_ms() {

        teacherBirthPlace_MS = Faker.instance().address().city();
        teacherPage_MS.chooseLessons_MS.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB, teacherBirthPlace_MS);
    }
    @Then("User types email into the emailbox_MS")
    public void user_types_email_into_the_emailbox_ms() {

        teacherEmail_MS = Faker.instance().internet().emailAddress();
        teacherPage_MS.chooseLessons_MS.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB, teacherEmail_MS);

    }
    @Then("User types the phone number_MS as xxx-xxx-xxxx")
    public void user_types_the_phone_number_ms_as_xxx_xxx_xxxx() {

        teacherPhoneNumber_MS = ""+Faker.instance().number().digits(3)+
                "-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);

        teacherPage_MS.chooseLessons_MS.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB, teacherPhoneNumber_MS);

    }
    @Then("User types the Ssn Number_MS as xxx-xx-xxxx")
    public void user_types_the_ssn_number_ms_as_xxx_xx_xxxx() {

        teacherSsnNumber_MS = ""+Faker.instance().number().digits(3)+
                "-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
        teacherPage_MS.chooseLessons_MS.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB, teacherSsnNumber_MS);
    }
    @Then("User clicks the is advisor teacher_MS")
    public void user_clicks_the_is_advisor_teacher_ms() {

        teacherPage_MS.advisorTeacher_MS.click();
    }

    @Then("User clicks the Female in the gender_MS")
    public void user_clicks_the_female_in_the_gender_ms() {

        if (!deanPage_MS.female_MS.isSelected()){
            deanPage_MS.female_MS.click();
        }
    }
    @Then("User types the Date of Birth_MS")
    public void user_types_the_date_of_birth_ms() {

        deanPage_MS.female_MS.sendKeys(Keys.TAB,"22091996", Keys.TAB);

    }
    @Then("User types the UserName_MS")
    public void user_types_the_user_name_ms() {

    }
    @Then("User types Password_MS {string}")
    public void user_types_password_ms(String Password) {

        teacherPage_MS.passwordforTeacher_MS.sendKeys(Password);
    }
    @Then("verify that Teacher updated Successful_MS")
    public void verify_that_teacher_updated_successful_ms() {

        WaitUtils.waitForVisibility(teacherPage_MS.alertForUpdated_MS,3);
        assertTrue(teacherPage_MS.alertForUpdated_MS.getText().contains("updated"));

    }

    @Then("User clicks the Submit button for teacher_MS")
    public void user_clicks_the_submit_button_for_teacher_ms() {

//     teacherPage.passwordforTeacher.sendKeys(Keys.TAB,Keys.ENTER);
        teacherPage_MS.submitButtonForTeacher_MS.sendKeys(Keys.ENTER);
    }
}
