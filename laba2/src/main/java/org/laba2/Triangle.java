package org.laba2;

import java.util.ArrayList;
import java.util.List;
import org.laba2.Circle;
import org.laba2.TriangleException;
public class Triangle {
    private Point A;
    private Point B;
    private Point C;


    public Triangle(){}

    public Point getA() {
        return A;
    }
    public void setA(Point a) {
        A = a;
    }

    public Point getB() {
        return B;
    }
    public static List<Point> getThirdPointsForTriangle(Point x, Point y){
        Point d;
        if (x.getX() > y.getX()){
            d = x;
            x = y;
            y = d;

        }
        double X1 = y.getX();
        double Y1 = x.getX();
        double X2 = y.getY();
        double Y2 = x.getX();
        Point first = new Point(X1,Y1);
        Point second = new Point(Y2, X2);
        ArrayList<Point> list = new ArrayList<>(2);
        list.add(0,first);
        list.add(1,second);
        return list;
    }
    public void setB(Point b) {
        B = b;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point c) {
        C = c;
    }

    public Triangle(Point A, Point B, Point C){
        this.A = A;
        this.B = B;
        this.C = C;

    }
    public Circle getCircumscribedCircle() throws Exception{
        if( this.C == null || this.A == null || this.B == null){
            throw new TriangleException("нет трёх точек");
        }
        Point center = new Point((B.getX() + C.getX() + A.getX()) / 3 , (B.getY() + C.getY() + A.getY()) / 3) ;
        double radius =  Line.getLength(this.A,this.B) * Math.sqrt(3) / 3;
        return new Circle(radius,center);
    }
    public static Circle getCircumscribedCircle(Triangle triangle) throws Exception{
        if( triangle.C == null || triangle.A == null || triangle.B == null){
            throw new TriangleException("нет трёх точек");
        }
        Point center = new Point((triangle.B.getX() + triangle.C.getX() + triangle.A.getX()) / 3 , (triangle.B.getY() + triangle.C.getY() + triangle.A.getY()) / 3);
        double radius =  Line.getLength(triangle.A,triangle.B) * Math.sqrt(3) / 3;
        return new Circle(radius,center);
    }

    public static Circle getCircumscribedCircle(Point A, Point B, Point C) throws Exception{
        if( C == null || A == null || B == null){
            throw new TriangleException("нет трёх точек");
        }
        Point center = new Point((B.getX() + C.getX() + A.getX()) / 3 , (B.getY() + C.getY() + A.getY()) / 3);
        double radius =  Line.getLength(A,B) * Math.sqrt(3) / 3;
        return new Circle(radius,center);
    }




}
