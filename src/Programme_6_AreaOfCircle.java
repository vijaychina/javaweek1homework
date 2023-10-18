import java.util.Scanner;

public class Programme_6_AreaOfCircle {
    public static void main(String[] args) {
        double radius, area;
        Scanner scan = new Scanner(System.in);
        radius = scan.nextInt();
        area = Math.PI * radius;
        System.out.println("Area of the circle: " + area);

    }
}
