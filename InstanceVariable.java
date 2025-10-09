public class InstanceVariable {
    byte b;
    float f;
    char c;
    double d;
    String str;
    short s;
    long l;

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

        InstanceVariable obj5 = new InstanceVariable();
        System.out.println("The Default Value of string is: "+obj5.str);
        obj5.str = "Java";
        System.out.println("The Value of string is: "+obj5.str);

        InstanceVariable obj6 = new InstanceVariable();
        System.out.println("The Default Value of byte is: "+obj6.s);
        obj6.s = 12365;
        System.out.println("The Value of byte is: "+obj6.s);

        InstanceVariable obj7 = new InstanceVariable();
        System.out.println("The Default Value of byte is: "+obj7.l);
        obj7.l = 834983453;
        System.out.println("The Value of byte is: "+obj7.l);

    }
}
