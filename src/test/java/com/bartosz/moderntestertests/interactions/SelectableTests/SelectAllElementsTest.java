package com.bartosz.moderntestertests.interactions.SelectableTests;

import com.bartosz.moderntestertests.interactions.BaseInteractionsTest;
import org.testng.annotations.Test;

public class SelectAllElementsTest extends BaseInteractionsTest {

    @Test
    public void selectAllElementsTest() {
        interactions.goToSelectable();
        selectable.selectAllElements();
    }

}
