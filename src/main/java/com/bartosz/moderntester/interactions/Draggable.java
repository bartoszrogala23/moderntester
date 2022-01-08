package com.bartosz.moderntester.interactions;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Draggable {
    private final WebDriver driver;

    public Draggable(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#draggable")
    public
    WebElement draggableObject;

    public void dragTheObject() {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(draggableObject, 230, 65).build().perform();
    }

    public Point getPointPosition() {
        return new Point(
                draggableObject.getLocation().x,
                draggableObject.getLocation().y);
    }
}
