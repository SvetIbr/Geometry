package org.example;

import org.example.model.Circle;
import org.example.model.Rectangle;
import org.example.model.Triangle;
import org.example.model3d.Cube;
import org.example.model3d.Cylinder;
import org.example.model3d.Sphere;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        double resultCircle = circle.area();
        System.out.println("Площадь круга: " + resultCircle);
        System.out.println("Периметр круга: " + circle.perimeter());
        System.out.println("Площадь круга в миллиметрах - " + Util.convertToMillimeters(resultCircle));

        Rectangle rectangle = new Rectangle(4, 6);
        double resultRectangle = rectangle.area();
        System.out.println("Площадь прямоугольника: " + resultRectangle);
        System.out.println("Периметр прямоугольника: " + rectangle.perimeter());
        System.out.println("Площадь прямоугольника в дециметрах - " +
                Util.convertToDecimeters(resultRectangle));

        Triangle triangle = new Triangle(3, 4, 5);
        double resultTriangle = triangle.area();
        System.out.println("Площадь треугольника: " + resultTriangle);
        System.out.println("Периметр треугольника: " + triangle.perimeter());
        System.out.println("Площадь треугольника в метрах - " +
                Util.convertToMeters(resultTriangle));
        System.out.println("Площадь треугольника в километрах - " +
                Util.convertToKilometers(resultTriangle));

        Cube cube = new Cube(4);
        System.out.println("Площадь поверхности куба: " + cube.surfaceArea());
        System.out.println("Объем куба: " + cube.volume());

        Sphere sphere = new Sphere(5);
        System.out.println("Площадь поверхности сферы: " + sphere.surfaceArea());
        System.out.println("Объем сферы: " + sphere.volume());

        Cylinder cylinder = new Cylinder(3, 5);
        System.out.println("Площадь поверхности цилиндра: " + cylinder.surfaceArea());
        System.out.println("Объем цилиндра: " + cylinder.volume());
    }
}