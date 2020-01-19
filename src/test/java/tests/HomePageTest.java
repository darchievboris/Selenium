package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.SeleniumUtils;

public class HomePageTest extends TestBase {
    HomePage homePage;


    @BeforeMethod
    public void  setUp(){
        initialzor();
        homePage = new HomePage();

    }
    @AfterMethod
    public void teardDown(){
        driver.quit();
    }
    @Test
    public  void verifyHomeTitle(){
        String expected = driver.getTitle();
//        SeleniumUtils.waitForVisibilityOfElement(homePage.logIn_Btn);
        Assert.assertEquals(expected, "SeleniumHQ Browser Automation");
    }

    @Test
    public void testLogInBtn(){
        SeleniumUtils.click(homePage.logIn_Btn);
        String expectedTitle = "Dashboard";
//        Assert.assertEquals(expected);

    }
}

