package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;


import static com.codeborne.selenide.Selenide.$x;

public class HomePage extends BasePage {
    private String homeURL = "https://the-internet.herokuapp.com/";
    private static String LINK_PATTERN = "//ul/li/a[text()='%s']";

    public SelenideElement abTesting = $x("//ul/li/a[@href='/abtest']");

    @Step("Переход по ссылке {linkName}")
    public void clickLink(String linkName) {
        $x(String.format(LINK_PATTERN, linkName)).click();
    }

}
