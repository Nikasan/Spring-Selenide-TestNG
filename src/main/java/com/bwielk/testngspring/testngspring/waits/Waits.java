package com.bwielk.testngspring.testngspring.waits;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

    public static void waitUntilElementVisible(String cssSelector){
        new WebDriverWait(WebDriverRunner.getWebDriver(), 60).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
    }

    public static void waitUntilElementClickable(String cssSelector){
        new WebDriverWait(WebDriverRunner.getWebDriver(), 60).until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssSelector)));
    }
}
