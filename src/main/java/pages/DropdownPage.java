package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage extends BasePage{

    private By dropdownPageLink = By.xpath("//a[contains(text(), 'Dropdown')]");

    private By dropdownMenu = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        super(driver);
        clickLink(dropdownPageLink);
    }
    public void selectFromDropdown(String option){
        findDropDownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdownMenu));
    }

}
