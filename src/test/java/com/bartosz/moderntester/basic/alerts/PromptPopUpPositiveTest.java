package com.bartosz.moderntester.basic.alerts;

import com.bartosz.moderntester.basic.BaseBasicTest;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PromptPopUpPositiveTest extends BaseBasicTest {
    @Test
    public void PopUpPositiveTest() {
        basic.goToAlerts();
        alerts.fillThePopUpWithName();
        String expectedMessage = "Hello James Bond! How are you today?";
        String actualResult = alerts.promptStatus.getText();
        assertThat(expectedMessage).isEqualTo(actualResult);
    }
}
