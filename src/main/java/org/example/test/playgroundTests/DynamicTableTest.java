package org.example.test.playgroundTests;

import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.example.pages.playground.BasePlaygroundPage;
import org.example.pages.playground.DynamicTablePage;
import org.example.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
@Log4j2
public class DynamicTableTest extends BaseTest {
    BasePlaygroundPage basePlaygroundPage = new BasePlaygroundPage();
    DynamicTablePage dynamicTablePage = new DynamicTablePage();

    @Test
    @Description("Проверка таблицы")
    public void tableTest() {
        log.info("Логи");
        open(getFromProperties("playground_url"));

        basePlaygroundPage.getContentPage(basePlaygroundPage.getDynamicTableLink());
        String expected = dynamicTablePage.getSearchValue();
        String actual = dynamicTablePage.getCPUValue(dynamicTablePage.getHeaderIndex());

        Assert.assertTrue(expected.equals(actual));
    }
}
