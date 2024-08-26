import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTest extends BaseTest{
    private HoversPage hoversPage;

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        hoversPage = new HoversPage(driver);
    }

    @Test
    public void testHoverUser1(){
        hoversPage.hoverOverFigure(1);
        assertTrue(hoversPage.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(hoversPage.getTitle(), "name: user1", "Caption title is incorrect");
        assertEquals(hoversPage.getLinkText(), "View profile", "Incorrect link text");
        assertTrue(hoversPage.getLink().endsWith("/users/1"), "Link is incorrect");
    }
}


