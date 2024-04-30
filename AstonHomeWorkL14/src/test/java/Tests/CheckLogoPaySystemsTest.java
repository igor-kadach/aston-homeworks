package Tests;

import PageOdjects.MainPageObject;
import Utils.GetWebDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class CheckLogoPaySystemsTest {
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
    public void checkLogoPaySystems() throws InterruptedException {
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Visa");
        expectedResult.add("Verified By Visa");
        expectedResult.add("MasterCard");
        expectedResult.add("MasterCard Secure Code");
        expectedResult.add("Белкарт");
        expectedResult.add("МИР");
        Assert.assertEquals(expectedResult, mainPage.getPaymentLogosText());
    }
}