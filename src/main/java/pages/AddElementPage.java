package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddElementPage extends BasePage{
    private By addElementLink = By.xpath("//a[contains(text(), 'Add/Remove Elements')]");

    private By addElementButton = By.xpath("//button[contains(text(), 'Add Element')]");

    private By removeButton = By.xpath("//button[contains(text(), 'Delete')]");


    public AddElementPage(WebDriver driver) {
        super(driver);
        clickLink(addElementLink);
    }

    public void clickAddElementButton() {
        driver.findElement(addElementButton).click();
    }

    public void clickRemoveButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(removeButton));
        driver.findElement(removeButton).click();;
    }
}
