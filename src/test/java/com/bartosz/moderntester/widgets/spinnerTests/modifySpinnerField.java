package com.bartosz.moderntester.widgets.spinnerTests;

import com.bartosz.moderntester.widgets.BaseWidgetsTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class modifySpinnerField extends BaseWidgetsTest {
    int exampleNumber =7;

    @Test
    public void setAndIncreaseTest() {
        widgets.goToSpinner();
        spinner.setSpinnerField(exampleNumber);
        spinner.increaseByOne();
        assertThat(spinner.getValueFromField()).isEqualTo(String.valueOf(exampleNumber+1));
    }
}
