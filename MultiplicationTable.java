import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which table to Print: ");
        int table = sc.nextInt();
        System.out.println("Starting Range: ");
        int start = sc.nextInt();
        System.out.println("Ending Range: ");
        int end = sc.nextInt();
        for(int i = start; i <= end; i++){
            System.out.println(table+ " X " +i+ " = " +table*i);
            System.out.printf("%d X %d = %d\n", table, i, table*i);
        }
    }
}
