package lesson12;

public class Rectangle implements Shape {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double perimeter() {
        return 2 * (side1 + side2);
    }

    @Override
    public double area() {
        return side1 * side2;
    }
}
