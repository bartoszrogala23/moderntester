package com.bartosz.moderntester.interactions.SelectableTests;

import com.bartosz.moderntester.interactions.BaseInteractionsTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ClickTwoItemsTest extends BaseInteractionsTest {
    @Test
    public void selectOneElement() {
        interactions.goToSelectable();
        selectable.selectTwoItems();
        String expectedResult = "#1 #4";
        String actualResult = selectable.result.getText();
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
