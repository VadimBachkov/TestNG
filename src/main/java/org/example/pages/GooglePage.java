package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;


public class GooglePage extends BasePage {
    final static String URL = "https://www.google.com/";
    SelenideElement input = $x("//textarea[@id='APjFqb']");

    public void getGoogle() {
        open(URL);
    }

    public void findContent(String search){
        input.setValue(search).pressEnter();
    }
}
