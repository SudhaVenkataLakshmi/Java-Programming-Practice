public class NestedIf {
    public static void main(String[] args){
        int a = 20, b = 10, c = 30;
        if(a > b){
            if(a > c){
                System.out.println("a is Highest.");
            }else{
                System.out.println("c is Highest.");
            }
        }else if(b > c){
            System.out.println("b is Highest.");
        }else{
            System.out.println("c is Highest.");
        }
    }
}
