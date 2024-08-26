import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.FileuploadPage;

import static org.testng.Assert.assertEquals;

public class FileuploadTest extends BaseTest{
    private FileuploadPage fileuploadPage;

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        fileuploadPage = new FileuploadPage(driver);
    }

    @Test
    public void testFileUpload(){
        fileuploadPage.uploadFile("C:\\Users\\valer\\IdeaProjects\\The-Internet-Automation\\src\\main\\resources\\configuration.properties");
        assertEquals(fileuploadPage.getResultMessage(), "configuration.properties", "Incorrect file name or file");
    }


}
