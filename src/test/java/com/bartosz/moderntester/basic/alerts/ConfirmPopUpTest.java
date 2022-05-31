package com.bartosz.moderntester.basic.alerts;

import com.bartosz.moderntester.basic.BaseBasicTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConfirmPopUpTest extends BaseBasicTest {
//    String expectedMessage = "You pressed OK!";
//    String actualResult = alerts.confirmLabel.getText();

    @Test
    public void confirmPopUpTest() {
        basicPage.goToAlerts();
        alerts.cofnirmPopUp();
//        assertThat(expectedMessage).isEqualTo(actualResult);
    }
}
