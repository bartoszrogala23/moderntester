package com.bartosz.moderntester.widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Widgets {
    private final WebDriver driver;

    public Widgets(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[contains(text(), 'Widgets')]")
    private WebElement widgetsDropdown;
    @FindBy(css = "#accordion-item")
    private WebElement accordionSelect;
    @FindBy(css = "#autocomplete-item")
    private WebElement autocompleteSelect;
    @FindBy(css = "#datepicker-item")
    private WebElement datePickerSelect;
    @FindBy(css = "#menu-item")
    private WebElement menuSelect;
    @FindBy(css = "#modal-dialog-item")
    private WebElement modalDialogSelect;
    @FindBy(css = "#progressbar-item")
    private WebElement progressbarSelect;
    @FindBy(css = "#selectmenu-item")
    private WebElement selectMenuSelect;
    @FindBy(css = "#slider-item")
    private WebElement sliderSelect;
    @FindBy(css = "#spinner-item")
    private WebElement spinnerSelect;
    @FindBy(css = "#tabs-item")
    private WebElement tabsSelect;
    @FindBy(css = "#tooltip-item")
    private WebElement tooltipSelect;

    public void goToSpinner() {
        widgetsDropdown.click();
        spinnerSelect.click();
    }

    public void goToSlider() {
        widgetsDropdown.click();
        sliderSelect.click();
    }

    public void goToProgressBar() {
        widgetsDropdown.click();
        progressbarSelect.click();
    }

    public void goToAccordion() {
        widgetsDropdown.click();
        accordionSelect.click();
    }

    public void goToAutocomplete() {
        widgetsDropdown.click();
        autocompleteSelect.click();
    }

    public void  gotoMenu() {
        widgetsDropdown.click();
        menuSelect.click();
    }

    public void gotoDatePicker() {
        widgetsDropdown.click();
        datePickerSelect.click();
    }



}

