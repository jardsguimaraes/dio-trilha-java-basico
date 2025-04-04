public record Rectangle(double height,double base) implements GeometricFrom {

    @Override
    public double area() {
        return height * base;
    }
    
}
