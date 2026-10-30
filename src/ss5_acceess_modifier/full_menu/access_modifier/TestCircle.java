package ss5_acceess_modifier.full_menu.access_modifier;
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Hinh tron 1:");
        System.out.println("Ban kinh: " + c1.getRadius());
        System.out.println("Dien tich: " + c1.getArea());

        Circle c2 = new Circle(5.5);
        System.out.println("Hinh tron 2:");
        System.out.println("Ban kinh: " + c2.getRadius());
        System.out.println("Dien tich: " + c2.getArea());
    }
}
