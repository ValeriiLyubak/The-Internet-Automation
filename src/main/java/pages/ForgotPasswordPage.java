package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage extends BasePage{

    private By forgotPasswordLink = By.xpath("//a[contains(text(), 'Forgot Password')]");

    private By emailInputField = By.id("email");

    private By submitButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
        clickLink(forgotPasswordLink);
    }

    public void setEmailInput(String emailInput){
        driver.findElement(emailInputField).sendKeys(emailInput);
    }

    public void clickSubmit(){
        driver.findElement(submitButton).click();
    }

}
