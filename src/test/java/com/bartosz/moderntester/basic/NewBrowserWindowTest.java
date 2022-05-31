package com.bartosz.moderntester.basic;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NewBrowserWindowTest extends BaseBasicTest{

    @Test
    public void newBrowserWindowTest()  {
        basicPage.goToWindowsTabs();
        String before = windowsTabs.getURL();
        windowsTabs.goToNewBrowserWindow();
        String after = windowsTabs.getURL();
        assertThat(before).isNotEqualTo(after);
    }
}
