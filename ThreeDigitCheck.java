import java.util.Scanner;

public class ThreeDigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999 || num <= -100 && num >= -999) {
            System.out.println(num + " is a three-digit number.");
        } else {
            System.out.println(num + " is NOT a three-digit number.");
        }

        sc.close();
    }
}

