package com.cucumber.steps;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;



public class ArgumentSteps {

//    static ChromeDriver driver = null;
//    static {
//        System.setProperty("webdriver.chrome.driver","src/test/resources/webdrivers/chromedriver.exe");
//        driver = new ChromeDriver();
//    }

//    @Test
    @Given("Open the shopping website homepage")
    public void OpenWebsite(){
//        driver.get("");
        System.out.println("open the shopping website");
    }
    @When("Search {string}")
    public void SearchPhone(String phone) {
        System.out.println("Search "+phone);


    }
    @Then("Show {string} {int} ?")
    public void Show(String phone,int num){
        System.out.println("Show "+phone+num);

    }


    @When("I have a {color} ball")
    public void colorBall(Color color){
        System.out.println("I have a "+color+" ball");
    }

    @ParameterType("red|blue|yellow")  // regexp
    public Color color(String color){  // type, name (from method)
        return new Color(color);       // transformer function
    }
}
