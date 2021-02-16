package com.bartosz.moderntestertests.interactions.SelectableTests;

import com.bartosz.moderntestertests.interactions.BaseInteractionsTest;
import org.testng.annotations.Test;

public class ClickItemsInOrderTests extends BaseInteractionsTest {
    @Test
    public void selectOneElement() {
        interactions.goToSelectable();
        selectable.clickItemsInOrder();
//        TODO: after each click add .getText to the new list and compare it with expected result;
    }

}
