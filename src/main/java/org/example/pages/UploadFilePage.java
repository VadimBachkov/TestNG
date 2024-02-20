package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Selenide.$x;

public class UploadFilePage extends BasePage {
    private SelenideElement uploadFile = $x("//input[@id='file-upload']");
    private SelenideElement uploadFileButton = $x("//input[@id='file-submit']");
    private SelenideElement successMessage = $x("//h3");

    private SelenideElement uploadFileDescription = $x("//div[@id='uploaded-files']");

    public void uploadFile(String pathToFile) {
        uploadFile.sendKeys(pathToFile);
    }

    public void doUpload() {
        uploadFileButton.click();
    }

    public String getSuccessMessage() {
        return successMessage.shouldBe(Condition.visible).getText();
    }

    public String getDescription() {
        return uploadFileDescription.shouldBe(Condition.visible).getText();
    }

}
