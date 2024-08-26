import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CheckboxesPage;

public class CheckboxesTest extends BaseTest{
    private CheckboxesPage checkboxesPage;

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        checkboxesPage = new CheckboxesPage(driver);
    }

    @Test
    public void testCheckboxSelection() {
        checkboxesPage.selectFirstCheckbox();
        checkboxesPage.selectSecondCheckbox();
    }
}
