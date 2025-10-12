import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Late Days: ");
        int days = sc.nextInt();
        int fine = days * 2;
        System.out.println("Total Fine for Given Number of Days: "+fine);
    }
}
