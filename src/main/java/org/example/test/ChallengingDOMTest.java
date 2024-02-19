package org.example.test;

import org.example.pages.ChallengingDOMPage;
import org.example.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ChallengingDOMTest extends BaseTest{
    HomePage homePage = new HomePage();
    ChallengingDOMPage challengingDom = new ChallengingDOMPage();

    @Test
    public void challengeTest(){
        homePage.clickLink("Challeging DOM");
        // challengingDom.pressButton(challengingDom.button);
        // challengingDom.pressButton(challengingDom.alertButton);
        // challengingDom.pressButton(challengingDom.successButton);
        WebElement element = challengingDom.getButton(challengingDom.button);
        String actualColor = element.getCssValue("color");

        System.out.println("test");
    }
}
