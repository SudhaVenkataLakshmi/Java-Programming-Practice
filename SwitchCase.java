import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Value: ");
        int a = sc.nextInt();
        System.out.println("Enter b Value: ");
        int b = sc.nextInt();
        System.out.println("Enter any Operator(+,-,*,/,%): ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Addition of given two Values: "+(a+b));
                break;
            case '-':
                System.out.println("Addition of given two Values: "+(a-b));
                break;
        case '*':
                System.out.println("Addition of given two Values: "+(a*b));
                break;
        case '/':
                System.out.println("Addition of given two Values: "+(a/b));
                break;
        case '%':
                System.out.println("Addition of given two Values: "+(a%b));
                break;
            default:
                System.out.println("Enter Valid Operator!");
                break;
        }
    }
}
