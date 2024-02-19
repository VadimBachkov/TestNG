package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.example.test.BaseTest;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class BelhardPage extends BasePage {

    public void getBelhardPage() {
        open(BaseTest.getFromProperties("belhard_url"));
    }

    // private By getWorkExperience = By.xpath("//div/a[@data-tooltip-menu-id='346409565']");
    private SelenideElement getWorkExperience = $x("//div/a[@data-tooltip-menu-id='346409565']");
    //private By businessAnalytics = By.xpath("//a[text()='Стажировка'");
    private SelenideElement businessAnalytics = $x("//a[text()='Стажировка'");

    public void getAnalyticsExperience() {
        /*actions.moveToElement(driver.findElement(getWorkExperience)).build().perform();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(businessAnalytics)));
        driver.findElement(businessAnalytics).click();*/
        getWorkExperience.hover();
        businessAnalytics.shouldBe(Condition.visible, Duration.ofSeconds(30)).click();

    }
}
