package com.bartosz.moderntester.widgets.spinnerTests;

import com.bartosz.moderntester.widgets.BaseWidgetsTest;
import org.junit.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class buttonSetTest extends BaseWidgetsTest {
    String expectedValue = "5";

    @Test
    public void clickButtonSetAsFiveTest() {
        widgets.goToSpinner();
        spinner.setValueAsFive();
        assertThat(spinner.getValueFromField()).isEqualTo(expectedValue);
    }
}
