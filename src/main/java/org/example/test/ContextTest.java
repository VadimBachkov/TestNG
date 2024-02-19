package org.example.test;

import org.example.pages.ContextPage;
import org.example.pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextTest extends BaseTest {
    private static final String EXPECTED_TEXT = "You selected a context menu";
    HomePage homePage = new HomePage();
    ContextPage contextPage = new ContextPage();

    @Test
    public void contextTest() {
        homePage.clickLink("Context Menu");
        contextPage.manageArea();

        String alertText = contextPage.getAlertText();
        contextPage.confirmAlert();

        Assert.assertEquals(alertText, EXPECTED_TEXT);
    }
}
