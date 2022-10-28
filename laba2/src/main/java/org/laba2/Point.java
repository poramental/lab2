package org.laba2;

public class Point {
    private double x;
    private double y;

    public Point(){};

    public double getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Point{" +'\n'+
                "x = " + x +'\n'+
                "y = " + y +'\n'+
                '\t'+'}';
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;

    }
}
