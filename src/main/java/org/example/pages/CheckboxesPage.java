package org.example.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CheckboxesPage extends BasePage {
    public SelenideElement checkbox1 = $x("//form[@id='checkboxes']/input[1]");
    public SelenideElement checkbox2 = $x("//form[@id='checkboxes']/input[2]");

    ElementsCollection allCheckboxes = $$x("//form[@id='checkboxes']/input");

    public void manageCheckbox(SelenideElement checkbox) {
        checkbox.click();
    }

    public boolean isChecked(SelenideElement checkbox) {
        return checkbox.isSelected();
    }

    public void selectAll() {
        allCheckboxes.iterator().forEachRemaining(element ->{
            if (!element.isSelected()) {
                element.click();
            }
        });
    }

    public void uncheckedAll() {
        allCheckboxes.iterator().forEachRemaining(element ->{
            if (element.isSelected()) {
                element.click();
            }
        });
    }

}
