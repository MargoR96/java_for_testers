package ru.stqa.pft.sandbox;

public class HelloWorld {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        Square s = new Square(5);
        Rectangle r = new Rectangle(5,6);
        System.out.println("Площадь квадрата = " + s.area()) ;
        System.out.println("Площадь прямоугольника = " + r.area());
    }

    public static void hello(String somebody) {
        System.out.println("Hello," + somebody);
    }



}
