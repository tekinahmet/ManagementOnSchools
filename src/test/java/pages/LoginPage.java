package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

  public LoginPage(){
          PageFactory.initElements(Driver.getDriver(),this);

  }
    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameSY;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordSY;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButtonSY;



    //Melik 25-40
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement login_MS;

  @FindBy(id = "username")
  public WebElement username_MS;

  @FindBy(id = "password")
  public WebElement password_MS;

  @FindBy(xpath = "//button[text()='Login']")
  public WebElement loginButton_MS;
}
