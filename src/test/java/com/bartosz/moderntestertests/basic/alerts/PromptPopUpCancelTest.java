package com.bartosz.moderntestertests.basic.alerts;

import com.bartosz.moderntestertests.basic.BaseBasicTest;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PromptPopUpCancelTest extends BaseBasicTest {
    @Test
    public void CancelThePopUp() {
        basic.goToAlerts();
        alerts.CancelThePopUpWithName();
        String expectedMessage = "User cancelled the prompt.";
        String actualResult = alerts.promptStatus.getText();
        assertThat(expectedMessage).isEqualTo(actualResult);
    }
}
