package com.bartosz.moderntester.basic;

import com.bartosz.moderntester.common.interactions.Interactions;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public abstract class BaseBasicTest {
    public WebDriver driver;
    public Basic basic;
    public Alerts alerts;
    public WindowsTabs windowsTabs;
    public Interactions interactions;
    public Faker faker;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        faker = new Faker();
        basic = new Basic(driver);
        alerts = new Alerts(driver);
        windowsTabs = new WindowsTabs(driver);
        interactions = new Interactions(driver);
        driver.get("https://seleniumui.moderntester.pl/");
    }

}
