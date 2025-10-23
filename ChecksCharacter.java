import java.util.Scanner;

public class ChecksCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Character: ");
        char ch = sc.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println(ch+ " is an UpperCase.");
        }else if(ch >= 'a' && ch <= 'z'){
            System.out.println(ch+ " is LowerCase.");
        }else if(ch >= '0' && ch <= '9'){
            System.out.println(ch+ " is a Digit.");
        }else
        System.out.println(ch+ " is a Special Character.");
    }
}
