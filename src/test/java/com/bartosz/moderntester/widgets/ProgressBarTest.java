package com.bartosz.moderntester.widgets;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProgressBarTest extends BaseWidgetsTest {

    @Test
    public void progressBarTest() throws InterruptedException {
        widgets.goToProgressBar();
        String before = progressBar.getProgressBarStatus();
//        thread sleep is a bad practise but in case of short test it does not affect the perfo.
//        create
        Thread.sleep(5000);
        String after = progressBar.getProgressBarStatus();
        assertThat(before).isNotEqualTo(after);

    }
}
