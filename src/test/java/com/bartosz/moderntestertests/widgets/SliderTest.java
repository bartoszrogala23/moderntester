package com.bartosz.moderntestertests.widgets;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SliderTest extends BaseWidgetsTest {

    @Test
    public void sliderTest() {
        widgets.goToSlider();
        String before = slider.getHandlerPosition();
        slider.moveHandler();
        String after = slider.getHandlerPosition();
        assertThat(before).isNotEqualTo(after);

    }
}
