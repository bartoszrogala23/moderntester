package com.bartosz.moderntester.widgets.spinnerTests;

import com.bartosz.moderntester.widgets.BaseWidgetsTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class spinnerAlertTest extends BaseWidgetsTest {

    @Test
    public void getValueButtonTest() {
        widgets.goToSpinner();
        String expectedValue = "23";
        spinner.spinnerField.sendKeys(expectedValue);
        spinner.getValueAsAlert();
        assertThat(spinner.getStatusfromAlert()).isEqualTo(expectedValue);
    }

}
