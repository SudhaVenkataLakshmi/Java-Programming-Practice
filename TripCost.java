import java.util.Scanner;

public class TripCost {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount Spent by Friend1: ");
        double f1 = sc.nextDouble();
        System.out.println("Amount Spentby Friend2: ");
        double f2 = sc.nextDouble();
        double total = f1 + f2;
        double f1_percentage = (f1 / total) * 100;
        double f2_percentage = (f2 / total) * 100;
        System.out.println("Total Amount: "+total);
        System.out.println("Percentage of amount paid by Friend1: "+f1_percentage);
        System.out.println("Percentage of amount paid by Friend2: "+f2_percentage);
    }
}
