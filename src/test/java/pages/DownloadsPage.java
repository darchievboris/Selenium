package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadsPage extends TestBase {
    public DownloadsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "body-large")
    public WebElement bodyLarg;

}
