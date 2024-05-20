package Tests;

import PageOdjects.MainPageObject;
import Utils.GetWebDriver;
import Utils.MakeScreenshot;
import io.qameta.allure.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

@Epic("OnlinePaymentBlock")
@Feature("Check icons")
public class CheckLogoPaySystemsTest {
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
    public void checkLogoPaySystems() throws InterruptedException {
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Visa");
        expectedResult.add("Verified By Visa");
        expectedResult.add("MasterCard");
        expectedResult.add("MasterCard Secure Code");
        expectedResult.add("Белкарт");
   //     expectedResult.add("МИР");
        screenshot.makeScreenshot();
        Assert.assertEquals(expectedResult, mainPage.getPaymentLogosText());
        screenshot.makeScreenshot();
    }
}