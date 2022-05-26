package com.bartosz.moderntester.widgets;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AccordionTest extends BaseWidgetsTest {
    @Test
    public void accordionTest() {
        widgets.goToAccordion();
        accordion.clickAllTheSections();
    }

    @Test
    public void accordionSingleSectionTest() {
        widgets.goToAccordion();
        accordion.clickSection2();
        assertThat(accordion.getStatusFromText()).contains("false");
    }
}
