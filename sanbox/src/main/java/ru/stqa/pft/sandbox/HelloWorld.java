package ru.stqa.pft.sandbox;

public class HelloWorld {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        System.out.println("Площадь квадрата = " + area(5)) ;
        System.out.println("Площадь прямоугольника = " + area(5,6));
    }

    public static void hello(String somebody) {
        System.out.println("Hello," + somebody);
    }

    public static double area (double l) {
        double s = l*l;
        return s;
    }
    public static double area (double a, double b) {
        return a*b;
    }
}
