package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.Then;

import pages.ViceDeanPage;

import static org.junit.Assert.assertTrue;

public class US_23_fatma_UI_StepDefs {

    ViceDeanPage viceDeanPage = new ViceDeanPage();


    @Then("User clicks on MENU button FK_{int}")
    public void user_clicks_on_menu_button_fk(Integer int1) {
        viceDeanPage.menuButtonFK.click();
    }

    @Then("User clicks on VICE DEAN MANAGEMENT link FK_{int}")
    public void user_clicks_on_vice_dean_management_link_fk(Integer int1) {
        viceDeanPage.viceDeanFK.click();

    }

    @Then("user must see the Vice Dean Management FK_{int}")
    public void user_must_see_the_vice_dean_management_fk(Integer int1) {

        assertTrue(viceDeanPage.addViceDeanFK.isDisplayed());

    }

    @Then("User must see the Vice Dean Saved message FK_{int}")
    public void user_must_see_the_vice_dean_saved_message_fk(Integer int1) {
        assertTrue(viceDeanPage.viceDeanSavedFK.isDisplayed());

    }

    @Then("verify that the user sees a red {string} warning each box FK_{int}")
    public void verify_that_the_user_sees_a_red_warning_each_box_fk(String string, Integer int1) {
        assertTrue(viceDeanPage.requiredMessage1FK.isDisplayed());
        assertTrue(viceDeanPage.requiredMessage2FK.isDisplayed());
        assertTrue(viceDeanPage.requiredMessage3FK.isDisplayed());
        assertTrue(viceDeanPage.requiredMessage4FK.isDisplayed());
        assertTrue(viceDeanPage.requiredMessage5FK.isDisplayed());
        assertTrue(viceDeanPage.requiredMessage6FK.isDisplayed());
        assertTrue(viceDeanPage.requiredMessage7FK.isDisplayed());
        assertTrue(viceDeanPage.requiredMessage8FK.isDisplayed());
    }

    @Then("user should not be able to log in with that impossible date FK_{int}")
    public void user_should_not_be_able_to_log_in_with_that_impossible_date_fk(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}

