public class Parents {
    void show() {
        System.out.println("Parent Content");
    }
}
class Child extends Parents{
    @Override
    void show() {
        System.out.println("Child Content");
    }
    public static void main(String[] args) {
        Parents obj = new Child();
        obj.show();
    }
}
