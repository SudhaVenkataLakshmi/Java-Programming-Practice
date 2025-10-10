import java.util.Scanner;

public class SimpleInterest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount: ");
        int p = sc.nextInt();
        System.out.println("Enter Time period:");
        int t = sc.nextInt();
        System.out.println("Enter Rate of Interest: ");
        int r = sc.nextInt();
        int si = (p * t * r)/100;
        System.out.println("Simple Interest: "+si);

    }
}
