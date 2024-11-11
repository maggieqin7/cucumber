package com.cucumber.steps;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.JsonNode;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.DocStringType;
import io.cucumber.java.en.Given;
import io.qameta.allure.internal.shadowed.jackson.core.JsonProcessingException;

public class JsonStepdefs {
    private ObjectMapper objectMapper = new ObjectMapper();

    @DocStringType
    public JsonNode json(String docString) throws JsonProcessingException, io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException {

        return objectMapper.readTree(docString);
    }

    @Given("datatables json form")
    public void showJson(JsonNode jsonNode){
        System.out.println(jsonNode);
//        {"role":"Manager","name":"Dojo","age":"25"}

    }
}
