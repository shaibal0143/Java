package javaProgram.oops;

//crearting a custom class
class Employee {
    int id;
    String name;
    long salary;

    public void print() {
        System.out.println("My id is::" + id);
        System.out.println("My name is::" + name);
        System.out.println("Salary is::" + salary);
    }
}

public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is a custom class::");
        Employee pathak = new Employee();// Instantiating an object
        Employee singh = new Employee();

        // Setting attributes
        pathak.id = 43;
        pathak.name = "Shaibal kumar pathak";
        pathak.salary = 12000;
        pathak.print();

        singh.id = 45;
        singh.name = " Rajkumar";
        singh.salary = 11000;
        singh.print();

    }

}
