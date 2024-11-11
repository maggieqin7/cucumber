package com.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class AnimalsSteps {

    @Given("There are a lot of animals")
    public void animals(List<String> animals){
        for (String s : animals){
            System.out.println(s);
        }
    }

    @Then("Show animals")
    public void showAniaml(){
        System.out.println("Show all animals");
    }

}
