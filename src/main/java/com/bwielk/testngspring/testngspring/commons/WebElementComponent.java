package com.bwielk.testngspring.testngspring.commons;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class WebElementComponent {

    public static WebElement getElementByCssSelector(String cssSelector){
        return WebDriverRunner.getWebDriver().findElement(By.cssSelector(cssSelector));
    }
}
