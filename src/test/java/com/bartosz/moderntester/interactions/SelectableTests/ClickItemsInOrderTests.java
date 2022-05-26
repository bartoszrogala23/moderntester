package com.bartosz.moderntester.interactions.SelectableTests;

import com.bartosz.moderntester.interactions.BaseInteractionsTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ClickItemsInOrderTests extends BaseInteractionsTest {
    @Test
    public void selectOneElement() {
        interactions.goToSelectable();
        selectable.clickItemsInOrder();
        String expectedResult = "#6";
        String actualResult = selectable.result.getText();
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
