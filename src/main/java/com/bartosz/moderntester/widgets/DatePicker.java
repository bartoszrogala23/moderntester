package com.bartosz.moderntester.widgets;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Date;

public class DatePicker {
    private WebDriver driver;
    private Faker faker;

    public DatePicker(WebDriver driver) {
        this.driver = driver;
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
