package com.bartosz.moderntester.widgets.spinnerTests;

import com.bartosz.moderntester.widgets.BaseWidgetsTest;
import org.junit.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class spinnerAlertTest extends BaseWidgetsTest {
    String expectedValue = "23";

    @Test
    public void getValueButtonTest() {
        widgets.goToSpinner();
        spinner.spinnerField.sendKeys(expectedValue);
        spinner.getValueAsAlert();
        assertThat(spinner.getStatusfromAlert()).isEqualTo(expectedValue);
    }
}
