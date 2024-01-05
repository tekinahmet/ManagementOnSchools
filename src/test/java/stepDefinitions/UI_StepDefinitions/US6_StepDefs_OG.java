package stepDefinitions.UI_StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.DeanPage;
import utilities.Driver;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

import static org.junit.Assert.assertTrue;


public class US6_StepDefs_OG {

    DeanPage us6_deanPage = new DeanPage();
    Faker faker = new Faker();


    @Then("verify user logged in_Og")
    public void verify_user_logged_in_og() {
        assertTrue(us6_deanPage.verifyDeanNameOG.getText().contains("Final Project"));
    }
    @When("click Vice Dean Management_Og")
    public void click_vice_dean_management_og() {
        us6_deanPage.viceDeanManagementOG.click();
    }
    @Then("verify User sees Vice Dean Management header_Og")
    public void verify_user_sees_vice_dean_management_header_og() {
        assertTrue(us6_deanPage.verifyVDManagementPageOG.getText().contains("Vice Dean Management"));
    }
    // TEST CASE 1
    @When("user click name box_Og {string}")
    public void user_click_name_box_og(String name) throws InterruptedException {
     //   us6_deanPage.name.sendKeys(string);
        us6_deanPage.nameOG.sendKeys(Faker.instance().name().firstName());
        WaitUtils.waitFor(1);
    }
    @When("user click surname box_Og {string}")
    public void user_click_surname_box_og(String surname) throws InterruptedException {
      // us6_deanPage.surname.sendKeys(string);
        us6_deanPage.surnameOG.sendKeys(Faker.instance().name().lastName());
        WaitUtils.waitFor(1);
    }
    // ADD on this line Birth-Place

    @When("user click Birth Place box_Og {string}")
    public void user_click_birth_place_box_og(String birthPlace) {
      //  us6_deanPage.birthPlace.sendKeys(string); use faker below
        us6_deanPage.birthPlaceOG.sendKeys(Faker.instance().address().city());

    }
    @When("user click male in gender_Og {string}")
    public void user_click_male_in_gender_og(String string) {
       us6_deanPage.maleOG.click();
    }
    @When("user enters birthday_Og {string}")
    public void user_enters_birthday_og(String string) {
       us6_deanPage.DateOfBirthOG.sendKeys(string+ Keys.TAB);
        WaitUtils.waitFor(2);
    }
    @When("user enters phone number as xxx-xxx-xxxx_Og  {string}")
    public void user_enters_phone_number_as_xxx_xxx_xxxx_og(String phoneNumber) {
    //   us6_deanPage.phoneNumber.sendKeys(string);
       us6_deanPage.phoneNumberOG.sendKeys(""+Faker.instance().number().digits(3)+"-"+Faker.
               instance().number().digits(3)+"-"+Faker.instance().number().digits(4));
        WaitUtils.waitFor(2);
    }

    @When("user enters SSN as xxx-xx-xxxx_Og {string}")
    public void user_enters_ssn_as_xxx_xx_xxxx_og(String ssnNumber) {
     //  us6_deanPage.ssnNumber.sendKeys(string);
       us6_deanPage.ssnNumberOG.sendKeys(Faker.instance().number().digits(3)+"-"+Faker.
               instance().number().digits(2)+"-"+Faker.instance().number().digits(4));
        WaitUtils.waitFor(1);
    }
    @When("user enters userName as_Og {string}")
    public void user_enters_user_name_as(String userName) {
      //  us6_deanPage.username.sendKeys(string);
        us6_deanPage.usernameOG.sendKeys(Faker.instance().name().firstName());
    }

    @When("user enters password \\(at least eight characters, one number, uppercase letter, lowercase letter) as_Og {string}")
    public void user_enters_password_at_least_eight_characters_one_number_uppercase_letter_lowercase_letter_as_og(String string) {
       us6_deanPage.passwordOG.sendKeys(string);
    }
    @When("user click submit_Og")
    public void user_click_submit_og() {
      us6_deanPage.submitButtonOG.click();
      WaitUtils.waitFor(1);
    }
    // VICE-DEAN SAVED CODE
    @Then("verify Vice dean Saved_Og")
    public void verify_vice_dean_saved_og() throws IOException {
        assertTrue(us6_deanPage.savedAlertOG.isDisplayed());
        WaitUtils.waitFor(1);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

    @When("user signed out_Og")
    public void user_signed_out_og() {
       us6_deanPage.menuOG.click();
       us6_deanPage.logOutOG.click();
       us6_deanPage.confirmLogOutOG.click();
    }

// TEST CASE 2
@When("user click female in gender_Og {string}")
public void user_click_female_in_gender_og(String string) throws IOException {
    us6_deanPage.femaleOG.click();
    MediaUtils.takeScreenshotOfTheEntirePage();
}
// TEST CASE 3
@Then("User directly clicks on the submit button_Og")
public void user_directly_clicks_on_the_submit_button_og() {
   us6_deanPage.submitButtonOG.click();
}
    @Then("verify that the user sees a red Required warning each box_Og")
    public void verify_that_the_user_sees_a_red_required_warning_each_box_og() throws IOException {
        assertTrue(us6_deanPage.requiredAlertOG.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
// TEST CASE 4

    @When("user enters SSN in wrong format_Og")
    public void user_enters_ssn_in_wrong_format_og() {
        us6_deanPage.ssnNumberOG.sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().
                digits(3)+"-"+Faker.instance().number().digits(3));
    }
    @Then("verify that the user sees a red wrong SSN warning at related box_Og")
    public void verify_that_the_user_sees_a_red_wrong_ssn_warning_at_related_box_og() throws IOException {
       assertTrue(us6_deanPage.alertSSNOG.isDisplayed());
       MediaUtils.takeScreenshotOfTheEntirePage();
    }
    // TEST CASE 5
    @When("user enters password less than eight characters as_Og {string}")
    public void user_enters_password_less_than_eight_characters_as_og(String string) {
   us6_deanPage.passwordOG.sendKeys(string);
}

    // at least 8 characters warning
    @Then("verify user sees At least {int} characters warning_Og")
    public void verify_user_sees_at_least_characters_warning_og(Integer int1) throws IOException {
        assertTrue(us6_deanPage.charAlertOG.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

    // TEST CASE 6
    @Then("verify user sees missing upper case warning_Og")
    public void verify_user_sees_missing_upper_case_warning_og() throws IOException {
        assertTrue(us6_deanPage.upperCaseAlertOG.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    // TEST CASE 7
    @Then("verify user sees missing One lowercase character_Og")
    public void verify_user_sees_missing_one_lowercase_character_og() throws IOException {
       assertTrue(us6_deanPage.lowerCaseAlertOG.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();

    }
    // TEST CASE 8
    @Then("verify user sees missing One number character_Og")
    public void verify_user_sees_missing_one_number_character_og() throws IOException {
      assertTrue(us6_deanPage.oneNumberOG.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Then("user closes driver_Og")
    public void user_closes_driver_og() {
        Driver.closeDriver();
    }

}






