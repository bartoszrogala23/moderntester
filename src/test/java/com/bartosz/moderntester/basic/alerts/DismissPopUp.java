package com.bartosz.moderntester.basic.alerts;

import com.bartosz.moderntester.basic.BaseBasicTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DismissPopUp extends BaseBasicTest {
    String expectedMessage = "You pressed Cancel!";
    String actualResult = alerts.confirmLabel.getText();

    @Test
    public void dismissAlertTest() {
        basicPage.goToAlerts();
        alerts.dismissPopUp();
        assertThat(expectedMessage).isEqualTo(actualResult);
    }
}
