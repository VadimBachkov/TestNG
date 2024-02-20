package org.example.test;

import org.example.pages.DropdownPage;
import org.example.pages.HomePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Collection;

public class DropdownTest extends BaseTest {
    HomePage homePage = new HomePage();
    DropdownPage dropdownPage = new DropdownPage();

    @Test
    public void dropdownTest() {
        homePage.clickLink("Dropdown");
        dropdownPage.selectOption(dropdownPage.getOption1());
        System.out.println("test");
    }
}
