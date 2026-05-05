public class Parents {
    void show() {
        System.out.println("Parent");
    }
}
class Child extends Parents{
    @Override
    void show() {
        System.out.println("Child");
    }
    public static void main(String[] args) {
        Parents obj = new Child();
        obj.show();
    }
}
