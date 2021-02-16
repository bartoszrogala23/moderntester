package com.bartosz.moderntester.widgets;

import org.testng.annotations.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class AutofillTest extends BaseWidgetsTest{


    @Test
    public void autofillTest() {
        widgets.goToAutocomplete();
        List<String> autocompleteResult = autocomplete.fillTheSearchFieldWithText("a");
        assertThat(autocompleteResult).hasSize(9).contains("andreas", "antal");
    }


}
