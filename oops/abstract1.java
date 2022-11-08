package javaProgram.oops;

abstract class parent1 {
    public parent1() {
        System.out.println("I am a constructor of parent1..");
    }

    public void sayhello() {
        System.out.println("Hello.. ");
    }

    abstract public void greet();

}

class child1 extends parent1 {
    public void greet() {
        System.out.println("Good Morning..");
    }
}

public class abstract1 {
    public static void main(String[] args) {
        child1 p = new child1();
        p.sayhello();
        p.greet();

    }

}
