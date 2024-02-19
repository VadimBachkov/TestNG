package org.example.test;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebDriverRunner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.pages.AddRemoveElementPage;
import org.example.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AddDeleteTest extends BaseTest {
    HomePage homePage = new HomePage();
    AddRemoveElementPage elementPage = new AddRemoveElementPage();
    Logger log = LogManager.getFormatterLogger(AddDeleteTest.class);
    @Test
    public void addTest() {
        log.info("Конфигурация таймаутов");
        long sec = WebDriverRunner.getWebDriver().manage().timeouts().getImplicitWaitTimeout().getSeconds();
        log.info("Переход на страницу Add/Remove Elements");
        homePage.clickLink("Add/Remove Elements");
        log.info("Добавляем 5 кнопок");
        elementPage.addElement(5);

        ElementsCollection actualList = elementPage.getDeleteButtonList();
        Assert.assertTrue(actualList.size() == 5);

        String elementHandle = driver.getWindowHandle();
        //elementPage.clickLink();

    }

    @Test(description = "Add remove")
    public void addRemoveAllTest() {
        homePage.clickLink("Add/Remove Elements");
        elementPage.addElement(5);

        ElementsCollection actualList = elementPage.getDeleteButtonList();
        Assert.assertTrue(actualList.size() == 5);

        for (WebElement element : actualList) {
            element.click();
        }

        ElementsCollection afterDelete = elementPage.getDeleteButtonList();
        Assert.assertTrue(afterDelete.isEmpty());
    }

}
