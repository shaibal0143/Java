package javaProgram.oops;

class student1 {
    student1(String name, int id) {
        System.out.println("The name of the Student is:" + name);
        System.out.println("The id of the student is:" + id);
    }

    student1(String name, int id, int roll) {
        System.out.println("The Name of the second student is :" + name);
        System.out.println("The id of the second student is :" + id);
        System.out.println("The Roll of the second student is :" + roll);
    }
}

public class constructor3 {
    public static void main(String[] args) {
        student1 shaibal = new student1("Shaibal ", 23);
        student1 pathak = new student1("Shaibal kr pathak", 45, 43);

    }
}
 
 
