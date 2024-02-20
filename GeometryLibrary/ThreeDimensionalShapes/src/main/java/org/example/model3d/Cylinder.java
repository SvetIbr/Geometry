package org.example.model3d;

public class Cylinder {
    private final double radius;
    private final double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double surfaceArea() {
        double baseArea = Math.PI * radius * radius;
        double lateralArea = 2 * Math.PI * radius * height;
        return 2 * baseArea + lateralArea;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
