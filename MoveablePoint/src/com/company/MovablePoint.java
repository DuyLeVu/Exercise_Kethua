package com.company;

public class MovablePoint extends Point {
    float xSpeed;
    float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }


    public void setX(float x){
        super.setX(x);
    }

    public float getX(){
        return super.getX();
    }

    public void setY(float y){
        super.setY(y);
    }
    public float getY(){
        return super.getY();
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{this.xSpeed,this.ySpeed};
    }

    @Override
    public String toString() {
        return "(" + this.getX() +
                ", " + this.getY() +
                ", " + this.getSpeed() +
                "= (" + (getX()* xSpeed) +
                ", " +  (getY()* ySpeed) +
                ")";
    }

    public MovablePoint move(){
      float newX = this.getX() + xSpeed;
        float newY = this.getY() + ySpeed;
        this.setX(newX);
        this.setY(newY);
        return this;
    }
}
