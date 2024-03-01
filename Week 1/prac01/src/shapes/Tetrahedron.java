package shapes;

public class Tetrahedron implements Shape{
    private double edge;
    public Tetrahedron(double edge)
    {
        this.edge = edge;
    }
    @Override
    public double volume() {
        return (edge * edge * edge/(6.0 * Math.sqrt(2)));
    }

    @Override
    public double surfaceArea() {
        return (Math.sqrt(3) * edge * edge);
    }
}


