import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String args[]){
        float pi = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of Circle:");
        int r = sc.nextInt();
        float area = pi * r * r;
        System.out.println("Area of Circle is: "+area);
    }
}
