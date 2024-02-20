package org.example.test;

import org.example.pages.HomePage;
import org.example.pages.UploadFilePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UploadTest extends BaseTest {
    private static final String SUCCESS = "File Uploaded!";
    private static final String DESCRIPTION = "TestUpload.xml";
    HomePage homePage = new HomePage();
    UploadFilePage uploadFilePage = new UploadFilePage();

    @Test
    public void uploadTest() {
        homePage.clickLink("File Upload");
        uploadFilePage.uploadFile("C:\\Users\\bachk\\Documents\\Java_Belhard\\AutoTest\\TestNG\\src\\main\\java\\org\\example\\resourses\\drivers\\TestUpload.xml");
        uploadFilePage.doUpload();

        String actualSuccess = uploadFilePage.getSuccessMessage();
        String description = uploadFilePage.getDescription();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualSuccess, SUCCESS);
        softAssert.assertEquals(description, DESCRIPTION);
        softAssert.assertAll();
    }
}
