package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;
@Getter
public class FramesPage {
    private SelenideElement iframeLink = $x("//a[text()='iFrame']");
    private SelenideElement tinyMce = $x("//body[@id='tinymce']");

    public void getIframe() {
        iframeLink.click();
    }
}
