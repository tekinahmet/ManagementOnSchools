//package stepDefinitions.UI_StepDefinitions;
//
//import com.github.javafaker.Faker;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pages.AdminPage;
//import pages.HomePage;
//import utilities.Driver;
//import utilities.MediaUtils;
//import utilities.WaitUtils;
//
//import java.io.IOException;
//
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//
//
//public class US_22_fatma_UI_StepDefs {
//
//    HomePage homePage = new HomePage();
//    AdminPage adminPage = new AdminPage();
//
//
//    //******************TC_01*******************
//
//    @Given("User goes to the {string} FK_{int}")
//    public void user_goes_to_the_fk(String string, Integer int1) {
//        Driver.getDriver().get(string);
//    }
//
//    @When("user clicks on login button FK_{int}")
//    public void user_clicks_on_login_button_fk(Integer int1) {
//        homePage.loginFK.click();
//    }
//
//    @When("user enters the username {string} FK_{int}")
//    public void user_enters_the_username_fk(String string, Integer int1) {
//        homePage.userNameFK.sendKeys(string);
//
//
//    }
//
//    @When("user enters the password {string} FK_{int}")
//    public void user_enters_the_password_fk(String string, Integer int1) {
//        homePage.passwordFK.sendKeys(string);
//
//    }
//
//    @When("user clicks on login FK_{int}")
//    public void user_clicks_on_login_fk(Integer int1) {
//
//        homePage.loginButtonFK.click();
//
//    }
//
//    @Then("user must see the Add Admin on the page FK_{int}")
//    public void user_must_see_the_add_admin_on_the_page_fk(Integer int1) {
//
//        assertTrue(adminPage.adminVisibilityFK.isDisplayed());
//    }
//
//    @Then("User enters a name FK_{int}")
//    public void user_enters_a_name_fk(Integer int1) {
//        adminPage.nameInputFK.sendKeys("John");
//
//
//    }
//
//    @Then("User  enters a surname FK_{int}")
//    public void user_enters_a_surname_fk(Integer int1) {
//
//        adminPage.surnameInputFK.sendKeys(Faker.instance().name().lastName());
//
//    }
//
//    @Then("User enters a birth place FK_{int}")
//    public void user_enters_a_birth_place_fk(Integer int1) {
//        adminPage.birthPlaceFK.sendKeys(Faker.instance().address().cityName());
//
//
//    }
//
//    @Then("User chooses a gender \\(clicks on male or female) FK_{int}")
//    public void user_chooses_a_gender_clicks_on_male_or_female_fk(Integer int1) {
//
//        adminPage.maleGenderFK.click();
//
//    }
//
//    @Then("User enters a birth date FK_{int}")
//    public void user_enters_a_birth_date_fk(Integer int1) {
//        adminPage.dateFK.sendKeys("03121990");
//
//    }
//
//    @Then("User enters a phone number as required FK_{int}")
//    public void user_enters_a_phone_number_as_required_fk(Integer int1) {
//
//        adminPage.phoneNoFK.sendKeys("525-657-" + Faker.instance().number().numberBetween(1000, 9999));
//
//    }
//
//    @Then("User enters a SSN as required FK_{int}")
//    public void user_enters_a_ssn_as_required_fk(Integer int1) {
//        adminPage.ssnFK.sendKeys("525-07-" + Faker.instance().number().numberBetween(1000, 9999));
//    }
//
//
//    @Then("User enters an username FK_{int}")
//    public void user_enters_an_username_fk(Integer int1) {
//        adminPage.usernameFK.sendKeys(Faker.instance().name().username());
//
//
//    }
//
//    @Then("User enters a password as required FK_{int}")
//    public void user_enters_a_password_as_required_fk(Integer int1) {
//        adminPage.passwordFK.sendKeys("Asdfuıo098");
//    }
//
//
//    @Then("User clicks on the submit button FK_{int}")
//    public void user_clicks_on_the_submit_button_fk(Integer int1) {
//        adminPage.submitButtonFK.click();
//
//    }
//
//
//    @Then("user must see the Admin Saved message FK_{int}")
//    public void user_must_see_the_admin_saved_message_fk(Integer int1) throws IOException {
//
//        assertTrue(adminPage.adminSavedMessageFK.isDisplayed());
//        MediaUtils.takeScreenshotOfTheEntirePage();
//
//    }
//
//    //*********************TC_02********************
//
//    @Then("User directly clicks on the submit button FK_{int}")
//    public void user_directly_clicks_on_the_submit_button_fk(Integer int1) {
//        adminPage.submitButtonFK.click();
//    }
//
//    @Then("verify that the user sees a red Required warning each box FK_{int}")
//    public void verify_that_the_user_sees_a_red_required_warning_each_box_fk(Integer int1) throws IOException {
//        assertTrue(adminPage.requiredMessage1FK.isDisplayed());
//        assertTrue(adminPage.requiredMessage2FK.isDisplayed());
//        assertTrue(adminPage.requiredMessage3FK.isDisplayed());
//        assertTrue(adminPage.requiredMessage4FK.isDisplayed());
//        assertTrue(adminPage.requiredMessage5FK.isDisplayed());
//        assertTrue(adminPage.requiredMessage6FK.isDisplayed());
//        assertTrue(adminPage.requiredMessage7FK.isDisplayed());
//        assertTrue(adminPage.requiredMessage8FK.isDisplayed());
//
//        MediaUtils.takeScreenshotOfTheEntirePage();
//
//
//    }
//
//
//    //******************TC_03******************
//
//    @Then("User leaves the blank gender section FK_{int}")
//    public void user_leaves_the_blank_gender_section_fk(Integer int1) {
//
//    }
//
//    @Then("the user must not be able to add admin FK_{int}")
//    public void the_user_must_not_be_able_to_add_admin_fk(Integer int1) throws IOException {
//
//        assertFalse(adminPage.adminSavedMessageFK.isDisplayed()); //it's not working
//        MediaUtils.takeScreenshotOfTheEntirePage();
//        // For this case, user should not able to add admin.
//        // So it is okay but, I did not see any required message as well.
//
//    }
//
//
//    //******************TC_04******************
//
//    @Then("User enters a date \\(trying critical values) FK_{int}")
//    public void user_enters_a_date_trying_critical_values_fk(Integer int1) {
//        adminPage.dateFK.sendKeys("12021000");
//    }
//
//    @Then("user should not be able to log in with that imposible date FK_{int}")
//    public void user_should_not_be_able_to_log_in_with_that_imposible_date_fk(Integer int1) throws IOException {
//
//        assertFalse(adminPage.adminSavedMessageFK.isDisplayed());
//        MediaUtils.takeScreenshotOfTheEntirePage();
//        Driver.closeDriver();
//
//        //Normally user should not able to log in, but it does. That is why this case failed.
//
//    }
//
//
////  ******************TC_05**********************
//
//    @Then("User enters a SSN first - missing FK_{int}")
//    public void user_enters_a_ssn_first_missing_fk(Double double1, Integer int1) {
//        adminPage.ssnFK.sendKeys("34423-5432");
//    }
//
//    @Then("must see the {string} message FK_{int}")
//    public void must_see_the_message_fk(String string, Integer int1) {
//        assertTrue(adminPage.requiredMessage6FK.isDisplayed());
//    }
//
//    @Then("User enters a SSN second - missing FK_{int}")
//    public void user_enters_a_ssn_second_missing_fk(Double double1, Integer int1) throws InterruptedException {
//
//        wait(3000);
//        adminPage.ssnFK.clear();
//        adminPage.ssnFK.clear();
//        adminPage.ssnFK.sendKeys("344-235432");
//
//    }
//
//    @Then("User enters more than eleven character FK_{int}")
//    public void user_enters_more_than_eleven_character_fk(Integer int1) throws InterruptedException {
//
//        wait(3000);
//        adminPage.ssnFK.clear();
//        wait(3000);
//        adminPage.ssnFK.clear();
//        adminPage.ssnFK.sendKeys("123-34-34457");
//
//
//    }
//
//    @Then("must see the {string} FK_{int}")
//    public void must_see_the_fk(String string, Integer int1) throws IOException {
//
//
//        assertTrue(adminPage.enterValidSSNFK.getText().contains(string));
//        MediaUtils.takeScreenshotOfTheEntirePage();
//        Driver.closeDriver();
//
//
//    }
//
//
//    //  ******************TC_06**********************
//    @Then("User enters a password just one char FK_{int}")
//    public void user_enters_a_password_just_one_char_fk(Integer int1) {
//        adminPage.passwordFK.sendKeys("f");
//
//    }
//
//    @Then("It has to appear {string} on the below FK_{int}")
//    public void it_has_to_appear_on_the_below_fk(String string, Integer int1) {
//        assertTrue(adminPage.requiredMessage8FK.getText().contains(string));
//    }
//
//    @Then("User enters a password all lowercase eight char FK_{int}")
//    public void user_enters_a_password_all_lowercase_eight_char_fk(Integer int1) {
//
//        WaitUtils.waitFor(3);
//        adminPage.passwordFK.clear();
//        WaitUtils.waitFor(3);
//        adminPage.passwordFK.sendKeys("asdfghjk");
//
//    }
//
//    @Then("User enters a password all uppercase eight char FK_{int}")
//    public void user_enters_a_password_all_uppercase_eight_char_fk(Integer int1) {
//
//        WaitUtils.waitFor(3);
//        adminPage.passwordFK.clear();
//        WaitUtils.waitFor(3);
//        adminPage.passwordFK.sendKeys("ASDFGHJKL");
//
//
//    }
//
//    @Then("User enters a password with one uppercase but without number FK_{int}")
//    public void user_enters_a_password_with_one_uppercase_but_without_number_fk(Integer int1) throws IOException {
//
//        WaitUtils.waitFor(3);
//        adminPage.passwordFK.clear();
//        WaitUtils.waitFor(3);
//        adminPage.passwordFK.sendKeys("Asdh");
//        MediaUtils.takeScreenshotOfTheEntirePage();
//        Driver.closeDriver();
//
//
//    }
//
//}