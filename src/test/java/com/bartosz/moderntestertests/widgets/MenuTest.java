package com.bartosz.moderntestertests.widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;


public class MenuTest extends BaseWidgetsTest{


//    @FindBy(css = "#ui-id-14")
//    WebElement jazzTypeFreeJazz;
//    @FindBy(css = "#ui-id-15")
//    WebElement jazzTypeBigBand;
//    @FindBy(css = "#ui-id-16")
//    WebElement jazzTypeModern;
//    @FindBy(css = "#ui-id-13")
//    private  WebElement jazzList;

    @Test
    public void musicSelectFromMenuTest() {
        widgets.gotoMenu();
        menu.selectModernMusic();
    }


}
