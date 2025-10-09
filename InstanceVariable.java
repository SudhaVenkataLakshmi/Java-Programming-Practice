public class InstanceVariable {
    byte b;
    float f;
    char c;
    double d;
    String str;
    public static void main(String args[]){

        InstanceVariable obj1 = new InstanceVariable();
        System.out.println("The Default Value of byte is: "+obj1.b);
        obj1.b = 123;
        System.out.println("The Value of byte is: "+obj1.b);

        InstanceVariable obj2 = new InstanceVariable();
        System.out.println("The Default Value of float is:"+obj2.f);   
        obj2.f = 24.43556f;  
        System.out.println("The Value of float is: "+obj2.f); 

        InstanceVariable obj3 = new InstanceVariable();
        System.out.println("The Default Value of char is:"+obj3.c);   
        obj3.c = 's';
        System.out.println("The Value of char is: "+obj3.c);

        InstanceVariable obj4 = new InstanceVariable();
        System.out.println("The Default Value of double is: "+obj4.d);
        obj4.d = 34.4674643;
        System.out.println("The Value of double is: "+obj4.d);

    }
}
