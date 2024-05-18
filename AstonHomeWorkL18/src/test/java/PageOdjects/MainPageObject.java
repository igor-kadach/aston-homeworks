package PageOdjects;

import io.qameta.allure.Step;
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
    private List<WebElement> listOfPaymentSystems;
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
    @FindBy(id = "pay")
    private WebElement servicesList;

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

    @Step("Get list of logo for assert")
    public List<String> getPaymentLogosText() throws InterruptedException {
        Thread.sleep(2000);
        List<String> paymentLogosText = new ArrayList<>();
        for (int i = 0; i < listOfPaymentSystems.size(); i++) {
            paymentLogosText.add(listOfPaymentSystems.get(i).getAttribute("alt"));
        }
        return paymentLogosText;
    }
    @Step("Get link for assert")
    public String getLink() {
        linkDetailedService.click();
        return driver.getCurrentUrl();
    }

    @Step("User enter data for pay")
    public void enterDataForPay() {
        phoneNumberField.sendKeys("297777777");
        totalSumField.sendKeys("100");
        emailField.sendKeys("email@email.ru");
        continueButton.click();
    }
    @Step("Is window present for assert")
    public boolean isWindowForPayPresent() throws InterruptedException {
        Thread.sleep(3000);
        driver.switchTo().frame(1);
        return payWindow.isDisplayed();
    }

    @Step("Get list of services for assert")
    public String[] getListOfServices() {
        String getElementText = servicesList.getText().replaceAll("\\n", ",");
        String[] servicesArray = getElementText.split(",");
        return servicesArray;
    }
}