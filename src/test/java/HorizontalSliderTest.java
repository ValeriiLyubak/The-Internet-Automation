import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.HorizontalSliderPage;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTest extends BaseTest{
    private HorizontalSliderPage horizontalSliderPage;

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        horizontalSliderPage = new HorizontalSliderPage(driver);
    }

    @Test
    public void setHorizontalSlideRange(){
        double sliderRange = 3;
        horizontalSliderPage.setSliderRange(sliderRange);
        assertEquals(Double.parseDouble(horizontalSliderPage.getResult()), sliderRange, "Result and adjusted range do not match.");
    }
}
