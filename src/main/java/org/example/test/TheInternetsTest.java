package org.example.test;

import org.example.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TheInternetsTest extends BaseTest {

    HomePage homePage = new HomePage();
    private static final String EXPECTED_URL = ("https://the-internet.herokuapp.com/abtest");

    @Test(priority = 0)
    public void locatorTest() {
        HomePage homePage = new HomePage();
       // homePage.clickLink(homePage.abTesting);
        String actualURL = driver.getCurrentUrl();
        Assert.assertTrue(actualURL.equals(EXPECTED_URL));
    }

}
