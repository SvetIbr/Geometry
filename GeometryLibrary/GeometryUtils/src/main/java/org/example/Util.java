package org.example;

public class Util {
    private static final String NOT_ZERO = "Число не может быть меньше или равно 0";
    public static double convertToMillimeters(double original) {
        if (isZero(original)) {
            return 0;
        }
        System.out.println("Переводим результат в миллиметры");
        return original * 10;
    }

    public static double convertToDecimeters(double original) {
        if (isZero(original)) {
            return 0;
        }
        System.out.println("Переводим результат в дециметры");
        return original * 0.1;
    }

    public static double convertToMeters(double original) {
        if (isZero(original)) {
            return 0;
        }
        System.out.println("Переводим результат в метры");
        return original * 0.01;
    }

    public static double convertToKilometers(double original) {
        if (isZero(original)) {
            return 0;
        }
        System.out.println("Переводим результат в километры");
        return original * 0.00001;
    }

    private static boolean isZero(double original) {
        if (original <= 0) {
            System.out.println(NOT_ZERO);
            return true;
        }
        return false;
    }
}
