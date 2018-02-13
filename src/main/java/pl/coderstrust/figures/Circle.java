package pl.coderstrust.figures;

public class Circle implements Figure {
    private final double PI = 3.14;
    private double radius;
    private double power;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
            power = Math.pow(radius, 2);
        } else {
            throw new IllegalArgumentException("radius must be > 0: " + radius);//uncheck
        }
    }

    public double calculateArea() { // P = π*r2
        return PI * power;
    }
}
