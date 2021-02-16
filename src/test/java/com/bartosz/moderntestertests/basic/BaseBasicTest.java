package com.bartosz.moderntestertests.basic;

import com.bartosz.automationpractise.FillTheForm;
import com.bartosz.moderntester.basic.Alerts;
import com.bartosz.moderntester.basic.Basic;
import com.bartosz.moderntester.basic.WindowsTabs;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class BaseBasicTest {
    protected FillTheForm fillTheForm;
    protected Basic basic;
    protected Alerts alerts;
    protected WindowsTabs windowsTabs;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        fillTheForm = new FillTheForm(driver);
        basic = new Basic(driver);
        alerts = new Alerts(driver);
        windowsTabs = new WindowsTabs(driver);
        driver.get("https://seleniumui.moderntester.pl/");
    }
}
