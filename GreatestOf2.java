import java.util.Scanner;

public class GreatestOf2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 2 Values:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("Greatest Value is: "+a);
        }else
        System.out.println("Greatest Value is: "+b);
    }
}
