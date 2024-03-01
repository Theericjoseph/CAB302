package shapes;

public class Cylinder implements Shape{

    private double radius;
    private double height;
    public Cylinder(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }
    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public double surfaceArea() {
        return (Math.PI * radius * radius * 2) + (2 * Math.PI * radius * height);
    }
}
