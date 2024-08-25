package pages;

import config.ConfigManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected String baseUrl;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.baseUrl = ConfigManager.getBaseUrl();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        navigateToBaseUrl();

    }

    private void navigateToBaseUrl() {
        driver.get(baseUrl);
    }

    public void clickLink(By locator) {
        wait.until(driver ->driver.findElement(locator)).click();
    }
}
