package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;



public class HoversPage extends BasePage{
    private By hoversPageLink = By.xpath("//a[contains(text(), 'Hovers')]");

    private By figureBox = By.className("figure");

    private By boxCaption = By.className("figcaption");

    private FigureCaption currentCaption;

    public HoversPage(WebDriver driver) {
        super(driver);
        clickLink(hoversPageLink);
    }

    public void hoverOverFigure(int index) {
        var figure = driver.findElements(figureBox).get(index - 1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();

        this.currentCaption = new FigureCaption(figure.findElement(boxCaption));
    }

    public boolean isCaptionDisplayed(){
        return this.currentCaption.isDisplayed();
    }

    public String getTitle(){
        return this.currentCaption.getTitle();
    }

    public String getLink(){
        return this.currentCaption.getLink();
    }

    public String getLinkText(){
        return this.currentCaption.getLinkText();
    }

    public class FigureCaption {
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");
        public FigureCaption(WebElement caption){
            this.caption = caption;
        }

        public boolean isDisplayed(){
            return caption.isDisplayed();
        }

        public String getTitle(){
            return caption.findElement(header).getText();
        }

        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }

        public String getLinkText(){
            return caption.findElement(link).getText();
        }
    }
}




