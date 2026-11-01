package ss6_extends.circle_cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle () {
        this.radius = 1.0;
        this.color = "yellow";
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius; }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "hình tròn [Ban kinh = " + radius + ", mau="+ color + ", Dien tich="+ getArea() + "]";
    }
}
