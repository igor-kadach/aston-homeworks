package Tests;

import PageOdjects.MainPageObject;
import Utils.GetWebDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckButtonContinueTest {
    private GetWebDriver driver;
    private MainPageObject mainPage;

    @Before
    public void setup() {
        driver = new GetWebDriver();
        mainPage = new MainPageObject(driver.getWebDriver());
        mainPage.acceptCookie();
    }

    @After
    public void quit() {
        GetWebDriver.teardown();
    }

    @Test
    public void сheckButtonContinue() throws InterruptedException {
        mainPage.enterDataForPay();
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, mainPage.isWindowForPayPresent());
    }
}