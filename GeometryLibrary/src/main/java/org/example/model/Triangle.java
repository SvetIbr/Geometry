package org.example.model;

public class Triangle {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        System.out.println("Вычисляем площадь треугольника...");
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double perimeter() {
        System.out.println("Вычисляем периметр треугольника...");
        return a + b + c;
    }
}
