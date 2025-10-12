import java.util.Scanner;

public class FuelCost {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Distance travelled: ");
        int d = sc.nextInt();
        System.out.println("Enter Mileage: ");
        int m = sc.nextInt();
        System.out.println("Enter Price of Fuel per litre: ");
        int p = sc.nextInt();
        int fuel = d / m;
        int total_cost = fuel * p;
        System.out.println("Total Fuel Used: "+fuel);
        System.out.println("Total Cost: "+total_cost);
    }
}
