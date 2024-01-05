package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DeanPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitUtils;

import static org.junit.Assert.assertTrue;

public class US_07_ahmet_UI_StepDefs {
    DeanPage deanPage = new DeanPage();
    @Given("go to homepage_AT")
    public void go_to_homepage_at_AT() {
        Driver.getDriver().get(ConfigReader.getProperty("schoolsUrl"));
    }
    @When("click login button_AT")
    public void click_login_button_at_AT() {
        deanPage.signIn.click();
    }
    @When("enter username_AT {string}")
    public void enter_username_AT(String string) {
        deanPage.username.sendKeys(string);
    }
    @When("enter password_AT {string}")
    public void enter_password_AT(String string) {
        deanPage.password.sendKeys(string);
    }
    @When("click login_AT")
    public void click_login_AT() {
        deanPage.loginButton.click();
    }
    @Then("verify User logged in_AT")
    public void verify_user_logged_in_AT() {
        assertTrue(deanPage.verifyUsername.getText().contains("jackdoe159"));
    }

    //TC_02
    @When("click menu button_AT")
    public void click_menu_button_AT() {
        deanPage.menu.click();
        WaitUtils.waitFor(1);
    }
    @When("User signed out_AT")
    public void user_signed_out_AT() {
        deanPage.menu.click();
        deanPage.logOut.click();
        deanPage.confirmLogOut.click();
    }
    @When("verify that User sees contact get all_AT")
    public void verify_that_user_sees_contact_get_all_AT() {
        assertTrue(deanPage.verifyContactGetAll.getText().contains("Contact Get All"));
    }
    @When("click Contact Get All_AT")
    public void click_contact_get_all_AT() {
        deanPage.clickContactGetAll.click();
    }
    @Then("verify User sees Contact Message header_AT")
    public void verify_user_sees_contact_message_header_AT() {
        assertTrue(deanPage.contactMessageHeader.getText().contains("Contact Message"));
    }
    @Then("verify User sees Delete button_AT")
    public void verify_user_sees_delete_button_AT() {
        assertTrue(deanPage.deleteButton.isDisplayed());
    }

    //TC_03
    @When("verify User sees Name_AT")
    public void verify_user_sees_name_AT() {
        assertTrue(deanPage.verifyName.isDisplayed());
    }
    @When("verify User sees Email_AT")
    public void verify_user_sees_email_AT() {
        assertTrue(deanPage.verifyEmail.isDisplayed());
    }
    @When("verify User sees Date_AT")
    public void verify_user_sees_date_AT() {
        assertTrue(deanPage.verifyDate.isDisplayed());
    }
    @When("verify User sees Subject_AT")
    public void verify_user_sees_subject_AT() {
        assertTrue(deanPage.verifySubject.isDisplayed());
    }
    @When("verify User sees Message_AT")
    public void verify_user_sees_message_AT() {
        assertTrue(deanPage.verifyMessage.isDisplayed());
    }

    //TC_04
    @Then("verify User deletes messages_AT")
    public void verify_user_deletes_messages_AT() {
        assertTrue(deanPage.deleteButton.isDisplayed());
    }


}
