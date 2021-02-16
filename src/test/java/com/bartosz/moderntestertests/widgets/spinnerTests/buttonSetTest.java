package com.bartosz.moderntestertests.widgets.spinnerTests;

import com.bartosz.moderntestertests.widgets.BaseWidgetsTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class buttonSetTest extends BaseWidgetsTest {

    @Test
    public void clickButtonSetAsFiveTest() {
        widgets.goToSpinner();
        spinner.setValueAsFive();
        String expectedValue = "5";
        assertThat(spinner.getValueFromField()).isEqualTo(expectedValue);
    }

}
