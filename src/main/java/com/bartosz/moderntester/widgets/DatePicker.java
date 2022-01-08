package com.bartosz.moderntester.widgets;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePicker {

    public DatePicker(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#datepicker")
    WebElement dateFieldInput;

    public void putTheDate(String date) {
        dateFieldInput.click();
        dateFieldInput.sendKeys(date);
        dateFieldInput.sendKeys(Keys.ENTER);
    }
}
