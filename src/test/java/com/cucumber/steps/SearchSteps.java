package com.cucumber.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.lang.Thread;
import java.time.Duration;


public class SearchSteps {
    static ChromeDriver driver = null;
    static {
        System.setProperty("webdriver.chrome.driver","src/test/resources/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Given("Open baidu website")
    public void OpenBaiduWebsite() throws InterruptedException {
        driver.get("https://www.baidu.com");
        Thread.sleep(3000);

    }

    @When("input {string} in baidu search box")
    public void inputCucumberInBaiduSearchBox(String query) {
        WebElement element = driver.findElement(By.name("wd"));
        element.sendKeys(query);
        element.submit();

    }

    @Then("Show {string} in website")
    public void showTitleInWebsite(String title) {
    int seconds = 10;
    Duration duration = Duration.ofSeconds(seconds);
        new WebDriverWait(driver,duration).until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[@id=\"1\"]/div/div[1]/div[2]/div[3]/div[4]/div/div/div/div[1]/span[3]")));
//                        By.xpath("//a[text()='"+title+"']")));

    }
//

    @After()
    public void closeBrowser() throws Exception{
        Thread.sleep(3000);
        driver.quit();
    }


}

