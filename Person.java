public class Person {
        String name;
        Person(String name) {
            this.name = name;
            System.out.println("Person: " +name);
        }
    }
    class Employee extends Person {
        int id;
        Employee (String name, int id){
            super(name);
            this.id = id;
            System.out.println("Employee ID: " +id);
        }
        public static void main(String[] args) {
            new Employee("Sushma", 101);
        }
}

