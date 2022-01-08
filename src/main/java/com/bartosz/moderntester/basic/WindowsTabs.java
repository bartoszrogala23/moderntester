package com.bartosz.moderntester.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowsTabs {
    private final WebDriver driver;

    public WindowsTabs(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#newBrowserWindow")
    private WebElement newBrowserWindowButton;
    @FindBy(css = "#windows-tabs-item")
    private WebElement windowsTabsButton;
    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle'] [contains(text(),'Basic')]")
    private WebElement basicDropdown;

    public void goToNewBrowserWindow() {
        newBrowserWindowButton.click();
        basicDropdown.click();
        windowsTabsButton.click();
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }
}
