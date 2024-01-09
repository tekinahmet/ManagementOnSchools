package stepDefinitions.UI_StepDefinitions.US_09_19_sibel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ViceDeanPage;
import utilities.Driver;

public class US09StepDefs {
    ViceDeanPage viceDeanPage = new ViceDeanPage();
    @Given(": Click Menu from right top off the pageSY")
    public void click_menu_from_right_top_off_the_pageSY() {
       viceDeanPage.menuSY.click();
    }
    @Given("Click Lesson Management from the Left Menu BarSY")
    public void click_lesson_management_from_the_left_menu_barSY() {
        viceDeanPage.lessonManagementSY.click();
    }
    @Given("Click LessonsSY")
    public void click_lessonsSY() {
        viceDeanPage.lessonListSY.click();
    }
    @Then("Check the page if created Lesson names are visibleSY")
    public void check_the_page_if_created_lesson_names_are_visibleSY() {
        Assert.assertTrue(viceDeanPage.lessonNameOnSecondRowSY.isDisplayed());

    }
    @Then("Check the page if created Compulsories are visibleSY")
    public void check_the_page_if_created_compulsories_are_visibleSY() {
        Assert.assertTrue(viceDeanPage.compulsorySecondRowSY.isDisplayed());

    }
    @Then("Check the page if created Credit Scores are visibleSY")
    public void check_the_page_if_created_credit_scores_are_visibleSY() {
        Assert.assertTrue(viceDeanPage.creditScoreSY.isDisplayed());

    }
    @Then("close the browserSY")
    public void close_the_browserSY() {
        Driver.closeDriver();

    }

    @And("Click from first row Delete Icon from the Lessons list belowSY")
    public void clickFromFirstRowDeleteIconFromTheLessonsListBelowSY() {
        viceDeanPage.viceDeleteButtonSY.click();
    }

    @Then("Check if there is a succession message for the deleted LessonSY")
    public void checkIfThereIsASuccessionMessageForTheDeletedLessonSY() {
      Driver.getDriver().switchTo().alert().accept();
    }

    @Then("Assert Lesson you deleted not on the list anymoreSY")
    public void assertLessonYouDeletedNotOnTheListAnymoreSY() {
        Assert.assertFalse(viceDeanPage.lessonNameOnSecondRowSY.isDisplayed());
    }

    @And("Inspect if there is any update sectionSY")
    public void inspectIfThereIsAnyUpdateSectionSY() {
        viceDeanPage.updateButtonSY.click();
    }
}
