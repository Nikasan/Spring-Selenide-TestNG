package com.bwielk.testngspring.testngspring.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


@Component
@Scope("prototype")
public class HomePage extends BasePage {

    @Value("${url}")
    private String url;

    public void openHomePage() {
        open(url);
        $("#L2AGLb").click();
        $(By.name("q")).shouldBe(Condition.visible, Duration.ofSeconds(5));
    }

    public void inputSearch(String request) {
        $(By.name("q")).setValue(request);
    }
}
