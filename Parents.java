public class Parents {
    void show() {
        System.out.println("Parent Method");
    }
}
class Child extends Parents{
    @Override
    void show() {
        System.out.println("Child Method");
    }
    public static void main(String[] args) {
        Parents obj = new Child();
        obj.show();
    }
}
