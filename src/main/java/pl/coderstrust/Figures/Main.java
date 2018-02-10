package pl.coderstrust.Figures;

public class Main {
    public static void main(String[] args) {

        System.out.println("Area of Tringle");
        Figure tringle = new Triangle(2, 8);
        //tringle.calculateArea(); - do test
        System.out.println(tringle.calculateArea());

        System.out.println("Area of Square");
        Figure square = new Square(2); //przekazanie paramtetru przez interface
        System.out.println(square.calculateArea());// wykonanie działania na parametrach przez intereface

        System.out.println("Area of Circle");
        Figure circle = new Circle(2);
        System.out.println(circle.calculateArea());

        System.out.println("Area of Trapezoid");
        Figure trapezoid = new Trapezoid(5, 9, 5);
        System.out.println(trapezoid.calculateArea());

        System.out.println("Area of Rectangle");
        Figure rectangle = new Rectangle(2, 5);
        System.out.println(rectangle.calculateArea());

    }
}

