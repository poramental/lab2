package org.laba2;

import org.jetbrains.annotations.NotNull;

public class Line {
    private Point x;
    private Point y;
    private double length;


    public Line(){};
    public Line(Point x, Point y){
        this.y = y;
        this.x = x;
    }

    public Point getX() {
        return x;
    }

    public void setX(Point x) {
        this.x = x;
    }

    public Point getY() {
        return y;
    }

    public void setY(Point y) {
        this.y = y;
    }

    public double getLength(){
        return Math.sqrt(Math.pow((this.x.getX() - this.y.getX()),2) + Math.pow((this.x.getY() - this.y.getY()),2));
    }

    public static double getLength( Point x, Point y){
        return Math.sqrt(Math.pow((x.getX() - y.getX()),2) + Math.pow((x.getY() - y.getY()),2));
    }

}
