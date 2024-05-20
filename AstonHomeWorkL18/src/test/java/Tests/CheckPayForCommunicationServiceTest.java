package Tests;

import PageOdjects.MainPageObject;
import PageOdjects.ModalPayWindowPageObject;
import Utils.GetWebDriver;
import Utils.MakeScreenshot;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.*;

@Epic("OnlinePaymentBlock")
@Feature("Check service")
public class CheckPayForCommunicationServiceTest {
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
    public void checkPayForCommunicationService() throws InterruptedException {
        boolean expectedResult = true;
        mainPage.enterDataForPay();
        screenshot.makeScreenshot();
        Assert.assertEquals(expectedResult, modalPage.checkDataForCommunicationPay());
        screenshot.makeScreenshot();
    }
}