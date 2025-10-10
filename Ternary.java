public class Ternary {
    public static void main (String args[]){
        int a = 50, b = 100, c = 60;
        int res = ((a>b)?(a>c?a:c):(b>c?b:c));
        System.out.println("Highest Value: "+res);
    }
}
