package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;

public class AlertPage extends BasePage {

    private static final String TRIGGER_ALERT_BUTTON_XPATH = "//button[text()='Click for JS Alert']";
    private static final String TRIGGER_CONFIRM_BUTTON_XPATH = "//button[text()='Click for JS Confirm']";
    private static final String TRIGGER_PROMPT_BUTTON_XPATH = "//button[text()='Click for JS Prompt']";
    private static final String RESULT_MESSAGE_ID = "result";

    private By triggerAlertButton = By.xpath(TRIGGER_ALERT_BUTTON_XPATH);
    private By triggerConfirmButton = By.xpath(TRIGGER_CONFIRM_BUTTON_XPATH);
    private By triggerPromptButton = By.xpath(TRIGGER_PROMPT_BUTTON_XPATH);
    private By resultMessage = By.id(RESULT_MESSAGE_ID);

    private By alertPageLink = By.xpath("//a[contains(text(), 'JavaScript Alerts')]");

    public AlertPage(WebDriver driver) {
        super(driver);
        clickLink(alertPageLink);
    }

    private Alert getAlert() {
        return driver.switchTo().alert();
    }

    public void setPromptMessage(String text) {
        getAlert().sendKeys(text);
    }
    public void cancelAlert(){
        getAlert().dismiss();
    }
    public void AcceptAlert(){
        getAlert().accept();
    }
    public String getResultMessage(){
        return driver.findElement(resultMessage).getText();
    }
    public void triggerAlert() {
        clickLink(triggerAlertButton);
    }
    public void triggerConfirm() {
        clickLink(triggerConfirmButton);
    }
    public void triggerPrompt() {
        clickLink(triggerPromptButton);
    }
}
