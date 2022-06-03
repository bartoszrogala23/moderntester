package com.bartosz.moderntester.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicPage {
    protected WebDriver driver;

    public BasicPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle'] [contains(text(),'Basic')]")
    private WebElement basicDropdown;
    @FindBy(css = "#windows-tabs-item")
    private WebElement windowTabButton;
    @FindBy(id = "prompt-label")
    private WebElement promptLabel;
    @FindBy(id = "confirm-label")
    private WebElement confirmLabel;
    @FindBy(id = "simple-alert-label")
    private WebElement simpleAlertLabel;
    @FindBy(id = "delayed-alert-label")
    private WebElement delayedAlertLabel;

    public void fillThePopUpWithName(String name) {
        driver.switchTo().alert().sendKeys(name);
        driver.switchTo().alert().accept();
    }

    public void goToWindowsTabs() {
        basicDropdown.click();
        windowTabButton.click();
    }

    public String getPromptLabelText() {
        return promptLabel.getText();
    }

    public String getConfirmLabelText() {
        return confirmLabel.getText();
    }

    public String getDelayedLabelText() {
        return delayedAlertLabel.getText();
    }

    public String getSimpleAlertLabel() {
        return simpleAlertLabel.getText();
    }
}

