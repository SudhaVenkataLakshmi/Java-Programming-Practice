class Demo {
    static {
        System.out.println("Static block executed");
    }

    static void show() {
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        show();
    }
}