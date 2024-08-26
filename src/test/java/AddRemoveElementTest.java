import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddElementPage;
import pages.CheckboxesPage;

public class AddRemoveElementTest extends BaseTest{
    private AddElementPage addElementPage;

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        addElementPage = new AddElementPage(driver);
    }

    @Test
    public void testAddElement() {
        addElementPage.clickAddElementButton();
        addElementPage.clickRemoveButton();
    }
}
