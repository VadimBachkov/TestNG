package org.example.test;

import org.example.pages.BasicAuthPage;
import org.example.pages.HomePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    HomePage homePage = new HomePage();
    BasicAuthPage authPage = new BasicAuthPage();

    @Test
    public void loginTest() {
        homePage.clickLink("Basic Auth");
        authPage.login("admin", "Admin");
    }
}
