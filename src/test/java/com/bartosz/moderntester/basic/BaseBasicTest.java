package com.bartosz.moderntester.basic;

import com.bartosz.moderntester.common.interactions.Interactions;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BaseBasicTest {
    public WebDriver driver;
    public BasicPage basicPage;
    public WindowsTabs windowsTabs;
    public Interactions interactions;
    public Faker faker;
    public WebDriverWait wait;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        faker = new Faker();
        basicPage = new BasicPage(driver);
        windowsTabs = new WindowsTabs(driver);
        interactions = new Interactions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://seleniumui.moderntester.pl/");
    }

}
