package PageOdjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.List;

public class MainPageObject {
    @FindBy(xpath = "//div[@class='col-12 col-xl-8']//h2[1]")
    private WebElement topUpOnline;
    @FindBy(xpath = "//div[@class='pay__partners']//ul//img")
    private List<WebElement> listOfPartners;
    @FindBy(xpath = "//a[text()='Подробнее о сервисе']")
    private WebElement linkDetailedService;
    @FindBy(xpath = "//input[@class='phone']")
    private WebElement phoneNumberField;
    @FindBy(xpath = "//input[@class='total_rub']")
    private WebElement totalSumField;
    @FindBy(xpath = "//input[@class='email']")
    private WebElement emailField;
    @FindBy(xpath = "//button[@class='button button__default ' and @type='submit']")
    private WebElement continueButton;
    @FindBy(xpath = "//div[@class='app-wrapper__content-container app-wrapper__content-container_full']")
    private WebElement payWindow;
    @FindBy(id = "cookie-agree")
    private WebElement acceptCookie;

    private WebDriver driver;

    public MainPageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getName() {
        return topUpOnline.getText();
    }

    public void acceptCookie() {
        acceptCookie.click();
    }

    public List<String> getPaymentLogosText() throws InterruptedException {
        Thread.sleep(2000);
        List<String> paymentLogosText = new ArrayList<>();
        for (int i = 0; i < listOfPartners.size(); i++) {
            paymentLogosText.add(listOfPartners.get(i).getAttribute("alt"));
        }
        return paymentLogosText;
    }

    public String getLink() {
        linkDetailedService.click();
        String linkText = driver.getCurrentUrl();
        return linkText;
    }

    public void enterDataForPay() {
        phoneNumberField.sendKeys("297777777");
        totalSumField.sendKeys("100");
        emailField.sendKeys("email@email.ru");
        continueButton.click();
    }

    public boolean isWindowForPayPresent() throws InterruptedException {
        Thread.sleep(3000);
        driver.switchTo().frame(1);
        boolean isElementPresent = payWindow.isDisplayed();
        return isElementPresent;
    }
}