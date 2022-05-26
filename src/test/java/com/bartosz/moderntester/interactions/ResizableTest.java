package com.bartosz.moderntester.interactions;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import static org.assertj.core.api.Assertions.assertThat;

public class ResizableTest extends BaseInteractionsTest {
    @Test
    public void resizableTest() {
        interactions.goToResizable();
        Dimension rectangleDimension = resizable.getSize();
        resizable.resizeTheElement();
        Dimension rectangleDimensionAfterResize = resizable.getSize();
        assertThat(rectangleDimension.height).isLessThan(rectangleDimensionAfterResize.height);
        assertThat(rectangleDimension.width).isLessThan(rectangleDimensionAfterResize.width);
    }
}
