package com.bartosz.moderntestertests.widgets.spinnerTests;

import com.bartosz.moderntestertests.widgets.BaseWidgetsTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class modifySpinnerField extends BaseWidgetsTest {

    @Test
    public void setAndIncreaseTest() {
        widgets.goToSpinner();
        int exampleNumber =7;
        spinner.setSpinnerField(exampleNumber);
        spinner.increaseByOne();
        assertThat(spinner.getValueFromField()).isEqualTo(String.valueOf(exampleNumber+1));
    }

}
