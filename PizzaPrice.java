import java.util.Scanner;

public class PizzaPrice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Small Pizzas: ");
        int small = sc.nextInt();
        System.out.println("Enter Number of Medium Pizzas: ");
        int medium = sc.nextInt();
        System.out.println("Enter Number of Large Pizzas: ");
        int large = sc.nextInt();
        int total = (small * 150) + (medium * 200) + (large * 250);
        System.out.println("Total bill: "+total);
    }
}
