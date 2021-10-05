package com.bartosz.moderntester.others;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseOtherTest {
    protected HighSite highSite;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        highSite = new HighSite(driver);
        driver.get("https://seleniumui.moderntester.pl/");
    }
}
