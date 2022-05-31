package com.bartosz.moderntester.common.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Interactions {
    private final WebDriver driver;

    public Interactions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "prompt-label")
    private WebElement promptLabel;

    public WebElement selectDropdown(String dropdownName) {
        return driver.findElement
                (By.xpath(String.format("//*[@class='nav-link dropdown-toggle'][contains(text(),'%s')]",
                        dropdownName)));
    }

    public WebElement selectDropdownItem(String dropdownItem) {
        return driver.findElement
                (By.xpath(String.format("//*[@class='dropdown-item'][contains(text(),'%s')]", dropdownItem)));
    }

    public WebElement selectButton(String buttonName) {
        return driver.findElement
                (By.xpath(String.format("//*[@class='btn btn-info'][contains(text(),'%s')]", buttonName)));
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }
}
