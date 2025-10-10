public class Ternary {
    public static void main (String args[]){
        int a = 10, b = 40, c = 60;
        int res = ((a>b)?(a>c?a:c):(b>c?b:c));
        System.out.println("Highest Value: "+res);
    }
}
