package com.bartosz.moderntester.widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Widgets {

    public Widgets(WebDriver driver) {
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
    @FindBy(css = "#progressbar-item")
    private WebElement progressbarSelect;
    @FindBy(css = "#slider-item")
    private WebElement sliderSelect;
    @FindBy(css = "#spinner-item")
    private WebElement spinnerSelect;

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

