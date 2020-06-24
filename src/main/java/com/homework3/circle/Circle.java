package main.java.com.homework3.circle;

public class Circle {
    public static void circleArea(double radius) {
        double area = Math.pow(radius, 2) * Math.PI;
        System.out.println("Area of Circle is : " + area);
    }
    public static void sphereVol(double radius){
        System.out.println("Volume of sphere is : " + ((4*Math.PI*Math.pow(radius, 3))/3));
    }
}
