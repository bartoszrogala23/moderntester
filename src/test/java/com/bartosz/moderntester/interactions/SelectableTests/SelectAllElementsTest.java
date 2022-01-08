package com.bartosz.moderntester.interactions.SelectableTests;

import com.bartosz.moderntester.interactions.BaseInteractionsTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SelectAllElementsTest extends BaseInteractionsTest {
    @Test
    public void selectAllElementsTest() {
        interactions.goToSelectable();
        selectable.selectAllElements();
        String expectedResult = "#1 #2 #3 #4 #5 #6";
        String actualResult = selectable.result.getText();
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
