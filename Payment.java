interface Payment {
    void pay(double amount);
}
class UPI implements Payment {
    public void pay(double amount){
        System.out.println("Paid via UPI: " +amount);
    }
}
class Card implements Payment {
    public void pay(double amount){
        System.out.println("Paid via Card: " +amount);
    }
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new Card();
        p1.pay(3000);
        p2.pay(15000);
    }
}
