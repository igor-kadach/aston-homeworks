package Tests;

import PageOdjects.MainPageObject;
import PageOdjects.ModalPayWindowPageObject;
import Utils.GetWebDriver;
import Utils.MakeScreenshot;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

@Epic("OnlinePaymentBlock")
@Feature("Check fields name")
public class CheckFieldNamesCardPayTest {
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
    public void checkFieldNamesCardPay() throws InterruptedException {
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Номер карты");
        expectedResult.add("Срок действия");
        expectedResult.add("CVC");
        expectedResult.add("Имя держателя (как на карте)");
        mainPage.enterDataForPay();
        screenshot.makeScreenshot();
        Assert.assertEquals(expectedResult, modalPage.getFieldNamePayCard());
        screenshot.makeScreenshot();
    }
}