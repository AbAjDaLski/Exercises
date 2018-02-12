package pl.coderstrust.figures;

public class Triangle implements Figure {
    private double base;
    private double height;


    public Triangle(double base, double height) {
        if (base > 0 && height > 0) {
            this.base = base;
            this.height = height;
        } else {
            throw new IllegalArgumentException("All values(base, height) must be > 0: " + base + " " + height);//uncheck
        }
    }

    public double calculateArea() {
        return (base * height) / 2;
    }
}
