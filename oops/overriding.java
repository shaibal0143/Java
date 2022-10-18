package javaProgram.oops;

class a {
    public int method1() {
        return 4;
    }

    public void method2() {
        System.out.println("I am a method of class a");
    }
}

class b extends a {
    public void method2() {
        System.out.println("I am a method of class b");
    }
}

public class overriding {
    public static void main(String[] args) {
        a aa = new a();
        aa.method2();
        b bb = new b();
        bb.method2();

    }

}
