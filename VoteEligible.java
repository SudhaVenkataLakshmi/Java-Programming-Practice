import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You are Eligible for Vote.");
        }else
        System.out.println("You are not Eligible for Vote.");
    }
}



