package org.example.pages.playground;

import com.codeborne.selenide.*;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class DynamicTablePage {
    private SelenideElement valueToCheck = $x("//p[@class='bg-warning']");
    private ElementsCollection headers = $$x("//span[@role='columnheader']");
    private SelenideElement rows = $x("//span[@role='cell' and text()='Chrome']/..");

    public String getSearchValue() {
        String initial = valueToCheck.getText();
        return initial.split(" ")[2];
    }

    public int getHeaderIndex() {
        List<WebElement> elementList = WebDriverRunner.getWebDriver().findElements(By.xpath("//span[@role='columnheader']"));
        int index = 0;
        for (int i = 0; i < elementList.size() - 1; i++) {
            if (elementList.get(i).getText().equals("CPU")) {
                index = i;
                System.out.println(i);
            }
        }
        return index;
    }

    public String getCPUValue(int index) {
        return rows.$x(String.format("./span[%s]", String.valueOf(index + 1))).getText();
    }
}
