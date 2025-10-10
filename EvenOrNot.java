import java.util.Scanner;

public class EvenOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Value: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Given Value is Even.");
        }else{
            System.out.println("Given Value is not Even.");
        }
    }
}
