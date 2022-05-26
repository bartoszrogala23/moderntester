package com.bartosz.moderntester.widgets;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;


import java.util.concurrent.TimeUnit;

public abstract class BaseWidgetsTest {
    protected Widgets widgets;
    protected Accordion accordion;
    protected Autocomplete autocomplete;
    protected DatePicker datePicker;
    protected Menu menu;
    protected ProgressBar progressBar;
    protected Slider slider;
    protected Spinner spinner;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        widgets = new Widgets(driver);
        accordion = new Accordion(driver);
        autocomplete = new Autocomplete(driver);
        datePicker = new DatePicker(driver);
        menu = new Menu(driver);
        progressBar = new ProgressBar(driver);
        slider = new Slider(driver);
        spinner = new Spinner(driver);
        driver.get("https://seleniumui.moderntester.pl/");
    }
}
