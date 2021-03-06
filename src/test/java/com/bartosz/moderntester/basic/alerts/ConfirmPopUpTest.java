package com.bartosz.moderntester.basic.alerts;

import com.bartosz.moderntester.basic.BaseBasicTest;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ConfirmPopUpTest extends BaseBasicTest {

    @Test
    public void confirmPopUpTest() {
        basic.goToAlerts();
        alerts.cofnirmPopUp();
        String expectedMessage = "You pressed OK!";
        String actualResult = alerts.confirmLabel.getText();
        assertThat(expectedMessage).isEqualTo(actualResult);
    }
}
