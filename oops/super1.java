package javaProgram.oops;

//using Super Keyword 
import java.util.*;

import java.io.*;

class Base1 {
    Base1() {
        System.out.println("I am a constructor::");
    }

    Base1(int x) {
        System.out.println("I am a Overloaded constructor with a value x:" + x);
    }

}

class Derived1 extends Base1 {
    Derived1() {
        System.out.println("I am a constructor of Derived Class::");
    }

    Derived1(int x, int y) {
        super(x);
        System.out.println("I am a Overloaded constructor of Derived class with a value y:" + y);
    }
}

class childofDerived1 extends Derived1 {
    childofDerived1() {
        System.out.println("I am a constructor of chiildofDerived1 Class::");
    }

    childofDerived1(int x, int y, int z) {
        super(x, y);
        System.out.println("I am a Overloaded constructor of childofDerived1 class with a value z:" + z);
    }

}

public class super1 {
    public static void main(String[] args) {
        Base1 b = new Base1();
        Derived1 d = new Derived1(6, 8);
        childofDerived1 cd = new childofDerived1(3, 4, 6);
    }
}
