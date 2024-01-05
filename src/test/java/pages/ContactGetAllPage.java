package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactGetAllPage {


    public static WebElement ContactGetAll;

    public void ContactGetAllPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }







}
