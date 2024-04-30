package Tests;

import PageOdjects.MainPageObject;
import PageOdjects.ModalPayWindowPageObject;
import Utils.GetWebDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckIsPaymentSystemIconDisplayedTest {
    private GetWebDriver driver;
    private MainPageObject mainPage;
    private ModalPayWindowPageObject modalPage;

    @Before
    public void setup() {
        driver = new GetWebDriver();
        mainPage = new MainPageObject(driver.getWebDriver());
        modalPage = new ModalPayWindowPageObject(driver.getWebDriver());
        mainPage.acceptCookie();
    }

    @After
    public void quit() {
        GetWebDriver.teardown();
    }

    @Test
    public void checkIsPaymentSystemIconDisplayed() throws InterruptedException {
        boolean expectedResult1 = true;
        int expectedResult2 = 5;
        mainPage.enterDataForPay();
        Assert.assertEquals(expectedResult1, modalPage.isLogoDisplayed());
        Assert.assertEquals(expectedResult2, modalPage.getLogosCount());
    }
}