package com.bartosz.moderntestertests.widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

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
