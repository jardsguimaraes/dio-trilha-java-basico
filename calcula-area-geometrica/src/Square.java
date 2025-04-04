public record Square(double side) implements GeometricFrom {

    @Override
    public double area() {
        return side * side;
    }
}
