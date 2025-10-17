import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting Value: ");
        int start = sc.nextInt();
        System.out.println("Enter Ending Value: ");
        int end = sc.nextInt();
        System.out.println("Values between " +start+ " and " +end+ " are: ");
        for(int i = start; i <= end; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
