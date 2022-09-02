public class method_overloading {
    static void foo() {
        System.out.println("Program on Method Overloading");
    }

    static void foo(int a) {
        System.out.println("Program no:" + a);
    }

    void foo(int a, int b) {
        System.out.println("program no:" + a + " and " + b);

    }

    public static void main(String[] args) {
        foo();
        foo(5);

        // without static Keyword
        method_overloading obj = new method_overloading();
        obj.foo(5, 8);

    }

}
