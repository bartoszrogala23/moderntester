package com.bartosz.moderntester.basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public abstract class BaseBasicTest {
    public Basic basic;
    public Alerts alerts;
    public WindowsTabs windowsTabs;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        basic = new Basic(driver);
        alerts = new Alerts(driver);
        windowsTabs = new WindowsTabs(driver);
        driver.get("https://seleniumui.moderntester.pl/");
    }
}
