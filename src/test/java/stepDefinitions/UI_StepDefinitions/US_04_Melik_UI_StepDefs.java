package stepDefinitions.UI_StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminPage;
import pages.DeanPage;
import pages.LoginPage;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class US_04_Melik_UI_StepDefs {

    LoginPage loginPage_MS = new LoginPage();

    AdminPage adminPage_MS = new AdminPage();
    DeanPage deanPage_MS = new DeanPage();

    public static String surname_MS;
    public static String userName_MS;
    public static String password_MS;
    public static String firstName_MS;

    public static String phoneNumber_MS;
    public static String birthPlace_MS;
    public static String ssnNumber_MS;

    @Given("User navigates to the_MS {string}")
    public void user_navigates_to_the_ms(String url) {

        Driver.getDriver().get(url);

    }
    @When("User clicks the login button at the top of page_MS")
    public void user_clicks_the_login_button_at_the_top_of_page_ms()  {

        loginPage_MS.login_MS.click();
    }
    @When("User enters the username_MS as {string}")
    public void user_enters_the_username_ms_as(String username) {

        loginPage_MS.username_MS.sendKeys(username);

    }
    @When("User enters the password_MS as {string}")
    public void user_enters_the_password_ms_as(String password) {

        loginPage_MS.password_MS.sendKeys(password);

    }
    @When("User clicks the login button_MS")
    public void user_clicks_the_login_button_ms() {

        loginPage_MS.loginButton_MS.click();

    }
    @When("User clicks the menu button_MS")
    public void user_clicks_the_menu_button_ms() {

        adminPage_MS.menuButton_MS.click();

    }
    @When("User clicks the Dean Management button_MS")
    public void user_clicks_the_dean_management_button_ms() {

        adminPage_MS.deanManagement_MS.click();

    }

    @When("Verify that Admin is on Dean Management page_MS")
    public void verify_that_admin_is_on_dean_management_page_ms() {

        assertTrue(deanPage_MS.addDeanText_MS.getText().contains("Add Dean"));

    }


    @When("User enters the name_MS {string}")
    public void user_enters_the_name_ms(String name) {

        firstName_MS = Faker.instance().name().firstName();
        deanPage_MS.name_MS.click();
        deanPage_MS.name_MS.sendKeys(firstName_MS);

    }
    @When("User enters the surname_MS {string}")
    public void user_enters_the_surname_ms(String surname) {

        surname_MS = Faker.instance().name().lastName();
        deanPage_MS.surname_MS.sendKeys(surname_MS);

    }
    @When("User enters Birth Place_MS {string}")
    public void user_enters_birth_place_ms(String BirthPlace) {

        birthPlace_MS = Faker.instance().address().city();
        deanPage_MS.birthPlace_MS.sendKeys(birthPlace_MS);

    }
    @When("User clicks the Male in the gender_MS")
    public void user_clicks_the_male_in_the_gender_ms() {

        if (!deanPage_MS.male_MS.isSelected()){
            deanPage_MS.male_MS.click();
        }

    }
    @When("User enters the Date of Birth_MS")
    public void user_enters_the_date_of_birth_ms() {

        deanPage_MS.DateOfBirth_MS.sendKeys("11111995");

    }

    @When("User enters the phone number_MS {string} as xxx-xxx-xxxx")
    public void user_enters_the_phone_number_ms_as_xxx_xxx_xxxx(String string) {

        phoneNumber_MS = ""+Faker.instance().number().digits(3)+
                "-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
        deanPage_MS.phoneNumber_MS.sendKeys(phoneNumber_MS);

    }
    @When("User enters the Ssn Number_MS {string} as xxx-xx-xxxx")
    public void user_enters_the_ssn_number_ms_as_xxx_xx_xxxx(String string) {

        ssnNumber_MS = ""+Faker.instance().number().digits(3)+
                "-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
        deanPage_MS.ssnNumber_MS.sendKeys(ssnNumber_MS);

    }

    @When("User enters the User Name_MS {string}")
    public void user_enters_the_user_name_ms(String string) {

        userName_MS = Faker.instance().name().username();
        deanPage_MS.username_MS.sendKeys(userName_MS);

    }

//    @When("User enters Password {string} \\(at least eight characters, one number, uppercase letter, lowercase letter)")
//    public void user_enters_password_at_least_eight_characters_one_number_uppercase_letter_lowercase_letter(String string) {
//
//        deanPage.password.sendKeys(Faker.instance().internet().password(9,11,true,true,true));
//
//    }

    @When("User enters Password_MS {string}")
    public void user_enters_password_ms(String Password) {

        password_MS = Password;
        deanPage_MS.password_MS.sendKeys(password_MS);

    }
    @When("User click the submit button_MS")
    public void user_click_the_submit_button_ms() {

        deanPage_MS.submitButton_MS.click();

    }

    @Then("Verify that the alert is visible Dean Saved_MS")
    public void verify_that_the_alert_is_visible_dean_saved_ms() throws InterruptedException {

        assertTrue(deanPage_MS.alertForDean_MS.isDisplayed());
        Thread.sleep(2);
    }


    @When("User leaves blank into the name_MS {string}")
    public void user_leaves_blank_into_the_name_ms(String name) {

        deanPage_MS.name_MS.sendKeys(name);

    }
    @When("User leaves blank into the Surname_MS {string}")
    public void user_leaves_blank_into_the_surname_ms(String Surname) {

        deanPage_MS.surname_MS.sendKeys(Surname);
    }
    @When("User leaves blank into the Birth Place_MS {string}")
    public void user_leaves_blank_into_the_birth_place_ms(String string) {

        deanPage_MS.birthPlace_MS.sendKeys(string);
    }
    @When("User leaves blank into the Date of Birth_MS {string}")
    public void user_leaves_blank_into_the_date_of_birth_ms(String string) {

        deanPage_MS.DateOfBirth_MS.sendKeys(string);
    }
    @When("User leaves blank into the Phone number_MS {string}")
    public void user_leaves_blank_into_the_phone_number_ms(String string) {

        deanPage_MS.phoneNumber_MS.sendKeys(string);
    }
    @When("User leaves blank into the Ssn Number_MS {string}")
    public void user_leaves_blank_into_the_ssn_number_ms(String string) {

        deanPage_MS.ssnNumber_MS.sendKeys(string);
    }
    @When("User leaves blank into the User Name_MS {string}")
    public void user_leaves_blank_into_the_user_name_ms(String string) {

        deanPage_MS.username_MS.sendKeys(string);
    }
    @Then("Verify that the text is visible as Required_MS")
    public void verify_that_the_text_is_visible_as_required_ms() {

        assertTrue(deanPage_MS.verifyName_MS.getText().contains("Required"));
        assertTrue(deanPage_MS.verifySurname_MS.getText().contains("Required"));
        assertTrue(deanPage_MS.verifyBirthPlace_MS.getText().contains("Required"));
        assertTrue(deanPage_MS.verifyDateOfBirth_MS.getText().contains("Required"));
        assertTrue(deanPage_MS.verifyPhoneNumber_MS.getText().contains("Required"));
        assertTrue(deanPage_MS.verifySsnNumber_MS.getText().contains("Required"));
        assertTrue(deanPage_MS.verifyUserName_MS.getText().contains("Required"));
        assertTrue(deanPage_MS.verifyPassword_MS.getText().contains("Enter your password"));

    }

    @When("User leaves blank into the Password_MS {string}")
    public void user_leaves_blank_into_the_password_ms(String Password) {

        deanPage_MS.password_MS.sendKeys(Password);
    }

    @When("User enters the invalid Ssn Number_MS {string} as xxx-xx-xxxx")
    public void user_enters_the_invalid_ssn_number_ms_as_xxx_xx_xxxx(String string) {
        deanPage_MS.ssnNumber_MS.click();
        deanPage_MS.ssnNumber_MS.sendKeys(string);
    }


    @Then("Verify that the alert is visible Please enter valid SSN number_MS")
    public void verify_that_the_alert_is_visible_please_enter_valid_ssn_number_ms() {

//        JSUtils.JSclickWithTimeout(deanPage.alertForSsn);
//        assertTrue(Driver.getDriver().switchTo().alert().getText().contains("enter valid"));

//        Actions actions = new Actions(Driver.getDriver());
//        actions.clickAndHold(deanPage.alertForSsn).perform();
//        assertTrue(Driver.getDriver().switchTo().alert().getText().contains("enter valid"));


        assertTrue(deanPage_MS.alertForSsn_MS.isDisplayed());

    }

    @Then("Verify that the text is visible for Ssn Number_MS")
    public void verifyThatTheAlertIsVisibleForSsnNumber() {

        assertTrue(deanPage_MS.verifySsnNumber_MS.getText().contains("Minimum 11"));
    }



    @When("User enters invalid Password_MS {string}")
    public void user_enters_invalid_password_ms(String Password) {
        deanPage_MS.password_MS.sendKeys(Password);

    }
    @Then("Verify that the text is visible for password_MS")
    public void verify_that_the_text_is_visible_for_password_ms() {

        String invalidPasswordText = deanPage_MS.verifyPassword_MS.getText();
        if(invalidPasswordText.contains("At least 8 characters")){
            assertTrue(deanPage_MS.verifyPassword_MS.getText().contains("At least 8 characters"));

        } else if (invalidPasswordText.contains("uppercase")) {
            assertTrue(deanPage_MS.verifyPassword_MS.getText().contains("uppercase"));

        } else if (invalidPasswordText.contains("lowercase")) {
            assertTrue(deanPage_MS.verifyPassword_MS.getText().contains("lowercase"));

        }else {assertTrue(deanPage_MS.verifyPassword_MS.getText().contains("number"));}
    }





    @Then("Close the application_MS")
    public void close_the_application_ms() {
        Driver.closeDriver();
    }



}

