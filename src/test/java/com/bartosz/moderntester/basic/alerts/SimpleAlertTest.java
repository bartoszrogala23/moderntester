package com.bartosz.moderntester.basic.alerts;

import com.bartosz.moderntester.basic.BaseBasicTest;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SimpleAlertTest extends BaseBasicTest {
    @Test
    public void simpleAlertTest() {
        basic.goToAlerts();
        alerts.clickSimpleAlert();
        String expectedResult = "OK button pressed";
        String actualResult = alerts.simpleAlertStatus.getText();
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
