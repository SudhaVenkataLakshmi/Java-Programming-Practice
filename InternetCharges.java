import java.util.Scanner;

public class InternetCharges {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Minutes Used: ");
        int mins = sc.nextInt();
        int hrs = mins / 60;
        int charges = hrs * 20;
        System.out.println("Total Charges: "+charges);
    }
}
