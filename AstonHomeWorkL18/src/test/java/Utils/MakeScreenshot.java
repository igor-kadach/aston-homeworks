package Utils;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class MakeScreenshot {

    private WebDriver driver;

    public MakeScreenshot(WebDriver driver) {
        this.driver = driver;
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] makeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}