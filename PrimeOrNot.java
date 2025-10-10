import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Value: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Given Value is Prime.");
        }else{
            System.out.println("Given Value is not Prime.");
        }
    }
}
