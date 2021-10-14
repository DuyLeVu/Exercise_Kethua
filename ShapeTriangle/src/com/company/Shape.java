package com.company;

public class Shape {
    private String Color;

    public Shape(String color) {
        Color = color;
    }

    public Shape() {
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "Color='" + Color + '\'' +
                '}';
    }
}
