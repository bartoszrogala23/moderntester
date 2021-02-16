package com.bartosz.moderntester.interactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropTheItem {
    private final WebDriver driver;

    public DropTheItem(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#draggable")
    private WebElement draggableItem;
    @FindBy(xpath = "//div[@id='droppable']")
    public WebElement expectedArea;
    @FindBy(css = "#droppable")
    public WebElement droppable;




    public void dropIntoRectangle() {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(draggableItem,180,60).build().perform();
    }

}
