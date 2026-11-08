package ss7_abstract_class_interface.protect1;

public class Rectangle implements Shape, Resizeable {
    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void resize(double percent) {
        double factor = 1 + percent / 100.0;
        width *= factor;
        height *= factor;
    }

    @Override
    public String toString() {
        return String.format("Rectangle[w=%.2f, h=%.2f]", width, height);
    }
}
