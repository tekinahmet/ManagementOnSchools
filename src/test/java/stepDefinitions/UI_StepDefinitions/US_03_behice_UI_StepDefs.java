package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.*;
import pages.ContactGetAllPage;
import utilities.Driver;
import utilities.WaitUtils;
import static org.junit.Assert.assertTrue;

public class US_03_behice_UI_StepDefs {
    ContactGetAllPage contactGetAllPage = new ContactGetAllPage();

    @Given("user navigates to {string}")
    public void user_Navigates_To() {
        Driver.getDriver().get("https://managementonschools.com/");
    }
    @Given("user clicks on contact link")
    public void user_clicks_on_contact_link() {
        contactGetAllPage.contactLink.click();
    }
    @And("user enters name {string}")
    public void user_enters_name(String string) {
        WaitUtils.waitFor(2);
        contactGetAllPage.name.sendKeys(string);
    }
    @And("user enters valid email address {string}")
    public void user_enters_valid_email_address(String string) {
        contactGetAllPage.email.sendKeys(string);
    }
    @And("user enters subject {string}")
    public void user_enters_subject(String string) {
        contactGetAllPage.subject.sendKeys(string);
    }
    @And("user enters message {string}")
    public void user_enters_message(String string) {
        contactGetAllPage.message.sendKeys(string);
    }
    @Then("user clicks on send message button")
    public void user_clicks_on_send_message_button() {
        WaitUtils.waitFor(2);
        contactGetAllPage.sendMessageButton.click();
    }

    //-------------------- TC01 -----------------------
    @Then("verify contact message created successfully confirmation appear")
    public void verify_contact_message_created_successfully_confirmation_appear() {
        WaitUtils.waitForVisibility(contactGetAllPage.contactCreatedAlertMessage,5);
        assertTrue(contactGetAllPage.contactCreatedAlertMessage.getText().contains("Contact Message Created Successfully"));
    }

    //-------------------- TC02 -----------------------
    @Then("verify the required message is visible")
    public void verify_the_required_message_is_visible() {
        assertTrue(contactGetAllPage.requiredTextMessage.isDisplayed());
    }

    //-------------------- TC03 -----------------------
    @Then("verify please enter valid email message will appear")
    public void verify_please_enter_valid_email_message_will_appear() {
        WaitUtils.waitForVisibility(contactGetAllPage.invalidEmailAlertMessage,5);
        assertTrue(contactGetAllPage.invalidEmailAlertMessage.getText().contains("Please enter valid email"));
    }


}
