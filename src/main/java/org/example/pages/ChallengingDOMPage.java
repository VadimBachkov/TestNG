package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;

public class ChallengingDOMPage extends BasePage {
    // By answerPayload = By.xpath("//canvas[@id='canvas']");
    public SelenideElement button = $x("//div[@class='large-2 columns']/a[@class='button']");
    public SelenideElement alertButton = $x("//div[@class='large-2 columns']/a[@class='button alert']");
    public By successButton = By.xpath("//div[@class='large-2 columns']/a[@class='button success']");

    public void pressButton(SelenideElement element) {
        element.click();
    }

    public SelenideElement getButton(SelenideElement element) {
        return element;
    }
}
