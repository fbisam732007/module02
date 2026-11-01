package ss6_extends.circle_cylinder.point2d_point3d;

public class Main {
    public static void main(String[] args) {
        Point2D p2 = new Point2D(1.5f, 2.5f);
        System.out.println("Point2D: " + p2.toString());

        float[] arr2 = p2.getXY();
        System.out.println("Mang XY: [" + arr2[0] + ", " + arr2[1] + "]");

        Point3D p3 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D: " + p3.toString());

        float[] arr3 = p3.getXYZ();
        System.out.println("Mang XYZ: [" + arr3[0] + ", " + arr3[1] + ", " + arr3[2] + "]");
    }
}
