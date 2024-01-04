package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ViceDeanPage;
import utilities.Driver;
import utilities.WaitUtils;

public class US_15_zeynep_UI_StepDefs {

    ViceDeanPage viceDeanPage = new ViceDeanPage();
    @Given("go to webpagez")
    public void go_to_webpagez() {
        Driver.getDriver().get("https://managementonschools.com/");
    }
    @When("click on loginz")
    public void clickOnLoginz() {viceDeanPage.loginzz.click();
        WaitUtils.waitFor(1);
    }

    @And("enter usernamez {string}")
    public void enterUsernamez(String username) {
        viceDeanPage.usernamezz.sendKeys(username);
        WaitUtils.waitFor(2);
    }

    @And("enter passwordz {string}")
    public void enterPasswordz(String password) {viceDeanPage.passwordzz.sendKeys(password);
    }

    @And("click login buttonz")
    public void clickLoginButtonz() {viceDeanPage.loginButtonzz.click();
        WaitUtils.waitFor(2);
    }

    @And("click on Menu buttonz")
    public void clickOnMenuButtonz() {viceDeanPage.menuButtonzz.click();
        WaitUtils.waitFor(2);
    }

    @And("click on Student Managementz")
    public void clickOnStudentManagementz() {viceDeanPage.studentManagementzz.click();
        WaitUtils.waitFor(3);
    }

    @And("choose teacher on dropdown menu")
    public void chooseTeacherOnDropdownMenu() {viceDeanPage.chooseTeacherzz.sendKeys("Porter Cormier");
    }

    @And("enter namez {string}")
    public void enterNamez(String name) {viceDeanPage.nameFieldzz.sendKeys(name);
    }

    @And("enter surnamez {string}")
    public void enterSurnamez(String surname) {viceDeanPage.surnameFieldzz.sendKeys(surname);
    }

    @And("enter birth placez {string}")
    public void enterBirthPlacez(String birtPlace) {viceDeanPage.birthPlaceFieldzz.sendKeys(birtPlace);
    }

    @And("enter emailz {string}")
    public void enterEmailz(String email) {viceDeanPage.emailFieldzz.sendKeys(email);
    }

    @And("enter phone numberz {string}")
    public void enterPhoneNumberz(String phoneNumber) {viceDeanPage.phoneNumberFieldzz.sendKeys(phoneNumber);
    }

    @And("select genderz")
    public void selectGenderz() {viceDeanPage.genderSelectzz.click();
    }

    @And("select date of birthz {string}")
    public void selectDateOfBirthz(String dateOfBirth) {viceDeanPage.dateOfBirthzz.sendKeys(dateOfBirth);
    }

    @And("enter ssnz {string}")
    public void enterSsnz(String ssnNumber) {viceDeanPage.ssnNumberFieldzz.sendKeys(ssnNumber);
    }

    @And("usernamez {string}")
    public void usernamez(String username2) {viceDeanPage.usernameFieldzz.sendKeys(username2);
    }

    @And("father namez {string}")
    public void fatherNamez(String fathername) {viceDeanPage.fatherNameFieldzz.sendKeys(fathername);
    }

    @And("mother name {string}")
    public void motherName(String mothername) {viceDeanPage.motherNameFieldzz.sendKeys(mothername);
    }

    @And("enter passworddd {string}")
    public void enterPassworddd(String password2) {viceDeanPage.passwordFieldzz.sendKeys(password2);
    }


    @Then("click on submit buttonz")
    public void clickOnSubmitButtonz() {viceDeanPage.submitButtonzz.click();
    }
    @Then("verify the student number automatically appear")
    public void verifyTheStudentNumberAutomaticallyAppear() {viceDeanPage.savedStudentAlertMessagezz.isDisplayed();
    }

    //TC
    @Then("verify invalid message shows up")
    public void verifyInvalidMessageShowsUp() {viceDeanPage.invalidMessagezz.isDisplayed();
    }

    //TC_09

    @And("enter ssnsecond {string}")
    public void enterSsnsecond(String ssnsecond) {viceDeanPage.ssnNumberFieldzz.sendKeys(ssnsecond);
    }

    @Then("verify alert message shows up")
    public void verifyAlertMessageShowsUp() {viceDeanPage.ssnAlertMessagezz.isDisplayed();
    }

    //TC_13
    @And("enter passwordfirst {string}")
    public void enterPasswordfirst(String passwordfirst) {viceDeanPage.passwordFieldzz.sendKeys(passwordfirst);
    }


    //TC_14
    @And("enter passwordsecond {string}")
    public void enterPasswordsecond(String passwordsecond) {viceDeanPage.passwordFieldzz.sendKeys(passwordsecond);
    }


}

