package com.bartosz.moderntester.widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Spinner {
    private final WebDriver driver;

    public Spinner(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".ui-icon-triangle-1-n")
    private WebElement triangleAddValueButton;
    @FindBy(css = "#spinner")
    public WebElement spinnerField;
    @FindBy(css = "#getvalue")
    private WebElement getValueButton;
    @FindBy(css = "#setvalue")
    private WebElement setValueAs5;

    public void increaseByOne() {
        triangleAddValueButton.click();
    }

    public void setSpinnerField(int number) {
        spinnerField.sendKeys(String.valueOf(number));
    }

    public void getValueAsAlert() {
        getValueButton.click();
    }

    public String getValueFromField() {
        return spinnerField.getAttribute("aria-valuenow");
    }

    public void setValueAsFive() {
        setValueAs5.click();
    }

    public String getStatusfromAlert() {
        return driver.switchTo().alert().getText();
    }
}
