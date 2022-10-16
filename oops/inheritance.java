package javaProgram.oops;

import java.lang.*;

import java.io.*;

class Base {
    public int x;

    public int getx() {
        return x;
    }

    public void setx(int x) {
        System.out.println("I am in base case::");
        this.x = x;
    }

    public void printme() {
        System.out.println("I am a constructor::");
    }

}

class Derived extends Base {
    public int y;

    public int gety() {
        System.out.println("I am in Derived class");
        return y;

    }

    public void sety(int y) {
        this.y = y;
    }

}

public class inheritance {
    public static void main(String[] args) {
        Base one = new Base();
        one.setx(8);
        one.printme();
        System.out.println(one.getx());

        Derived two = new Derived();
        two.setx(9);
        two.sety(19);
        System.out.println(two.getx());
        System.out.println(two.gety());

    }

}
