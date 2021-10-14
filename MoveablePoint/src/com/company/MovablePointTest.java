package com.company;

public class MovablePointTest  {
    public static void main(String[] args) {
        MovablePoint pointB = new MovablePoint();
        pointB.setX(5f);
        pointB.setY(10f);
        pointB.setSpeed(2,2);
        System.out.println(pointB);
        pointB.move();
        System.out.println(pointB.getX());
        System.out.println(pointB.getY());

    }
}
