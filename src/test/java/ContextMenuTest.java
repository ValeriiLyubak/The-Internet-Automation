import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTest{
    private ContextMenuPage contextMenuPage;

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        contextMenuPage = new ContextMenuPage(driver);
    }

    @Test
    public void contextMenuTest(){
        contextMenuPage.clickHotSpot();
        String message = contextMenuPage.getAlertMessage();
        contextMenuPage.acceptAlert();
        assertEquals(message, "You selected a context menu", "Alert message is incorrect");
    }
}
