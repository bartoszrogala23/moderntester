package com.bartosz.moderntester.widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertThat;


public class Accordion {
    private WebDriver driver;

    public Accordion(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#ui-id-1")
    private WebElement section1;
    @FindBy(css = "#ui-id-3")
    private WebElement section2;
    @FindBy(css = "#ui-id-5")
    private WebElement section3;
    @FindBy(css = "#ui-id-7")
    private WebElement section4;
    @FindBy(css = "[aria-hidden='false']")
    private WebElement visibleText;

    public void clickAllTheSections() {
        section1.click();
        section2.click();
        section3.click();
        section4.click();
    }


    public void clickSection2() {
        section2.click();
    }

    public String getStatusFromText() {
        return visibleText.getAttribute("aria-hidden");
    }

}
