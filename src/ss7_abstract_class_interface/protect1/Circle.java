package ss7_abstract_class_interface.protect1;

public class Circle implements Shape, Resizeable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void resize(double percent) {
        radius *= (1 + percent / 100.0);
    }

    @Override
    public String toString() {
        return String.format("Circle[r=%.2f]", radius);

    }
}
