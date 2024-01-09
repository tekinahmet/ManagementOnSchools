package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }




    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginSY;



    //Fatma Karmis
    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement loginFK;


    @FindBy(id = "username")
    public WebElement userNameFK;


    @FindBy(id = "password")
    public WebElement passwordFK;


    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement loginButtonFK;

}
