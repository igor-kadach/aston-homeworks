package Tests;

import PageOdjects.MainPageObject;
import Utils.GetWebDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckListOfServicesTest {
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
    public void checkListOfServices() {
        String[] expectedResult = new String[]{"Услуги связи", "Домашний интернет", "Рассрочка", "Задолженность"};
        Assert.assertArrayEquals(expectedResult, mainPage.getListOfServices());
    }
}