package com.bartosz.moderntester.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Slider {
    WebDriver driver;

    public Slider(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="#custom-handle")
    private WebDriver handler;



//    moveHandler: clickandhold nie chce przyjąć handler jako parametru;

    public void moveHandler(){
        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(By.cssSelector("#custom-handle")))
                .moveByOffset(50,0).release().build().perform();
    }

    public String getHandlerPosition() {
        return driver.findElement(By.cssSelector("#custom-handle")).getText();
    }
}
