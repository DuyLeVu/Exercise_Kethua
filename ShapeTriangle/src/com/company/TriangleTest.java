package com.company;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle newTriangle = new Triangle(8,7,9);
        newTriangle.setColor("Red");
        if (!newTriangle.check()) System.out.println("This is not a Triangle");
        else System.out.println(newTriangle);

    }
}
