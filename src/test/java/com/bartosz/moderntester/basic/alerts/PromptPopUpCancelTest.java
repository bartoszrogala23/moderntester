package com.bartosz.moderntester.basic.alerts;

import com.bartosz.moderntester.basic.BaseBasicTest;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PromptPopUpCancelTest extends BaseBasicTest {
    String expectedMessage = "User cancelled the prompt.";
    String actualResult = alerts.promptStatus.getText();

    @Test
    public void CancelThePopUp() {
        basicPage.goToAlerts();
        alerts.CancelThePopUpWithName();
        assertThat(expectedMessage).isEqualTo(actualResult);
    }
}
