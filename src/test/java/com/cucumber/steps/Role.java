package com.cucumber.steps;

public class Role {
    private String role;
    private String name;
    private String age;

    public Role() {
    }

    public Role(String role, String name, String age) {
        this.role = role;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Role{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
