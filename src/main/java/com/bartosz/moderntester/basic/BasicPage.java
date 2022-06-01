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

    public static By bySimpleAlert = By.id("simple-alert-label");
    public static By byPromptLabel = By.id("prompt-label");
    public static By byConfirmLabel = By.id("confirm-label");
    public static By byDalayedAlert = By.id("delayed-alert-label");

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

    public String getLeadText(By by) {
        return driver.findElement(by).getText();
    }
}

