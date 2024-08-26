import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

public class ForgotPasswordTest extends BaseTest{
    private ForgotPasswordPage forgotPasswordPage;

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        forgotPasswordPage = new ForgotPasswordPage(driver);
    }

    @Test
    public void testForgotPassword(){
        forgotPasswordPage.setEmailInput("test@gmail.com");
        forgotPasswordPage.clickSubmit();
    }
}
