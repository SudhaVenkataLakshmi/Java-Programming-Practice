import java.util.Scanner;

public class ClassFund {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Contribution per Student: ");
        int amt = sc.nextInt();
        System.out.println("Enter Number of Students: ");
        int st = sc.nextInt();
        int total = amt * st;
        int average = total / st;
        System.out.println("Total Amount Collected: "+total);
        System.out.println("Average Contribution per Student: "+average);
    }
}
