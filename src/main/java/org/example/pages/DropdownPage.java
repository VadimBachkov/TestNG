package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
@Getter
public class DropdownPage {
    private SelenideElement dropdown = $x("//select[@id='dropdown']");
    private SelenideElement optionDisable = $x("//select[@id='dropdown']/option[text()='Please select an option']");
    private SelenideElement option1 = $x("//select[@id='dropdown']/option[text()='Option 1']");
    private SelenideElement option2 = $x("//select[@id='dropdown']/option[text()='Option 2']");

    public void selectOption(SelenideElement option){
        dropdown.click();
        option.shouldBe(Condition.visible, Duration.ofSeconds(3)).click();
    }

}
