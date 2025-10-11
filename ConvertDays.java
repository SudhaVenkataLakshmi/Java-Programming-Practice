import java.util.Scanner;

public class ConvertDays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Days: ");
        int d = sc.nextInt();
        int years = d/365;
        int weeks = (d % 365) / 7;
        int days = (d % 365) % 7;
        System.out.println("Final Result: "+years+"year,"+weeks+"weeks,"+days+"days");
    }
}
