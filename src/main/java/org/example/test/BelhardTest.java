package org.example.test;

import org.example.pages.BelhardPage;
import org.testng.annotations.Test;

public class BelhardTest extends  BaseTest{
    BelhardPage belhardPage = new BelhardPage();
    @Test
    public void belhardTest(){
        belhardPage.getBelhardPage();
        belhardPage.getAnalyticsExperience();

        System.out.println("test");
    }
}
