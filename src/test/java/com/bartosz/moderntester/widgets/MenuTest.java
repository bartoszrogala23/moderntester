package com.bartosz.moderntester.widgets;

import org.junit.Test;


public class MenuTest extends BaseWidgetsTest{
    @Test
    public void musicSelectFromMenuTest() {
        widgets.gotoMenu();
        menu.selectModernMusic();
    }
}
