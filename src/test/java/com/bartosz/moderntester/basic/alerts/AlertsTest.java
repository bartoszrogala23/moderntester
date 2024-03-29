package com.bartosz.moderntester.basic.alerts;

import com.bartosz.moderntester.basic.BaseBasicTest;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.bartosz.moderntester.common.constants.Announcements.ENTER_NAME;
import static com.bartosz.moderntester.common.constants.Announcements.OK_BUTTON_PRESSED;
import static com.bartosz.moderntester.common.constants.Announcements.PRESS_BUTTON;
import static com.bartosz.moderntester.common.constants.Announcements.PROMPT_CANCELLED;
import static com.bartosz.moderntester.common.constants.Announcements.YOU_PRESSED_CANCEL;
import static com.bartosz.moderntester.common.constants.Announcements.YOU_PRESSED_OK;
import static com.bartosz.moderntester.common.constants.Buttons.CONFIRM_POP_UP;
import static com.bartosz.moderntester.common.constants.Buttons.DELAYED_ALERT;
import static com.bartosz.moderntester.common.constants.Buttons.PROMPT_POP_UP;
import static com.bartosz.moderntester.common.constants.Buttons.SIMPLE_ALERT;
import static com.bartosz.moderntester.common.constants.DropdownItems.ALERTS;
import static com.bartosz.moderntester.common.constants.Dropdowns.BASIC;

public class AlertsTest extends BaseBasicTest {

    SoftAssertions softly = new SoftAssertions();

    @Test
    public void simpleAlertTest() {
        interactions.selectDropdown(BASIC).click();
        interactions.selectDropdownItem(ALERTS).click();
        interactions.selectButton(SIMPLE_ALERT).click();
        final String alertText = interactions.getAlertText();
        interactions.acceptAlert();

        softly.assertThat(alertText)
                .isEqualTo(OK_BUTTON_PRESSED);

        softly.assertThat(basicPage.getSimpleAlertLabel())
                .isEqualTo(OK_BUTTON_PRESSED);
        softly.assertAll();
    }

    @Test
    public void PromptAlertBoxPositiveTest() {
        interactions.selectDropdown(BASIC).click();
        interactions.selectDropdownItem(ALERTS).click();
        interactions.selectButton(PROMPT_POP_UP).click();

        softly.assertThat(interactions.getAlertText())
                .isEqualTo(ENTER_NAME);

        final String name = faker.name().fullName();
        basicPage.fillThePopUpWithName(name);
        final String actualValue = basicPage.getPromptLabelText();

        softly.assertThat(actualValue)
                .isEqualTo("Hello " + name + "! How are you today?");
        softly.assertAll();
    }

    @Test
    public void PromptAlertBoxNegativeTest() {
        interactions.selectDropdown(BASIC).click();
        interactions.selectDropdownItem(ALERTS).click();
        interactions.selectButton(PROMPT_POP_UP).click();

        softly.assertThat(interactions.getAlertText())
                .isEqualTo(ENTER_NAME);

        interactions.dismissAlert();
        final String actualValue = basicPage.getPromptLabelText();

        softly.assertThat(actualValue)
                .isEqualTo(PROMPT_CANCELLED);
        softly.assertAll();
    }

    @Test
    public void confirmAlertBoxTest() {
        interactions.selectDropdown(BASIC).click();
        interactions.selectDropdownItem(ALERTS).click();
        interactions.selectButton(CONFIRM_POP_UP).click();

        softly.assertThat(interactions.getAlertText())
                .isEqualTo(PRESS_BUTTON);

        interactions.acceptAlert();

        softly.assertThat(basicPage.getConfirmLabelText())
                .isEqualTo(YOU_PRESSED_OK);
        softly.assertAll();
    }

    @Test
    public void declineAfterConfirmationAlertBoxTest() {
        interactions.selectDropdown(BASIC).click();
        interactions.selectDropdownItem(ALERTS).click();
        interactions.selectButton(CONFIRM_POP_UP).click();

        softly.assertThat(interactions.getAlertText())
                .isEqualTo(PRESS_BUTTON);

        interactions.acceptAlert();

        softly.assertThat(basicPage.getConfirmLabelText())
                .isEqualTo(YOU_PRESSED_OK);

        interactions.selectButton(CONFIRM_POP_UP).click();
        interactions.dismissAlert();

        softly.assertThat(basicPage.getConfirmLabelText())
                .isEqualTo(YOU_PRESSED_CANCEL);

        softly.assertAll();
    }

    @Test
    public void delayedAlertTest() {
        interactions.selectDropdown(BASIC).click();
        interactions.selectDropdownItem(ALERTS).click();
        interactions.selectButton(DELAYED_ALERT).click();
        wait.until(ExpectedConditions.alertIsPresent());

        softly.assertThat(interactions.getAlertText())
                .isEqualTo(OK_BUTTON_PRESSED);

        interactions.acceptAlert();

        softly.assertThat(basicPage.getDelayedLabelText())
                .isEqualTo(OK_BUTTON_PRESSED);
        softly.assertAll();
    }
}
