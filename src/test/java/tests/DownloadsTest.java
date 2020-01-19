package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DownloadsPage;
import pages.HomePage;
import utils.SeleniumUtils;

public class DownloadsTest extends TestBase {
    HomePage homePage;
    DownloadsPage downloadsPage;

    @BeforeMethod
    public void setUp(){
        initialzor();
        homePage = new HomePage();
        homePage.clickDonwloadSeleniumWebDriver_Btn();

    }

    @AfterMethod
    public void treadDown(){
        driver.quit();
    }

    @Test
    public void verifyBodyParagraph(){
        String actual = SeleniumUtils.getText(downloadsPage.bodyLarg);
        Assert.assertEquals(actual ,"Below is where you can find the latest releases of all the Selenium components. You can also find a list of previous releases, source code, and additional information for Maven users.");

    }
}
