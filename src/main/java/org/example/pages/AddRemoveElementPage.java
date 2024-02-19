package org.example.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class AddRemoveElementPage extends BasePage {

    //By addButton = (By.xpath("//div[@class='example']/button[@onclick='addElement()']"));
    private SelenideElement addButton = $x("//div[@class='example']/button[@onclick='addElement()']");
    //By deleteButtonList = (By.xpath("//div[@id='elements']/button"));
    private ElementsCollection deleteButtonList = $$x("//div[@id='elements']/button");
    //By addCSSButton = By.cssSelector("div.example>button[onclick='addElement()']");
    private SelenideElement addCSSButton = $("div.example>button[onclick='addElement()']");

    /* public AddRemoveElementPage(WebDriver driver) {
        super(driver);
    }*/

    public SelenideElement getAddButton() {
        return $x("//div[@class='example']/button[@onclick='addElement()']");
    }

    @Step("Добавить кол-во елементов равное {clickCount}")
    public void addElement(int clickCount) {
        for (int i = 0; i < clickCount; i++) {
            addCSSButton.click();
        }
    }

    public ElementsCollection getDeleteButtonList() {
        return $$x("//div[@id='elements']/button");
    }

}
