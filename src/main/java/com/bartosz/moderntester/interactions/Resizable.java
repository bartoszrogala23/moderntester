package com.bartosz.moderntester.interactions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Resizable {
    private final WebDriver driver;

    public Resizable(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".ui-icon-gripsmall-diagonal-se")
    private WebElement resizeCornerElement;

    @FindBy(css = "#resizable")
    private WebElement rectangleElement;

    public void resizeTheElement() {
        Actions actions = new Actions(driver);
        actions.clickAndHold(resizeCornerElement).moveByOffset(300,90).release().build().perform();
    }

    public Dimension getSize(){
        return rectangleElement.getSize();
    }

}
