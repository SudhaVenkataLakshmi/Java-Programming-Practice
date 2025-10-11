import java.util.Scanner;

public class Remainder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 2 Values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int rem = a - (a/b) * b;
    System.out.println("The Remainder of Given Numbers without using % operator: "+rem);    }
}
