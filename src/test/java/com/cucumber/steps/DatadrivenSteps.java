package com.cucumber.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class DatadrivenSteps {
    private ChromeDriver driver;

    @Given("Open the baidu website")
    public void OpenBaiduWebsite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/test/resources/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        Thread.sleep(2000);

    }

    @When("input {string} in the baidu search box")
    public void inputCucumberInBaiduSearchBox(String query) {
        WebElement element = driver.findElement(By.name("wd"));
        element.sendKeys(query);
        element.submit();

    }

    @Then("Show {string} in the website")
    public void showTitleInWebsite(String title) {
        System.out.println(title);
    }

    @After()
    public void closeBrowser() throws Exception{
        Thread.sleep(3000);
        driver.quit();
    }


}

