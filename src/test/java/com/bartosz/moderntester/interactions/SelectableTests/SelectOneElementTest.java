package com.bartosz.moderntester.interactions.SelectableTests;


import com.bartosz.moderntester.interactions.BaseInteractionsTest;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SelectOneElementTest extends BaseInteractionsTest {

    @Test
    public void selectOneElement() {
        interactions.goToSelectable();
        selectable.selectOneElement();
        String expectedResult = "#1";
        String actualResult = selectable.result.getText();
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
