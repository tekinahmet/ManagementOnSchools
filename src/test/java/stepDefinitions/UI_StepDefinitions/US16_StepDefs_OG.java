package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ViceDeanPage;
import utilities.Driver;
import utilities.MediaUtils;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class US16_StepDefs_OG {
    ViceDeanPage us16_vd_managementPage = new ViceDeanPage();

    @Given("go to homepage_OG")
    public void go_to_homepage_og() {

        Driver.getDriver().get("https://managementonschools.com/");
    }
    @When("click login button_OG")
    public void click_login_button_og() {
        us16_vd_managementPage.loginOg.click();
    }
    @When("enter username_OG {string}")
    public void enter_username_og(String string) {
        us16_vd_managementPage.viceDeanNameOg.sendKeys(string);
    }
    @When("enter password_OG {string}")
    public void enter_password_og(String string) {
        us16_vd_managementPage.viceDeanPasswordOg.sendKeys(string);
    }
    @When("click login_OG")
    public void click_login_og() {
        us16_vd_managementPage.loginButtonOg.click();
    }
    @Then("verify User logged in_OG")
    public void verify_user_logged_in_og() throws IOException {
        assertTrue(us16_vd_managementPage.verifyViceDeanNameOg.getText().contains("HankTheVD"));
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

    @When("User signed out_OG")
    public void user_signed_out_og() {
        us16_vd_managementPage.menuOg.click();
        us16_vd_managementPage.logOutOg.click();
        us16_vd_managementPage.confirmLogOutOg.click();
    }
    // Test Case 2

    @Then("verify User sees Delete button_OG")
    public void verify_user_sees_delete_button_og() throws IOException {
        MediaUtils.takeScreenshotOfTheEntirePage();
        assertTrue(us16_vd_managementPage.deleteButtonOg.isDisplayed());


    }
    // Test Case 3
    @When("click menu button_OG")
    public void click_menu_button_og() {
        us16_vd_managementPage.menuOg.click();
    }

    @When("click Contact Get All_OG")
    public void click_contact_get_all_og() {
        us16_vd_managementPage.clickContactGetAllOg.click();
    }

    @When("verify User sees Contact Message header_OG")
    public void verify_user_sees_contact_message_header_og() {
        assertTrue(us16_vd_managementPage.contactMessageHeaderOg.getText().contains("Contact Message"));
    }

    @When("verify User sees Name_OG")
    public void verify_user_sees_name_og() {
        assertTrue(us16_vd_managementPage.contactMessageHeaderOg.getText().contains("Contact Message"));
    }

    @When("verify User sees Email_OG")
    public void verify_user_sees_email_og() {
        assertTrue(us16_vd_managementPage.verifyEmailOg.isDisplayed());
    }

    @When("verify User sees Date_OG")
    public void verify_user_sees_date_og() {
        assertTrue(us16_vd_managementPage.verifyDateOg.isDisplayed());
    }

    @When("verify User sees Subject_OG")
    public void verify_user_sees_subject_og() {
        assertTrue(us16_vd_managementPage.verifySubjectOg.isDisplayed());
    }

    @When("verify User sees Message_OG")
    public void verify_user_sees_message_og() throws IOException {
        assertTrue(us16_vd_managementPage.verifyMessageOg.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
// Test Case 4

    @Then("verify User deletes messages_OG")
    public void verify_user_deletes_messages_og() throws IOException {
        MediaUtils.takeScreenshotOfTheEntirePage();
        assertTrue(us16_vd_managementPage.deleteButtonOg.isDisplayed());
    }
//    @Then("user closes the driver")
//    public void user_closes_driver() {
//        Driver.closeDriver();
//    }

}
