package com.bartosz.moderntester.others;

import org.testng.annotations.Test;

public class HighSiteTest extends  BaseOtherTest{

    @Test
    public void goToSubmitTest() {
        highSite.goToHighSite();
        highSite.goToSubmitButton();
    }
}
