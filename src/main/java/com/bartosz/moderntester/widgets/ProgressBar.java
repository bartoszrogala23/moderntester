package com.bartosz.moderntester.widgets;

import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;


public class ProgressBar {
    private WebDriver driver;
    private final WebDriverWait wait;


    public ProgressBar(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".progress-label")
    private WebDriver progressbar;

    public String getProgressBarStatus() {
        return driver.findElement(By.cssSelector(".progress-label")).getText();
    }




}
