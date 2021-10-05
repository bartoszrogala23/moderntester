package com.bartosz.moderntester.interactions.SelectableTests;

import com.bartosz.moderntester.interactions.BaseInteractionsTest;
import org.testng.annotations.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class SortableTest extends BaseInteractionsTest {

//    @Test
//    public void sortTheItems() {
//        modernTesterMain.goToSortable();
//        sortable.pullItemDown();
//        sortable.pullItemUp();
//    }
//TODO moveto target parametryzowane - masz przyjmować od użytkownika który item w które miejsce.
    //TODO getTextsOfSortableItems() - unfinished method

    @Test
    public void moveToTargetTest() {
        interactions.goToSortable();
        List<String> beforeDrop = sortable.getTextsOfSortableItems();
        sortable.pullItemtoTarget();
        List<String> afterDrop = sortable.getTextsOfSortableItems();
        assertThat(beforeDrop).isNotEqualTo(afterDrop);
    }

}
