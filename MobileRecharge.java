import java.util.Scanner;

public class MobileRecharge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter Recharge Amount: ");
        int amt = sc.nextInt();
        int gst = (amt * 18) / 100;
        int talk_Time = amt - gst;
        System.out.println("Talktime: "+talk_Time);
    }
}
