package com.bartosz.moderntester.interactions;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DroppableTest extends BaseInteractionsTest {
    @Test
    public void dropToRectangle() {
        interactions.goToDroppable();
        String expectedMessage = "Dropped!";
        dropTheItem.dropIntoRectangle();
        String actualMessage = dropTheItem.droppable.getText();
        assertThat(actualMessage).isEqualTo(expectedMessage);
    }
}
