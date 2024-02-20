package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class HorizontalSliderPage extends BasePage {
    private SelenideElement scroller = $x("//input[@type='range']");
    private SelenideElement rangeValue = $x("//span[@id='range']");

    @Step("Перемещение положения ползунка")
    public void moveScroller(String scrollTo) {
        while (rangeValue.getText().equals(scrollTo)) {
            scroller.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    @Step("Получение текущего значения ползунка")
    public String getRangeValue() {
        return rangeValue.getText();
    }
}
