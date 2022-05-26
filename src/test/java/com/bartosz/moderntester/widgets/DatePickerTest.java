package com.bartosz.moderntester.widgets;

import org.junit.Test;


public class DatePickerTest extends BaseWidgetsTest {

    @Test
    public void dateFillerTest() {
        widgets.gotoDatePicker();
        datePicker.putTheDate("12-02-2020");
    }
}
