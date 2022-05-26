package com.bartosz.moderntester.others;

import org.junit.Test;

public class HighSiteTest extends  BaseOtherTest{
    @Test
    public void goToSubmitTest() {
        highSite.goToHighSite();
        highSite.goToSubmitButton();
    }
}
