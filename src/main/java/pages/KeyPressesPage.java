package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage extends BasePage{
    private By keyPressesLink = By.xpath("//a[contains(text(), 'Key Presses')]");

    private By inputField = By.id("target");

    private By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        super(driver);
        clickLink(keyPressesLink);
    }


    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public void enterPi(){
        enterText(Keys.chord(Keys.ALT, Keys.NUMPAD2, Keys.NUMPAD2, Keys.NUMPAD7));
    }

    public String getResult(){
        return driver.findElement(resultText).getText();
    }

}
