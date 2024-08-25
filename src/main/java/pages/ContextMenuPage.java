package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage {

    private By contextMenuPageLink = By.xpath("//a[contains(text(), 'Context Menu')]");

    private By hotSpotArea = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        super(driver);
        clickLink(contextMenuPageLink);
    }

    public void clickHotSpot() {
        var button = driver.findElement(hotSpotArea);
        Actions actions = new Actions(driver);
        actions.contextClick(button).perform();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public String getAlertMessage(){
        return driver.switchTo().alert().getText();
    }
}
