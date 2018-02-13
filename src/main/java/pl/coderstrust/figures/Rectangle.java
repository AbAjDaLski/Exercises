package pl.coderstrust.figures;

public class Rectangle implements Figure {
    private double side_a, side_b;

    public Rectangle(double side_a, double side_b) {
        if (side_a > 0 && side_b > 0) {
            this.side_a = side_a;
            this.side_b = side_b;
        } else {
            throw new IllegalArgumentException("side must be > 0: " + side_a + " " + side_b);//uncheck
        }
    }

    public double calculateArea() { //P = a*b
        return side_a * side_b;
    }
}
