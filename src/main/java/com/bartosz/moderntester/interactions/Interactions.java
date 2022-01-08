package com.bartosz.moderntester.interactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Interactions {

    public Interactions(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(), 'Interactions')]")
    private WebElement interactionsDropdown;
    @FindBy(css = "#sortable-item")
    private WebElement sortableButton;
    @FindBy(css = "#selectable-item")
    private WebElement selectableButton;
    @FindBy(css = "#resizable-item")
    private WebElement resizableButton;
    @FindBy(css = "#droppable-item")
    private WebElement droppableSelect;
    @FindBy(css = "#draggable-item")
    private WebElement draggableSelect;

    public void goToDraggable() {
        interactionsDropdown.click();
        draggableSelect.click();
    }

    public void goToDroppable() {
        interactionsDropdown.click();
        droppableSelect.click();
    }

    public void goToSelectable() {
        interactionsDropdown.click();
        selectableButton.click();
    }

    public void goToSortable() {
        interactionsDropdown.click();
        sortableButton.click();
    }

    public void goToResizable() {
        interactionsDropdown.click();
        resizableButton.click();
    }
}

