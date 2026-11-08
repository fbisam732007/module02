package ss7_abstract_class_interface.protect1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Square(3)
        };

        Random random = new Random();

        for (Shape shape : shapes) {
            double areaBefore = shape.getArea();

            double percent = 1 + random.nextDouble() * 99;

            if (shape instanceof Resizeable) {
                ((Resizeable) shape).resize(percent);
            }

            double areaAfter = shape.getArea();

            System.out.println("----------------------------------------");
            System.out.println("Hình          : " + shape);
            System.out.println("Tỷ lệ resize  : " + String.format("%.2f%%", percent));
            System.out.println("Diện tích cũ  : " + String.format("%.4f", areaBefore));
            System.out.println("Diện tích mới : " + String.format("%.4f", areaAfter));
            System.out.println("Tỷ lệ S mới/cũ: " + String.format("%.4f", areaAfter / areaBefore));
        }
    }
}
