package org.example.model3d;

public class Cube {
    private final double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    public double surfaceArea() {
        return 6 * sideLength * sideLength;
    }

    public double volume() {
        return sideLength * sideLength * sideLength;
    }
}
