package com.nortal.tdd.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.seleniumhq.selenium.fluent.FluentWebDriver;

import static org.openqa.selenium.By.id;

public class WebPageTest {

    private WebDriver driver;
    private FluentWebDriver webDriver;

    @Before
    public void setUp() throws Exception {
        driver = new HtmlUnitDriver();
        webDriver = new FluentWebDriver(driver);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    @Ignore
    public void openTheMainPage() throws Exception {
        driver.get("http://localhost:8080");
        webDriver.h1(id("title")).getText().shouldBe("TDD Demo Web App");
    }
}
