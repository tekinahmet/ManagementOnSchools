package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ChooseLessonPage {
    public ChooseLessonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
