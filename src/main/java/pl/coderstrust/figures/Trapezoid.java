package pl.coderstrust.figures;

public class Trapezoid implements Figure {
    private double side_a, side_b, height;

    public Trapezoid(double side_a, double side_b, double height) {
        if (side_a > 0 && side_b > 0 && height > 0) {
            this.side_a = side_a;
            this.side_b = side_b;
            this.height = height;
        } else {
            throw new IllegalArgumentException("All values (side_a, side_b, height) must be > 0: " + side_a + " " + side_b + " " + height);//uncheck
        }
    }

    public double calculateArea() {
        return ((side_a + side_b) * height) / 2;
    }
}
