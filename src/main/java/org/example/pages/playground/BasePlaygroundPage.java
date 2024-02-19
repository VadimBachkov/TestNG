package org.example.pages.playground;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class BasePlaygroundPage {
    private SelenideElement dynamicTableLink = $x("//div[@class='col-sm']/h3/a[text()='Dynamic Table']");

    public void getContentPage(SelenideElement dynamicTableLink) {
        dynamicTableLink.click();
    }

    ;
}
