package org.laba2;

import java.util.ArrayList;
import java.util.List;

public class Circle {

    private double radius;
    private Point center ;


    public Circle(){};

    public Circle(double radius, Point center){
        this.center = center;
        this.radius = radius;

    }


    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +'\n'+
                "radius=" + radius +'\n'+
                 "center = " + center.toString() +'\n'+
                '}';
    }

    public double getRadius(double radius){
        return this.radius;
    }

    public void setCenter(double x, double y){
        this.center = new Point(x,y);


    }



}
