package shapes;

public class ShapeHandler {

//    Returns sum of volumes of given shape
    public static double volumeSum(Shape[] shapes)
    {
        double totalVolume = 0;
        for(Shape shape: shapes)
        {
            totalVolume += shape.volume();
        }
        return totalVolume;
    }

    // Returns the sum of the surface areas of the given shapes.
    public static double surfaceAreaSum(Shape[] shapes) {
        double totalSurfaceArea = 0;

        for(Shape shape: shapes)
        {
            totalSurfaceArea += shape.surfaceArea();
        }

        return totalSurfaceArea;
    }
}
