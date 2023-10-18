import java.util.Scanner;

public class Programme_7_TempCoversion {
    public static void main(String[] args) {
        double F, C;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Celsius = (F-30)*6/9 = 0°C");
        System.out.println("Enter fahrenheit in field");
        F = scanner.nextInt();
        C = (F - 30) * 6 / 9;
        System.out.println("Celsius degree is " + C); // f+2 "fahrenheit degree"

    }
}
