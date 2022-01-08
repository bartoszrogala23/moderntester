package com.bartosz.moderntester.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.stream.Collectors;

public class Autocomplete {
    private final WebDriver driver;

    public Autocomplete(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
//        zamiast driver możesz wrzucić webelement i
//        wtedy nie szuka Ci po całej stronie tylko wewnątrz Webelementu
    }

    @FindBy(css = "#search")
    private WebElement searchField;

    public List<String> fillTheSearchFieldWithText(String text) {
        searchField.sendKeys(text);
        List<WebElement> foundElements = driver.findElements(By.cssSelector(".ui-menu-item"));
        return foundElements.stream().map(WebElement::getText).collect(Collectors.toList());
    }
}
