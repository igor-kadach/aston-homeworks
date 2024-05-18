package Tests;

import PageOdjects.MainPageObject;
import Utils.GetWebDriver;
import Utils.MakeScreenshot;
import io.qameta.allure.*;
import org.junit.*;

@Epic("OnlinePaymentBlock")
@Feature("Check elements")
public class CheckButtonContinueTest {
    private GetWebDriver driver;
    private MainPageObject mainPage;
    private MakeScreenshot screenshot;

    @Before
    public void setup() {
        driver = new GetWebDriver();
        mainPage = new MainPageObject(driver.getWebDriver());
        screenshot = new MakeScreenshot(driver.getWebDriver());
        mainPage.acceptCookie();
    }

    @After
    public void quit() {
        GetWebDriver.teardown();
    }

    @Test
    public void сheckButtonContinue() throws InterruptedException {
        boolean expectedResult = true;
        mainPage.enterDataForPay();
        screenshot.makeScreenshot();
        Assert.assertEquals(expectedResult, mainPage.isWindowForPayPresent());
        screenshot.makeScreenshot();
    }
}