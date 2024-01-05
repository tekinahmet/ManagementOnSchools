package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Wait;
import pages.DeanPage;


import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

import java.security.Key;

import static org.junit.Assert.assertTrue;

public class US_05_zeynep_UI_StepDefs {

    DeanPage deanPage = new DeanPage();

    @Given("go to webpagee ZS")
    public void go_to_webpagee() {
        Driver.getDriver().get("https://managementonschools.com/");
        WaitUtils.waitFor(2);
    }

    @When("click on loginn ZS")
    public void clickOnLoginn() {
        deanPage.loginz.click();
    }

    @And("enter usernamee {string} ZS")
    public void enterUsernamee(String username) {
        deanPage.usernamez.sendKeys(username);
    }

    @And("enter passwordd {string} ZS")
    public void enterPasswordd(String password) {
        deanPage.passwordz.sendKeys(password);
    }

    @And("click login buttonn ZS")
    public void clickLoginButtonn() {
        deanPage.loginButtonz.click();
        WaitUtils.waitFor(2);
    }


    @And("click on Menu buttonn ZS")
    public void clickOnMenuButton() {
        deanPage.menuButtonz.click();
        WaitUtils.waitFor(2);
    }


    @And("click on Dean Management ZS")
    public void clickOnDeanManagement() {
        deanPage.deanManagementz.click();
        WaitUtils.waitFor(3);
    }


    //TC_01
    @Then("Verify Name column is visible ZS")
    public void verifyNameColumnIsVisible() {
        Assert.assertTrue(deanPage.nameColumnz.isDisplayed());
        WaitUtils.waitFor(3);
    }

    @Then("Verify Gender column is visible ZS")
    public void verifyGenderColumnIsVisible() {
        Assert.assertTrue(deanPage.genderColumnz.isDisplayed());
    }

    @Then("Verify Phone Number column is visible ZS")
    public void verifyPhoneNumberColumnIsVisible() {
        Assert.assertTrue(deanPage.phoneNumberColumnz.isDisplayed());
    }

    @Then("Verify SSN column is visible ZS")
    public void verifySSNColumnIsVisible() {
        Assert.assertTrue(deanPage.ssnColumnz.isDisplayed());
    }

    @Then("Verify User Name Information is visible ZS")
    public void verifyUserNameInformationIsVisible() {
        Assert.assertTrue(deanPage.userNameColumnz.isDisplayed());
    }

    //TC_03
    @Then("Click on edit button at the end of the row ZS")
    public void clickOnEditButtonAtTheEndOfTheRow() {
        JSUtils.JSclickWithTimeout(deanPage.editButtonz);
        WaitUtils.waitFor(3);
    }

    @And("enter name ZS")
    public void enterName() {deanPage.nameFieldz.sendKeys("folina");
    }

    @And("enter surname {string} ZS")
    public void enterSurname(String enter_surnamez) {deanPage.surnameFieldz.sendKeys(enter_surnamez);
    }

    @And("birth place {string} ZS")
    public void birthPlace(String birth_place) {deanPage.birthPlaceFieldz.sendKeys(Keys.CONTROL + "a");
        deanPage.birthPlaceFieldz.sendKeys(Keys.DELETE);
        deanPage.birthPlaceFieldz.sendKeys(birth_place);
    }

    @And("gender ZS")
    public void gender() {deanPage.genderOptionz.click();
    }

    @And("date of birth ZS")
    public void dateOfBirth() {deanPage.dateOfBirthz.sendKeys();
    }

    @And("date of birth {string} ZS")
    public void dateOfBirth(String date_birthz) {deanPage.dateOfBirthz.sendKeys(date_birthz);
    }

    @And("phone number {string} ZS")
    public void phoneNumber(String phoneNumberz) {deanPage.phoneFieldz.sendKeys(Keys.CONTROL + "a");
        deanPage.phoneFieldz.sendKeys(Keys.DELETE);
        deanPage.phoneFieldz.sendKeys(phoneNumberz);
    }

    @And("ssn {string} ZS")
    public void ssn(String ssnNumberz) {deanPage.ssnFieldz.sendKeys(Keys.CONTROL + "a");
        deanPage.ssnFieldz.sendKeys(Keys.DELETE);
        deanPage.ssnFieldz.sendKeys(ssnNumberz);
    }

    @And("user name information {string} ZS")
    public void userNameInformation(String user_name_infoz) {deanPage.userNameFiledz.sendKeys(Keys.CONTROL +"a");
        deanPage.userNameFiledz.sendKeys(Keys.DELETE);
        deanPage.userNameFiledz.sendKeys(user_name_infoz);
    }

    @And("click on submit button ZS")
    public void clickOnSubmitButton() {deanPage.submitButtonz.click();
    }

    @And("passwordz {string} ZS")
    public void passwordz(String enter_passwordz) {deanPage.passwordFieldz.sendKeys(enter_passwordz);
    }


    @Then("Verify that Dean updated successful message is visible ZS")
    public void verifyThatDeanUpdatedSuccessfulMessageIsVisible() {Assert.assertTrue(deanPage.verifyMessagez.isDisplayed());
    }
}
