package org.example.test;

import com.codeborne.selenide.WebDriverRunner;
import org.example.pages.FramesPage;
import org.example.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest{
    HomePage homePage = new HomePage();
    FramesPage framesPage = new FramesPage();

    @Test
    public void frameTest(){
        homePage.clickLink("Frames");
        framesPage.getIframe();
        WebDriverRunner.getWebDriver().switchTo().frame(0);
        Assert.assertTrue(framesPage.getTinyMce().exists());
        WebDriverRunner.getWebDriver().switchTo().defaultContent();
    }
}
