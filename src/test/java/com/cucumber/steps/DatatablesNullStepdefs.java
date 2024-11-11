package com.cucumber.steps;

import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;


public class DatatablesNullStepdefs {

//    method 1: key-value,when the value = "[blank]" in feature file, it will print emptyString = ""
    @DataTableType(replaceWithEmptyString = "[blank]")
    public Role dataTables(Map<String,String> map){
        return new Role(map.get("role"),
                map.get("name"),
                map.get("age"));
    }

    @Given("There are null in the list:")
    public void showRole(List<Role> roles){
        System.out.println(roles);
//       [Role{role='Manager', name='Dojo', age='23'}, Role{role='Admin', name='', age=''}, Role{role='', name='Joye', age='25'}]
//        System.out.println(roles.size());

    }



//    output method 2
    @Given("roles method two have null value")
    public void showrole2(@Transpose Role roles){
        System.out.println(roles);
//        Role{role='jk', name='Kimi', age='null'}
    }

}
