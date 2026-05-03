public class Animal {
    Animal() {
        System.out.println("Animal Constructor");
    }
}
class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog was Barking");
    }
    public static void main(String[] args) {
        new Dog();
    }
}

