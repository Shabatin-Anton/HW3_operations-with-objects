package main.java.com.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Write radius of circle");
        double radius = Double.parseDouble(reader.readLine());
        Circle.Circle(radius);

        new Add();
        new Add();
        new Add();

        System.out.println("Quantity of objects created : " + Add.getСount());

        Car car = new Car();
        car.startCar();
        car.stopCar();
        car.drive();
        car.speed(120);
    }
}
