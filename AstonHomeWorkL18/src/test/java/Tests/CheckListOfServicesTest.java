package Tests;

import PageOdjects.MainPageObject;
import Utils.GetWebDriver;
import Utils.MakeScreenshot;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.*;

@Epic("OnlinePaymentBlock")
@Feature("Check icons")
public class CheckListOfServicesTest {
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
    public void checkListOfServices() {
        String[] expectedResult = new String[]{"Услуги связи", "Домашний интернет", "Рассрочка", "Задолженность"};
        screenshot.makeScreenshot();
        Assert.assertArrayEquals(expectedResult, mainPage.getListOfServices());
        screenshot.makeScreenshot();
    }
}