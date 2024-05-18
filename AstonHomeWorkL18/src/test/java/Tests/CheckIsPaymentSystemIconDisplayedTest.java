package Tests;

import PageOdjects.MainPageObject;
import PageOdjects.ModalPayWindowPageObject;
import Utils.GetWebDriver;
import Utils.MakeScreenshot;
import io.qameta.allure.*;
import org.junit.*;

@Epic("OnlinePaymentBlock")
@Feature("Check icons")
public class CheckIsPaymentSystemIconDisplayedTest {
    private GetWebDriver driver;
    private MainPageObject mainPage;
    private ModalPayWindowPageObject modalPage;
    private MakeScreenshot screenshot;

    @Before
    public void setup() {
        driver = new GetWebDriver();
        mainPage = new MainPageObject(driver.getWebDriver());
        modalPage = new ModalPayWindowPageObject(driver.getWebDriver());
        screenshot = new MakeScreenshot(driver.getWebDriver());
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
        screenshot.makeScreenshot();
        Assert.assertEquals(expectedResult1, modalPage.isLogoDisplayed());
        screenshot.makeScreenshot();
        Assert.assertEquals(expectedResult2, modalPage.getLogosCount());
        screenshot.makeScreenshot();
    }
}