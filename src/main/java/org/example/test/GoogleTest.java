package org.example.test;

import org.example.pages.GooglePage;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
    GooglePage googlePage = new GooglePage();

    @Test
    public void googleTest() {
        googlePage.getGoogle();
        googlePage.findContent("House");
        BaseTest.takeScreenshot();
        System.out.println("Test");
    }
}
