package javaProgram.oops;

class cons {
    // initializing a constructor(name same as class name)
    public cons() {
        System.out.println("Program based on constructor");
    }

    // constructor overloading(Same as method overloading)
    public cons(String name) {
        System.out.println(name);
    }
}

public class constructor1 {
    public static void main(String[] args) {
        cons obj1 = new cons();
        cons obj2 = new cons("Pathak");

    }

}
