package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage extends BasePage{
    private By horizontalSliderLink = By.xpath("//a[contains(text(), 'Horizontal Slider')]");

    private By sliderField = By.cssSelector("input[type='range']");

    private By result = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
        clickLink(horizontalSliderLink);
    }

    public void setSliderRange(double desiredValue){
        WebElement slider = driver.findElement(sliderField);
        slider.click();
        int numPresses = (int) (desiredValue * 2);

        Actions action = new Actions(driver);
        if(numPresses > 0){
            for(int i = 0; i < numPresses; i++){

                action.sendKeys(Keys.ARROW_RIGHT).perform();
                action.sendKeys(Keys.ARROW_LEFT).perform();

            }
            action.sendKeys(Keys.ARROW_RIGHT).perform();
        }
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }
}
