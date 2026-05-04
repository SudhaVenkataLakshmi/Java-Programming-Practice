public class Student1 {
    static int count = 0;
    Student1(){
        count++;
    }
    public static void main(String[] args){
        new Student1();
        new Student1();
        new Student1();
        System.out.println("Total Students: " +count);
    }
}

