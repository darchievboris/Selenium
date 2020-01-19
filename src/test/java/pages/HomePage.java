package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

public class HomePage extends TestBase {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="btnLogin")
    public WebElement logIn_Btn;

    @FindBy(className = "download-button webdriver")
    public WebElement donwloadSeleniumWebDriver_Btn;

    public void clickDonwloadSeleniumWebDriver_Btn(){
        SeleniumUtils.moveIntoView(donwloadSeleniumWebDriver_Btn);
        SeleniumUtils.click(donwloadSeleniumWebDriver_Btn);
    }

    public static void main(String[] args) {
       HomePage o = new HomePage();
       o.clickDonwloadSeleniumWebDriver_Btn();
    }
}

