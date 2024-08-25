import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AlertPage;
import pages.BasePage;

import static org.testng.Assert.assertEquals;

public class AlertsTest extends BaseTest{

    private BasePage basePage;
    private AlertPage alertPage;

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        basePage = new BasePage(driver);
        alertPage = new AlertPage(driver);
    }

    @Test
    public void testAcceptAlert() {
        alertPage.triggerAlert();
        alertPage.AcceptAlert();
        assertEquals(alertPage.getResultMessage(), "You successfully clicked an alert", "Result message is incorrect");
    }

    @Test
    public void testConfirm() {
        alertPage.triggerConfirm();
        alertPage.cancelAlert();
        assertEquals(alertPage.getResultMessage(), "You clicked: Cancel", "Result message is incorrect");
    }

    @Test
    public void testConfirmAccept() {
        alertPage.triggerConfirm();
        alertPage.AcceptAlert();
        assertEquals(alertPage.getResultMessage(), "You clicked: Ok", "Result message is incorrect");
    }

    @Test
    public void testPrompt() {
        String message = "a message";
        alertPage.triggerPrompt();
        alertPage.setPromptMessage(message);
        alertPage.AcceptAlert();
        assertEquals(alertPage.getResultMessage(), "You entered: " + message, "Result message is incorrect!");
    }

    @Test
    public void dismissPrompt() {
        alertPage.triggerPrompt();
        alertPage.cancelAlert();
        assertEquals(alertPage.getResultMessage(), "You entered: null", "Result message is incorrect!");
    }
}