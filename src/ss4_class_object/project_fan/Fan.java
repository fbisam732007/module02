package ss4_class_object.project_fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this(SLOW, false, 5, "blue");
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public boolean isOn() { return on; }
    public void setOn(boolean on) { this.on = on; }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    private String speedName() {
        switch (speed) {
            case SLOW:   return "SLOW";
            case MEDIUM: return "MEDIUM";
            case FAST:   return "FAST";
            default:     return "UNKNOWN";
        }
    }

    @Override
    public String toString() {
        return on
                ? "fan is on: speed = " + speedName()
                + ", color = " + color + ", radius = " + radius
                : "fan is off: color = " + color + ", radius = " + radius;
    }
}
