package com.bwielk.testngspring.testngspring.browseractions;

import com.bwielk.testngspring.testngspring.waits.Waits;

import static com.bwielk.testngspring.testngspring.commons.WebElementComponent.getElementByCssSelector;

public class TextFieldActions {

    public static void fillTextWithContent(String cssSelector, String textToEnter){
        Waits.waitUntilElementVisible(cssSelector);
        getElementByCssSelector(cssSelector).sendKeys(textToEnter);
    }
}
