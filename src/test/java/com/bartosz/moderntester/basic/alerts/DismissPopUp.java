package com.bartosz.moderntester.basic.alerts;

import com.bartosz.moderntester.basic.BaseBasicTest;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DismissPopUp extends BaseBasicTest {

    @Test
    public void dismissAlertTest() {
        basic.goToAlerts();
        alerts.dismissPopUp();
        String expectedMessage = "You pressed Cancel!";
        String actualResult = alerts.confirmLabel.getText();
        assertThat(expectedMessage).isEqualTo(actualResult);
    }
}
