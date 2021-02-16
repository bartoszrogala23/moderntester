package com.bartosz.moderntester.interactions;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DragAndDropTest extends BaseInteractionsTest {

    @Test
    public void dragAndDropTheSquare() {
        interactions.goToDraggable();
        Point beforeDND = draggable.getPointPosition();
        draggable.dragTheObject();
        Point afterDND = draggable.getPointPosition();
        assertThat(beforeDND).isNotEqualTo(afterDND);
    }
}
