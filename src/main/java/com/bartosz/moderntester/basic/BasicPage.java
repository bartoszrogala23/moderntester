package com.bartosz.moderntester.basic;

import org.openqa.selenium.By;
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

    public By byPromptLabel = By.className("lead");

    @FindBy(css = "#alerts-item")
    private WebElement alertsSelect;
    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle'] [contains(text(),'Basic')]")
    private WebElement basicDropdown;
    @FindBy(css = "#windows-tabs-item")
    private WebElement windowsTabsButton;



    public void goToAlerts() {
        basicDropdown.click();
        alertsSelect.click();
    }

    public void goToWindowsTabs() {
        basicDropdown.click();
        windowsTabsButton.click();
    }

    public String getPromptLabelText() {
        return driver.findElement(byPromptLabel).getText();
    }
}

