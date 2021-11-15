package com.bwielk.testngspring.testngspring.commons;

import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WebDriverComponent {

    @Value("${browser:chrome}")
    private String browser;

    public static ThreadLocal<WebDriver> webdriver = new ThreadLocal<>();

    public void launchBrowser(String nameOfTestMethod) {
        WebDriver driver = null;
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else {
            if (browser.equals("edge")) {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        webdriver.set(driver);
        WebDriverRunner.setWebDriver(webdriver.get());
        System.out.println(nameOfTestMethod + " was started");
    }

    public WebDriver getDriver() {
        return WebDriverRunner.getWebDriver();
    }

    public void quitDriver() {
        if (WebDriverRunner.getWebDriver() != null) {
            WebDriverRunner.getWebDriver().quit();
        }
    }
}
