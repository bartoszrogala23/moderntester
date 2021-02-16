package com.bartosz.moderntester.interactions.SelectableTests;

import com.bartosz.moderntester.interactions.BaseInteractionsTest;
import org.testng.annotations.Test;

public class SelectAllElementsTest extends BaseInteractionsTest {

    @Test
    public void selectAllElementsTest() {
        interactions.goToSelectable();
        selectable.selectAllElements();
    }

}
