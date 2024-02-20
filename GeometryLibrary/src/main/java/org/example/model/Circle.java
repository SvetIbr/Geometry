package org.example.model;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double perimeter() {
        System.out.println("Вычисляем периметр круга...");
        return 2 * radius * Math.PI;
    }

    public double area() {
        System.out.println("Вычисляем площадь круга...");
        return radius * radius * Math.PI;
    }
}
