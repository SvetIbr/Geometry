package org.example.model3d;

public class Sphere {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

