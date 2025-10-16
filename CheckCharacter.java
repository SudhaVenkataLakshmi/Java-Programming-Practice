import java.util.Scanner;

public class CheckCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Value: ");
        char value = sc.next().charAt(0);
        if((value >= 'A' && value <= 'Z') || (value >= 'a' && value <= 'z')){
            System.out.println("It is an Alphabet.");
        }else if(value >= '0' && value <= '9'){
            System.out.println("It is a Number.");
        }else
        System.out.println("It is a Special Character.");
    }
}
