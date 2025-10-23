import java.util.Scanner;

public class Div5and11 {
    public static void main(String[] aregs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int num = sc.nextInt();
        if(num % 5 == 0 && num % 11 == 0){
            System.out.println("It is Divisible by 5 and 11.");
        }else{
            System.out.println("It is not Divisible by 5 and 11.");
        }
    }
}
