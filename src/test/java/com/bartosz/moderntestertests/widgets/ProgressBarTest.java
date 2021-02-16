package com.bartosz.moderntestertests.widgets;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class ProgressBarTest extends BaseWidgetsTest {

    @Test
    public void progressBarTest() {
        widgets.goToProgressBar();
        String before = progressBar.getProgressBarStatus();
//        how to wait?
        String after = progressBar.getProgressBarStatus();
        assertThat(before).isNotEqualTo(after);

    }
}
