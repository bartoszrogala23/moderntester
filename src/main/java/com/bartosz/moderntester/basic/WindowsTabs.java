package com.bartosz.moderntester.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsTabs {
    private final WebDriver driver;
    private final Wait wait;

    public WindowsTabs(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#newBrowserWindow")
    private WebElement newBrowserWindowButton;
    @FindBy(css = "#newMessageWindow")
    private WebElement newMessageWindowButton;
    @FindBy(css = "#newBrowserTab")
    private WebElement newBrowserTabButton;
    @FindBy(css = ".display-4")
    private WebElement newWindowHeader;
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
