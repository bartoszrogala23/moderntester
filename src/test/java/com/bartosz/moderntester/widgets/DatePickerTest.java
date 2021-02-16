package com.bartosz.moderntester.widgets;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DatePickerTest extends BaseWidgetsTest {

    @Test
    public void dateFillerTest() {
        widgets.gotoDatePicker();
        datePicker.putTheDate("12-02-2020");

    }
}
