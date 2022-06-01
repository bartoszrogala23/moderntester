package com.bartosz.moderntester.basic.alerts;

import com.bartosz.moderntester.basic.BaseBasicTest;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static com.bartosz.moderntester.basic.BasicPage.byPromptLabel;
import static com.bartosz.moderntester.basic.BasicPage.bySimpleAlert;
import static com.bartosz.moderntester.common.constants.Announcements.ENTER_NAME;
import static com.bartosz.moderntester.common.constants.Announcements.OK_BUTTON_PRESSED;
import static com.bartosz.moderntester.common.constants.Announcements.PROMPT_CANCELLED;
import static com.bartosz.moderntester.common.constants.Buttons.PROMPT_POP_UP;
import static com.bartosz.moderntester.common.constants.Buttons.SIMPLE_ALERT;
import static com.bartosz.moderntester.common.constants.DropdownItems.ALERTS;
import static com.bartosz.moderntester.common.constants.Dropdowns.BASIC;
import static org.assertj.core.api.Assertions.assertThat;

public class AlertsTest extends BaseBasicTest {

    SoftAssertions softly = new SoftAssertions();

    @Test
    public void simpleAlertTest() {
        interactions.selectDropdown(BASIC).click();
        interactions.selectDropdownItem(ALERTS).click();
        interactions.selectButton(SIMPLE_ALERT).click();
        final String alertText = interactions.getAlertText();
        acceptAlert();

        softly.assertThat(alertText)
                .isEqualTo(OK_BUTTON_PRESSED);

        final String promptText = basicPage.getLeadText(bySimpleAlert);

        softly.assertThat(promptText)
                .isEqualTo(OK_BUTTON_PRESSED);
        softly.assertAll();
    }

    @Test
    public void PromptAlertBoxPositiveTest() {
        interactions.selectDropdown(BASIC).click();
        interactions.selectDropdownItem(ALERTS).click();
        interactions.selectButton(PROMPT_POP_UP).click();
        final String alertText = interactions.getAlertText();

        softly.assertThat(alertText)
                .isEqualTo(ENTER_NAME);

        final String name = faker.name().fullName();
        alerts.fillThePopUpWithName(name);
        final String actualValue = basicPage.getLeadText(byPromptLabel);

        softly.assertThat(actualValue)
                .isEqualTo("Hello " + name + "! How are you today?");
        softly.assertAll();
    }

    @Test
    public void PromptAlertBoxNegativeTest() {
        interactions.selectDropdown(BASIC).click();
        interactions.selectDropdownItem(ALERTS).click();
        interactions.selectButton(PROMPT_POP_UP).click();
        interactions.dismissAlert();
        final String actualValue = basicPage.getLeadText(byPromptLabel);
        assertThat(actualValue)
                .isEqualTo(PROMPT_CANCELLED);
    }
}
