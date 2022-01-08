package com.bartosz.moderntester.widgets;

import org.testng.annotations.Test;

public class MenuTest extends BaseWidgetsTest{
    @Test
    public void musicSelectFromMenuTest() {
        widgets.gotoMenu();
        menu.selectModernMusic();
    }
}
