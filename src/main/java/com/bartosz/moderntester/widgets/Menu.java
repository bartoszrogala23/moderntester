package com.bartosz.moderntester.widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {
    private final WebDriver driver;

    public Menu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="//div[contains(text(),'Music')]" )
    WebElement music;
    @FindBy(xpath = "//div[contains(text(),'Jazz')]")
    WebElement jazz;
    @FindBy(css = "#ui-id-16")
    WebElement jazzTypeModern;

    public void selectModernMusic() {
        music.click();
        jazz.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(jazzTypeModern).click();
    }
}
