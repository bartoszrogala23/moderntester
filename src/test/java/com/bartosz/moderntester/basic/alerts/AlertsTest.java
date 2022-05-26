package com.bartosz.moderntester.basic.alerts;

import com.bartosz.moderntester.basic.BaseBasicTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.bartosz.moderntester.common.constants.Announcements.OK_BUTTON_PRESSED;
import static com.bartosz.moderntester.common.constants.Announcements.PROMPT_CANCELLED;
import static com.bartosz.moderntester.common.constants.Buttons.PROMPT_POP_UP;
import static com.bartosz.moderntester.common.constants.Buttons.SIMPLE_ALERT;
import static com.bartosz.moderntester.common.constants.DropdownItems.ALERTS;
import static com.bartosz.moderntester.common.constants.Dropdowns.BASIC;
import static org.assertj.core.api.Assertions.assertThat;

public class AlertsTest extends BaseBasicTest {

    @Test
    public void simpleAlertTest() {
        interactions.selectDropdown(BASIC).click();
        interactions.selectDropdownItem(ALERTS).click();
        interactions.selectButton(SIMPLE_ALERT).click();
        final String actualValue = interactions.getAlertText();
        assertThat(actualValue)
                .isEqualTo(OK_BUTTON_PRESSED);
    }

    @Test
    public void PromptAlertBoxPositiveTest() {
        basic.goToAlerts();
        final String name = faker.name().fullName();
        interactions.selectButton(PROMPT_POP_UP).click();
        alerts.fillThePopUpWithName(name);
        final String actualValue = driver.findElement(By.id("prompt-label")).getText();
        assertThat(actualValue)
                .isEqualTo("Hello " + name + "! How are you today?");
    }

    @Test
    public void PromptAlertBoxNegativeTest() {
        basic.goToAlerts();
        interactions.selectButton(PROMPT_POP_UP).click();
        driver.switchTo().alert().dismiss();
        final String actualValue = driver.findElement(By.id("prompt-label")).getText();
        assertThat(actualValue)
                .isEqualTo(PROMPT_CANCELLED);
    }
}
