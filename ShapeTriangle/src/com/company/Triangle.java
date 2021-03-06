package com.company;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public boolean check(){
        if ((this.side1+this.side2 > this.side3) && (this.side2+this.side3 > this.side1) && (this.side1+this.side3 > this.side2)){
            return true;
        } else return false;
    }
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void setColor(String color){
        super.setColor(color);
    }

    public String getColor(){
        return super.getColor();
    }

    public  double getArea(){
        double p = (side1 + side2 + side3)/2;
        double triangleArea = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return triangleArea;
    }
    public  double getPerimeter(){
        double trianglePerimeter = side1 + side2 + side3;
        return trianglePerimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color: " + getColor() +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                '}';
    }
}
