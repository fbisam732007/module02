package ss4_class_object.project_fan;

public class RunApp {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow");
        Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "blue");

        System.out.println("Fan 1: " + fan1);
        System.out.println("Fan 2: " + fan2);
     }
}
