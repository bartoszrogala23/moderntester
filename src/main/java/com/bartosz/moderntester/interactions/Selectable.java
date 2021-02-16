package com.bartosz.moderntester.interactions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectable {
    private final WebDriver driver;

    public Selectable(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//ol/li[contains(text(),'1')]")
    private WebElement item1;
    @FindBy(xpath = "//ol/li[contains(text(),'2')]")
    private WebElement item2;
    @FindBy(xpath = "//ol/li[contains(text(),'3')]")
    private WebElement item3;
    @FindBy(xpath = "//ol/li[contains(text(),'4')]")
    private WebElement item4;
    @FindBy(xpath = "//ol/li[contains(text(),'5')]")
    private WebElement item5;
    @FindBy(xpath = "//ol/li[contains(text(),'6')]")
    private WebElement item6;
    @FindBy(css = "#select-result")
    public WebElement result;

    public void selectOneElement() {
        item1.click();
    }

    public void clickItemsInOrder() {
        item1.click();
        item2.click();
        item3.click();
        item4.click();
        item5.click();
        item6.click();
    }

    public void selectTwoItems() {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.LEFT_CONTROL).perform();
        item1.click();
        item4.click();
    }

    public void selectAllElements() {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.LEFT_CONTROL).perform();
        item1.click();
        item2.click();
        item3.click();
        item4.click();
        item5.click();
        item6.click();
    }




}
