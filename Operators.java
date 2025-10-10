import java.util.Scanner;

public class Operators {
    public static void main(String args[]){
        int a = 40;
        int b = 60;

        //Arithmatic Operators

        System.out.println("Sum of Given Numbers: "+(a+b));
        System.out.println("Difference of Given Numbers: "+ -((a-b)));
        System.out.println("Product of Given Numbers:"+(a*b));
        System.out.println("Division of Given Numbers: "+(b/a));
        System.out.println("Modulo Division of Given Numbers: "+(b%a));

        //Relational Operators

        System.out.println("(a==b):"+(a==b));
        System.out.println("(a<b):"+(a<b));
        System.out.println("(a>b):"+(a>b));
        System.out.println("(a<=b):"+(a<=b));
        System.out.println("(a>=b):"+(a>=b));
        System.out.println("(a!=b):"+(a!=b));

        //Logical Operators

        System.out.println((a!=b) && (a>b));
        System.out.println((a!=b) && (a<b));
        System.out.println((a==b) || (a<b));
        System.out.println((a!=10) || (b>a));
        System.out.println(a!=b);
        System.out.println(a==b);

        //Assignment Operators

        System.out.println("(a+=3): "+(a+=3));
        System.out.println("(a-=2): "+(a-=2));
        System.out.println("(a*=4): "+(a*=4));
        System.out.println("(a/=2): "+(a/=2));
        System.out.println("(a%=2): "+(a%=2));

        //Increment & Decrement Operators

        System.out.println("The Value of a is: "+a);
        System.out.println("(++a): "+(++a));
        System.out.println("(a++): "+(a++));
        System.out.println("(--a): "+(--a));
        System.out.println("(a--): "+(a--));
        System.out.println("The Value of a is: "+a);

        //Ternary Operator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Value: ");
        int num = sc.nextInt();
        String result = (num % 2 == 0)? "Even":"Odd";
        System.out.println("The Value is: "+result);

    }
}
