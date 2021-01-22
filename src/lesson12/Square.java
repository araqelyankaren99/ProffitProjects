package lesson12;

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
