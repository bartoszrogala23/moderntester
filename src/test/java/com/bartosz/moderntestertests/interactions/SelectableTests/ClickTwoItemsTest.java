package com.bartosz.moderntestertests.interactions.SelectableTests;

import com.bartosz.moderntestertests.interactions.BaseInteractionsTest;
import org.testng.annotations.Test;

public class ClickTwoItemsTest extends BaseInteractionsTest {

    @Test
    public void selectOneElement() {
        interactions.goToSelectable();
        selectable.selectTwoItems();
    }
}
