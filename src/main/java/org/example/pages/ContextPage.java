package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$x;

public class ContextPage extends BasePage {
    SelenideElement contextArea = $x("//div[@id='hot-spot']");

    public void manageArea() {
        contextArea.contextClick();
    }

    public String getAlertText() {
        return WebDriverRunner.getWebDriver().switchTo().alert().getText();
    }

    public void confirmAlert() {
        WebDriverRunner.getWebDriver().switchTo().alert().accept();
    }
}
