import java.util.Scanner;

public class Programme_5_Calculator {
    public static void main(String[] args) {
        int v1, v2, v3;
        Scanner adj = new Scanner(System.in);
        System.out.println("input the first number");
        v1 = adj.nextInt();
        System.out.println("Input the second number");
        v2 = adj.nextInt();

        System.out.println("Option available");
        System.out.println("addition");
        System.out.println("substraction");
        System.out.println("multiplication");
        System.out.println("division");
        System.out.println("enter option");

        //1
        // v3 =v1 + v2
        System.out.println("addition");
        //2
        v3 = v1 - v2;
        System.out.println("substraction");
        //3
        v3 = v1 * v3;
        System.out.println("multiplication");

        //4
        v3 = v1 / v2;
        System.out.println("divition");
        // any number;
        System.out.println("any option");
        adj.close();

    }
}


