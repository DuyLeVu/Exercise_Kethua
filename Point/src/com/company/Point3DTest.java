package com.company;

import java.util.Arrays;

public class Point3DTest {
        public static void main(String[] args) {
            Point3D pointB = new Point3D();
            pointB.setXYZ(3,3,3);
            pointB.setX(5);
            System.out.println(Arrays.toString(pointB.getXYZ()));
        }
    }

