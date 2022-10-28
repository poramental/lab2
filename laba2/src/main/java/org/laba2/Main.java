package org.laba2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        double x1,x2,y1,y2;
        while(true){
            try {
                System.out.print("Введите x1 ->");

                 x1 = Double.parseDouble(in.next());

                System.out.print("Введите y1 ->");

                 y1 = Double.parseDouble(in.next());

                System.out.print("Введите x2 ->");

                 x2 = Double.parseDouble(in.next());

                System.out.print("Введите y2 ->");

                 y2 = Double.parseDouble(in.next());

                 break;



            }catch (Exception ex){
                System.out.println(ex.getMessage());
                continue;
            }
        }

        Point A = new Point(x1, y1);
        Point B = new Point(x2, y2);

        List<Point> points = Triangle.getThirdPointsForTriangle(A,B);

        Triangle firstTriangle = new Triangle(A,B,points.get(0));
        Triangle secondTriangle = new Triangle(A,B,points.get(1));

        Circle firstCircle = firstTriangle.getCircumscribedCircle();
        Circle secondCircle = secondTriangle.getCircumscribedCircle();
        for(Point point : points){
            System.out.println('\n'+point.toString() + '\n') ;
        }
        System.out.println("ПЕРВЫЙ ВАРИАНТ :");
        System.out.println('\n'+firstCircle.toString() + '\n');
        System.out.println("ВТОРОЙ ВАРИАНТ :");
        System.out.println('\n'+secondCircle.toString()+ '\n');

    }
}