package com.bartosz.moderntester.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Basic {
    private final WebDriver driver;

    public Basic(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#alerts-item")
    private WebElement alertsSelect;
    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle'] [contains(text(),'Basic')]")
    private WebElement basicDropdown;
    @FindBy(css = "#form-item")
    private WebElement formButton;
    @FindBy(css = ".success")
    WebElement validatorMessage;
    @FindBy(css = "#windows-tabs-item")
    private WebElement windowsTabsButton;


    public String getMessageFromValidation() {
        return validatorMessage.getText();
    }

    public void goToAlerts() {
        basicDropdown.click();
        alertsSelect.click();
    }

    public void goToForms() {
        basicDropdown.click();
        formButton.click();
    }

    public void goToFillForm() {
        basicDropdown.click();
        formButton.click();
    }

    public void goToWidnowsTabs() {
        basicDropdown.click();
        windowsTabsButton.click();
    }

}

