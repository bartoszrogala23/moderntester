package com.bartosz.moderntester.widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class Menu {
    private WebDriver driver;

    public Menu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="//div[contains(text(),'Music')]" )
    WebElement music;
    @FindBy(xpath = "//div[contains(text(),'Jazz')]")
    WebElement jazz;

    @FindBy(css = "#ui-id-14")
    WebElement jazzTypeFreeJazz;
    @FindBy(css = "#ui-id-15")
    WebElement jazzTypeBigBand;
    @FindBy(css = "#ui-id-16")
    WebElement jazzTypeModern;
    @FindBy(css = "#ui-id-13")
    private  WebElement jazzList;


    public void selectModernMusic() {
        music.click();
        jazz.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(jazzTypeModern).click();
    }

}
