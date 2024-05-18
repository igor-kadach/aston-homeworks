package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWebDriver {
    public static WebDriver driver;

    public WebDriver getWebDriver() {
        System.setProperty("webdriver.chrome.driver", "E:\\Aston\\chromedriver.exe");
        if (driver == null) {
            driver = new ChromeDriver();
            driver.get("https://www.mts.by/");
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void teardown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}