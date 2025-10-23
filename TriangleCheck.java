import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The sides form a valid triangle.");
        } else {
            System.out.println("The sides do NOT form a valid triangle.");
        }

        sc.close();
    }
}
