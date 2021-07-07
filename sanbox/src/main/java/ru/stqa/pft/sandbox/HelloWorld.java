package ru.stqa.pft.sandbox;

public class HelloWorld {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        Square s = new Square(5);
        Rectangle r = new Rectangle(5,6);
        System.out.println("Площадь квадрата = " + area(s)) ;
        System.out.println("Площадь прямоугольника = " + area(r));
    }

    public static void hello(String somebody) {
        System.out.println("Hello," + somebody);
    }

    public static double area (Square s) {
        return s.l*s.l;
    }
    public static double area (Rectangle r) {
        return r.a*r.b;
    }
}
