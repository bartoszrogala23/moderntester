package com.bartosz.moderntestertests.interactions.SelectableTests;

import com.bartosz.moderntestertests.interactions.BaseInteractionsTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SortableWithVariablesTest extends BaseInteractionsTest {

//    @Test
//    public void sortTheItems() {
//        modernTesterMain.goToSortable();
//        sortable.pullItemDown();
//        sortable.pullItemUp();
//    }
//TODO moveto target parametryzowane - masz przyjmować od użytkownika który item w które miejsce.

    @Test
    public void moveToTargetTest() {
        interactions.goToSortable();
        List<String> beforeDrop = sortable.getTextsOfSortableItems();
        sortable.pullItemtoTargetSelectable(3,5);
        List<String> afterDrop = sortable.getTextsOfSortableItems();
        assertThat(beforeDrop).isNotEqualTo(afterDrop);
    }

}
