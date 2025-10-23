import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Character: ");
        char c = sc.next().toLowerCase().charAt(0);
        if(c >= 'a' && c <= 'z'){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                System.out.println(c+ " is Vowel.");
            }else
            System.out.println(c+ " is Consonant.");
        }else
        System.out.println("It is not an Alphabet.");
    }
}
