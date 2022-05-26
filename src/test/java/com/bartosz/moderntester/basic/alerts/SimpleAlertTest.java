package com.bartosz.moderntester.basic.alerts;

import com.bartosz.moderntester.basic.BaseBasicTest;
import org.junit.Test;

import static com.bartosz.moderntester.common.constants.Announcements.OK_BUTTON_PRESSED;
import static com.bartosz.moderntester.common.constants.Buttons.SIMPLE_ALERT;
import static com.bartosz.moderntester.common.constants.DropdownItems.ALERTS;
import static com.bartosz.moderntester.common.constants.Dropdowns.BASIC;
import static org.assertj.core.api.Assertions.assertThat;

public class SimpleAlertTest extends BaseBasicTest {

    @Test
    public void simpleAlertTest() {
        interactions.selectDropdown(BASIC).click();
        interactions.selectDropdownItem(ALERTS).click();
        interactions.selectButton(SIMPLE_ALERT).click();
        final String actualValue = interactions.getAlertText();
        assertThat(actualValue)
                .isEqualTo(OK_BUTTON_PRESSED);
    }
}
