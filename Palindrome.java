import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int number = sc.nextInt();
        int temp = number;
        int rev = 0;
        while (number != 0) {
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        if(rev == temp)
        System.out.println("It is Palindrome.");
        else
        System.out.println("It is Not a Palindrome.");
    }
}
