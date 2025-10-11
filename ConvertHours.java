import java.util.Scanner;

public class ConvertHours {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter hours: ");
    int hrs = sc.nextInt();
    int min = hrs * 60;
    int sec = min * 60;
    System.out.println("Given Hours to Minutes: "+min);
    System.out.println("Given Hours to Seconds: "+sec);
  }
}

