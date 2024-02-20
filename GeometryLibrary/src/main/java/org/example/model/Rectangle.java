package org.example.model;

public class Rectangle {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        System.out.println("Вычисляем площадь прямоугольника...");
        return length * width;
    }

    public double perimeter() {
        System.out.println("Вычисляем периметр прямоугольника...");
        return 2 * (length + width);
    }
}
