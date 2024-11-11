package com.cucumber.steps;

public class Color {
    private String color;

    public Color(String color) {
        this.color = color;
    }

    public Color() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                '}';
    }
}
