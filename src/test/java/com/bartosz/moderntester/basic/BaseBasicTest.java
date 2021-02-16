package com.bartosz.moderntester.basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class BaseBasicTest {
    protected Basic basic;
    protected Alerts alerts;
    protected WindowsTabs windowsTabs;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        basic = new Basic(driver);
        alerts = new Alerts(driver);
        windowsTabs = new WindowsTabs(driver);
        driver.get("https://seleniumui.moderntester.pl/");
    }
}
