package geometry;

public class Rectangle implements Figure {
    private double a = 0;
    private double b = 0;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2*a + 2*b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
