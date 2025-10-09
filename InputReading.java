import java.util.Scanner;
public class InputReading {
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter byte Value: ");
        byte b = sc.nextByte();
        System.out.println("Enter short Value: ");
        short s = sc.nextShort();
        System.out.println("Enter int Value: ");
        int i = sc.nextInt();
        System.out.println("Enter long Value: ");
        long l = sc.nextLong();
        System.out.println("Enter float Value: ");
        float f = sc.nextFloat();
        System.out.println("Enter double Value: ");
        double d = sc.nextDouble();
        System.out.println("Enter string Value: ");
        sc.nextLine();
        String str1 = sc.next();
        System.out.println("Enter sentence Value: ");
        sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("Enter char Value: ");
        char c = sc.next().charAt(2);

        System.out.println("Byte Value: "+b);
        System.out.println("Short Value: "+s);
        System.out.println("Int Value: "+i);
        System.out.println("Long Value: "+l);
        System.out.println("String Value: "+str1);
        System.out.println("Sentence Value: "+str2);
        System.out.println("Char Value: "+c);
        System.out.println("Float Value: "+f);
        System.out.println("Double Value: "+d);


   }

}
