import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DropdownPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTest{

    private DropdownPage dropdownPage;

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        dropdownPage = new DropdownPage(driver);
    }

    @Test
    public void testSelectOption(){
        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");

    }
}
