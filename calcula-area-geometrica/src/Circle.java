public record Circle(double radius) implements GeometricFrom {
    private static final double PI = Math.PI;

    @Override
    public double area() {
        return PI * (radius * radius);
    }
}
