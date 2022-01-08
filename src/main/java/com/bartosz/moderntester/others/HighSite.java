package com.bartosz.moderntester.others;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HighSite {
    private final WebDriver driver;

    public HighSite(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#scroll-button")
    private WebElement submitButton;
    @FindBy(xpath = "//li/a[contains(text(),'Others')]")
    private WebElement othersDropdown;
    @FindBy(css = "#high-site-item")
    private WebElement highSiteSite;

    public void goToHighSite() {
        othersDropdown.click();
        highSiteSite.click();
    }

    public void goToSubmitButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(submitButton).build().perform();
    }
}
