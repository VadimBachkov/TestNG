package org.example.test.playgroundTests;

import io.qameta.allure.Step;
import org.example.pages.HomePage;
import org.example.pages.HorizontalSliderPage;
import org.example.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalScrollerTest extends BaseTest {
    private static final String MOVE_TO = "0";
    String actualRange;
    HomePage homePage = new HomePage();
    HorizontalSliderPage horizontalSliderPage = new HorizontalSliderPage();

    @Test
    public void scrollTest(){
        homePage.clickLink("Horizontal Slider");
        horizontalSliderPage.moveScroller(MOVE_TO);

        actualRange = horizontalSliderPage.getRangeValue();
        Assert.assertTrue(assertLocation());
    }
    @Step("Проверка положения ползунка")
    private boolean assertLocation(){
        return MOVE_TO.equals(actualRange);
    }
}
