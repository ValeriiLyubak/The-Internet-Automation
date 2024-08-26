import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeyPressesTest extends BaseTest{

    private KeyPressesPage keyPressesPage;

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        keyPressesPage = new KeyPressesPage(driver);
    }

    @Test
    public void testBackspace(){
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(), "You entered: BACK_SPACE", "Result message is incorrect");

    }

    @Test
    public void testPi(){
        keyPressesPage.enterPi();
        assertEquals(keyPressesPage.getResult(), "You entered: NUMPAD7", "Result message is incorrect");
    }
}

