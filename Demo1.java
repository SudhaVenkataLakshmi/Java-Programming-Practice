public class Demo1 {
    Demo1() {
        this(10);
        System.out.println("Default Constructor");
    }
    Demo1(int x){
        System.out.println("Parameterized: " +x);
    }
    public static void main(String[] args) {
        new Demo();
    }
}
