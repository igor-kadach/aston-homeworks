package Tests;

import PageOdjects.MainPageObject;
import PageOdjects.ModalPayWindowPageObject;
import Utils.GetWebDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class CheckFieldNamesCardPayTest {
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
    public void checkFieldNamesCardPay() throws InterruptedException {
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Номер карты");
        expectedResult.add("Срок действия");
        expectedResult.add("CVC");
        expectedResult.add("Имя держателя (как на карте)");
        mainPage.enterDataForPay();
        Assert.assertEquals(expectedResult, modalPage.getFieldNamePayCard());
    }
}