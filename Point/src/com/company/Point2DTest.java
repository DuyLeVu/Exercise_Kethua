package com.company;

import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D pointA = new Point2D();
        pointA.setXY(3,3);
        System.out.println(Arrays.toString(pointA.getXY()));
    }
}
