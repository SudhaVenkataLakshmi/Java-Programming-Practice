import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int n = sc.nextInt();
        int sqr = n * n;
        int cube = n * n * n;
        System.out.println("The Square of Given Number: "+sqr);
        System.out.println("The Cube of Given Number: "+cube);
    }
}
