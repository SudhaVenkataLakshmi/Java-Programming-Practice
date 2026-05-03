class Test {
    int value = 10;

    void change(Test t) {
        t.value = 80;
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.change(obj);
        System.out.println(obj.value);
    }
}