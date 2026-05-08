public class Parents {
    void show() {
        System.out.println("Parent Class");
    }
}
class Child extends Parents{
    @Override
    void show() {
        System.out.println("Child Class");
    }
    public static void main(String[] args) {
        Parents obj = new Child();
        obj.show();
    }
}
