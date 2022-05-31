package com.bartosz.moderntester.basic.alerts;

import com.bartosz.moderntester.basic.BaseBasicTest;
import org.junit.Test;

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
        final String alertText = interactions.getAlertText();
        assertThat(alertText)
                .isEqualTo(OK_BUTTON_PRESSED);
        final String promptText = basicPage.getPromptLabelText();
        assertThat(promptText)
                .isEqualTo(OK_BUTTON_PRESSED);
    }

    @Test
    public void PromptAlertBoxPositiveTest() {
        interactions.selectDropdown(BASIC).click();
        interactions.selectDropdownItem(ALERTS).click();
        interactions.selectButton(PROMPT_POP_UP).click();
        final String name = faker.name().fullName();
        alerts.fillThePopUpWithName(name);
        final String actualValue = basicPage.getPromptLabelText();
        assertThat(actualValue)
                .isEqualTo("Hello " + name + "! How are you today?");
    }

    @Test
    public void PromptAlertBoxNegativeTest() {
        interactions.selectDropdown(BASIC).click();
        interactions.selectDropdownItem(ALERTS).click();
        interactions.selectButton(PROMPT_POP_UP).click();
        interactions.dismissAlert();
        final String actualValue = basicPage.getPromptLabelText();
        assertThat(actualValue)
                .isEqualTo(PROMPT_CANCELLED);
    }
}
