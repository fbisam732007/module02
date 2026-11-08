package ss7_abstract_class_interface.protect1;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
    public double getSide() {
        return width;
    }

    @Override
    public void resize(double percent) {
        super.resize(percent);
    }

    @Override
    public String toString() {
        return String.format("Square[side=%.2f]", width);
    }
}
