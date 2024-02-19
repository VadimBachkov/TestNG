package org.example.test;

import org.example.pages.CheckboxesPage;
import org.example.pages.HomePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckboxTest extends BaseTest {
    HomePage homePage = new HomePage();
    CheckboxesPage checkboxesPage = new CheckboxesPage();

    @Test
    public void testCheckboxes() {
        homePage.clickLink("Checkboxes");
        boolean initialState1 = checkboxesPage.isChecked(checkboxesPage.checkbox1);
        boolean initialState2 = checkboxesPage.isChecked(checkboxesPage.checkbox2);

        checkboxesPage.manageCheckbox(checkboxesPage.checkbox1);

        boolean actualState1 = checkboxesPage.isChecked(checkboxesPage.checkbox1);
        boolean actualState2 = checkboxesPage.isChecked(checkboxesPage.checkbox2);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(initialState1);
        softAssert.assertTrue(initialState2);
        softAssert.assertTrue(actualState1);
        softAssert.assertTrue(actualState2);

        checkboxesPage.uncheckedAll();
        checkboxesPage.selectAll();

        softAssert.assertAll();
    }
}
