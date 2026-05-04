public class Address {
    String city;
    Address(String city){
        this.city = city;
    }
}
class Student {
    String name;
    Address address;
    Student(String name, String city){
        this.name = name;
        this.address = new Address(city);
    }
    void display(){
        System.out.println(name+ " lives in " +address.city);
    }
    public static void main(String[] args){
        Student s = new Student("Sushma", "Kakinada");
        s.display();
    }
}
