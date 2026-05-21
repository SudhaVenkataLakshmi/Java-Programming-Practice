interface Payment1 {
    void pay(double amount);
        default void receipt() {
            System.out.println("Payment Successful");
    }
}
class UPI implements Payment1{
    public void pay(double amount){
        System.out.println("UPI Payment: " +amount);
    }
    public static void main(String[] args) {
        UPI u = new UPI();
        u.pay(1800);
        u.receipt();
    }
}
