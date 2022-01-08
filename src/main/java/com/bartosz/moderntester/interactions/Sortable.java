package com.bartosz.moderntester.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class Sortable {
    private final WebDriver driver;

    public Sortable(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[contains(text(), 1)]")
    private WebElement item1;
    @FindBy(xpath = "//li[contains(text(), 7)]")
    private WebElement item7;

    public List<String> getTextsOfSortableItems() {
        return driver.findElements(By.cssSelector("li.ui-sortable-handle")).stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public void pullItemDown() {
        Actions actions = new Actions(driver);
        actions.clickAndHold(item1).moveByOffset(0, 120).release().perform();
    }

    public void pullItemUp() {
        Actions actions = new Actions(driver);
        actions.clickAndHold(item7).moveByOffset(0, -120).click().build().perform();
    }

    public void pullItemtoTarget() {
        Actions actions = new Actions(driver);
        actions.clickAndHold(item7).moveToElement(item1).release().build().perform();
    }
}
