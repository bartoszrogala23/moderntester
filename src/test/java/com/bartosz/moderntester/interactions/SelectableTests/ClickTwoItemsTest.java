package com.bartosz.moderntester.interactions.SelectableTests;

import com.bartosz.moderntester.interactions.BaseInteractionsTest;
import org.testng.annotations.Test;

public class ClickTwoItemsTest extends BaseInteractionsTest {

    @Test
    public void selectOneElement() {
        interactions.goToSelectable();
        selectable.selectTwoItems();
    }
}
