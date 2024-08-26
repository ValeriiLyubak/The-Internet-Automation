package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxesPage extends BasePage{
    private By checkBoxesLink = By.xpath("//a[contains(text(), 'Checkboxes')]");

    private By firstCheckbox = By.xpath("//form[@id='checkboxes']/input[1]");

    private By secondCheckbox = By.xpath("//form[@id='checkboxes']/input[2]");

    public CheckboxesPage(WebDriver driver) {
        super(driver);
        clickLink(checkBoxesLink);
    }

    public void selectFirstCheckbox() {
        driver.findElement(firstCheckbox).click();
    }

    public void selectSecondCheckbox() {
        driver.findElement(secondCheckbox).click();
    }
}
