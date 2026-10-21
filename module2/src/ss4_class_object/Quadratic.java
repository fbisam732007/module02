package ss4_class_object;

import java.util.Scanner;

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.sqrt(delta)) / (2 * a);
        }
        return 0;
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta)) / (2 * a);
        }
        return 0;
    }
}

// Đã đổi tên class Main thành Quadratic để khớp với tên file của bạn
public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation eq = new QuadraticEquation(a, b, c);
        double delta = eq.getDiscriminant();

        if (delta > 0) {
            System.out.printf("The equation has two roots %.6f and %.6f%n", eq.getRoot1(), eq.getRoot2());
        } else if (delta == 0) {
            System.out.printf("The equation has one root %.6f%n", eq.getRoot1());
        } else {
            System.out.println("The equation has no real roots");
        }

        scanner.close();
    }
}
