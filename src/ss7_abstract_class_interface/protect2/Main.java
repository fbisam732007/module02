package ss7_abstract_class_interface.protect2;

public class Main {
    public static void main(String[] args) {
        GeometricObject[] shapes = {
                new Square(2),
                new Circle(3),
                new Square(5),
                new Circle(1.5)
        };

        for (GeometricObject g : shapes) {
            System.out.printf("Area = %.2f%n", g.getArea());
            if (g instanceof Colorable) {
                ((Colorable) g).howToColor();
            }
        }
    }
}
