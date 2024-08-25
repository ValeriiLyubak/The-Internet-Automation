import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.BasePage;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        basePage = new BasePage(driver);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
