package stepDefinitions.UI_StepDefinitions.US_09_19_sibel;

import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.LoginPage;

import utilities.Driver;

public class CommonStepDefs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    @Given("User navigates to home page {string} SY")
    public void user_navigates_to_home_pageSY(String string) {
        Driver.getDriver().get(string);
    }
    @Given("Click on Login ButtonSY")
    public void click_on_login_buttonSY() {
        homePage.loginSY.click();

    }
    @Given("Type UserName {string} and Password {string} SY")
    public void type_user_name_and_passwordSY(String string, String string2) {
       loginPage.userNameSY.sendKeys(string);
       loginPage.passwordSY.sendKeys(string2);

    }
    @Given("Click on the login buttonSY")
    public void click_on_the_login_buttonSY() {
        loginPage.loginButtonSY.click();
    }


}
