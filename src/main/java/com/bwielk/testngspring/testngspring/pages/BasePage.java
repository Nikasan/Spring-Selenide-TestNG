package com.bwielk.testngspring.testngspring.pages;

import com.bwielk.testngspring.testngspring.commons.WebDriverComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Nikasan
 */
@Component
public class BasePage {

    @Autowired
    public WebDriverComponent webDriverComponent;

}