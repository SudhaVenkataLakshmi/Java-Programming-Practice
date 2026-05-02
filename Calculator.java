public class Calculator {
    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }
}
class AdvanceCalculator extends Calculator {
    int add(int a, int b){
        return a + b + 10;
    }
    public static void main(String[] args) {
        AdvanceCalculator obj = new AdvanceCalculator();
        System.out.println(obj.add(5,8));
        System.out.println(obj.add(12,10,9));
    }
}
