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

    @FindBy(xpath = "[type=\"text/css\"]")
    private WebElement items;




    public List<String> getTextsOfSortableItems() {
//        List<WebElement> foundElements = driver.findElements(By.cssSelector("li.ui-sortable-handle"));
//        List<String> result = new ArrayList<>();
//        for (int i = 0; i < foundElements.size(); i++) {
//            result.add(foundElements.get(i).getText());
//        }
//        return result;
        return driver.findElements(By.cssSelector("li.ui-sortable-handle")).stream()
                .map((webElement) -> webElement.getText())
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


//    TODO = #tomek_pomusz
    public void pullItemtoTargetSelectable(int itemNumberToMove, int itemNumberDestination) {
        WebElement itemFrom = driver.findElement(
//                masz problem z łączeniem Stringów
                By.cssSelector( "//li[contains(text(), " + itemNumberToMove + ")]" ));
        WebElement itemTo = driver.findElement(
                By.cssSelector( "//li[contains(text(), " + itemNumberDestination + ")]"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(itemFrom).moveToElement(itemTo).release().build().perform();
    }




}
