package com.bartosz.moderntester.interactions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public abstract class BaseInteractionsTest {
    protected Interactions interactions;
    protected Draggable draggable;
    protected DropTheItem dropTheItem;
    protected Resizable resizable;
    protected Selectable selectable;
    protected Sortable sortable;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        interactions = new Interactions(driver);
        draggable = new Draggable(driver);
        dropTheItem = new DropTheItem(driver);
        resizable = new Resizable(driver);
        selectable = new Selectable(driver);
        sortable = new Sortable(driver);
        driver.get("https://seleniumui.moderntester.pl/");
    }
}
