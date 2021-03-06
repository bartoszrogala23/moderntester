package com.bartosz.moderntester.basic;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public Alerts(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#simple-alert")
    private WebElement simpleAlert;
    @FindBy(css = "#prompt-alert")
    private WebElement promptPopUp;
    @FindBy(css = "#confirm-alert")
    private WebElement confirmPopUp;
    @FindBy(css = "#delayed-alert")
    private WebElement DelayedAlert;
    @FindBy(css = "#simple-alert-label")
    public WebElement simpleAlertStatus;
    @FindBy(css = "#prompt-label")
    public WebElement promptStatus;
    @FindBy(css = "#confirm-label")
    public WebElement confirmLabel;

    public void cofnirmPopUp() {
        confirmPopUp.click();
        driver.switchTo().alert().accept();
    }

    public void dismissPopUp() {
        confirmPopUp.click();
        driver.switchTo().alert().dismiss();
    }

    public void clickSimpleAlert() {
        simpleAlert.click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public void fillThePopUpWithName() {
        promptPopUp.click();
        driver.switchTo().alert().sendKeys("James Bond");
        driver.switchTo().alert().accept();
    }

    public void CancelThePopUpWithName() {
        promptPopUp.click();
        driver.switchTo().alert().dismiss();
    }


}
