package main.java.com.homework3;

import main.java.com.homework3.car.Car;
import main.java.com.homework3.circle.Circle;
import main.java.com.homework3.counter.Counter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Write radius of circle");
        double radius = Double.parseDouble(reader.readLine());
        Circle.circleArea(radius);
        Circle.sphereVol(radius);

        new Counter();
        new Counter();
        new Counter();

        System.out.println("Quantity of objects created : " + Counter.getСount());

        Car car = new Car();
        car.start();
        car.stop();
        car.drive();
        car.speed(120);
    }
}
