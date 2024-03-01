package shapes;


import static shapes.ShapeHandler.surfaceAreaSum;
import static shapes.ShapeHandler.volumeSum;

public class Main{
    public static void main(String[] args)
    {
        Tetrahedron tetrahedron = new Tetrahedron(2);
        System.out.println(tetrahedron.volume());
        System.out.println(tetrahedron.surfaceArea());

        Cylinder cylinder = new Cylinder(2,2);
        System.out.println(cylinder.volume());
        System.out.println(cylinder.surfaceArea());

        Shape[] shapes = {tetrahedron, cylinder};
        System.out.println(volumeSum(shapes));
        System.out.println(surfaceAreaSum(shapes));

    }
}
