package com.company;
import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point pointA = new Point();
        pointA.setX(0.5f);
        System.out.println(pointA.getX());
        pointA.setXY(5.5f,10f);
        System.out.println(Arrays.toString(pointA.getXY()));
    }

}
