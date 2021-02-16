package com.bartosz.moderntestertests.basic;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NewBrowserWindowTest extends BaseBasicTest{

    @Test
    public void newBrowserWindowTest()  {
        basic.goToWidnowsTabs();
        String before = windowsTabs.getURL();
        windowsTabs.goToNewBrowserWindow();
        String after = windowsTabs.getURL();
        assertThat(before).isNotEqualTo(after);
    }
}
