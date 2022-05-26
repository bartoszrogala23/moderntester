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
    @FindBy(css = "#windows-tabs-item")
    private WebElement windowsTabsButton;

    public void goToAlerts() {
        basicDropdown.click();
        alertsSelect.click();
    }

    public void goToWidnowsTabs() {
        basicDropdown.click();
        windowsTabsButton.click();
    }

//    public WebElement selectButton(String buttonName) {
//        driver.findElement(By.xpath())
//    };

    public void getAlert() {
        driver.switchTo().alert().getText();
    }
}

