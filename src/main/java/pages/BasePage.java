package pages;

import config.ConfigManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    protected WebDriver driver;
    protected String baseUrl;

    public BasePage() {
        this.baseUrl = ConfigManager.getBaseUrl();
        this.driver = new ChromeDriver();
        driver.get(this.baseUrl);
        driver.manage().window().maximize();
    }
}
