package com.bartosz.moderntester.widgets;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProgressBarTest extends BaseWidgetsTest {
    @Test
    public void progressBarTest() throws InterruptedException {
        widgets.goToProgressBar();
        String before = progressBar.getProgressBarStatus();
        Thread.sleep(5000);
        String after = progressBar.getProgressBarStatus();
        assertThat(before).isNotEqualTo(after);
    }
}
